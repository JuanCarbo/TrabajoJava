package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CreacionPeronaje {

	private JFrame frame;
	private JTextField enefield;
	private JTextField namefield;
	private JTextField atkField;
	private JTextField defField;
	private JTextField hpField;
	private JTextField evaField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreacionPeronaje window = new CreacionPeronaje();
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
	public CreacionPeronaje() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 230, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		});
		enefield.setBounds(95, 57, 86, 20);
		frame.getContentPane().add(enefield);
		enefield.setColumns(10);
		
		namefield = new JTextField();
		namefield.setBounds(95, 26, 86, 20);
		frame.getContentPane().add(namefield);
		namefield.setColumns(10);
		
		JLabel nombreLabel = new JLabel("Nombre:");
		nombreLabel.setBounds(39, 29, 46, 14);
		frame.getContentPane().add(nombreLabel);
		
		JLabel eneLabel = new JLabel("Energ\u00EDa:");
		eneLabel.setBounds(39, 60, 46, 14);
		frame.getContentPane().add(eneLabel);
		
		atkField = new JTextField();
		atkField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if (!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))
						{
						arg0.consume();}
						
			}
		});
		atkField.setColumns(10);
		atkField.setBounds(95, 119, 86, 20);
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
		});
		defField.setColumns(10);
		defField.setBounds(95, 88, 86, 20);
		frame.getContentPane().add(defField);
		
		JLabel defLabel = new JLabel("Defensa:");
		defLabel.setBounds(39, 91, 46, 14);
		frame.getContentPane().add(defLabel);
		
		JLabel atkLabel = new JLabel("Ataque:");
		atkLabel.setBounds(39, 122, 46, 14);
		frame.getContentPane().add(atkLabel);
		
		hpField = new JTextField();
		hpField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if (!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))
						{
						arg0.consume();}
						
			}
		});
		hpField.setColumns(10);
		hpField.setBounds(95, 181, 86, 20);
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
		});
		evaField.setColumns(10);
		evaField.setBounds(95, 150, 86, 20);
		frame.getContentPane().add(evaField);
		
		JLabel evaLabel = new JLabel("Evasi\u00F3n:");
		evaLabel.setBounds(39, 153, 46, 14);
		frame.getContentPane().add(evaLabel);
		
		JLabel hpLabel = new JLabel("Hp:");
		hpLabel.setBounds(39, 184, 46, 14);
		frame.getContentPane().add(hpLabel);
		
		JButton guardarBtn = new JButton("Guardar");
		guardarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		guardarBtn.setBounds(10, 234, 75, 23);
		frame.getContentPane().add(guardarBtn);
		
		JButton rtrnBtn = new JButton("Volver");
		rtrnBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		rtrnBtn.setBounds(118, 234, 75, 23);
		frame.getContentPane().add(rtrnBtn);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(51, 54, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
	}
}
