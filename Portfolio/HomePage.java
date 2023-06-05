import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**

	 * Launch the application.

	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					HomePage frame = new HomePage();

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

	public HomePage() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 900, 470);

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);

		

		JLabel HomePic = new JLabel("");

		HomePic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Portfolio\\HomePage.jpg"));

		HomePic.setBounds(0, 0, 884, 431);

		contentPane.add(HomePic);

		

		JLabel Proceed = new JLabel("");

		Proceed.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				ToKnow ToKnow = new ToKnow();

				ToKnow.setVisible(true);

				dispose();

			}

		});

		Proceed.setBounds(402, 406, 92, 25);

		contentPane.add(Proceed);

		

		JLabel HomeExit = new JLabel("");

		HomeExit.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				dispose();

			}

		});

		HomeExit.setBounds(766, 406, 55, 25);

		contentPane.add(HomeExit);

	}

}
