package ui;

import java.awt.EventQueue;
import entidades.Personaje;

import javax.swing.JFrame;
import javax.swing.JTextField;

import controlador.Control;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ModificacionPersonaje {
	//ventana principal de creacion de personaje. 

	private JFrame frame;
	private JTextField enefield;
	private JTextField namefield;
	private JTextField atkField;
	private JTextField defField;
	private JTextField hpField;
	private JTextField evaField;
	private JLabel lblRestantes;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificacionPersonaje window = new ModificacionPersonaje(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void modifica(Personaje pers){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificacionPersonaje window = new ModificacionPersonaje(pers);
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
	public ModificacionPersonaje(Personaje pers) {
		initialize(pers);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Personaje pers) {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				//Hub.main(null);
			}
		});
		frame.setResizable(false);
		frame.setBounds(100, 100, 230, 327);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		enefield = new JTextField();
		enefield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if (!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))
						{
						arg0.consume();}
						}
			@Override
			public void keyReleased(KeyEvent e) {
				lblRestantes.setText(String.valueOf((200-Integer.parseInt('0'+enefield.getText())-Integer.parseInt('0'+atkField.getText())-Integer.parseInt('0'+defField.getText())
						-Integer.parseInt('0'+hpField.getText())-Integer.parseInt('0'+evaField.getText()))));
			}
			}
		
		);
		enefield.setBounds(95, 72, 86, 20);
		frame.getContentPane().add(enefield);
		enefield.setColumns(10);
		enefield.setText(String.valueOf(pers.getEne()));
		
		namefield = new JTextField();
		namefield.setBounds(95, 41, 86, 20);
		frame.getContentPane().add(namefield);
		namefield.setColumns(10);
		namefield.setText(pers.getNombre());
		
		JLabel nombreLabel = new JLabel("Nombre:");
		nombreLabel.setBounds(27, 44, 58, 14);
		frame.getContentPane().add(nombreLabel);
		
		JLabel eneLabel = new JLabel("Energ\u00EDa:");
		eneLabel.setBounds(27, 75, 58, 14);
		frame.getContentPane().add(eneLabel);
		
		atkField = new JTextField();
		atkField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if (!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))
						{
						arg0.consume();};
						
			}
			@Override
			public void keyReleased(KeyEvent e) {
				lblRestantes.setText(String.valueOf((200-Integer.parseInt('0'+enefield.getText())-Integer.parseInt('0'+atkField.getText())-Integer.parseInt('0'+defField.getText())
						-Integer.parseInt('0'+hpField.getText())-Integer.parseInt('0'+evaField.getText()))));
			}
		});
		atkField.setColumns(10);
		atkField.setBounds(95, 134, 86, 20);
		atkField.setText(String.valueOf(pers.getAtk()));
		frame.getContentPane().add(atkField);
		
		defField = new JTextField();
		defField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if (!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))
						{
						arg0.consume();}
						
			}
			@Override
			public void keyReleased(KeyEvent e) {
				lblRestantes.setText(String.valueOf((200-Integer.parseInt('0'+enefield.getText())-Integer.parseInt('0'+atkField.getText())-Integer.parseInt('0'+defField.getText())
						-Integer.parseInt('0'+hpField.getText())-Integer.parseInt('0'+evaField.getText()))));
			}
		});
		defField.setColumns(10);
		defField.setBounds(95, 103, 86, 20);
		defField.setText(String.valueOf(pers.getDef()));

		frame.getContentPane().add(defField);
		
		JLabel defLabel = new JLabel("Defensa:");
		defLabel.setBounds(27, 106, 58, 14);
		frame.getContentPane().add(defLabel);
		
		JLabel atkLabel = new JLabel("Ataque:");
		atkLabel.setBounds(27, 137, 58, 14);
		frame.getContentPane().add(atkLabel);
		
		hpField = new JTextField();
		hpField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if (!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))
						{
						arg0.consume();};
						
			}
			@Override
			public void keyReleased(KeyEvent e) {
				lblRestantes.setText(String.valueOf((200-Integer.parseInt('0'+enefield.getText())-Integer.parseInt('0'+atkField.getText())-Integer.parseInt('0'+defField.getText())
						-Integer.parseInt('0'+hpField.getText())-Integer.parseInt('0'+evaField.getText()))));
			}
		});
		hpField.setColumns(10);
		hpField.setBounds(95, 196, 86, 20);
		hpField.setText(String.valueOf(pers.getHp()));
		frame.getContentPane().add(hpField);
		
		evaField = new JTextField();
		evaField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if (!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))
						{
						arg0.consume();}
						
			}
			@Override
			public void keyReleased(KeyEvent e) {
				lblRestantes.setText(String.valueOf((200-Integer.parseInt('0'+enefield.getText())-Integer.parseInt('0'+atkField.getText())-Integer.parseInt('0'+defField.getText())
						-Integer.parseInt('0'+hpField.getText())-Integer.parseInt('0'+evaField.getText()))));
			}
		});
		evaField.setColumns(10);
		evaField.setBounds(95, 165, 86, 20);
		evaField.setText(String.valueOf(pers.getEva()));
		frame.getContentPane().add(evaField);
		
		JLabel evaLabel = new JLabel("Evasi\u00F3n:");
		evaLabel.setBounds(27, 168, 58, 14);
		frame.getContentPane().add(evaLabel);
		
		JLabel hpLabel = new JLabel("Hp:");
		hpLabel.setBounds(27, 199, 58, 14);
		frame.getContentPane().add(hpLabel);
		
		JButton guardarBtn = new JButton("Guardar");
		guardarBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pers.setAtk(Integer.parseInt(atkField.getText()));
				pers.setDef(Integer.parseInt(defField.getText()));
				pers.setEne(Integer.parseInt(enefield.getText()));
				pers.setEva(Integer.parseInt(evaField.getText()));
				pers.setHp(Integer.parseInt(hpField.getText()));
				pers.setNombre(namefield.getText());
				Control.modificaPJ(pers);
				frame.dispose();};
			
		});
		guardarBtn.setBounds(10, 264, 87, 23);
		frame.getContentPane().add(guardarBtn);
		
		JButton rtrnBtn = new JButton("Volver");
		rtrnBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Hub.main(null);
				frame.dispose();
			}
		});
		
		rtrnBtn.setBounds(128, 264, 86, 23);
		frame.getContentPane().add(rtrnBtn);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(51, 69, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblPuntosRestantes = new JLabel("Puntos Restantes:");
		lblPuntosRestantes.setBounds(10, 227, 90, 14);
		frame.getContentPane().add(lblPuntosRestantes);
		
		lblRestantes = new JLabel("restantes");
		lblRestantes.setBounds(124, 227, 57, 14);
		frame.getContentPane().add(lblRestantes);
		lblRestantes.setText(String.valueOf((200-Integer.parseInt('0'+enefield.getText())-Integer.parseInt('0'+atkField.getText())-Integer.parseInt('0'+defField.getText())
				-Integer.parseInt('0'+hpField.getText())-Integer.parseInt('0'+evaField.getText()))));
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(27, 11, 22, 14);
		frame.getContentPane().add(lblId);
		
		JLabel lblIDNum = new JLabel("New label");
		lblIDNum.setBounds(51, 11, 46, 14);
		frame.getContentPane().add(lblIDNum);
		lblIDNum.setText(String.valueOf(pers.getId()));
		
	}
}
