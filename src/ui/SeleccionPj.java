package ui;

import java.awt.EventQueue;
import entidades.Personaje;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SeleccionPj {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionPj window = new SeleccionPj();
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
	public SeleccionPj() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Personaje[] pers = data.DBInteract.buscaTodos();
		
		//JList list_1 = new JList();
		
		JList<Personaje> list_1 = new JList<Personaje>(pers);
		list_1.setBounds(10, 11, 178, 178);
		frame.getContentPane().add(list_1);
		
		//JList list_2 = new JList();
		JList<Personaje> list_2 = new JList<Personaje>(pers);
		list_2.setBounds(246, 11, 178, 178);
		frame.getContentPane().add(list_2);
		
		JButton btnFight = new JButton("Fight!");
		btnFight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Personaje per1 = list_1.getSelectedValue();
				Personaje per2 = list_2.getSelectedValue();
				if (per1!=per2)
				{
					Combate.combate(per1, per2);
					frame.dispose();
					}
			}
		});
		btnFight.setBounds(172, 200, 89, 23);
		frame.getContentPane().add(btnFight);
	}
}
