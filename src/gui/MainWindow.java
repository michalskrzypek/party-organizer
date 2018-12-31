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

public class MainWindow extends JFrame {

	private JPanel contentPane;
	
	private ResourceConnector rc = ResourceConnector.getInstance();
	private JPanel userPanel;
	private JButton btnLogin;
	private JButton btnSignUp;
	private JPanel northPanel;
	private JPanel mainPanel;
	private JLabel lblWelcomeToThe;
	private JLabel lblPartyOrganizer;
	private JPanel titlePanel;
	private JButton button;
	private JLabel label;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame.setDefaultLookAndFeelDecorated(true);
					JDialog.setDefaultLookAndFeelDecorated(true);
					
					SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessSkin");
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public MainWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/img/icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(rc.getTitle());
		setSize(900, 560);
		setResizable(true);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getNorthPanel(), BorderLayout.NORTH);
		contentPane.add(getMainPanel(), BorderLayout.CENTER);
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
	private JPanel getMainPanel() {
		if (mainPanel == null) {
			mainPanel = new JPanel();
			mainPanel.setBackground(Color.PINK);
			GridBagLayout gbl_mainPanel = new GridBagLayout();
			gbl_mainPanel.columnWeights = new double[]{1.0};
			gbl_mainPanel.rowWeights = new double[]{0.0, 0.0, 0.0};
			mainPanel.setLayout(gbl_mainPanel);
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.ipadx = 40;
			gbc_button.ipady = 40;
			gbc_button.gridheight = 2;
			gbc_button.insets = new Insets(0, 0, 5, 0);
			gbc_button.gridx = 0;
			gbc_button.gridy = 2;
			mainPanel.add(getButton(), gbc_button);
			GridBagConstraints gbc_titlePanel = new GridBagConstraints();
			gbc_titlePanel.fill = GridBagConstraints.HORIZONTAL;
			gbc_titlePanel.gridx = 0;
			gbc_titlePanel.gridy = 0;
			mainPanel.add(getTitlePanel(), gbc_titlePanel);
		}
		return mainPanel;
	}
	private JLabel getLblWelcomeToThe() {
		if (lblWelcomeToThe == null) {
			lblWelcomeToThe = new JLabel("Welcome to the");
			lblWelcomeToThe.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 34));
		}
		return lblWelcomeToThe;
	}
	private JLabel getLblPartyOrganizer() {
		if (lblPartyOrganizer == null) {
			lblPartyOrganizer = new JLabel("PARTY ORGANIZER");
			lblPartyOrganizer.setFont(new Font("Segoe Script", Font.BOLD, 48));
		}
		return lblPartyOrganizer;
	}
	private JPanel getTitlePanel() {
		if (titlePanel == null) {
			titlePanel = new JPanel();
			titlePanel.setBackground(Color.PINK);
			titlePanel.setLayout(new GridBagLayout());
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.ipadx = 10;
			gbc.gridwidth = 3;
			gbc.insets = new Insets(0, 0, 5, 0);
			gbc.gridx = 0;
			gbc.gridy = 0;
			titlePanel.add(getLblWelcomeToThe(), gbc);
			GridBagConstraints gbc2 = new GridBagConstraints();
			gbc2.gridwidth = 3;
			gbc2.insets = new Insets(0, 0, 5, 0);
			gbc2.gridx = 0;
			gbc2.gridy = 1;
			titlePanel.add(getLblPartyOrganizer(), gbc2);
			GridBagConstraints gbc_label = new GridBagConstraints();
			gbc_label.gridwidth = 2;
			gbc_label.gridheight = 2;
			gbc_label.anchor = GridBagConstraints.WEST;
			gbc_label.insets = new Insets(0, 20, 0, 0);
			gbc_label.gridx = 3;
			gbc_label.gridy = 0;
			titlePanel.add(getLabel(), gbc_label);
		}
		return titlePanel;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Get started!");
			button.setFont(new Font("Tahoma", Font.BOLD, 17));
			button.setBackground(SystemColor.activeCaption);
		}
		return button;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
			Image iconImage = new ImageIcon(getClass().getResource("/img/icon.png")).getImage().getScaledInstance(100,
					100, Image.SCALE_DEFAULT);
			ImageIcon icon = new ImageIcon(iconImage);
			label.setIcon(icon);
		}
		return label;
	}
}
