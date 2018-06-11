package core;

import java.util.Observable;

public class TempleOfAtzoatl extends Observable {
	
	private int[] incursions;
	private int index, tierCap, desiredTier;
	
	public TempleOfAtzoatl(TempleOfAtzoatlGUI gui, int desiredTier) {
		this.addObserver(gui);
		this.incursions = new int[11];
		this.index = 0;
		this.tierCap = 0;
		this.desiredTier = desiredTier;
		this.updateIncursions();
		this.updateIndex();
		this.calculateNext();
	}

	private void updateIndex() {
		setChanged();
		notifyObservers(this.index);
		
	}

	private void updateIncursions() {
		setChanged();
		notifyObservers(this.incursions);
		
	}
	
	public void doIncursion(int tier) {
		if (this.index > 10) {
			return;
		}
		this.incursions[this.index++] = tier;
		if (this.tierCap < tier) {
			this.tierCap = tier;
		}
		this.updateIndex();
		this.updateIncursions();
		this.calculateNext();
	}

	public void setDesiredTier(int i) {
		this.desiredTier = i;
		calculateNext();
	}
	private void calculateNext() {
		if (this.tierCap < this.desiredTier && !(this.index == 11)) {
			setChanged();
			notifyObservers("Minimum recommended map tier: " + this.desiredTier);
			return;
		} else {
			if (index == 11) {
				setChanged();
				notifyObservers(String.format("Your temple will be T%d!", Math.min(((this.addIncursionTiers()/11) + 4), this.tierCap)));
				return;
			}
			double rec = Math.min(Math.ceil((11 * (this.desiredTier - 4) - this.addIncursionTiers())/(11-index)), this.desiredTier);
			setChanged();
			notifyObservers(String.format("Minimum recommended map tier: %.0f", rec));
		}
		
		
	}
	
	private int addIncursionTiers() {
		int ret = 0;
		for (int i : this.incursions) {
			ret += i;
		}
		return ret;
	}
	
}
