package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConfirmacionMod {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					int ide = 0;
					ConfirmacionMod window = new ConfirmacionMod(ide);
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
					ConfirmacionMod window = new ConfirmacionMod(ide);
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
	public ConfirmacionMod(int ide) {
		initialize(ide);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int id) {
		frame = new JFrame();
		frame.setBounds(100, 100, 158, 194);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Personaje modificado.");
		lblNewLabel.setBounds(23, 11, 97, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnCrearOtro = new JButton("Crear otro");
		btnCrearOtro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ListaPersonajes.main(null);
				frame.dispose();
			}
		});
		btnCrearOtro.setBounds(10, 87, 121, 23);
		frame.getContentPane().add(btnCrearOtro);
		
		JButton btnVolverAMen = new JButton("Volver a men\u00FA");
		btnVolverAMen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hub.main(null);
				frame.dispose();
			}
		});
		btnVolverAMen.setBounds(10, 121, 121, 23);
		frame.getContentPane().add(btnVolverAMen);
		
		JLabel labelID = new JLabel("ID");
		labelID.setBounds(64, 43, 68, 14);
		frame.getContentPane().add(labelID);
		labelID.setText(String.valueOf(id));
		
		JLabel lblIdN = new JLabel("ID N\u00BA:");
		lblIdN.setBounds(10, 43, 44, 14);
		frame.getContentPane().add(lblIdN);
	}

}
