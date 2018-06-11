package core;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JCheckBox;

public class TempleOfAtzoatlGUI implements Observer, ActionListener, ChangeListener {

	private JFrame frmTempleOfAtzoatl;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button5;
	private JButton button4;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button10;
	private JButton button11;
	private JButton button12;
	private JButton button13;
	private JButton button14;
	private JButton button15;
	private JButton button16;
	private int tierCap, desiredTier;
	private JTextField textField_remaining;
	private JTextField textField_tierCap;
	private JTextField textField_recommendation;
	private TempleOfAtzoatl temple;
	private JTextField textField_log;
	private JLabel lblDesiredTierOf;
	private JButton btnNewTemple;
	private JSpinner spinner_desiredTier;
	private JCheckBox chckbxAutobump;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TempleOfAtzoatlGUI window = new TempleOfAtzoatlGUI();
					window.frmTempleOfAtzoatl.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TempleOfAtzoatlGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTempleOfAtzoatl = new JFrame();
		frmTempleOfAtzoatl.setResizable(false);
		frmTempleOfAtzoatl.setTitle("Temple of Atzoatl");
		frmTempleOfAtzoatl.setBounds(100, 100, 313, 556);
		frmTempleOfAtzoatl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTempleOfAtzoatl.getContentPane().setLayout(null);
		
		
		JLabel lblMapTiersOf = new JLabel("Map tiers of your incursions:");
		lblMapTiersOf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMapTiersOf.setBounds(10, 130, 172, 17);
		frmTempleOfAtzoatl.getContentPane().add(lblMapTiersOf);
		
		button1 = new JButton("1");
		button1.setBounds(20, 160, 60, 60);
		button1.addActionListener(this);
		frmTempleOfAtzoatl.getContentPane().add(button1);
		
		button2 = new JButton("2");
		button2.setBounds(90, 160, 60, 60);
		button2.addActionListener(this);
		frmTempleOfAtzoatl.getContentPane().add(button2);
		
		button3 = new JButton("3");
		button3.setBounds(160, 160, 60, 60);
		button3.addActionListener(this);
		frmTempleOfAtzoatl.getContentPane().add(button3);
		
		button4 = new JButton("4");
		button4.setBounds(230, 160, 60, 60);
		button4.addActionListener(this);
		frmTempleOfAtzoatl.getContentPane().add(button4);
		
		button5 = new JButton("5");
		button5.setBounds(20, 230, 60, 60);
		button5.addActionListener(this);
		frmTempleOfAtzoatl.getContentPane().add(button5);
		
		button6 = new JButton("6");
		button6.setBounds(90, 230, 60, 60);
		button6.addActionListener(this);
		frmTempleOfAtzoatl.getContentPane().add(button6);
		
		button7 = new JButton("7");
		button7.setBounds(160, 230, 60, 60);
		button7.addActionListener(this);
		frmTempleOfAtzoatl.getContentPane().add(button7);
		
		button8 = new JButton("8");
		button8.setBounds(230, 230, 60, 60);
		button8.addActionListener(this);
		frmTempleOfAtzoatl.getContentPane().add(button8);
		
		button9 = new JButton("9");
		button9.setBounds(20, 300, 60, 60);
		button9.addActionListener(this);
		frmTempleOfAtzoatl.getContentPane().add(button9);
		
		button10 = new JButton("10");
		button10.setBounds(90, 300, 60, 60);
		button10.addActionListener(this);
		frmTempleOfAtzoatl.getContentPane().add(button10);
		
		button11 = new JButton("11");
		button11.setBounds(160, 300, 60, 60);
		button11.addActionListener(this);
		frmTempleOfAtzoatl.getContentPane().add(button11);
		
		button12 = new JButton("12");
		button12.setBounds(230, 300, 60, 60);
		button12.addActionListener(this);
		frmTempleOfAtzoatl.getContentPane().add(button12);
		
		button13 = new JButton("13");
		button13.setBounds(20, 370, 60, 60);
		button13.addActionListener(this);
		frmTempleOfAtzoatl.getContentPane().add(button13);
		
		button14 = new JButton("14");
		button14.setBounds(90, 370, 60, 60);
		button14.addActionListener(this);
		frmTempleOfAtzoatl.getContentPane().add(button14);
		
		button15 = new JButton("15");
		button15.setBounds(160, 370, 60, 60);
		button15.addActionListener(this);
		frmTempleOfAtzoatl.getContentPane().add(button15);
		
		button16 = new JButton("16");
		button16.setBounds(230, 370, 60, 60);
		button16.addActionListener(this);
		frmTempleOfAtzoatl.getContentPane().add(button16);
		
