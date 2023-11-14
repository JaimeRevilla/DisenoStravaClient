package gui;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

//import es.deusto.ingenieria.sd.strava.client.controller.LoginController;

//import es.deusto.ingenieria.sd.strava.client.remote.ServiceLocator;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.DropMode;

public class VentanaLog extends JFrame{
	private JPanel contentPane;
	private JTextField txtEmail;
	private JPasswordField txtContrasenia;
//	private ServiceLocator service;
//	private LoginController controller;
	
	public VentanaLog(){//LoginController loginCont, ServiceLocator service) {
//		controller = loginCont;
//		this.service = service;
		
		setBounds(325, 100, 800, 408);
		setTitle("Log In");
		setResizable(true);
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel pCentro = new JPanel();
		getContentPane().add(pCentro);
		pCentro.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(255, 102, 0));
		pCentro.add(p1);
		
		JLabel lblLog = new JLabel("LOG IN");
		lblLog.setFont(new Font("Tahoma", Font.BOLD, 20));
		p1.add(lblLog);
		
		JPanel p2 = new JPanel();
		p2.setBackground(new Color(255, 102, 0));
		pCentro.add(p2);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 10));
		p2.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setText("ejemplo@mail.com");
		p2.add(txtEmail);
		txtEmail.setColumns(10);
		
		JPanel p3 = new JPanel();
		p3.setBackground(new Color(255, 102, 0));
		pCentro.add(p3);
		
		JLabel lblContrasenia = new JLabel("Contraseña:");
		lblContrasenia.setFont(new Font("Tahoma", Font.BOLD, 10));
		p3.add(lblContrasenia);
		
		txtContrasenia = new JPasswordField();
		p3.add(txtContrasenia);
		txtContrasenia.setColumns(10);
		
		JPanel p4 = new JPanel();
		p4.setBackground(new Color(255, 102, 0));
		pCentro.add(p4);
		
		JButton btnLog = new JButton("Iniciar Sesion");
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 10));
		p4.add(btnLog);
		
		
		
		
		btnLog.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaPrincipal vPrin = new VentanaPrincipal();
//				if(controller.login(txtEmail.getText(), txtContrasenia.getText())) {
//					VentanaPrincipal vPrin = new VentanaPrincipal(service);
//				}else {
//					JOptionPane.showInputDialog(null, "Error en el login", "Aviso", JOptionPane.WARNING_MESSAGE);
//					System.out.println("Error en el login");
//				}
				dispose();
			}
		});
		
		setVisible(true);
	}

}