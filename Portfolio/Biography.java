import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

public class Biography extends JFrame {

	private JPanel contentPane;

	/**

	 * Launch the application.

	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					Biography frame = new Biography();

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

	public Biography() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 900, 470);

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);

		

		JLabel BioPic = new JLabel("");

		BioPic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Portfolio\\Biography.jpg"));

		BioPic.setBounds(0, 0, 884, 431);

		contentPane.add(BioPic);

		

		JLabel BioBack = new JLabel("");

		BioBack.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				ToKnow ToKnow = new ToKnow();

				ToKnow.setVisible(true);

				dispose();

			}

		});

		BioBack.setBounds(629, 386, 65, 34);

		contentPane.add(BioBack);

		

		JLabel BioExit = new JLabel("");

		BioExit.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				dispose();

			}

		});

		BioExit.setBounds(717, 386, 65, 34);

		contentPane.add(BioExit);

	}

}
