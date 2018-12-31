package gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SecondPanel extends JPanel {

	private JLabel lblPlace;
	private JButton btnGo2;
	private JButton btnBack2;
	private JComboBox cbPlace;
	
	private JPanel pnCard;
	
	public SecondPanel() {
		pnCard = MainDialog.getPnCard();
		
		this.setBackground(Color.PINK);
		GridBagLayout gbl_this = new GridBagLayout();
		this.setLayout(gbl_this);
		GridBagConstraints gbc_lblPlace = new GridBagConstraints();
		gbc_lblPlace.gridwidth = 4;
		gbc_lblPlace.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlace.gridx = 7;
		gbc_lblPlace.gridy = 5;
		this.add(getLblPlace(), gbc_lblPlace);
		GridBagConstraints gbc_cbPlace = new GridBagConstraints();
		gbc_cbPlace.gridwidth = 4;
		gbc_cbPlace.insets = new Insets(0, 0, 5, 5);
		gbc_cbPlace.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbPlace.gridx = 7;
		gbc_cbPlace.gridy = 6;
		this.add(getCbPlace(), gbc_cbPlace);
		GridBagConstraints gbc_btnBack2 = new GridBagConstraints();
		gbc_btnBack2.insets = new Insets(0, 0, 0, 5);
		gbc_btnBack2.gridx = 1;
		gbc_btnBack2.gridy = 10;
		this.add(getBtnBack2(), gbc_btnBack2);
		GridBagConstraints gbc_btnGo2 = new GridBagConstraints();
		gbc_btnGo2.gridx = 20;
		gbc_btnGo2.gridy = 10;
		this.add(getBtnGo2(), gbc_btnGo2);
	}
	
	private JLabel getLblPlace() {
		if (lblPlace == null) {
			lblPlace = new JLabel("Choose place of the party:");
		}
		return lblPlace;
	}
	private JButton getBtnGo2() {
		if (btnGo2 == null) {
			btnGo2 = new JButton("Select items \u2192");
			btnGo2.addActionListener(a -> {
				((CardLayout)pnCard.getLayout()).show(pnCard,"pn3");
			});
		}
		return btnGo2;
	}
	private JButton getBtnBack2() {
		if (btnBack2 == null) {
			btnBack2 = new JButton("\u2190 Select people");
			btnBack2.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnBack2.addActionListener(a -> {
				((CardLayout)pnCard.getLayout()).show(pnCard,"pn1");
			});
		}
		return btnBack2;
	}
	
	
	private JComboBox getCbPlace() {
		if (cbPlace == null) {
			cbPlace = new JComboBox();
		}
		return cbPlace;
	}
	
}
