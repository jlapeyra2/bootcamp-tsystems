package Ej3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Encuesta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encuesta frame = new Encuesta();
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
	public Encuesta() {
		setTitle("Encuesta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("Elije un sistema operativo");		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnNewRadioButton);
		btnGroup.add(rdbtnNewRadioButton_1);
		btnGroup.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel = new JLabel("Elije especialidades");
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programación");
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Diseño gráfico");
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administración");
		
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas a la programación");
		JSlider slider = new JSlider();
		slider.setValue(0);
		slider.setMaximum(10);
		
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				JOptionPane.showMessageDialog(null, 
						"Sistema operativo: "
						+ (rdbtnNewRadioButton.isSelected()   ? rdbtnNewRadioButton.getText()   : "")
						+ (rdbtnNewRadioButton_1.isSelected() ? rdbtnNewRadioButton_1.getText() : "")
						+ (rdbtnNewRadioButton_2.isSelected() ? rdbtnNewRadioButton_2.getText() : "")
						+ "\nEspecialidades: "
						+ (chckbxNewCheckBox.isSelected()   ? (i++>0 ?", ":"") + chckbxNewCheckBox.getText().toLowerCase()   : "")
						+ (chckbxNewCheckBox_1.isSelected() ? (i++>0 ?", ":"") + chckbxNewCheckBox_1.getText().toLowerCase() : "")
						+ (chckbxNewCheckBox_2.isSelected() ? (i++>0 ?", ":"") + chckbxNewCheckBox_2.getText().toLowerCase() : "")
						+ "\nHoras dedicadas a la programación: " + slider.getValue()
				);
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("0");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNewLabel_3_1 = new JLabel("10");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(chckbxNewCheckBox)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxNewCheckBox_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxNewCheckBox_2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnNewRadioButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton_1)
							.addGap(2)
							.addComponent(rdbtnNewRadioButton_2))
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_2)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_3_1))
						.addComponent(btnNewButton))
					.addContainerGap(131, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnNewRadioButton_1)
						.addComponent(rdbtnNewRadioButton_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox)
						.addComponent(chckbxNewCheckBox_1)
						.addComponent(chckbxNewCheckBox_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(btnNewButton))
						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(56))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
