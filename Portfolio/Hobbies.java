import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

public class Hobbies extends JFrame {

	private JPanel contentPane;

	/**

	 * Launch the application.

	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					Hobbies frame = new Hobbies();

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

	public Hobbies() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 900, 470);

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);

		

		JLabel HobbiesPic = new JLabel("");

		HobbiesPic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Portfolio\\Hobbies.jpg"));

		HobbiesPic.setBounds(0, 0, 884, 431);

		contentPane.add(HobbiesPic);

		

		JLabel HobbiesBack = new JLabel("");

		HobbiesBack.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				ToKnow ToKnow = new ToKnow();

				ToKnow.setVisible(true);

				dispose();

			}

		});

		HobbiesBack.setBounds(343, 398, 70, 33);

		contentPane.add(HobbiesBack);

		

		JLabel HobbiesExit = new JLabel("");

		HobbiesExit.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				dispose();

			}

		});

		HobbiesExit.setBounds(491, 398, 70, 33);

		contentPane.add(HobbiesExit);

	}

}
