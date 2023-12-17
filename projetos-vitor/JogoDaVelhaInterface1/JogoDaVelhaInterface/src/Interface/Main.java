package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a1;
	private JTextField a2;
	private JTextField a3;
	private JTextField a6;
	private JTextField a5;
	private JTextField a4;
	private JTextField a7;
	private JTextField a8;
	private JTextField a9;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox jogador1 = new JComboBox();
		jogador1.setBounds(25, 11, 120, 22);
		contentPane.add(jogador1);

		JComboBox jogador2 = new JComboBox();
		jogador2.setModel(new DefaultComboBoxModel(new String[] {"Jogador 1", "Jogador 2"}));
		jogador2.setBounds(277, 11, 120, 22);
		contentPane.add(jogador2);

		JLabel lblNewLabel = new JLabel("vitória");
		lblNewLabel.setBounds(172, 15, 39, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("derrota");
		lblNewLabel_1.setBounds(221, 15, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("x");
		lblNewLabel_2.setBounds(210, 15, 46, 14);
		contentPane.add(lblNewLabel_2);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("X");
		rdbtnNewRadioButton.setBounds(112, 40, 109, 23);
		contentPane.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("O");
		rdbtnNewRadioButton_1.setBounds(279, 40, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);

		a1 = new JTextField();
		a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a1.setEnabled(false);
			}
		});
		a1.setBounds(99, 70, 46, 46);
		contentPane.add(a1);
		a1.setColumns(10);

		a2 = new JTextField();
		a2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a2.setEnabled(false);
			}
		});
		a2.setColumns(10);
		a2.setBounds(175, 70, 46, 46);
		contentPane.add(a2);

		a3 = new JTextField();
		a3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a3.setEnabled(false);
			}
		});
		a3.setColumns(10);
		a3.setBounds(251, 70, 46, 46);
		contentPane.add(a3);

		a6 = new JTextField();
		a6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a6.setEnabled(false);
			}
		});
		a6.setColumns(10);
		a6.setBounds(251, 127, 46, 46);
		contentPane.add(a6);

		a5 = new JTextField();
		a5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a5.setEnabled(false);
			}
		});
		a5.setColumns(10);
		a5.setBounds(175, 127, 46, 46);
		contentPane.add(a5);

		a4 = new JTextField();
		a4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a4.setEnabled(false);
			}
		});
		a4.setColumns(10);
		a4.setBounds(99, 127, 46, 46);
		contentPane.add(a4);

		a7 = new JTextField();
		a7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a7.setEnabled(false);
			}
		});
		a7.setColumns(10);
		a7.setBounds(99, 185, 46, 46);
		contentPane.add(a7);

		a8 = new JTextField();
		a8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a8.setEnabled(false);
			}
		});
		a8.setColumns(10);
		a8.setBounds(175, 185, 46, 46);
		contentPane.add(a8);

		a9 = new JTextField();
		a9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a9.setEnabled(false);
			}
		});
		a9.setColumns(10);
		a9.setBounds(251, 185, 46, 46);
		contentPane.add(a9);
		List<String> listajogadores = new ArrayList<>();
		JComboBox<String>comboBoxJogadores = new JComboBox<>();
		 while(true) {
				String nomeJ = JOptionPane.showInputDialog(null, "Digite seu nome de jogador: ");
				 if(nomeJ == null) {
					 break;
				 }
				 listajogadores.add(nomeJ); 
			}
	        for(String jogador : listajogadores) {
	        	comboBoxJogadores.addItem(jogador);
	        }
	}
}