		textField_recommendation = new JTextField();
		textField_recommendation.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_recommendation.setEditable(false);
		textField_recommendation.setBounds(10, 500, 287, 20);
		frmTempleOfAtzoatl.getContentPane().add(textField_recommendation);
		textField_recommendation.setColumns(10);
		
		JLabel lblRemaining = new JLabel("Remaining: ");
		lblRemaining.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRemaining.setBounds(10, 470, 72, 17);
		frmTempleOfAtzoatl.getContentPane().add(lblRemaining);
		
		textField_remaining = new JTextField();
		textField_remaining.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_remaining.setEditable(false);
		textField_remaining.setBounds(85, 470, 46, 20);
		textField_remaining.setText("N/A");
		frmTempleOfAtzoatl.getContentPane().add(textField_remaining);
		textField_remaining.setColumns(10);
		
		JLabel lblTierCap = new JLabel("Tier Cap:");
		lblTierCap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTierCap.setBounds(160, 470, 55, 17);
		frmTempleOfAtzoatl.getContentPane().add(lblTierCap);
		
		textField_tierCap = new JTextField();
		textField_tierCap.setText("N/A");
		textField_tierCap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_tierCap.setEditable(false);
		textField_tierCap.setBounds(230, 470, 60, 20);
		frmTempleOfAtzoatl.getContentPane().add(textField_tierCap);
		textField_tierCap.setColumns(10);
		
		textField_log = new JTextField();
		textField_log.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_log.setBounds(10, 439, 287, 20);
		textField_log.setText("N/A");
		frmTempleOfAtzoatl.getContentPane().add(textField_log);
		textField_log.setColumns(10);
		
		lblDesiredTierOf = new JLabel("Desired tier of temple:");
		lblDesiredTierOf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDesiredTierOf.setBounds(10, 14, 134, 17);
		frmTempleOfAtzoatl.getContentPane().add(lblDesiredTierOf);
		
		spinner_desiredTier = new JSpinner();
		spinner_desiredTier.setModel(new SpinnerNumberModel(16, 1, 16, 1));
		spinner_desiredTier.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinner_desiredTier.setBounds(160, 11, 46, 24);
		spinner_desiredTier.addChangeListener(this);
		frmTempleOfAtzoatl.getContentPane().add(spinner_desiredTier);
		
		chckbxAutobump = new JCheckBox("Auto-bump");
		chckbxAutobump.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxAutobump.setSelected(true);
		chckbxAutobump.setBounds(212, 13, 79, 23);
		frmTempleOfAtzoatl.getContentPane().add(chckbxAutobump);
		
		btnNewTemple = new JButton("New Temple");
		btnNewTemple.addActionListener(this);
		btnNewTemple.setBounds(10, 52, 287, 67);
		frmTempleOfAtzoatl.getContentPane().add(btnNewTemple);
		
