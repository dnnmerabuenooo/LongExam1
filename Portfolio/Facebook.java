import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

public class Facebook extends JFrame {

	private JPanel contentPane;

	/**

	 * Launch the application.

	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					Facebook frame = new Facebook();

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

	public Facebook() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 900, 470);

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);

		

		JLabel FbPic = new JLabel("");

		FbPic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Portfolio\\Facebook.jpg"));

		FbPic.setBounds(0, 0, 884, 431);

		contentPane.add(FbPic);

		

		JLabel FbBack = new JLabel("");

		FbBack.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				Socials Socials = new Socials();

				Socials.setVisible(true);

				dispose();

			}

		});

		FbBack.setBounds(625, 395, 70, 25);

		contentPane.add(FbBack);

		

		JLabel FbExit = new JLabel("");

		FbExit.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				dispose();

			}

		});

		FbExit.setBounds(705, 395, 62, 25);

		contentPane.add(FbExit);

	}

}
