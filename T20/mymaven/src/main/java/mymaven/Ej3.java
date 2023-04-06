package mymaven;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Ej3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej3 frame = new Ej3();
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
	public Ej3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 44, 296, 14);
		contentPane.add(label);
		
		JButton button1 = new JButton("Botón 1");
		button1.setBounds(57, 10, 87, 23);
		contentPane.add(button1);
		button1.addActionListener(getActionListener(0));
		
		JButton button2 = new JButton("Botón 2");
		button2.setBounds(170, 10, 87, 23);
		contentPane.add(button2);
		button2.addActionListener(getActionListener(1));
		
		setText();
	}
	
	int[] veces = {0,0};
	JLabel label;
	
	void setText() {
		label.setText("Botón 1: "+veces[0]+" veces        Botón 2: "+veces[1]+" veces. ");
	}
	
	ActionListener getActionListener(final int i) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				veces[i]++;
				setText();
			}
		};
	}

}
