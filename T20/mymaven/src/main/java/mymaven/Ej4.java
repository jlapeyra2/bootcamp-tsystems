package mymaven;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class Ej4 extends JFrame {

	private JPanel contentPane;
	JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej4 frame = new Ej4();
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
	public Ej4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(107, 10, 276, 240);
		contentPane.add(textArea);
		
		JLabel lblEventos = new JLabel("Events:");
		lblEventos.setBounds(10, 124, 65, 14);
		contentPane.add(lblEventos);
		
		this.addComponentListener(windowAttributes);
		this.addWindowStateListener(windowState);
	}
	
	final int ACTION_OTHER = 0;
	final int ACTION_RESIZE = 1;
	final int ACTION_MOVE = 2;
	int last_action = ACTION_OTHER;
	int old_state = Frame.NORMAL;
	
	WindowStateListener windowState = new WindowStateListener() {
		public void windowStateChanged(WindowEvent e) {
			int new_state = e.getNewState();
			if (new_state == Frame.ICONIFIED)
				textArea.append("Window minimized\n");
			else if (old_state == Frame.ICONIFIED)
				textArea.append("Window unminimized\n");
			else if (new_state != Frame.NORMAL)
				textArea.append("Window maximized\n");
			else if (old_state != Frame.NORMAL)
				textArea.append("Window unmaximized\n");
			last_action = ACTION_OTHER;
			old_state = new_state;
		}
	};
	ComponentAdapter windowAttributes = new ComponentAdapter() {
		
		public void componentMoved(ComponentEvent e) {
			if(last_action != ACTION_MOVE) 
				textArea.append("Window moved\n");
			last_action = ACTION_MOVE;
		}
		
		public void componentResized(ComponentEvent e) {
			if(last_action != ACTION_RESIZE) 
				textArea.append("Window resized\n");
			last_action = ACTION_RESIZE;
		}

	};

}
