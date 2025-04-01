package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class mochila extends JFrame {

	private JPanel contentPane;
	private JTextField TxtCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mochila frame = new mochila();
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
	public mochila() {
		setTitle("mochila");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 278);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblModelo.setBounds(10, 11, 62, 46);
		contentPane.add(lblModelo);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCantidad.setBounds(10, 56, 89, 55);
		contentPane.add(lblCantidad);
		
		JComboBox cboCombo = new JComboBox();
		cboCombo.setModel(new DefaultComboBoxModel(new String[] {"Sherman", "Fguo", "Aldo", "Suburban"}));
		cboCombo.setBounds(105, 25, 104, 22);
		contentPane.add(cboCombo);
		
		TxtCantidad = new JTextField();
		TxtCantidad.setBounds(109, 75, 86, 20);
		contentPane.add(TxtCantidad);
		TxtCantidad.setColumns(10);
		
		JButton Btnborras = new JButton("borrar");
		Btnborras.setBounds(396, 74, 89, 23);
		contentPane.add(Btnborras);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(396, 25, 89, 23);
		contentPane.add(btnProcesar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 106, 509, 122);
		contentPane.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
}
