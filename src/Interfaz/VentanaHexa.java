package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class VentanaHexa extends JFrame {

	private JPanel contentPane;
	private JTextField numero;
	private JTextField resultado;
	
	String Hexa;

	public VentanaHexa() {
		setTitle("Hexadecimal a Binario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		numero = new JTextField();
		numero.setBounds(259, 49, 117, 30);
		contentPane.add(numero);
		numero.setColumns(10);
		
		resultado = new JTextField();
		resultado.setBounds(151, 106, 117, 30);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		JButton Convertir = new JButton("Convertir");
		Convertir.setFont(new Font("Segoe Script", Font.PLAIN, 14));
		Convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Hexa = numero.getText();
				String caracterHexa = "0123456789ABCDEF";
				Hexa = Hexa.toUpperCase();
				int decimal = 0;
				for (int i = 0; i<Hexa.length(); i++) {
					char caracter = Hexa.charAt(i);
					int posicion = caracterHexa.indexOf(caracter);
					decimal = 16 * decimal + posicion;
				}
				
				String binario = "";
				while (decimal > 0) {
					binario = decimal %2 + binario;
					decimal = decimal / 2;
				}
				
				resultado.setText(binario);
				
			}
		});
		Convertir.setBounds(60, 161, 117, 35);
		contentPane.add(Convertir);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana ven = new Ventana();
				ven.setVisible(true);			}
		});
		btnNewButton.setIcon(new ImageIcon(VentanaHexa.class.getResource("/Imagenes/flechas-arriba (2).png")));
		btnNewButton.setBounds(0, 218, 48, 43);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("BINARIO");
		lblNewLabel.setForeground(new Color(204, 0, 0));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(151, 81, 117, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HEXADECIMAL");
		lblNewLabel_1.setForeground(new Color(204, 0, 0));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(259, 24, 117, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(VentanaHexa.class.getResource("/Imagenes/binario.jpg")));
		lblNewLabel_2.setBounds(-22, 0, 456, 261);
		contentPane.add(lblNewLabel_2);
	}
}
