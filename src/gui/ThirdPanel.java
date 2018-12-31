package gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ThirdPanel extends JPanel{

	private JLabel lblItems;
	private JComboBox cbType;
	private JButton btnBack3;
	private JButton btnGo3;
	private JLabel lblType;
	private JLabel lblName;
	private JComboBox cbProduct;
	private JLabel lblDescription;
	private JLabel lblImage;
	private JLabel lblUnitPrice;
	private JLabel lblPrice;
	private JTextField txtUnitPrice;
	private JTextField txtPrice;
	private JLabel lblUnits;
	private JSpinner spnUnits;
	private JTextArea txtAreaDesc;
	private JLabel lblChosenItems;
	private JTextArea textArea;
	
	private JPanel pnCard;
	
	public ThirdPanel() {
		pnCard = MainDialog.getPnCard();
		
		this.setBackground(Color.PINK);
		GridBagLayout gbl_this = new GridBagLayout();
		gbl_this.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_this.rowHeights = new int[]{33, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_this.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_this.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		this.setLayout(gbl_this);
		GridBagConstraints gbc_lblItems = new GridBagConstraints();
		gbc_lblItems.gridwidth = 7;
		gbc_lblItems.insets = new Insets(0, 0, 5, 5);
		gbc_lblItems.gridx = 1;
		gbc_lblItems.gridy = 0;
		this.add(getLblItems(), gbc_lblItems);
		GridBagConstraints gbc_lblChosenItems = new GridBagConstraints();
		gbc_lblChosenItems.gridwidth = 7;
		gbc_lblChosenItems.insets = new Insets(0, 0, 5, 5);
		gbc_lblChosenItems.gridx = 12;
		gbc_lblChosenItems.gridy = 0;
		this.add(getLblChosenItems(), gbc_lblChosenItems);
		GridBagConstraints gbc_lblType = new GridBagConstraints();
		gbc_lblType.anchor = GridBagConstraints.EAST;
		gbc_lblType.insets = new Insets(0, 0, 5, 5);
		gbc_lblType.gridx = 1;
		gbc_lblType.gridy = 2;
		this.add(getLblType(), gbc_lblType);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridheight = 8;
		gbc_textArea.gridwidth = 7;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 12;
		gbc_textArea.gridy = 1;
		this.add(getTextArea(), gbc_textArea);
		GridBagConstraints gbc_cbType = new GridBagConstraints();
		gbc_cbType.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbType.gridwidth = 4;
		gbc_cbType.insets = new Insets(0, 0, 5, 5);
		gbc_cbType.gridx = 2;
		gbc_cbType.gridy = 2;
		this.add(getCbType(), gbc_cbType);
		GridBagConstraints gbc_lblImage = new GridBagConstraints();
		gbc_lblImage.gridheight = 7;
		gbc_lblImage.gridwidth = 4;
		gbc_lblImage.insets = new Insets(0, 0, 5, 5);
		gbc_lblImage.gridx = 7;
		gbc_lblImage.gridy = 2;
		this.add(getLblImage(), gbc_lblImage);
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.EAST;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 1;
		gbc_lblName.gridy = 3;
		this.add(getLblName(), gbc_lblName);
		GridBagConstraints gbc_cbProduct = new GridBagConstraints();
		gbc_cbProduct.gridwidth = 4;
		gbc_cbProduct.insets = new Insets(0, 0, 5, 5);
		gbc_cbProduct.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbProduct.gridx = 2;
		gbc_cbProduct.gridy = 3;
		this.add(getCbProduct(), gbc_cbProduct);
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.anchor = GridBagConstraints.EAST;
		gbc_lblDescription.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescription.gridx = 1;
		gbc_lblDescription.gridy = 4;
		this.add(getLblDescription(), gbc_lblDescription);
		GridBagConstraints gbc_txtAreaDesc = new GridBagConstraints();
		gbc_txtAreaDesc.gridheight = 4;
		gbc_txtAreaDesc.gridwidth = 4;
		gbc_txtAreaDesc.insets = new Insets(0, 0, 5, 5);
		gbc_txtAreaDesc.fill = GridBagConstraints.BOTH;
		gbc_txtAreaDesc.gridx = 2;
		gbc_txtAreaDesc.gridy = 4;
		this.add(getTxtAreaDesc(), gbc_txtAreaDesc);
		GridBagConstraints gbc_lblUnitPrice = new GridBagConstraints();
		gbc_lblUnitPrice.insets = new Insets(0, 0, 5, 5);
		gbc_lblUnitPrice.gridx = 2;
		gbc_lblUnitPrice.gridy = 9;
		this.add(getLblUnitPrice(), gbc_lblUnitPrice);
		GridBagConstraints gbc_lblPrice = new GridBagConstraints();
		gbc_lblPrice.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrice.gridx = 3;
		gbc_lblPrice.gridy = 9;
		this.add(getLblPrice(), gbc_lblPrice);
		GridBagConstraints gbc_txtUnitPrice = new GridBagConstraints();
		gbc_txtUnitPrice.insets = new Insets(0, 0, 5, 5);
		gbc_txtUnitPrice.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUnitPrice.gridx = 2;
		gbc_txtUnitPrice.gridy = 10;
		this.add(getTxtUnitPrice(), gbc_txtUnitPrice);
		GridBagConstraints gbc_txtPrice = new GridBagConstraints();
		gbc_txtPrice.anchor = GridBagConstraints.NORTH;
		gbc_txtPrice.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrice.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrice.gridx = 3;
		gbc_txtPrice.gridy = 10;
		this.add(getTxtPrice(), gbc_txtPrice);
		GridBagConstraints gbc_lblUnits = new GridBagConstraints();
		gbc_lblUnits.anchor = GridBagConstraints.EAST;
		gbc_lblUnits.insets = new Insets(0, 0, 5, 5);
		gbc_lblUnits.gridx = 1;
		gbc_lblUnits.gridy = 11;
		this.add(getLblUnits(), gbc_lblUnits);
		GridBagConstraints gbc_spnUnits = new GridBagConstraints();
		gbc_spnUnits.anchor = GridBagConstraints.WEST;
		gbc_spnUnits.gridwidth = 2;
		gbc_spnUnits.ipadx = 50;
		gbc_spnUnits.insets = new Insets(0, 0, 5, 5);
		gbc_spnUnits.gridx = 2;
		gbc_spnUnits.gridy = 11;
		this.add(getSpnUnits(), gbc_spnUnits);
		GridBagConstraints gbc_btnBack3 = new GridBagConstraints();
		gbc_btnBack3.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack3.gridx = 1;
		gbc_btnBack3.gridy = 12;
		this.add(getBtnBack3(), gbc_btnBack3);
		GridBagConstraints gbc_btnGo3 = new GridBagConstraints();
		gbc_btnGo3.insets = new Insets(0, 0, 5, 5);
		gbc_btnGo3.gridx = 19;
		gbc_btnGo3.gridy = 12;
		this.add(getBtnGo3(), gbc_btnGo3);
	}
	
	private JLabel getLblItems() {
		if (lblItems == null) {
			lblItems = new JLabel("Select items for the party:");
		}
		return lblItems;
	}
	private JComboBox getCbType() {
		if (cbType == null) {
			cbType = new JComboBox();
		}
		return cbType;
	}
	private JButton getBtnBack3() {
		if (btnBack3 == null) {
			btnBack3 = new JButton("\u2190 Select place");
			btnBack3.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnBack3.addActionListener(a -> {
				((CardLayout)pnCard.getLayout()).show(pnCard,"pn2");
			});
		}
		return btnBack3;
	}
	private JButton getBtnGo3() {
		if (btnGo3 == null) {
			btnGo3 = new JButton("Cart \u2192");
			btnGo3.addActionListener(a -> {
				((CardLayout)pnCard.getLayout()).show(pnCard,"pn4");
			});
		}
		return btnGo3;
	}
	private JLabel getLblType() {
		if (lblType == null) {
			lblType = new JLabel("Type:");
		}
		return lblType;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name:");
		}
		return lblName;
	}
	private JComboBox getCbProduct() {
		if (cbProduct == null) {
			cbProduct = new JComboBox();
		}
		return cbProduct;
	}
	private JLabel getLblDescription() {
		if (lblDescription == null) {
			lblDescription = new JLabel("Description:");
		}
		return lblDescription;
	}
	private JLabel getLblImage() {
		if (lblImage == null) {
			lblImage = new JLabel("");
			Image iconImage = new ImageIcon(getClass().getResource("/img/icon.png")).getImage().getScaledInstance(100,
					100, Image.SCALE_DEFAULT);
			ImageIcon icon = new ImageIcon(iconImage);
			lblImage.setIcon(icon);
		}
		return lblImage;
	}
	private JLabel getLblUnitPrice() {
		if (lblUnitPrice == null) {
			lblUnitPrice = new JLabel("Unit price:");
		}
		return lblUnitPrice;
	}
	private JLabel getLblPrice() {
		if (lblPrice == null) {
			lblPrice = new JLabel("Price:");
		}
		return lblPrice;
	}
	private JTextField getTxtUnitPrice() {
		if (txtUnitPrice == null) {
			txtUnitPrice = new JTextField();
			txtUnitPrice.setText("0");
			txtUnitPrice.setColumns(10);
		}
		return txtUnitPrice;
	}
	private JTextField getTxtPrice() {
		if (txtPrice == null) {
			txtPrice = new JTextField();
			txtPrice.setColumns(10);
		}
		return txtPrice;
	}
	private JLabel getLblUnits() {
		if (lblUnits == null) {
			lblUnits = new JLabel("Units:");
		}
		return lblUnits;
	}
	private JSpinner getSpnUnits() {
		if (spnUnits == null) {
			spnUnits = new JSpinner();
		}
		return spnUnits;
	}
	private JTextArea getTxtAreaDesc() {
		if (txtAreaDesc == null) {
			txtAreaDesc = new JTextArea();
			txtAreaDesc.setEditable(false);
		}
		return txtAreaDesc;
	}
	private JLabel getLblChosenItems() {
		if (lblChosenItems == null) {
			lblChosenItems = new JLabel("Chosen items:");
		}
		return lblChosenItems;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}
