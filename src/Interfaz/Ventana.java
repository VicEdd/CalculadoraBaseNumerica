package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Ventana extends JFrame {

	private JPanel contentPane;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Decimal = new JButton("Decimal");
		Decimal.setBackground(Color.WHITE);
		Decimal.setForeground(Color.BLACK);
		Decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaDecimal v = new VentanaDecimal();
				v.setVisible(true);
			}
		});
		Decimal.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		Decimal.setBounds(40, 47, 129, 36);
		contentPane.add(Decimal);
		
		JButton Octal = new JButton("Octal");
		Octal.setBackground(Color.WHITE);
		Octal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaOctal ve = new VentanaOctal();
				ve.setVisible(true);

			}
		});
		Octal.setFont(new Font("Segoe Script", Font.PLAIN, 14));
		Octal.setBounds(40, 114, 129, 36);
		contentPane.add(Octal);
		
		JButton Hexadecimal = new JButton("Hexadecimal");
		Hexadecimal.setBackground(Color.WHITE);
		Hexadecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaHexa ven = new VentanaHexa();
				ven.setVisible(true);
				
			}
		});
		Hexadecimal.setFont(new Font("Segoe Script", Font.PLAIN, 14));
		Hexadecimal.setBounds(40, 189, 140, 36);
		contentPane.add(Hexadecimal);
		
		JLabel lblNewLabel = new JLabel("BASES NUMERICAS");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(226, 89, 173, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(282, 135, 46, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BINARIO");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(263, 168, 92, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Ventana.class.getResource("/Imagenes/pexels-markus-spiske-3872166.jpg")));
		lblNewLabel_3.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel_3);
	}
}
