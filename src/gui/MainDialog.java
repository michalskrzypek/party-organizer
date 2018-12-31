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
	private static JPanel pnFirst;

	private static JPanel pnCard;
	private static JPanel pnSecond;
	private static JPanel pnThird;
	private static JPanel pnFourth;
	private static JPanel pnFifth;
	private static JPanel pnSixth;
	private static JPanel pnSeventh;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainDialog.class.getResource("/img/icon.png")));
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

	static JPanel getPnCard() {
		if (pnCard == null) {
			pnCard = new JPanel();
			pnCard.setLayout(new CardLayout(0, 0));
			pnCard.add(getPnFirst(), "pn1");
			pnCard.add(getPnSecond(), "pn2");
			pnCard.add(getPnThird(), "pn3");
			pnCard.add(getPnFourth(), "pn4");
			pnCard.add(getPnFifth(), "pn5");
			pnCard.add(getPnSixth(), "pn6");
			pnCard.add(getPnSeventh(), "pn7");
		}
		return pnCard;
	}

	private static JPanel getPnFirst() {
		if (pnFirst == null) {
			pnFirst = new FirstPanel();
		}
		return pnFirst;
	}

	private static JPanel getPnSecond() {
		if (pnSecond == null) {
			pnSecond = new SecondPanel();
		}
		return pnSecond;
	}

	private static JPanel getPnThird() {
		if (pnThird == null) {
			pnThird = new ThirdPanel();
		}
		return pnThird;
	}

	private static JPanel getPnFourth() {
		if (pnFourth == null) {
			pnFourth = new FourthPanel();
		}
		return pnFourth;
	}

	private static JPanel getPnFifth() {
		if (pnFifth == null) {
			pnFifth = new FifthPanel();
		}
		return pnFifth;
	}

	private static JPanel getPnSixth() {
		if (pnSixth == null) {
			pnSixth = new SixthPanel();
		}
		return pnSixth;
	}

	private static JPanel getPnSeventh() {
		if (pnSeventh == null) {
			pnSeventh = new SeventhPanel();
		}
		return pnSeventh;
	}
}
