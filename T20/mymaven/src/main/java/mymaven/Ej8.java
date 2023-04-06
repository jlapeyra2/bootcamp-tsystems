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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ej8 extends JFrame {

	private JPanel contentPane;
	private JTextField fieldInput;
	private JLabel labelIgual;
	private JButton buttonBorrar;
	private JButton buttonConvertir;
	private JButton buttonCambiar;
	private JLabel labelMonedaIn;
	private JLabel labelMonedaOut;
	private JLabel resultado;

	
	int conversion = 0; // conversion=0 para €->pts / conversion=1 para  pts->€
	String[] convertir_text = {"euros → pesetas", "pesetas → euros"};
	String[] moneda_in_text = {"euros", "pesetas"};
	String[] moneda_out_text = {"pesetas", "euros"};
	double[] cambio = {166.386, 1/166.386};
	String[] decimal_format = {"%.0f", "%.2f"};
	
	
	ActionListener convertir = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				double in = Double.valueOf(fieldInput.getText());
				double out = in*cambio[conversion];
				resultado.setText(String.format(decimal_format[conversion], out));
			} catch (NumberFormatException exc) {
				JOptionPane.showMessageDialog(null, "Por favor, introduzca un número real \nen formato XX.XX (por ejemplo 1.5)");
			}
		}
	};
	
	void actualizar_texto() {
		buttonConvertir.setText(convertir_text[conversion]);
		labelMonedaIn.setText(moneda_in_text[conversion]);
		labelMonedaOut.setText(moneda_out_text[conversion]);
	}
	
	ActionListener cambiar_conversion = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			conversion = (conversion+1)%2;
			fieldInput.setText("");
			resultado.setText("");
			actualizar_texto();
		}
	};
	
	ActionListener borrar = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			fieldInput.setText("");
			resultado.setText("");
		}
	};
	
	
	public Ej8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		fieldInput = new JTextField();
		fieldInput.setBounds(91, 26, 86, 20);
		contentPane.add(fieldInput);
		fieldInput.setColumns(10);
		
		buttonConvertir = new JButton("");
		buttonConvertir.addActionListener(convertir);
		buttonConvertir.setBounds(154, 63, 140, 23);
		contentPane.add(buttonConvertir);
		
		labelIgual = new JLabel("=");
		labelIgual.setBounds(240, 29, 18, 14);
		contentPane.add(labelIgual);
		
		labelMonedaIn = new JLabel("");
		labelMonedaIn.setBounds(184, 29, 57, 14);
		contentPane.add(labelMonedaIn);
		
		labelMonedaOut = new JLabel("");
		labelMonedaOut.setBounds(323, 29, 46, 14);
		contentPane.add(labelMonedaOut);
		
		resultado = new JLabel("");
		resultado.setBounds(256, 29, 57, 14);
		contentPane.add(resultado);
		
		buttonCambiar = new JButton("Cambiar"); 
		buttonCambiar.addActionListener(cambiar_conversion);
		buttonCambiar.setBounds(127, 97, 89, 23);
		contentPane.add(buttonCambiar);
		
		buttonBorrar = new JButton("Borrar");
		buttonBorrar.addActionListener(borrar);
		buttonBorrar.setBounds(236, 97, 89, 23);
		contentPane.add(buttonBorrar);
		
		actualizar_texto();
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej8 frame = new Ej8();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
