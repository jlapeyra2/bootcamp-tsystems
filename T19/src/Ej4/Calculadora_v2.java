package Ej4;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora_v2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora_v2 frame = new Calculadora_v2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	JLabel label;
	
	public Calculadora_v2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final int SIZE = 70;
		final int MARGIN = 20;
		setBounds(100, 100, 15+MARGIN*2+SIZE*4, 50+MARGIN*2+SIZE*5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("0");
		label.setBackground(new Color(255, 255, 255));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label.setBounds(MARGIN, MARGIN, SIZE*4, SIZE);
		contentPane.add(label);
		
		String[][] simbols = {
				{"7","8","9","+"},
				{"4","5","6","-"},
				{"1","2","3","×"},
				{"C","0","=","÷"},
		};
		JButton[][] botons = new JButton[4][4];
				
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				botons[i][j] = new JButton(simbols[i][j]);
				botons[i][j].setBounds(MARGIN+SIZE*j, MARGIN+SIZE*(i+1), SIZE, SIZE);
				contentPane.add(botons[i][j]);
				botons[i][j].setFont(new Font("Tahoma", Font.PLAIN, 30));
				addListener(botons[i][j]);
			}
		}
	}
	
	boolean escrivint = false; //indica si hi ha un número a mig esciure
	long operand1 = 0;
	char operacio = 0;
	long operand2 = 0;
	
	void addListener(JButton boto) {
		boto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				char simbol = boto.getText().charAt(0);
				if ('0' <= simbol && simbol <= '9') {
					if (!escrivint) label.setText(""+simbol);
					else if (label.getText().length() < 17) label.setText(label.getText()+simbol);
					escrivint = true;
				}
				else if (simbol == 'C') {
					label.setText("0");
					operacio = 0;
					escrivint = false;
				}
				else {
					if (escrivint && operacio!=0) {
						operand2 = Long.parseLong(label.getText());
						switch (operacio) {
							case '+': label.setText(String.valueOf(operand1 + operand2)); break;
							case '-': label.setText(String.valueOf(operand1 - operand2)); break;
							case '×': label.setText(String.valueOf(operand1 * operand2)); break;
							case '÷': 
								if (operand2 == 0) label.setText("Error");
								else label.setText(String.valueOf(operand1 / operand2)); 
								break;
						}
					}
					escrivint = false;
					if (simbol == '=') {
						operacio = 0;
					}
					else {
						operand1 = Long.parseLong(label.getText());
						operacio = simbol;
					}
				}
			}
		});
	}
}
