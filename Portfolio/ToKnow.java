import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

public class ToKnow extends JFrame {

	private JPanel contentPane;

	/**

	 * Launch the application.

	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					ToKnow frame = new ToKnow();

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

	public ToKnow() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 900, 470);

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);

		

		JLabel ToKnowPic = new JLabel("");

		ToKnowPic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Portfolio\\ToKnow.jpg"));

		ToKnowPic.setBounds(0, 0, 874, 431);

		contentPane.add(ToKnowPic);

		

		JLabel ToKnowBack = new JLabel("");

		ToKnowBack.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				HomePage HomePage = new HomePage();

				HomePage.setVisible(true);

				dispose();

			}

		});

		ToKnowBack.setBounds(304, 365, 71, 30);

		contentPane.add(ToKnowBack);

		

		JLabel ToKnowExit = new JLabel("");

		ToKnowExit.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				dispose();

			}

		});

		ToKnowExit.setBounds(515, 365, 61, 30);

		contentPane.add(ToKnowExit);

		

		JLabel BioButton = new JLabel("");

		BioButton.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				Biography Biography = new Biography();

				Biography.setVisible(true);

				dispose();

			}

		});

		BioButton.setBounds(138, 153, 208, 46);

		contentPane.add(BioButton);

		

		JLabel SkillsButton = new JLabel("");

		SkillsButton.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				Skills Skills = new Skills();

				Skills.setVisible(true);

				dispose();

			}

		});

		SkillsButton.setBounds(177, 270, 127, 46);

		contentPane.add(SkillsButton);

		

		JLabel HobbiesButton = new JLabel("");

		HobbiesButton.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				Hobbies Hobbies = new Hobbies();

				Hobbies.setVisible(true);

				dispose();

			}

		});

		HobbiesButton.setBounds(597, 153, 163, 46);

		contentPane.add(HobbiesButton);

		

		JLabel SocialsButton = new JLabel("");

		SocialsButton.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				Socials Socials = new Socials();

				Socials.setVisible(true);

				dispose();

			}

		});

		SocialsButton.setBounds(597, 270, 163, 38);

		contentPane.add(SocialsButton);

	}

}
