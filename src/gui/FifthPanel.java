package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class FifthPanel extends JPanel {

	private JLabel lblProvideUsWith;
	private JLabel lblYourName;
	private JLabel lblYourSurname;
	private JLabel lblNationalId;
	private JButton btnBack5;
	private JButton btnGo5;
	private JLabel lblPhone;
	private JTextField txtName;
	private JTextField txtSurname;
	private JTextField txtId;
	private JTextField txtPhone;
	private JLabel lblDateAndTime;
	private JPanel pnDate;
	private JComboBox<Integer> comboBox;
	private JComboBox<String> comboBox_1;
	private JComboBox<Integer> comboBox_2;
	private JPanel pnTime;
	private JSpinner spinnerHour;
	private JLabel lblCommentToThe;
	private JTextArea txtrComment;

	private JPanel pnCard;

	public FifthPanel() {
		pnCard = MainDialog.getPnCard();

		this.setBackground(Color.PINK);
		GridBagLayout gbl_this = new GridBagLayout();
		gbl_this.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 47, 0, 0 };
		gbl_this.rowHeights = new int[] { 33, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_this.columnWeights = new double[] { 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_this.rowWeights = new double[] { 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		this.setLayout(gbl_this);
		GridBagConstraints gbc_lblProvideUsWith = new GridBagConstraints();
		gbc_lblProvideUsWith.anchor = GridBagConstraints.EAST;
		gbc_lblProvideUsWith.gridwidth = 2;
		gbc_lblProvideUsWith.insets = new Insets(0, 0, 5, 5);
		gbc_lblProvideUsWith.gridx = 1;
		gbc_lblProvideUsWith.gridy = 1;
		this.add(getLblProvideUsWith(), gbc_lblProvideUsWith);
		GridBagConstraints gbc_lblDateAndTime = new GridBagConstraints();
		gbc_lblDateAndTime.gridwidth = 11;
		gbc_lblDateAndTime.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateAndTime.gridx = 7;
		gbc_lblDateAndTime.gridy = 1;
		this.add(getLblDateAndTime(), gbc_lblDateAndTime);
		GridBagConstraints gbc_lblYourName = new GridBagConstraints();
		gbc_lblYourName.anchor = GridBagConstraints.EAST;
		gbc_lblYourName.insets = new Insets(0, 0, 5, 5);
		gbc_lblYourName.gridx = 1;
		gbc_lblYourName.gridy = 2;
		this.add(getLblYourName(), gbc_lblYourName);
		GridBagConstraints gbc_txtName = new GridBagConstraints();
		gbc_txtName.insets = new Insets(0, 0, 5, 5);
		gbc_txtName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtName.gridx = 2;
		gbc_txtName.gridy = 2;
		this.add(getTextField_2_1(), gbc_txtName);
		GridBagConstraints gbc_pnDate = new GridBagConstraints();
		gbc_pnDate.gridwidth = 9;
		gbc_pnDate.insets = new Insets(0, 0, 5, 5);
		gbc_pnDate.fill = GridBagConstraints.BOTH;
		gbc_pnDate.gridx = 8;
		gbc_pnDate.gridy = 2;
		this.add(getPnDate(), gbc_pnDate);
		GridBagConstraints gbc_lblYourSurname = new GridBagConstraints();
		gbc_lblYourSurname.anchor = GridBagConstraints.EAST;
		gbc_lblYourSurname.insets = new Insets(0, 0, 5, 5);
		gbc_lblYourSurname.gridx = 1;
		gbc_lblYourSurname.gridy = 3;
		this.add(getLblYourSurname(), gbc_lblYourSurname);
		GridBagConstraints gbc_txtSurname = new GridBagConstraints();
		gbc_txtSurname.insets = new Insets(0, 0, 5, 5);
		gbc_txtSurname.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSurname.gridx = 2;
		gbc_txtSurname.gridy = 3;
		this.add(getTextField_2_2(), gbc_txtSurname);
		GridBagConstraints gbc_pnTime = new GridBagConstraints();
		gbc_pnTime.gridwidth = 9;
		gbc_pnTime.insets = new Insets(0, 0, 5, 5);
		gbc_pnTime.fill = GridBagConstraints.BOTH;
		gbc_pnTime.gridx = 8;
		gbc_pnTime.gridy = 3;
		this.add(getPnTime(), gbc_pnTime);
		GridBagConstraints gbc_lblNationalId = new GridBagConstraints();
		gbc_lblNationalId.anchor = GridBagConstraints.EAST;
		gbc_lblNationalId.insets = new Insets(0, 0, 5, 5);
		gbc_lblNationalId.gridx = 1;
		gbc_lblNationalId.gridy = 4;
		this.add(getLblNationalId(), gbc_lblNationalId);
		GridBagConstraints gbc_txtId = new GridBagConstraints();
		gbc_txtId.insets = new Insets(0, 0, 5, 5);
		gbc_txtId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtId.gridx = 2;
		gbc_txtId.gridy = 4;
		this.add(getTextField_2_3(), gbc_txtId);
		GridBagConstraints gbc_lblCommentToThe = new GridBagConstraints();
		gbc_lblCommentToThe.gridwidth = 9;
		gbc_lblCommentToThe.insets = new Insets(0, 0, 5, 5);
		gbc_lblCommentToThe.gridx = 8;
		gbc_lblCommentToThe.gridy = 4;
		this.add(getLblCommentToThe(), gbc_lblCommentToThe);
		GridBagConstraints gbc_lblPhone = new GridBagConstraints();
		gbc_lblPhone.anchor = GridBagConstraints.EAST;
		gbc_lblPhone.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhone.gridx = 1;
		gbc_lblPhone.gridy = 5;
		this.add(getLblPhone(), gbc_lblPhone);
		GridBagConstraints gbc_txtPhone = new GridBagConstraints();
		gbc_txtPhone.insets = new Insets(0, 0, 5, 5);
		gbc_txtPhone.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPhone.gridx = 2;
		gbc_txtPhone.gridy = 5;
		this.add(getTextField_2_4(), gbc_txtPhone);
		GridBagConstraints gbc_txtrComment = new GridBagConstraints();
		gbc_txtrComment.gridheight = 4;
		gbc_txtrComment.gridwidth = 9;
		gbc_txtrComment.insets = new Insets(0, 0, 5, 5);
		gbc_txtrComment.fill = GridBagConstraints.BOTH;
		gbc_txtrComment.gridx = 8;
		gbc_txtrComment.gridy = 5;
		this.add(getTxtrComment(), gbc_txtrComment);
		GridBagConstraints gbc_btnBack5 = new GridBagConstraints();
		gbc_btnBack5.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack5.gridx = 1;
		gbc_btnBack5.gridy = 12;
		this.add(getBtnBack5(), gbc_btnBack5);
		GridBagConstraints gbc_btnGo5 = new GridBagConstraints();
		gbc_btnGo5.insets = new Insets(0, 0, 5, 5);
		gbc_btnGo5.gridx = 19;
		gbc_btnGo5.gridy = 12;
		this.add(getBtnGo5(), gbc_btnGo5);
	}

	private JLabel getLblProvideUsWith() {
		if (lblProvideUsWith == null) {
			lblProvideUsWith = new JLabel("Provide us with all the imprtant information:");
		}
		return lblProvideUsWith;
	}

	private JLabel getLblYourName() {
		if (lblYourName == null) {
			lblYourName = new JLabel("Your name:");
		}
		return lblYourName;
	}

	private JLabel getLblYourSurname() {
		if (lblYourSurname == null) {
			lblYourSurname = new JLabel("Your surname:");
		}
		return lblYourSurname;
	}

	private JLabel getLblNationalId() {
		if (lblNationalId == null) {
			lblNationalId = new JLabel("National ID:");
		}
		return lblNationalId;
	}

	private JButton getBtnBack5() {
		if (btnBack5 == null) {
			btnBack5 = new JButton("\u2190 Cart");
			btnBack5.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnBack5.addActionListener(a -> {
				((CardLayout) pnCard.getLayout()).show(pnCard, "pn4");
			});
		}
		return btnBack5;
	}

	private JButton getBtnGo5() {
		if (btnGo5 == null) {
			btnGo5 = new JButton("Order details \u2192");
			btnGo5.addActionListener(a -> {
				((CardLayout) pnCard.getLayout()).show(pnCard, "pn6");
			});
		}
		return btnGo5;
	}

	private JLabel getLblPhone() {
		if (lblPhone == null) {
			lblPhone = new JLabel("Phone:");
		}
		return lblPhone;
	}

	private JTextField getTextField_2_1() {
		if (txtName == null) {
			txtName = new JTextField();
			txtName.setText("txtName");
			txtName.setColumns(10);
		}
		return txtName;
	}

	private JTextField getTextField_2_2() {
		if (txtSurname == null) {
			txtSurname = new JTextField();
			txtSurname.setText("Surname");
			txtSurname.setColumns(10);
		}
		return txtSurname;
	}

	private JTextField getTextField_2_3() {
		if (txtId == null) {
			txtId = new JTextField();
			txtId.setText("ID");
			txtId.setColumns(10);
		}
		return txtId;
	}

	private JTextField getTextField_2_4() {
		if (txtPhone == null) {
			txtPhone = new JTextField();
			txtPhone.setText("Phone");
			txtPhone.setColumns(10);
		}
		return txtPhone;
	}

	private JLabel getLblDateAndTime() {
		if (lblDateAndTime == null) {
			lblDateAndTime = new JLabel("Date and time of the party:");
		}
		return lblDateAndTime;
	}

	private JPanel getPnDate() {
		if (pnDate == null) {
			pnDate = new JPanel((LayoutManager) null);
			pnDate.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Date", TitledBorder.LEADING,
					TitledBorder.TOP, null, new Color(0, 0, 0)));
			pnDate.setBackground(Color.WHITE);
			pnDate.setLayout(new BorderLayout());
			pnDate.add(getComboBox(), BorderLayout.CENTER);
			pnDate.add(getComboBox_1(), BorderLayout.WEST);
			pnDate.add(getComboBox_2(), BorderLayout.EAST);
		}
		return pnDate;
	}

	private JComboBox<Integer> getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox<Integer>();
			comboBox.setSelectedIndex(-1);
		}
		return comboBox;
	}

	private JComboBox<String> getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox<String>();
