package graphics;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;


public class JFramePueba extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePueba frame = new JFramePueba();
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
	public JFramePueba() {
		setForeground(new Color(128, 128, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		//Para poder arrastrar elementos al panel (desbloquea el panel)
		contentPane.setLayout(null);
		
		JLabel Label1 = new JLabel("Pulsa un botón para cambiar el nombre.");
		Label1.setHorizontalAlignment(SwingConstants.LEFT);
		Label1.setFont(new Font ("Times new Roman", Font.PLAIN, 18 ));
		Label1.setBounds(64, 11, 298, 47);
		contentPane.add(Label1);
		
		JButton boton1 = new JButton("Cambia el nombre a JUAN");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JFrame2 frame2 = new JFrame2();
				//frame2.setVisible(true);
				System.out.println("Hello World");
				Label1.setText("Juanito. ");
			}
		});
		boton1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		boton1.setBounds(37, 90, 168, 36);
		contentPane.add(boton1);
		
		JButton btn2 = new JButton("Cambia el nombre a WITO");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Label1.setText(btn2.getText());
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btn2.setBounds(235, 90, 157, 36);
		contentPane.add(btn2);
	}
}
