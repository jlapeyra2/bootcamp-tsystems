package mymaven;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Ej5 extends JFrame {

	private JPanel contentPane;
	JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej5 frame = new Ej5();
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
	public Ej5() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(31, 59, 276, 282);
		textArea.addMouseListener(mouseListener);
		contentPane.add(textArea);
		
		JButton btn = new JButton("CLEAR");
		btn.setBounds(98, 34, 145, 14);
		btn.addActionListener(actionListener);
		contentPane.add(btn);
	}
	
	ActionListener actionListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textArea.setText("");
		}
	};
	
	MouseListener mouseListener = new MouseListener() {
		public void mouseClicked(MouseEvent e) {
			// this is redundant: mouseClicked = mousePressed + mouseReleased
		}
		public void mousePressed(MouseEvent e) {
			textArea.append("Mouse pressed\n");
		}
		public void mouseReleased(MouseEvent e) {
			textArea.append("Mouse released\n");
		}
		public void mouseEntered(MouseEvent e) {
			textArea.append("Mouse entered\n");
		}
		public void mouseExited(MouseEvent e) {
			textArea.append("Mouse exited\n");
		}
	};

}
