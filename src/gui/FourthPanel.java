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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class FourthPanel extends JPanel{

	private JButton btnGo4;
	private JButton btnBack4;
	private JLabel lblCart;
	private JScrollPane spCart;
	private JTable tableCart;
	private JLabel lblTotal;
	private JTextField txtTotal;
	private JButton btnRemoveTheCart;
	
	private JPanel pnCard;
	
	public FourthPanel() {
		pnCard = MainDialog.getPnCard();
		
		this.setBackground(Color.PINK);
		GridBagLayout gbl_this = new GridBagLayout();
		gbl_this.columnWidths = new int[]{0, 0, 0, 55, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_this.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_this.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_this.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		this.setLayout(gbl_this);
		GridBagConstraints gbc_lblCart = new GridBagConstraints();
		gbc_lblCart.gridwidth = 4;
		gbc_lblCart.insets = new Insets(0, 0, 5, 5);
		gbc_lblCart.gridx = 6;
		gbc_lblCart.gridy = 0;
		this.add(getLblCart(), gbc_lblCart);
		GridBagConstraints gbc_spCart = new GridBagConstraints();
		gbc_spCart.gridheight = 8;
		gbc_spCart.gridwidth = 14;
		gbc_spCart.insets = new Insets(0, 0, 5, 5);
		gbc_spCart.fill = GridBagConstraints.BOTH;
		gbc_spCart.gridx = 3;
		gbc_spCart.gridy = 1;
		this.add(getSpCart(), gbc_spCart);
		GridBagConstraints gbc_btnRemoveTheCart = new GridBagConstraints();
		gbc_btnRemoveTheCart.gridwidth = 2;
		gbc_btnRemoveTheCart.insets = new Insets(0, 0, 5, 5);
		gbc_btnRemoveTheCart.gridx = 3;
		gbc_btnRemoveTheCart.gridy = 9;
		this.add(getBtnRemoveTheCart(), gbc_btnRemoveTheCart);
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.anchor = GridBagConstraints.EAST;
		gbc_lblTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotal.gridx = 12;
		gbc_lblTotal.gridy = 9;
		this.add(getLblTotal(), gbc_lblTotal);
		GridBagConstraints gbc_txtTotal = new GridBagConstraints();
		gbc_txtTotal.gridwidth = 4;
		gbc_txtTotal.anchor = GridBagConstraints.NORTH;
		gbc_txtTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTotal.gridx = 13;
		gbc_txtTotal.gridy = 9;
		this.add(getTextField_1(), gbc_txtTotal);
		GridBagConstraints gbc_btnBack4 = new GridBagConstraints();
		gbc_btnBack4.insets = new Insets(0, 0, 0, 5);
		gbc_btnBack4.gridx = 1;
		gbc_btnBack4.gridy = 10;
		this.add(getBtnBack4(), gbc_btnBack4);
		GridBagConstraints gbc_btnGo4 = new GridBagConstraints();
		gbc_btnGo4.gridx = 20;
		gbc_btnGo4.gridy = 10;
		this.add(getBtnGo4(), gbc_btnGo4);
	}
	
	private JButton getBtnGo4() {
		if (btnGo4 == null) {
			btnGo4 = new JButton("Continue \u2192");
			btnGo4.addActionListener(a -> {
				((CardLayout)pnCard.getLayout()).show(pnCard,"pn5");
			});
		}
		return btnGo4;
	}
	private JButton getBtnBack4() {
		if (btnBack4 == null) {
			btnBack4 = new JButton("Add another item");
			btnBack4.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnBack4.addActionListener(a -> {
				((CardLayout)pnCard.getLayout()).show(pnCard,"pn3");
			});
		}
		return btnBack4;
	}
	private JLabel getLblCart() {
		if (lblCart == null) {
			lblCart = new JLabel("Your cart");
		}
		return lblCart;
	}
	private JScrollPane getSpCart() {
		if (spCart == null) {
			spCart = new JScrollPane();
			spCart.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			spCart.setViewportView(getTableCart());
		}
		return spCart;
	}
	private JTable getTableCart() {
		if (tableCart == null) {
			tableCart = new JTable();
		}
		return tableCart;
	}
	private JLabel getLblTotal() {
		if (lblTotal == null) {
			lblTotal = new JLabel("Total:");
		}
		return lblTotal;
	}
	private JTextField getTextField_1() {
		if (txtTotal == null) {
			txtTotal = new JTextField();
			txtTotal.setColumns(10);
		}
		return txtTotal;
	}
	private JButton getBtnRemoveTheCart() {
		if (btnRemoveTheCart == null) {
			btnRemoveTheCart = new JButton("Remove the cart");
		}
		return btnRemoveTheCart;
	}
	
}
