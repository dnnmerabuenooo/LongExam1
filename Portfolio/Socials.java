import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

public class Socials extends JFrame {

	private JPanel contentPane;

	/**

	 * Launch the application.

	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					Socials frame = new Socials();

					frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}

	/**

	 * Create the frame.

	 */

	public Socials() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 900, 470);

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);

		

		JLabel SocialsPic = new JLabel("");

		SocialsPic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Portfolio\\Socials.jpg"));

		SocialsPic.setBounds(0, 0, 884, 431);

		contentPane.add(SocialsPic);

		

		JLabel SocialsBack = new JLabel("");

		SocialsBack.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				ToKnow ToKnow = new ToKnow();

				ToKnow.setVisible(true);

				dispose();

			}

		});

		SocialsBack.setBounds(344, 390, 66, 30);

		contentPane.add(SocialsBack);

		

		JLabel SocialsExit = new JLabel("");

		SocialsExit.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				dispose();

			}

		});

		SocialsExit.setBounds(485, 390, 66, 30);

		contentPane.add(SocialsExit);

		

		JLabel FbLogo = new JLabel("");

		FbLogo.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				Facebook Facebook = new Facebook();

				Facebook.setVisible(true);

				dispose();

			}

		});

		FbLogo.setBounds(72, 114, 225, 205);

		contentPane.add(FbLogo);

		

		JLabel IgLogo = new JLabel("");

		IgLogo.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				Instagram Instagram = new Instagram();

				Instagram.setVisible(true);

				dispose();

			}

		});

		IgLogo.setBounds(344, 114, 217, 205);

		contentPane.add(IgLogo);

		

		JLabel TwtLogo = new JLabel("");

		TwtLogo.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				Twitter Twitter = new Twitter();

				Twitter.setVisible(true);

				dispose();			}

		});

		TwtLogo.setBounds(612, 114, 208, 205);

		contentPane.add(TwtLogo);

	}

}
