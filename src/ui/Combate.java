package ui;

import java.awt.EventQueue;
import controlador.Control;
import entidades.Personaje;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class Combate {

	private JFrame frame;
	private JTextField fieldEne;
	private JTextField fieldEne2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Combate window = new Combate(null, null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void combate(Personaje per, Personaje per2) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Combate window = new Combate(per, per2);
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
	public Combate(Personaje per, Personaje per2) {
		initialize(per, per2);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Personaje per, Personaje per2) {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 416, 342);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
				
		fieldEne2 = new JTextField();
		fieldEne2.setBounds(304, 200, 86, 20);
		frame.getContentPane().add(fieldEne2);
		fieldEne2.setColumns(10);
		fieldEne2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if (!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))
						{
						arg0.consume();}
						};});
		
		fieldEne = new JTextField();
		fieldEne.setBounds(104, 200, 86, 20);
		frame.getContentPane().add(fieldEne);
		fieldEne.setColumns(10);
		fieldEne.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if (!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))
						{
						arg0.consume();}
						};});
		
		JLabel lblNewLabel = new JLabel("Gasto Energia");
		lblNewLabel.setBounds(10, 200, 84, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gasto Energia");
		lblNewLabel_1.setBounds(210, 203, 80, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		JLabel lblNombre = new JLabel(per.getNombre());
		lblNombre.setBounds(48, 50, 106, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblHp = new JLabel("HP:");
		lblHp.setBounds(48, 75, 22, 14);
		frame.getContentPane().add(lblHp);
		
		JLabel lblAtk = new JLabel("Ataque:");
		lblAtk.setBounds(48, 175, 46, 14);
		frame.getContentPane().add(lblAtk);
		
		JLabel lblDef = new JLabel("Defensa:");
		lblDef.setBounds(48, 125, 46, 14);
		frame.getContentPane().add(lblDef);
		
		JLabel lblEva = new JLabel("Evasion:");
		lblEva.setBounds(48, 150, 46, 14);
		frame.getContentPane().add(lblEva);
		
		JLabel lblEne = new JLabel("Energia:");
		lblEne.setBounds(48, 100, 46, 14);
		frame.getContentPane().add(lblEne);
		
		JLabel lblID = new JLabel("ID: "+ String.valueOf(per.getId()));
		lblID.setBounds(68, 25, 46, 14);
		frame.getContentPane().add(lblID);
		
		JLabel lblDefN = new JLabel(String.valueOf(per.getDef()));
		lblDefN.setBounds(104, 125, 50, 14);
		frame.getContentPane().add(lblDefN);
		
		JLabel lblEneN = new JLabel(String.valueOf(per.getEne()));
		lblEneN.setBounds(104, 100, 50, 14);
		frame.getContentPane().add(lblEneN);
		
		JLabel lblHpN = new JLabel(String.valueOf(per.getHp()));
		lblHpN.setBounds(104, 75, 50, 14);
		frame.getContentPane().add(lblHpN);
		
		JLabel lblEvaN = new JLabel(String.valueOf(per.getEva()));
		lblEvaN.setBounds(104, 150, 50, 14);
		frame.getContentPane().add(lblEvaN);
		
		JLabel lblAtkN = new JLabel(String.valueOf(per.getAtk()));
		lblAtkN.setBounds(104, 175, 50, 14);
		frame.getContentPane().add(lblAtkN);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.BLACK);
		separator.setForeground(Color.BLACK);
		separator.setBounds(200, 11, 1, 250);
		frame.getContentPane().add(separator);
		
		JLabel lblNombre2 = new JLabel(per2.getNombre());
		lblNombre2.setBounds(255, 50, 89, 14);
		frame.getContentPane().add(lblNombre2);
		
		JLabel lblHp2 = new JLabel("HP:");
		lblHp2.setBounds(255, 75, 22, 14);
		frame.getContentPane().add(lblHp2);
		
		JLabel lblAtk2 = new JLabel("Ataque:");
		lblAtk2.setBounds(255, 175, 46, 14);
		frame.getContentPane().add(lblAtk2);
		
		JLabel lblDef2 = new JLabel("Defensa:");
		lblDef2.setBounds(255, 125, 46, 14);
		frame.getContentPane().add(lblDef2);
		
		JLabel lblEva2 = new JLabel("Evasion:");
		lblEva2.setBounds(255, 150, 46, 14);
		frame.getContentPane().add(lblEva2);
		
		JLabel lblEne2 = new JLabel("Energia:");
		lblEne2.setBounds(255, 100, 46, 14);
		frame.getContentPane().add(lblEne2);
		
		JLabel lblID2 = new JLabel("ID: "+ String.valueOf(per2.getId()));
		lblID2.setBounds(275, 25, 46, 14);
		frame.getContentPane().add(lblID2);
		
		JLabel lblDefN2 = new JLabel(String.valueOf(per2.getDef()));
		lblDefN2.setBounds(311, 125, 50, 14);
		frame.getContentPane().add(lblDefN2);
		
		JLabel lblEneN2 = new JLabel(String.valueOf(per2.getEne()));
		lblEneN2.setBounds(311, 100, 50, 14);
		frame.getContentPane().add(lblEneN2);
		
		JLabel lblHpN2 = new JLabel(String.valueOf(per2.getHp()));
		lblHpN2.setBounds(311, 75, 50, 14);
		frame.getContentPane().add(lblHpN2);
		
		JLabel lblEvaN2 = new JLabel(String.valueOf(per2.getEva()));
		lblEvaN2.setBounds(311, 150, 50, 14);
		frame.getContentPane().add(lblEvaN2);
		
		JLabel lblAtkN2 = new JLabel(String.valueOf(per2.getAtk()));
		lblAtkN2.setBounds(311, 175, 50, 14);
		frame.getContentPane().add(lblAtkN2);
		
		JButton btnAtacar = new JButton("Atacar");
		btnAtacar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int ener = Integer.getInteger("0");
				System.out.println("esto se ejecuto");
				Control.turnocombate(per, per2, ener);
				if (Control.muerte(per2))
				{};
			}
		});
		
		btnAtacar.setBounds(10, 238, 89, 23);
		frame.getContentPane().add(btnAtacar);
		
		JButton btnDefender = new JButton("Defender");
		btnDefender.setBounds(101, 238, 89, 23);
		frame.getContentPane().add(btnDefender);
		
		JButton btnAtacar2 = new JButton("Atacar");

		btnAtacar2.setBounds(211, 238, 89, 23);
		frame.getContentPane().add(btnAtacar2);
		
		JButton btnDefender2 = new JButton("Defender");
		btnDefender2.setBounds(301, 238, 89, 23);
		frame.getContentPane().add(btnDefender2);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hub.main(null);
				frame.dispose();
				
			}
		});
		btnSalir.setBounds(160, 272, 80, 23);
		frame.getContentPane().add(btnSalir);
		
		
			}
}
