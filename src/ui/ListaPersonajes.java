package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;

import entidades.Personaje;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListaPersonajes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaPersonajes window = new ListaPersonajes();
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
	public ListaPersonajes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Volver");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hub.main(null);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(335, 407, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnModificar = new JButton("Modificar");
		
		btnModificar.setBounds(10, 407, 89, 23);
		frame.getContentPane().add(btnModificar);
		
		JList<Personaje> list = new JList<Personaje>(data.DBInteract.buscaTodos());
		//JList<Personaje> list = new JList<Personaje>();
		list.setBounds(10, 11, 414, 385);
		frame.getContentPane().add(list);
		btnModificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (list.getSelectedValue()!=null){
				Personaje per = list.getSelectedValue();
				ModificacionPersonaje.modifica(per);
				frame.dispose();}
			}
		});
	}
}
