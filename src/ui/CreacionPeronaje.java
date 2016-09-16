package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreacionPeronaje {

	private JFrame frame;
	private JTextField idfield;
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
		frame.setBounds(100, 100, 205, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		idfield = new JTextField();
		idfield.setBounds(50, 51, 86, 20);
		frame.getContentPane().add(idfield);
		idfield.setColumns(10);
		
		enefield = new JTextField();
		enefield.setBounds(91, 123, 86, 20);
		frame.getContentPane().add(enefield);
		enefield.setColumns(10);
		
		namefield = new JTextField();
		namefield.setBounds(91, 92, 86, 20);
		frame.getContentPane().add(namefield);
		namefield.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(30, 54, 20, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel nombreLabel = new JLabel("Nombre:");
		nombreLabel.setBounds(35, 95, 46, 14);
		frame.getContentPane().add(nombreLabel);
		
		JLabel eneLabel = new JLabel("Energ\u00EDa:");
		eneLabel.setBounds(35, 126, 46, 14);
		frame.getContentPane().add(eneLabel);
		
		atkField = new JTextField();
		atkField.setColumns(10);
		atkField.setBounds(91, 185, 86, 20);
		frame.getContentPane().add(atkField);
		
		defField = new JTextField();
		defField.setColumns(10);
		defField.setBounds(91, 154, 86, 20);
		frame.getContentPane().add(defField);
		
		JLabel defLabel = new JLabel("Defensa:");
		defLabel.setBounds(35, 157, 46, 14);
		frame.getContentPane().add(defLabel);
		
		JLabel atkLabel = new JLabel("Ataque:");
		atkLabel.setBounds(35, 188, 46, 14);
		frame.getContentPane().add(atkLabel);
		
		hpField = new JTextField();
		hpField.setColumns(10);
		hpField.setBounds(91, 247, 86, 20);
		frame.getContentPane().add(hpField);
		
		evaField = new JTextField();
		evaField.setColumns(10);
		evaField.setBounds(91, 216, 86, 20);
		frame.getContentPane().add(evaField);
		
		JLabel evaLabel = new JLabel("Evasi\u00F3n:");
		evaLabel.setBounds(35, 219, 46, 14);
		frame.getContentPane().add(evaLabel);
		
		JLabel hpLabel = new JLabel("Hp:");
		hpLabel.setBounds(35, 250, 46, 14);
		frame.getContentPane().add(hpLabel);
		
		JButton guardarBtn = new JButton("Guardar");
		guardarBtn.setBounds(6, 300, 75, 23);
		frame.getContentPane().add(guardarBtn);
		
		JButton rtrnBtn = new JButton("Volver");
		rtrnBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		rtrnBtn.setBounds(114, 300, 75, 23);
		frame.getContentPane().add(rtrnBtn);
	}
}