//			comboBox_1.setSelectedIndex(0);
		}
		return comboBox_1;
	}

	private JComboBox<Integer> getComboBox_2() {
		if (comboBox_2 == null) {
			comboBox_2 = new JComboBox<Integer>();
//			comboBox_2.setSelectedIndex(0);
		}
		return comboBox_2;
	}

	private JPanel getPnTime() {
		if (pnTime == null) {
			pnTime = new JPanel((LayoutManager) null);
			pnTime.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Time", TitledBorder.LEADING,
					TitledBorder.TOP, null, new Color(0, 0, 0)));
			pnTime.setBackground(Color.WHITE);
			pnTime.setLayout(new BorderLayout());
			pnTime.add(getSpinnerHour(), BorderLayout.WEST);
		}
		return pnTime;
	}

	private JSpinner getSpinnerHour() {
		if (spinnerHour == null) {
			spinnerHour = new JSpinner();
		}
		return spinnerHour;
	}

	private JLabel getLblCommentToThe() {
		if (lblCommentToThe == null) {
			lblCommentToThe = new JLabel("Comment to the order:");
		}
		return lblCommentToThe;
	}

	private JTextArea getTxtrComment() {
		if (txtrComment == null) {
			txtrComment = new JTextArea();
			txtrComment.setText("Comment");
		}
		return txtrComment;
	}

}
