package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConfirmacionPje {
	private int id;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					int ide = 0;
					ConfirmacionPje window = new ConfirmacionPje(ide);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void confirma(int ide) {
			EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmacionPje window = new ConfirmacionPje(ide);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConfirmacionPje(int ide) {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 136, 194);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Personaje creado.");
		lblNewLabel.setBounds(10, 11, 121, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnCrearOtro = new JButton("Crear otro");
		btnCrearOtro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CreacionPeronaje.main(null);
			}
		});
		btnCrearOtro.setBounds(10, 87, 101, 23);
		frame.getContentPane().add(btnCrearOtro);
		
		JButton btnVolverAMen = new JButton("Volver a men\u00FA");
		btnVolverAMen.setBounds(10, 121, 101, 23);
		frame.getContentPane().add(btnVolverAMen);
		
		JLabel labelID = new JLabel("ID");
		labelID.setBounds(48, 43, 68, 14);
		frame.getContentPane().add(labelID);
		labelID.setText(String.valueOf(id));
		
		JLabel lblIdN = new JLabel("ID N\u00BA:");
		lblIdN.setBounds(10, 43, 121, 14);
		frame.getContentPane().add(lblIdN);
	}

}
