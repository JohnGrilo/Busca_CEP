package cep;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Cursor;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class Cep extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cep frame = new Cep();
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
	public Cep() {
		setTitle("Busca CEP");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cep.class.getResource("/img/home.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CEP");
		lblNewLabel.setBounds(24, 33, 35, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(69, 30, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Endereço");
		lblNewLabel_1.setBounds(13, 82, 54, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(93, 82, 320, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Bairro");
		lblNewLabel_2.setBounds(24, 123, 35, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(93, 120, 320, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Cidade");
		lblNewLabel_3.setBounds(24, 159, 43, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(93, 156, 179, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("UF");
		lblNewLabel_4.setBounds(282, 159, 20, 14);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.info);
		comboBox.setBounds(312, 155, 54, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.setBackground(SystemColor.info);
		btnNewButton.setBounds(83, 204, 85, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.setBackground(SystemColor.info);
		btnNewButton_1.setBounds(183, 29, 85, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setToolTipText("Sobre");
		btnNewButton_2.setIcon(new ImageIcon(Cep.class.getResource("/img/about.png")));
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(SystemColor.control);
		btnNewButton_2.setBounds(335, 11, 48, 48);
		contentPane.add(btnNewButton_2);
	}
}
