package ui;

import java.awt.EventQueue;
import entidades.Personaje;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Victoria {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Victoria window = new Victoria(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void victoria(Personaje per) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Victoria window = new Victoria(per);
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
	public Victoria(Personaje per) {
		initialize(per);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Personaje per) {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 9));
		frame.setBounds(100, 100, 219, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblVictoria = new JLabel("Victoria!");
		lblVictoria.setBounds(53, 42, 59, 14);
		frame.getContentPane().add(lblVictoria);
		
		JLabel lblPersonajeGanador = new JLabel("Personaje Ganador:");
		lblPersonajeGanador.setBounds(10, 59, 118, 14);
		frame.getContentPane().add(lblPersonajeGanador);
		
		JLabel lblNombre = new JLabel(per.getNombre());
		lblNombre.setBounds(107, 84, 86, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblID = new JLabel("ID: "+ String.valueOf(per.getId()));
		lblID.setBounds(107, 109, 46, 14);
		frame.getContentPane().add(lblID);
		
		JLabel lblHP = new JLabel("HP: "+ String.valueOf(per.getHp()));
		lblHP.setBounds(107, 134, 46, 14);
		frame.getContentPane().add(lblHP);
		
		JLabel lblAtk = new JLabel("Atk: "+ String.valueOf(per.getAtk()));
		lblAtk.setBounds(107, 159, 46, 14);
		frame.getContentPane().add(lblAtk);
		
		JLabel lblEva = new JLabel("Eva: "+ String.valueOf(per.getEva()));
		lblEva.setBounds(107, 184, 46, 14);
		frame.getContentPane().add(lblEva);
		
		JLabel lblEne = new JLabel("Ene: "+ String.valueOf(per.getEne()));
		lblEne.setBounds(107, 209, 46, 14);
		frame.getContentPane().add(lblEne);
		
		JLabel lblDef = new JLabel("Def: "+ String.valueOf(per.getDef()));
		lblDef.setBounds(107, 234, 46, 14);
		frame.getContentPane().add(lblDef);
		
		JButton btnNewButton_1 = new JButton("Seleccion Pjs");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SeleccionPj.main(null);
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_1.setBounds(-7, 105, 104, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Volver a Menu");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hub.main(null);
				frame.dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_2.setBounds(0, 188, 104, 23);
		frame.getContentPane().add(btnNewButton_2);
	}

}