		this.temple = new TempleOfAtzoatl(this, 16);
		this.tierCap = 0;
		this.desiredTier = 16;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			if (this.tierCap < 1) {
				this.tierCap = 1;
			}
			if (this.desiredTier < 1 && this.chckbxAutobump.isSelected()) {
				this.desiredTier = 1;
				this.spinner_desiredTier.setValue(1);
				
			}
			temple.doIncursion(1);
		}
		if (e.getSource() == button2) {
			if (this.tierCap < 2) {
				this.tierCap = 2;
			}
			if (this.desiredTier < 2 && this.chckbxAutobump.isSelected()) {
				this.desiredTier = 2;
				this.spinner_desiredTier.setValue(2);
			}
			temple.doIncursion(2);
		}
		if (e.getSource() == button3) {
			if (this.tierCap < 3) {
				this.tierCap = 3;
			}
			if (this.desiredTier < 3 && this.chckbxAutobump.isSelected()) {
				this.desiredTier = 3;
				this.spinner_desiredTier.setValue(3);
			}
			temple.doIncursion(3);
		}
		if (e.getSource() == button4) {
			if (this.tierCap < 4) {
				this.tierCap = 4;
			}
			if (this.desiredTier < 4 && this.chckbxAutobump.isSelected()) {
				this.desiredTier = 4;
				this.spinner_desiredTier.setValue(4);
			}
			temple.doIncursion(4);
		}
		if (e.getSource() == button5) {
			if (this.tierCap < 5) {
				this.tierCap = 5;
			}
			if (this.desiredTier < 5 && this.chckbxAutobump.isSelected()) {
				this.desiredTier = 5;
				this.spinner_desiredTier.setValue(5);
			}
			temple.doIncursion(5);
		}
		if (e.getSource() == button6) {
			if (this.tierCap < 6) {
				this.tierCap = 6;
			}
			if (this.desiredTier < 6 && this.chckbxAutobump.isSelected()) {
				this.desiredTier = 6;
				this.spinner_desiredTier.setValue(6);
			}
			temple.doIncursion(6);
		}
		if (e.getSource() == button7) {
			if (this.tierCap < 7) {
				this.tierCap = 7;
			}
			if (this.desiredTier < 7 && this.chckbxAutobump.isSelected()) {
				this.desiredTier = 7;
				this.spinner_desiredTier.setValue(7);
			}
			temple.doIncursion(7);
		}
		if (e.getSource() == button8) {
			if (this.tierCap < 8) {
				this.tierCap = 8;
			}
			if (this.desiredTier < 8 && this.chckbxAutobump.isSelected()) {
				this.desiredTier = 8;
				this.spinner_desiredTier.setValue(8);
			}
			temple.doIncursion(8);
		}
		if (e.getSource() == button9) {
			if (this.tierCap < 9) {
				this.tierCap = 9;
			}
			if (this.desiredTier < 9 && this.chckbxAutobump.isSelected()) {
				this.desiredTier = 9;
				this.spinner_desiredTier.setValue(9);
			}
			temple.doIncursion(9);
		}
		if (e.getSource() == button10) {
			if (this.tierCap < 10) {
				this.tierCap = 10;
			}
			if (this.desiredTier < 10 && this.chckbxAutobump.isSelected()) {
				this.desiredTier = 10;
				this.spinner_desiredTier.setValue(10);
			}
			temple.doIncursion(10);
		}
		if (e.getSource() == button11) {
			if (this.tierCap < 11) {
				this.tierCap = 11;
			}
			if (this.desiredTier < 11 && this.chckbxAutobump.isSelected()) {
				this.desiredTier = 11;
				this.spinner_desiredTier.setValue(11);
			}
			temple.doIncursion(11);
		}
		if (e.getSource() == button12) {
			if (this.tierCap < 12) {
				this.tierCap = 12;
			}
			if (this.desiredTier < 12 && this.chckbxAutobump.isSelected()) {
				this.desiredTier = 12;
				this.spinner_desiredTier.setValue(12);
			}
			temple.doIncursion(12);
		}
		if (e.getSource() == button13) {
			if (this.tierCap < 13) {
				this.tierCap = 13;
			}
			if (this.desiredTier < 13 && this.chckbxAutobump.isSelected()) {
				this.desiredTier = 13;
				this.spinner_desiredTier.setValue(13);
			}
			temple.doIncursion(13);
		}
		if (e.getSource() == button14) {
			if (this.tierCap < 14) {
				this.tierCap = 14;
			}
			if (this.desiredTier < 14 && this.chckbxAutobump.isSelected()) {
				this.desiredTier = 14;
				this.spinner_desiredTier.setValue(14);
			}
			temple.doIncursion(14);
		}
		if (e.getSource() == button15) {
			if (this.tierCap < 15) {
				this.tierCap = 15;
			}
			if (this.desiredTier < 15 && this.chckbxAutobump.isSelected()) {
				this.desiredTier = 15;
				this.spinner_desiredTier.setValue(15);
			}
			temple.doIncursion(15);
		}
		if (e.getSource() == button16) {
			if (this.tierCap < 16) {
				this.tierCap = 16;
			}
			if (this.desiredTier < 16 && this.chckbxAutobump.isSelected()) {
				this.desiredTier = 16;
				this.spinner_desiredTier.setValue(16);
			}
			temple.doIncursion(16);
		}
		if (e.getSource() == btnNewTemple) {
			this.temple = new TempleOfAtzoatl(this, (int) this.spinner_desiredTier.getValue());
			this.tierCap = 0;
		}
		this.updateTierCap();
		
	}

	private void updateTierCap() {
		if (this.tierCap != 0) {
			this.textField_tierCap.setText(Integer.toString(this.tierCap));
		} else {
			this.textField_tierCap.setText("N/A");
		}
		
	}

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof String) {
			textField_recommendation.setText((String) arg);
		} else {
			if (arg instanceof Integer) {
				this.textField_remaining.setText(Integer.toString(11 - (int) arg));
			} else {
				this.setIncursionsText((int[]) arg);
			}
		}
		
		
	}

	private void setIncursionsText(int[] incursions) {
		StringBuffer buffer = new StringBuffer();
		for (int i : incursions) {
			if (i == 0) {
				break;
			}
			buffer.append(i).append(", ");
		}
		if (buffer.length() < 2) {
			this.textField_log.setText("N/A");
		} else {
			buffer.setLength(buffer.length() - 2);
			this.textField_log.setText(buffer.toString());
		}
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if (e.getSource() == this.spinner_desiredTier) {
			this.desiredTier = (int) this.spinner_desiredTier.getValue();
			this.temple.setDesiredTier(this.desiredTier);
			
		}
		
	}
}
