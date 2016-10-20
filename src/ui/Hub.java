package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Hub {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hub window = new Hub();
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
	public Hub() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCreacionPj = new JButton("Crear Nuevo");
		btnCreacionPj.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent arg0) {
				CreacionPeronaje.main(null);
				frame.dispose();
			}
		});
		btnCreacionPj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCreacionPj.setBounds(60, 45, 107, 23);
		frame.getContentPane().add(btnCreacionPj);
		
		JButton btnPelea = new JButton("Iniciar combate");
		btnPelea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SeleccionPj.main(null);
				frame.dispose();
			}
		});
		btnPelea.setBounds(249, 45, 124, 23);
		frame.getContentPane().add(btnPelea);
		
		JButton Nada = new JButton("Lista Pjs");
		Nada.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ListaPersonajes.main(null);
				frame.dispose();
			}
		});
		Nada.setBounds(60, 176, 107, 23);
		frame.getContentPane().add(Nada);
		
		JButton salir = new JButton("Salir");
		salir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		salir.setBounds(249, 176, 124, 23);
		frame.getContentPane().add(salir);
	}
}
