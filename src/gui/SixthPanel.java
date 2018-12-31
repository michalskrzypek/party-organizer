package gui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class SixthPanel extends JPanel {

	private JLabel lblOrderDetails;
	private JScrollPane scrollPane;
	private JLabel label_1;
	private JTextField textField;
	private JButton btnPayment;
	
	public SixthPanel() {
		this.setBackground(Color.PINK);
		GridBagLayout gbl_this = new GridBagLayout();
		gbl_this.columnWidths = new int[] { 0, 0, 0, 55, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_this.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_this.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_this.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		this.setLayout(gbl_this);
		GridBagConstraints gbc_lblOrderDetails = new GridBagConstraints();
		gbc_lblOrderDetails.gridwidth = 4;
		gbc_lblOrderDetails.insets = new Insets(0, 0, 5, 5);
		gbc_lblOrderDetails.gridx = 6;
		gbc_lblOrderDetails.gridy = 0;
		this.add(getLblOrderDetails(), gbc_lblOrderDetails);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridheight = 8;
		gbc_scrollPane.gridwidth = 14;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 3;
		gbc_scrollPane.gridy = 1;
		this.add(getScrollPane(), gbc_scrollPane);
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 12;
		gbc_label_1.gridy = 9;
		this.add(getLabel_1_1(), gbc_label_1);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.gridwidth = 4;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 13;
		gbc_textField.gridy = 9;
		this.add(getTextField_2(), gbc_textField);
		GridBagConstraints gbc_btnPayment = new GridBagConstraints();
		gbc_btnPayment.gridx = 20;
		gbc_btnPayment.gridy = 10;
		this.add(getButton_2_1(), gbc_btnPayment);
	}

	private JLabel getLblOrderDetails() {
		if (lblOrderDetails == null) {
			lblOrderDetails = new JLabel("Order details:");
		}
		return lblOrderDetails;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		}
		return scrollPane;
	}
	private JLabel getLabel_1_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Total:");
		}
		return label_1;
	}
	private JTextField getTextField_2() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getButton_2_1() {
		if (btnPayment == null) {
			btnPayment = new JButton("Payment \u2192");
		}
		return btnPayment;
	}
	
}
