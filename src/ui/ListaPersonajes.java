package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;

import entidades.Personaje;

import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

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
		
		JButton btnNewButton = new JButton("Eliminar");
		btnNewButton.setBounds(10, 407, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Volver");
		btnNewButton_1.setBounds(335, 407, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(176, 407, 89, 23);
		frame.getContentPane().add(btnModificar);
		
		JList<Personaje> list = new JList<Personaje>(data.DBInteract.buscaTodos());
		list.setBounds(10, 11, 414, 385);
		frame.getContentPane().add(list);
	}
}
