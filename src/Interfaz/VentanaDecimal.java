package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import java.awt.Canvas;
import javax.swing.JLabel;

public class VentanaDecimal extends JFrame {

	private JPanel contentPane;
	private JTextField numero;
	private JTextField resultado;
	int decimal;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;

	public VentanaDecimal() {
		setTitle("Decimal a Binario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		numero = new JTextField();
		numero.setBounds(137, 49, 145, 33);
		contentPane.add(numero);
		numero.setColumns(10);
		
		resultado = new JTextField();
		resultado.setBounds(137, 130, 145, 33);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		JButton Convertir = new JButton("Convertir");
		Convertir.setBackground(Color.WHITE);
		Convertir.setForeground(new Color(0, 0, 0));
		Convertir.setFont(new Font("Segoe Script", Font.PLAIN, 12));
		Convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decimal = Integer.parseInt(numero.getText());
				String binario = "";
				while (decimal > 0 ) {
					binario = decimal % 2 + binario;
					decimal = decimal / 2;
				}
				resultado.setText(binario);
			}
		});
		Convertir.setBounds(158, 182, 109, 43);
		contentPane.add(Convertir);
		
		btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana vent = new Ventana();
				vent.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon(VentanaDecimal.class.getResource("/Imagenes/flechas-arriba (2).png")));
		btnNewButton.setBounds(0, 218, 48, 43);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("DECIMAL");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBackground(new Color(127, 255, 212));
		lblNewLabel_1.setForeground(new Color(204, 0, 0));
		lblNewLabel_1.setBounds(137, 21, 145, 25);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel = new JLabel("BINARIO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(204, 0, 0));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBackground(new Color(127, 255, 212));
		lblNewLabel.setBounds(137, 103, 145, 25);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(VentanaDecimal.class.getResource("/Imagenes/binario.jpg")));
		lblNewLabel_2.setBounds(-11, 0, 445, 261);
		contentPane.add(lblNewLabel_2);
	}
}
