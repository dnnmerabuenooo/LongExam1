import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

public class Twitter extends JFrame {

	private JPanel contentPane;

	/**

	 * Launch the application.

	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					Twitter frame = new Twitter();

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

	public Twitter() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 900, 470);

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);

		

		JLabel TwtPic = new JLabel("");

		TwtPic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Portfolio\\Twitter.jpg"));

		TwtPic.setBounds(0, 0, 884, 431);

		contentPane.add(TwtPic);

		

		JLabel TwtBack = new JLabel("");

		TwtBack.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				Socials Socials = new Socials();

				Socials.setVisible(true);

				dispose();

			}

		});

		TwtBack.setBounds(657, 384, 65, 36);

		contentPane.add(TwtBack);

		

		JLabel TwtExit = new JLabel("");

		TwtExit.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				dispose();

			}

		});

		TwtExit.setBounds(746, 384, 65, 36);

		contentPane.add(TwtExit);

	}

}
