import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

public class Skills extends JFrame {

	private JPanel contentPane;

	/**

	 * Launch the application.

	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					Skills frame = new Skills();

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

	public Skills() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 900, 470);

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);

		

		JLabel SkillsPic = new JLabel("");

		SkillsPic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Portfolio\\Skills.jpg"));

		SkillsPic.setBounds(0, 0, 884, 431);

		contentPane.add(SkillsPic);

		

		JLabel SkillsBack = new JLabel("");

		SkillsBack.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				ToKnow ToKnow = new ToKnow();

				ToKnow.setVisible(true);

				dispose();

			}

		});

		SkillsBack.setBounds(343, 386, 70, 34);

		contentPane.add(SkillsBack);

		

		JLabel SkillsExit = new JLabel("");

		SkillsExit.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseClicked(MouseEvent e) {

				dispose();

			}

		});

		SkillsExit.setBounds(490, 386, 70, 34);

		contentPane.add(SkillsExit);

	}

}
