package gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

public class FirstPanel extends JPanel{

	private JPanel cardPanel;
	private JButton btnBack1;
	private JButton btnGo1;
	private JLabel lbl1;
	private JLabel lbl2;
	private JSpinner spnPeople;
	
	private JPanel pnCard;
	
	public FirstPanel() {
			
			pnCard = MainDialog.getPnCard();
			
			this.setBackground(Color.PINK);
			GridBagLayout gbl_this = new GridBagLayout();
			this.setLayout(gbl_this);
			GridBagConstraints gbc_lbl1 = new GridBagConstraints();
			gbc_lbl1.insets = new Insets(0, 0, 5, 5);
			gbc_lbl1.gridx = 7;
			gbc_lbl1.gridy = 5;
			this.add(getLbl1(), gbc_lbl1);
			GridBagConstraints gbc_spnPeople = new GridBagConstraints();
			gbc_spnPeople.ipady = 20;
			gbc_spnPeople.ipadx = 20;
			gbc_spnPeople.gridwidth = 3;
			gbc_spnPeople.gridheight = 2;
			gbc_spnPeople.insets = new Insets(0, 0, 5, 5);
			gbc_spnPeople.gridx = 9;
			gbc_spnPeople.gridy = 5;
			this.add(getSpnPeople(), gbc_spnPeople);
			GridBagConstraints gbc_lbl2 = new GridBagConstraints();
			gbc_lbl2.insets = new Insets(0, 0, 5, 5);
			gbc_lbl2.gridx = 7;
			gbc_lbl2.gridy = 6;
			this.add(getLbl2(), gbc_lbl2);
			GridBagConstraints gbc_btnGo1 = new GridBagConstraints();
			gbc_btnGo1.gridx = 20;
			gbc_btnGo1.gridy = 10;
			this.add(getBtnGo1(), gbc_btnGo1);
			GridBagConstraints gbc_btnBack1 = new GridBagConstraints();
			gbc_btnBack1.insets = new Insets(0, 0, 0, 5);
			gbc_btnBack1.gridx = 1;
			gbc_btnBack1.gridy = 10;
			this.add(getBtnBack1(), gbc_btnBack1);
	}
	
	
	private JButton getBtnBack1() {
		if (btnBack1 == null) {
			btnBack1 = new JButton("\u2190");
			btnBack1.setFont(new Font("Tahoma", Font.BOLD, 30));
			//TODO  close the dialog and open the frame
		}
		return btnBack1;
	}
	private JButton getBtnGo1() {
		if (btnGo1 == null) {
			btnGo1 = new JButton("Select place \u2192");
			btnGo1.addActionListener(a -> {
				((CardLayout)pnCard.getLayout()).show(pnCard,"pn2");
			});
		}
		return btnGo1;
	}
	private JLabel getLbl1() {
		if (lbl1 == null) {
			lbl1 = new JLabel("Indicate the number");
		}
		return lbl1;
	}
	private JLabel getLbl2() {
		if (lbl2 == null) {
			lbl2 = new JLabel("of people:");
		}
		return lbl2;
	}
	private JSpinner getSpnPeople() {
		if (spnPeople == null) {
			spnPeople = new JSpinner();
		}
		return spnPeople;
	}
	
}
