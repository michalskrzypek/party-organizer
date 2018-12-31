package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SeventhPanel extends JPanel{

	
	private JLabel lblPaymentDetails;
	private JLabel lblCardHolder;
	private JTextField textField_1;
	private JLabel lblCardNumber;
	private JTextField txtCVC;
	private JLabel lblExpirationDate;
	private JTextField txtNumber;
	private JLabel lblCvcCode;
	private JTextField txtDate;
	private JButton btnBack7;
	private JButton btnGo7;
	
	public SeventhPanel() {
		this.setBackground(Color.PINK);
		GridBagLayout gbl_this = new GridBagLayout();
		gbl_this.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 47, 0,
				0 };
		gbl_this.rowHeights = new int[] { 33, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_this.columnWeights = new double[] { 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0,
				1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_this.rowWeights = new double[] { 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
		this.setLayout(gbl_this);
		GridBagConstraints gbc_lblPaymentDetails = new GridBagConstraints();
		gbc_lblPaymentDetails.gridwidth = 13;
		gbc_lblPaymentDetails.insets = new Insets(0, 0, 5, 5);
		gbc_lblPaymentDetails.gridx = 3;
		gbc_lblPaymentDetails.gridy = 0;
		this.add(getLblPaymentDetails(), gbc_lblPaymentDetails);
		GridBagConstraints gbc_lblCardHolder = new GridBagConstraints();
		gbc_lblCardHolder.anchor = GridBagConstraints.EAST;
		gbc_lblCardHolder.insets = new Insets(0, 0, 5, 5);
		gbc_lblCardHolder.gridx = 2;
		gbc_lblCardHolder.gridy = 1;
		this.add(getLblCardHolder(), gbc_lblCardHolder);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 5;
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		this.add(getTextField_1_1(), gbc_textField_1);
		GridBagConstraints gbc_lblCardNumber = new GridBagConstraints();
		gbc_lblCardNumber.anchor = GridBagConstraints.EAST;
		gbc_lblCardNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblCardNumber.gridx = 2;
		gbc_lblCardNumber.gridy = 3;
		this.add(getLblCardNumber(), gbc_lblCardNumber);
		GridBagConstraints gbc_txtNumber = new GridBagConstraints();
		gbc_txtNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNumber.insets = new Insets(0, 0, 5, 5);
		gbc_txtNumber.gridx = 2;
		gbc_txtNumber.gridy = 4;
		this.add(getTxtNumber(), gbc_txtNumber);
		GridBagConstraints gbc_lblExpirationDate = new GridBagConstraints();
		gbc_lblExpirationDate.anchor = GridBagConstraints.EAST;
		gbc_lblExpirationDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblExpirationDate.gridx = 2;
		gbc_lblExpirationDate.gridy = 5;
		this.add(getLblExpirationDate(), gbc_lblExpirationDate);
		GridBagConstraints gbc_txtDate = new GridBagConstraints();
		gbc_txtDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDate.insets = new Insets(0, 0, 5, 5);
		gbc_txtDate.gridx = 2;
		gbc_txtDate.gridy = 6;
		this.add(getTxtDate(), gbc_txtDate);
		GridBagConstraints gbc_lblCvcCode = new GridBagConstraints();
		gbc_lblCvcCode.anchor = GridBagConstraints.EAST;
		gbc_lblCvcCode.insets = new Insets(0, 0, 5, 5);
		gbc_lblCvcCode.gridx = 2;
		gbc_lblCvcCode.gridy = 7;
		this.add(getLblCvcCode(), gbc_lblCvcCode);
		GridBagConstraints gbc_txtCVC = new GridBagConstraints();
		gbc_txtCVC.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCVC.insets = new Insets(0, 0, 5, 5);
		gbc_txtCVC.gridx = 2;
		gbc_txtCVC.gridy = 8;
		this.add(getTextField_2_5(), gbc_txtCVC);
		GridBagConstraints gbc_btnBack7 = new GridBagConstraints();
		gbc_btnBack7.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack7.gridx = 1;
		gbc_btnBack7.gridy = 12;
		this.add(getButton_3(), gbc_btnBack7);
		GridBagConstraints gbc_btnGo7 = new GridBagConstraints();
		gbc_btnGo7.insets = new Insets(0, 0, 5, 5);
		gbc_btnGo7.gridx = 19;
		gbc_btnGo7.gridy = 12;
		this.add(getButton_1_6(), gbc_btnGo7);
	}
	
	private JLabel getLblPaymentDetails() {
		if (lblPaymentDetails == null) {
			lblPaymentDetails = new JLabel("Payment details:");
		}
		return lblPaymentDetails;
	}

	private JLabel getLblCardHolder() {
		if (lblCardHolder == null) {
			lblCardHolder = new JLabel("Card holder:");
		}
		return lblCardHolder;
	}

	private JTextField getTextField_1_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
		}
		return textField_1;
	}

	private JLabel getLblCardNumber() {
		if (lblCardNumber == null) {
			lblCardNumber = new JLabel("Card number");
		}
		return lblCardNumber;
	}

	private JTextField getTextField_2_5() {
		if (txtCVC == null) {
			txtCVC = new JTextField();
			txtCVC.setColumns(10);
		}
		return txtCVC;
	}

	private JLabel getLblExpirationDate() {
		if (lblExpirationDate == null) {
			lblExpirationDate = new JLabel("Expiration date:");
		}
		return lblExpirationDate;
	}

	private JTextField getTxtNumber() {
		if (txtNumber == null) {
			txtNumber = new JTextField();
			txtNumber.setColumns(10);
		}
		return txtNumber;
	}

	private JLabel getLblCvcCode() {
		if (lblCvcCode == null) {
			lblCvcCode = new JLabel("CVC code:");
		}
		return lblCvcCode;
	}

	private JTextField getTxtDate() {
		if (txtDate == null) {
			txtDate = new JTextField();
			txtDate.setColumns(10);
		}
		return txtDate;
	}

	private JButton getButton_3() {
		if (btnBack7 == null) {
			btnBack7 = new JButton("\u2190 Order details");
			btnBack7.setFont(new Font("Tahoma", Font.BOLD, 18));
		}
		return btnBack7;
	}

	private JButton getButton_1_6() {
		if (btnGo7 == null) {
			btnGo7 = new JButton("Confirm & pay!");
		}
		return btnGo7;
	}
	
}
