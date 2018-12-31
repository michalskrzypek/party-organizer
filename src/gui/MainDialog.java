package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import org.jvnet.substance.SubstanceLookAndFeel;

import utils.ResourceConnector;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import java.awt.LayoutManager;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class MainDialog extends JDialog {

	private JPanel contentPane;
	
	private ResourceConnector rc = ResourceConnector.getInstance();
	private JPanel userPanel;
	private JButton btnLogin;
	private JButton btnSignUp;
	private JPanel northPanel;
	private JPanel centerPanel;
	private JLabel lblTitle;
	private JPanel pnFirst;
	private JButton btnBack1;
	private JButton btnGo1;
	private JLabel lbl1;
	private JLabel lbl2;
	private JSpinner spnPeople;
	private JPanel pnCard;
	private JPanel pnSecond;
	private JLabel lblPlace;
	private JButton btnGo2;
	private JButton btnBack2;
	private JComboBox cbPlace;
	private JPanel pnThird;
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
	private JPanel pnFourth;
	private JButton btnGo4;
	private JButton btnBack4;
	private JLabel lblCart;
	private JScrollPane spCart;
	private JTable tableCart;
	private JLabel lblTotal;
	private JTextField txtTotal;
	private JButton btnRemoveTheCart;
	private JPanel pnFifth;
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
	private JPanel pnSixth;
	private JLabel lblOrderDetails;
	private JScrollPane scrollPane;
	private JLabel label_1;
	private JTextField textField;
	private JButton btnPayment;
	private JPanel pnSeventh;
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
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame.setDefaultLookAndFeelDecorated(true);
					JDialog.setDefaultLookAndFeelDecorated(true);
					
					SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessSkin");
					MainDialog frame = new MainDialog();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public MainDialog() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow2.class.getResource("/img/icon.png")));
		setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		setTitle(rc.getTitle());
		setSize(900, 560);
		setResizable(true);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getNorthPanel(), BorderLayout.NORTH);
		contentPane.add(getCenterPanel(), BorderLayout.CENTER);
	}
	private JPanel getUserPanel() {
		if (userPanel == null) {
			userPanel = new JPanel();
			userPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
			userPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
			userPanel.setBorder(new LineBorder(Color.BLACK));
			userPanel.setLayout(new BoxLayout(userPanel, BoxLayout.X_AXIS));
			userPanel.add(getBtnLogin());
			userPanel.add(getBtnSignUp());
		}
		return userPanel;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Login");
			btnLogin.setBackground(SystemColor.activeCaption);
			btnLogin.setMnemonic('L');
			btnLogin.setAlignmentX(Component.RIGHT_ALIGNMENT);
		}
		return btnLogin;
	}
	private JButton getBtnSignUp() {
		if (btnSignUp == null) {
			btnSignUp = new JButton("Sign Up");
			btnSignUp.setBackground(SystemColor.activeCaption);
			btnSignUp.setMnemonic('S');
			btnSignUp.setAlignmentX(Component.RIGHT_ALIGNMENT);
		}
		return btnSignUp;
	}
	private JPanel getNorthPanel() {
		if (northPanel == null) {
			northPanel = new JPanel();
			northPanel.setBorder(new LineBorder(new Color(0, 51, 102), 2));
			northPanel.setBackground(new Color(51, 102, 204));
			northPanel.setLayout(new BorderLayout(0, 0));
			northPanel.add(getUserPanel(), BorderLayout.EAST);
		}
		return northPanel;
	}
	private JPanel getCenterPanel() {
		if (centerPanel == null) {
			centerPanel = new JPanel();
			centerPanel.setBackground(Color.PINK);
			centerPanel.setForeground(Color.PINK);
			centerPanel.setLayout(new BorderLayout(0, 0));
			centerPanel.add(getLabel_1(), BorderLayout.NORTH);
			centerPanel.add(getPnCard(), BorderLayout.CENTER);
		}
		return centerPanel;
	}
	private JLabel getLabel_1() {
		if (lblTitle == null) {
			lblTitle = new JLabel("Let's organize a party!");
			lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitle.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 34));
			lblTitle.setBackground(Color.PINK);
		}
		return lblTitle;
	}
	private JPanel getPnFirst() {
		if (pnFirst == null) {
			pnFirst = new JPanel();
			pnFirst.setBackground(Color.PINK);
			GridBagLayout gbl_pnFirst = new GridBagLayout();
			pnFirst.setLayout(gbl_pnFirst);
			GridBagConstraints gbc_lbl1 = new GridBagConstraints();
			gbc_lbl1.insets = new Insets(0, 0, 5, 5);
			gbc_lbl1.gridx = 7;
			gbc_lbl1.gridy = 5;
			pnFirst.add(getLbl1(), gbc_lbl1);
			GridBagConstraints gbc_spnPeople = new GridBagConstraints();
			gbc_spnPeople.ipady = 20;
			gbc_spnPeople.ipadx = 20;
			gbc_spnPeople.gridwidth = 3;
			gbc_spnPeople.gridheight = 2;
			gbc_spnPeople.insets = new Insets(0, 0, 5, 5);
			gbc_spnPeople.gridx = 9;
			gbc_spnPeople.gridy = 5;
			pnFirst.add(getSpnPeople(), gbc_spnPeople);
			GridBagConstraints gbc_lbl2 = new GridBagConstraints();
			gbc_lbl2.insets = new Insets(0, 0, 5, 5);
			gbc_lbl2.gridx = 7;
			gbc_lbl2.gridy = 6;
			pnFirst.add(getLbl2(), gbc_lbl2);
			GridBagConstraints gbc_btnGo1 = new GridBagConstraints();
			gbc_btnGo1.gridx = 20;
			gbc_btnGo1.gridy = 10;
			pnFirst.add(getButton_2(), gbc_btnGo1);
			GridBagConstraints gbc_btnBack1 = new GridBagConstraints();
			gbc_btnBack1.insets = new Insets(0, 0, 0, 5);
			gbc_btnBack1.gridx = 1;
			gbc_btnBack1.gridy = 10;
			pnFirst.add(getButton_1(), gbc_btnBack1);
		}
		return pnFirst;
	}
	private JButton getButton_1() {
		if (btnBack1 == null) {
			btnBack1 = new JButton("\u2190");
			btnBack1.setFont(new Font("Tahoma", Font.BOLD, 30));
		}
		return btnBack1;
	}
	private JButton getButton_2() {
		if (btnGo1 == null) {
			btnGo1 = new JButton("Select place \u2192");
			btnGo1.addActionListener(a -> {
				((CardLayout)pnCard.getLayout()).show(pnCard,"pnSecond");
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
	private JPanel getPnCard() {
		if (pnCard == null) {
			pnCard = new JPanel();
			pnCard.setLayout(new CardLayout(0, 0));
			pnCard.add(getPnFirst(), "pnFirst");
			pnCard.add(getPnSecond(), "pnSecond");
			pnCard.add(getPnThird(), "name_3496232240753");
			pnCard.add(getPnFourth(), "name_4724200708079");
			pnCard.add(getPnFifth(), "name_5284541229351");
			pnCard.add(getPnSixth(), "name_7083409392721");
			pnCard.add(getPnSeventh(), "name_7244486779758");
		}
		return pnCard;
	}
	private JPanel getPnSecond() {
		if (pnSecond == null) {
			pnSecond = new JPanel();
			pnSecond.setBackground(Color.PINK);
			GridBagLayout gbl_pnSecond = new GridBagLayout();
			pnSecond.setLayout(gbl_pnSecond);
			GridBagConstraints gbc_lblPlace = new GridBagConstraints();
			gbc_lblPlace.gridwidth = 4;
			gbc_lblPlace.insets = new Insets(0, 0, 5, 5);
			gbc_lblPlace.gridx = 7;
			gbc_lblPlace.gridy = 5;
			pnSecond.add(getLblPlace(), gbc_lblPlace);
			GridBagConstraints gbc_cbPlace = new GridBagConstraints();
			gbc_cbPlace.gridwidth = 4;
			gbc_cbPlace.insets = new Insets(0, 0, 5, 5);
			gbc_cbPlace.fill = GridBagConstraints.HORIZONTAL;
			gbc_cbPlace.gridx = 7;
			gbc_cbPlace.gridy = 6;
			pnSecond.add(getCbPlace(), gbc_cbPlace);
			GridBagConstraints gbc_btnBack2 = new GridBagConstraints();
			gbc_btnBack2.insets = new Insets(0, 0, 0, 5);
			gbc_btnBack2.gridx = 1;
			gbc_btnBack2.gridy = 10;
			pnSecond.add(getButton_1_1(), gbc_btnBack2);
			GridBagConstraints gbc_btnGo2 = new GridBagConstraints();
			gbc_btnGo2.gridx = 20;
			gbc_btnGo2.gridy = 10;
			pnSecond.add(getBtnGo2(), gbc_btnGo2);
		}
		return pnSecond;
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
		}
		return btnGo2;
	}
	private JButton getButton_1_1() {
		if (btnBack2 == null) {
			btnBack2 = new JButton("\u2190 Select people");
			btnBack2.setFont(new Font("Tahoma", Font.BOLD, 18));
		}
		return btnBack2;
	}
	private JComboBox getCbPlace() {
		if (cbPlace == null) {
			cbPlace = new JComboBox();
		}
		return cbPlace;
	}
	private JPanel getPnThird() {
		if (pnThird == null) {
			pnThird = new JPanel();
			pnThird.setBackground(Color.PINK);
			GridBagLayout gbl_pnThird = new GridBagLayout();
			gbl_pnThird.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_pnThird.rowHeights = new int[]{33, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_pnThird.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_pnThird.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			pnThird.setLayout(gbl_pnThird);
			GridBagConstraints gbc_lblItems = new GridBagConstraints();
			gbc_lblItems.gridwidth = 7;
			gbc_lblItems.insets = new Insets(0, 0, 5, 5);
			gbc_lblItems.gridx = 1;
			gbc_lblItems.gridy = 0;
			pnThird.add(getLblItems(), gbc_lblItems);
			GridBagConstraints gbc_lblChosenItems = new GridBagConstraints();
			gbc_lblChosenItems.gridwidth = 7;
			gbc_lblChosenItems.insets = new Insets(0, 0, 5, 5);
			gbc_lblChosenItems.gridx = 12;
			gbc_lblChosenItems.gridy = 0;
			pnThird.add(getLblChosenItems(), gbc_lblChosenItems);
			GridBagConstraints gbc_lblType = new GridBagConstraints();
			gbc_lblType.anchor = GridBagConstraints.EAST;
			gbc_lblType.insets = new Insets(0, 0, 5, 5);
			gbc_lblType.gridx = 1;
			gbc_lblType.gridy = 2;
			pnThird.add(getLblType(), gbc_lblType);
			GridBagConstraints gbc_textArea = new GridBagConstraints();
			gbc_textArea.gridheight = 8;
			gbc_textArea.gridwidth = 7;
			gbc_textArea.insets = new Insets(0, 0, 5, 5);
			gbc_textArea.fill = GridBagConstraints.BOTH;
			gbc_textArea.gridx = 12;
			gbc_textArea.gridy = 1;
			pnThird.add(getTextArea(), gbc_textArea);
			GridBagConstraints gbc_cbType = new GridBagConstraints();
			gbc_cbType.fill = GridBagConstraints.HORIZONTAL;
			gbc_cbType.gridwidth = 4;
			gbc_cbType.insets = new Insets(0, 0, 5, 5);
			gbc_cbType.gridx = 2;
			gbc_cbType.gridy = 2;
			pnThird.add(getCbType(), gbc_cbType);
			GridBagConstraints gbc_lblImage = new GridBagConstraints();
			gbc_lblImage.gridheight = 7;
			gbc_lblImage.gridwidth = 4;
			gbc_lblImage.insets = new Insets(0, 0, 5, 5);
			gbc_lblImage.gridx = 7;
			gbc_lblImage.gridy = 2;
			pnThird.add(getLblImage(), gbc_lblImage);
			GridBagConstraints gbc_lblName = new GridBagConstraints();
			gbc_lblName.anchor = GridBagConstraints.EAST;
			gbc_lblName.insets = new Insets(0, 0, 5, 5);
			gbc_lblName.gridx = 1;
			gbc_lblName.gridy = 3;
			pnThird.add(getLblName(), gbc_lblName);
			GridBagConstraints gbc_cbProduct = new GridBagConstraints();
			gbc_cbProduct.gridwidth = 4;
			gbc_cbProduct.insets = new Insets(0, 0, 5, 5);
			gbc_cbProduct.fill = GridBagConstraints.HORIZONTAL;
			gbc_cbProduct.gridx = 2;
			gbc_cbProduct.gridy = 3;
			pnThird.add(getCbProduct(), gbc_cbProduct);
			GridBagConstraints gbc_lblDescription = new GridBagConstraints();
			gbc_lblDescription.anchor = GridBagConstraints.EAST;
			gbc_lblDescription.insets = new Insets(0, 0, 5, 5);
			gbc_lblDescription.gridx = 1;
			gbc_lblDescription.gridy = 4;
			pnThird.add(getLblDescription(), gbc_lblDescription);
			GridBagConstraints gbc_txtAreaDesc = new GridBagConstraints();
			gbc_txtAreaDesc.gridheight = 4;
			gbc_txtAreaDesc.gridwidth = 4;
			gbc_txtAreaDesc.insets = new Insets(0, 0, 5, 5);
			gbc_txtAreaDesc.fill = GridBagConstraints.BOTH;
			gbc_txtAreaDesc.gridx = 2;
			gbc_txtAreaDesc.gridy = 4;
			pnThird.add(getTxtAreaDesc(), gbc_txtAreaDesc);
			GridBagConstraints gbc_lblUnitPrice = new GridBagConstraints();
			gbc_lblUnitPrice.insets = new Insets(0, 0, 5, 5);
			gbc_lblUnitPrice.gridx = 2;
			gbc_lblUnitPrice.gridy = 9;
			pnThird.add(getLblUnitPrice(), gbc_lblUnitPrice);
			GridBagConstraints gbc_lblPrice = new GridBagConstraints();
			gbc_lblPrice.insets = new Insets(0, 0, 5, 5);
			gbc_lblPrice.gridx = 3;
			gbc_lblPrice.gridy = 9;
			pnThird.add(getLblPrice(), gbc_lblPrice);
			GridBagConstraints gbc_txtUnitPrice = new GridBagConstraints();
			gbc_txtUnitPrice.insets = new Insets(0, 0, 5, 5);
			gbc_txtUnitPrice.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtUnitPrice.gridx = 2;
			gbc_txtUnitPrice.gridy = 10;
			pnThird.add(getTxtUnitPrice(), gbc_txtUnitPrice);
			GridBagConstraints gbc_txtPrice = new GridBagConstraints();
			gbc_txtPrice.anchor = GridBagConstraints.NORTH;
			gbc_txtPrice.insets = new Insets(0, 0, 5, 5);
			gbc_txtPrice.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtPrice.gridx = 3;
			gbc_txtPrice.gridy = 10;
			pnThird.add(getTxtPrice(), gbc_txtPrice);
			GridBagConstraints gbc_lblUnits = new GridBagConstraints();
			gbc_lblUnits.anchor = GridBagConstraints.EAST;
			gbc_lblUnits.insets = new Insets(0, 0, 5, 5);
			gbc_lblUnits.gridx = 1;
			gbc_lblUnits.gridy = 11;
			pnThird.add(getLblUnits(), gbc_lblUnits);
			GridBagConstraints gbc_spnUnits = new GridBagConstraints();
			gbc_spnUnits.anchor = GridBagConstraints.WEST;
			gbc_spnUnits.gridwidth = 2;
			gbc_spnUnits.ipadx = 50;
			gbc_spnUnits.insets = new Insets(0, 0, 5, 5);
			gbc_spnUnits.gridx = 2;
			gbc_spnUnits.gridy = 11;
			pnThird.add(getSpnUnits(), gbc_spnUnits);
			GridBagConstraints gbc_btnBack3 = new GridBagConstraints();
			gbc_btnBack3.insets = new Insets(0, 0, 5, 5);
			gbc_btnBack3.gridx = 1;
			gbc_btnBack3.gridy = 12;
			pnThird.add(getBtnBack3(), gbc_btnBack3);
			GridBagConstraints gbc_btnGo3 = new GridBagConstraints();
			gbc_btnGo3.insets = new Insets(0, 0, 5, 5);
			gbc_btnGo3.gridx = 19;
			gbc_btnGo3.gridy = 12;
			pnThird.add(getButton_1_2(), gbc_btnGo3);
		}
		return pnThird;
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
		}
		return btnBack3;
	}
	private JButton getButton_1_2() {
		if (btnGo3 == null) {
			btnGo3 = new JButton("Cart \u2192");
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
	private JPanel getPnFourth() {
		if (pnFourth == null) {
			pnFourth = new JPanel();
			pnFourth.setBackground(Color.PINK);
			GridBagLayout gbl_pnFourth = new GridBagLayout();
			gbl_pnFourth.columnWidths = new int[]{0, 0, 0, 55, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_pnFourth.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_pnFourth.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_pnFourth.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			pnFourth.setLayout(gbl_pnFourth);
			GridBagConstraints gbc_lblCart = new GridBagConstraints();
			gbc_lblCart.gridwidth = 4;
			gbc_lblCart.insets = new Insets(0, 0, 5, 5);
			gbc_lblCart.gridx = 6;
			gbc_lblCart.gridy = 0;
			pnFourth.add(getLblCart(), gbc_lblCart);
			GridBagConstraints gbc_spCart = new GridBagConstraints();
			gbc_spCart.gridheight = 8;
			gbc_spCart.gridwidth = 14;
			gbc_spCart.insets = new Insets(0, 0, 5, 5);
			gbc_spCart.fill = GridBagConstraints.BOTH;
			gbc_spCart.gridx = 3;
			gbc_spCart.gridy = 1;
			pnFourth.add(getSpCart(), gbc_spCart);
			GridBagConstraints gbc_btnRemoveTheCart = new GridBagConstraints();
			gbc_btnRemoveTheCart.gridwidth = 2;
			gbc_btnRemoveTheCart.insets = new Insets(0, 0, 5, 5);
			gbc_btnRemoveTheCart.gridx = 3;
			gbc_btnRemoveTheCart.gridy = 9;
			pnFourth.add(getBtnRemoveTheCart(), gbc_btnRemoveTheCart);
			GridBagConstraints gbc_lblTotal = new GridBagConstraints();
			gbc_lblTotal.anchor = GridBagConstraints.EAST;
			gbc_lblTotal.insets = new Insets(0, 0, 5, 5);
			gbc_lblTotal.gridx = 12;
			gbc_lblTotal.gridy = 9;
			pnFourth.add(getLblTotal(), gbc_lblTotal);
			GridBagConstraints gbc_txtTotal = new GridBagConstraints();
			gbc_txtTotal.gridwidth = 4;
			gbc_txtTotal.anchor = GridBagConstraints.NORTH;
			gbc_txtTotal.insets = new Insets(0, 0, 5, 5);
			gbc_txtTotal.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtTotal.gridx = 13;
			gbc_txtTotal.gridy = 9;
			pnFourth.add(getTextField_1(), gbc_txtTotal);
			GridBagConstraints gbc_btnBack4 = new GridBagConstraints();
			gbc_btnBack4.insets = new Insets(0, 0, 0, 5);
			gbc_btnBack4.gridx = 1;
			gbc_btnBack4.gridy = 10;
			pnFourth.add(getButton_1_3(), gbc_btnBack4);
			GridBagConstraints gbc_btnGo4 = new GridBagConstraints();
			gbc_btnGo4.gridx = 20;
			gbc_btnGo4.gridy = 10;
			pnFourth.add(getBtnGo4(), gbc_btnGo4);
		}
		return pnFourth;
	}
	private JButton getBtnGo4() {
		if (btnGo4 == null) {
			btnGo4 = new JButton("Continue \u2192");
		}
		return btnGo4;
	}
	private JButton getButton_1_3() {
		if (btnBack4 == null) {
			btnBack4 = new JButton("Add another item");
			btnBack4.setFont(new Font("Tahoma", Font.PLAIN, 12));
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
	private JPanel getPnFifth() {
		if (pnFifth == null) {
			pnFifth = new JPanel();
			pnFifth.setBackground(Color.PINK);
			GridBagLayout gbl_pnFifth = new GridBagLayout();
			gbl_pnFifth.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 47, 0, 0};
			gbl_pnFifth.rowHeights = new int[]{33, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_pnFifth.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_pnFifth.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			pnFifth.setLayout(gbl_pnFifth);
			GridBagConstraints gbc_lblProvideUsWith = new GridBagConstraints();
			gbc_lblProvideUsWith.anchor = GridBagConstraints.EAST;
			gbc_lblProvideUsWith.gridwidth = 2;
			gbc_lblProvideUsWith.insets = new Insets(0, 0, 5, 5);
			gbc_lblProvideUsWith.gridx = 1;
			gbc_lblProvideUsWith.gridy = 1;
			pnFifth.add(getLblProvideUsWith(), gbc_lblProvideUsWith);
			GridBagConstraints gbc_lblDateAndTime = new GridBagConstraints();
			gbc_lblDateAndTime.gridwidth = 11;
			gbc_lblDateAndTime.insets = new Insets(0, 0, 5, 5);
			gbc_lblDateAndTime.gridx = 7;
			gbc_lblDateAndTime.gridy = 1;
			pnFifth.add(getLblDateAndTime(), gbc_lblDateAndTime);
			GridBagConstraints gbc_lblYourName = new GridBagConstraints();
			gbc_lblYourName.anchor = GridBagConstraints.EAST;
			gbc_lblYourName.insets = new Insets(0, 0, 5, 5);
			gbc_lblYourName.gridx = 1;
			gbc_lblYourName.gridy = 2;
			pnFifth.add(getLblYourName(), gbc_lblYourName);
			GridBagConstraints gbc_txtName = new GridBagConstraints();
			gbc_txtName.insets = new Insets(0, 0, 5, 5);
			gbc_txtName.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtName.gridx = 2;
			gbc_txtName.gridy = 2;
			pnFifth.add(getTextField_2_1(), gbc_txtName);
			GridBagConstraints gbc_pnDate = new GridBagConstraints();
			gbc_pnDate.gridwidth = 9;
			gbc_pnDate.insets = new Insets(0, 0, 5, 5);
			gbc_pnDate.fill = GridBagConstraints.BOTH;
			gbc_pnDate.gridx = 8;
			gbc_pnDate.gridy = 2;
			pnFifth.add(getPnDate(), gbc_pnDate);
			GridBagConstraints gbc_lblYourSurname = new GridBagConstraints();
			gbc_lblYourSurname.anchor = GridBagConstraints.EAST;
			gbc_lblYourSurname.insets = new Insets(0, 0, 5, 5);
			gbc_lblYourSurname.gridx = 1;
			gbc_lblYourSurname.gridy = 3;
			pnFifth.add(getLblYourSurname(), gbc_lblYourSurname);
			GridBagConstraints gbc_txtSurname = new GridBagConstraints();
			gbc_txtSurname.insets = new Insets(0, 0, 5, 5);
			gbc_txtSurname.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtSurname.gridx = 2;
			gbc_txtSurname.gridy = 3;
			pnFifth.add(getTextField_2_2(), gbc_txtSurname);
			GridBagConstraints gbc_pnTime = new GridBagConstraints();
			gbc_pnTime.gridwidth = 9;
			gbc_pnTime.insets = new Insets(0, 0, 5, 5);
			gbc_pnTime.fill = GridBagConstraints.BOTH;
			gbc_pnTime.gridx = 8;
			gbc_pnTime.gridy = 3;
			pnFifth.add(getPnTime(), gbc_pnTime);
			GridBagConstraints gbc_lblNationalId = new GridBagConstraints();
			gbc_lblNationalId.anchor = GridBagConstraints.EAST;
			gbc_lblNationalId.insets = new Insets(0, 0, 5, 5);
			gbc_lblNationalId.gridx = 1;
			gbc_lblNationalId.gridy = 4;
			pnFifth.add(getLblNationalId(), gbc_lblNationalId);
			GridBagConstraints gbc_txtId = new GridBagConstraints();
			gbc_txtId.insets = new Insets(0, 0, 5, 5);
			gbc_txtId.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtId.gridx = 2;
			gbc_txtId.gridy = 4;
			pnFifth.add(getTextField_2_3(), gbc_txtId);
			GridBagConstraints gbc_lblCommentToThe = new GridBagConstraints();
			gbc_lblCommentToThe.gridwidth = 9;
			gbc_lblCommentToThe.insets = new Insets(0, 0, 5, 5);
			gbc_lblCommentToThe.gridx = 8;
			gbc_lblCommentToThe.gridy = 4;
			pnFifth.add(getLblCommentToThe(), gbc_lblCommentToThe);
			GridBagConstraints gbc_lblPhone = new GridBagConstraints();
			gbc_lblPhone.anchor = GridBagConstraints.EAST;
			gbc_lblPhone.insets = new Insets(0, 0, 5, 5);
			gbc_lblPhone.gridx = 1;
			gbc_lblPhone.gridy = 5;
			pnFifth.add(getLblPhone(), gbc_lblPhone);
			GridBagConstraints gbc_txtPhone = new GridBagConstraints();
			gbc_txtPhone.insets = new Insets(0, 0, 5, 5);
			gbc_txtPhone.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtPhone.gridx = 2;
			gbc_txtPhone.gridy = 5;
			pnFifth.add(getTextField_2_4(), gbc_txtPhone);
			GridBagConstraints gbc_txtrComment = new GridBagConstraints();
			gbc_txtrComment.gridheight = 4;
			gbc_txtrComment.gridwidth = 9;
			gbc_txtrComment.insets = new Insets(0, 0, 5, 5);
			gbc_txtrComment.fill = GridBagConstraints.BOTH;
			gbc_txtrComment.gridx = 8;
			gbc_txtrComment.gridy = 5;
			pnFifth.add(getTxtrComment(), gbc_txtrComment);
			GridBagConstraints gbc_btnBack5 = new GridBagConstraints();
			gbc_btnBack5.insets = new Insets(0, 0, 5, 5);
			gbc_btnBack5.gridx = 1;
			gbc_btnBack5.gridy = 12;
			pnFifth.add(getBtnBack5(), gbc_btnBack5);
			GridBagConstraints gbc_btnGo5 = new GridBagConstraints();
			gbc_btnGo5.insets = new Insets(0, 0, 5, 5);
			gbc_btnGo5.gridx = 19;
			gbc_btnGo5.gridy = 12;
			pnFifth.add(getButton_1_4(), gbc_btnGo5);
		}
		return pnFifth;
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
		}
		return btnBack5;
	}
	private JButton getButton_1_4() {
		if (btnGo5 == null) {
			btnGo5 = new JButton("Order details \u2192");
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
			pnDate.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Date", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
			comboBox_1.setSelectedIndex(0);
		}
		return comboBox_1;
	}
	private JComboBox<Integer> getComboBox_2() {
		if (comboBox_2 == null) {
			comboBox_2 = new JComboBox<Integer>();
			comboBox_2.setSelectedIndex(0);
		}
		return comboBox_2;
	}
	private JPanel getPnTime() {
		if (pnTime == null) {
			pnTime = new JPanel((LayoutManager) null);
			pnTime.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Time", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
	private JPanel getPnSixth() {
		if (pnSixth == null) {
			pnSixth = new JPanel();
			pnSixth.setBackground(Color.PINK);
			GridBagLayout gbl_pnSixth = new GridBagLayout();
			gbl_pnSixth.columnWidths = new int[]{0, 0, 0, 55, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_pnSixth.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_pnSixth.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_pnSixth.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			pnSixth.setLayout(gbl_pnSixth);
			GridBagConstraints gbc_lblOrderDetails = new GridBagConstraints();
			gbc_lblOrderDetails.gridwidth = 4;
			gbc_lblOrderDetails.insets = new Insets(0, 0, 5, 5);
			gbc_lblOrderDetails.gridx = 6;
			gbc_lblOrderDetails.gridy = 0;
			pnSixth.add(getLblOrderDetails(), gbc_lblOrderDetails);
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridheight = 8;
			gbc_scrollPane.gridwidth = 14;
			gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
			gbc_scrollPane.gridx = 3;
			gbc_scrollPane.gridy = 1;
			pnSixth.add(getScrollPane(), gbc_scrollPane);
			GridBagConstraints gbc_label_1 = new GridBagConstraints();
			gbc_label_1.anchor = GridBagConstraints.EAST;
			gbc_label_1.insets = new Insets(0, 0, 5, 5);
			gbc_label_1.gridx = 12;
			gbc_label_1.gridy = 9;
			pnSixth.add(getLabel_1_1(), gbc_label_1);
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.anchor = GridBagConstraints.NORTH;
			gbc_textField.gridwidth = 4;
			gbc_textField.insets = new Insets(0, 0, 5, 5);
			gbc_textField.gridx = 13;
			gbc_textField.gridy = 9;
			pnSixth.add(getTextField_2(), gbc_textField);
			GridBagConstraints gbc_btnPayment = new GridBagConstraints();
			gbc_btnPayment.gridx = 20;
			gbc_btnPayment.gridy = 10;
			pnSixth.add(getButton_2_1(), gbc_btnPayment);
		}
		return pnSixth;
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
	private JPanel getPnSeventh() {
		if (pnSeventh == null) {
			pnSeventh = new JPanel();
			pnSeventh.setBackground(Color.PINK);
			GridBagLayout gbl_pnSeventh = new GridBagLayout();
			gbl_pnSeventh.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 47, 0, 0};
			gbl_pnSeventh.rowHeights = new int[]{33, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_pnSeventh.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_pnSeventh.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			pnSeventh.setLayout(gbl_pnSeventh);
			GridBagConstraints gbc_lblPaymentDetails = new GridBagConstraints();
			gbc_lblPaymentDetails.gridwidth = 13;
			gbc_lblPaymentDetails.insets = new Insets(0, 0, 5, 5);
			gbc_lblPaymentDetails.gridx = 3;
			gbc_lblPaymentDetails.gridy = 0;
			pnSeventh.add(getLblPaymentDetails(), gbc_lblPaymentDetails);
			GridBagConstraints gbc_lblCardHolder = new GridBagConstraints();
			gbc_lblCardHolder.anchor = GridBagConstraints.EAST;
			gbc_lblCardHolder.insets = new Insets(0, 0, 5, 5);
			gbc_lblCardHolder.gridx = 2;
			gbc_lblCardHolder.gridy = 1;
			pnSeventh.add(getLblCardHolder(), gbc_lblCardHolder);
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.gridwidth = 5;
			gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_1.insets = new Insets(0, 0, 5, 5);
			gbc_textField_1.gridx = 2;
			gbc_textField_1.gridy = 2;
			pnSeventh.add(getTextField_1_1(), gbc_textField_1);
			GridBagConstraints gbc_lblCardNumber = new GridBagConstraints();
			gbc_lblCardNumber.anchor = GridBagConstraints.EAST;
			gbc_lblCardNumber.insets = new Insets(0, 0, 5, 5);
			gbc_lblCardNumber.gridx = 2;
			gbc_lblCardNumber.gridy = 3;
			pnSeventh.add(getLblCardNumber(), gbc_lblCardNumber);
			GridBagConstraints gbc_txtNumber = new GridBagConstraints();
			gbc_txtNumber.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtNumber.insets = new Insets(0, 0, 5, 5);
			gbc_txtNumber.gridx = 2;
			gbc_txtNumber.gridy = 4;
			pnSeventh.add(getTxtNumber(), gbc_txtNumber);
			GridBagConstraints gbc_lblExpirationDate = new GridBagConstraints();
			gbc_lblExpirationDate.anchor = GridBagConstraints.EAST;
			gbc_lblExpirationDate.insets = new Insets(0, 0, 5, 5);
			gbc_lblExpirationDate.gridx = 2;
			gbc_lblExpirationDate.gridy = 5;
			pnSeventh.add(getLblExpirationDate(), gbc_lblExpirationDate);
			GridBagConstraints gbc_txtDate = new GridBagConstraints();
			gbc_txtDate.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtDate.insets = new Insets(0, 0, 5, 5);
			gbc_txtDate.gridx = 2;
			gbc_txtDate.gridy = 6;
			pnSeventh.add(getTxtDate(), gbc_txtDate);
			GridBagConstraints gbc_lblCvcCode = new GridBagConstraints();
			gbc_lblCvcCode.anchor = GridBagConstraints.EAST;
			gbc_lblCvcCode.insets = new Insets(0, 0, 5, 5);
			gbc_lblCvcCode.gridx = 2;
			gbc_lblCvcCode.gridy = 7;
			pnSeventh.add(getLblCvcCode(), gbc_lblCvcCode);
			GridBagConstraints gbc_txtCVC = new GridBagConstraints();
			gbc_txtCVC.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtCVC.insets = new Insets(0, 0, 5, 5);
			gbc_txtCVC.gridx = 2;
			gbc_txtCVC.gridy = 8;
			pnSeventh.add(getTextField_2_5(), gbc_txtCVC);
			GridBagConstraints gbc_btnBack7 = new GridBagConstraints();
			gbc_btnBack7.insets = new Insets(0, 0, 5, 5);
			gbc_btnBack7.gridx = 1;
			gbc_btnBack7.gridy = 12;
			pnSeventh.add(getButton_3(), gbc_btnBack7);
			GridBagConstraints gbc_btnGo7 = new GridBagConstraints();
			gbc_btnGo7.insets = new Insets(0, 0, 5, 5);
			gbc_btnGo7.gridx = 19;
			gbc_btnGo7.gridy = 12;
			pnSeventh.add(getButton_1_6(), gbc_btnGo7);
		}
		return pnSeventh;
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
