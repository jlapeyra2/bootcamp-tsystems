package mymaven;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Ej6 extends JFrame {

	private JPanel contentPane;
	private JTextField fieldAltura;
	private JTextField fieldPeso;
	private JLabel imcLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej6 frame = new Ej6();
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
	public Ej6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Altura (m)");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(31, 29, 65, 14);
		contentPane.add(lblNewLabel);
		
		fieldAltura = new JTextField();
		fieldAltura.setBounds(99, 26, 86, 20);
		contentPane.add(fieldAltura);
		fieldAltura.setColumns(10);
		
		JLabel lblPesokg = new JLabel("Peso (kg)");
		lblPesokg.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPesokg.setBounds(201, 29, 65, 14);
		contentPane.add(lblPesokg);
		
		fieldPeso = new JTextField();
		fieldPeso.setColumns(10);
		fieldPeso.setBounds(269, 26, 86, 20);
		contentPane.add(fieldPeso);
		
		
		imcLabel = new JLabel("IMC: ");
		imcLabel.setBounds(218, 67, 86, 14);
		contentPane.add(imcLabel);
		
		JButton button = new JButton("Calcular");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float peso = Float.parseFloat(fieldPeso.getText());
				float altura = Float.parseFloat(fieldAltura.getText());
				float imc = peso/(altura*altura);
				imcLabel.setText("IMC: "+(new DecimalFormat("0.00")).format(imc));
			}
		});
		button.setBounds(99, 63, 89, 23);
		contentPane.add(button);
	}
}
