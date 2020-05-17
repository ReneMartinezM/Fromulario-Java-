package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtRFC;
	private JTextField txtEDAD;
	private JTextField txtTelefono;

	/**
	 * Launch the application.
	 */
	
	
	
	private void enviaMensaje(String mensaje, JTextField esti) {
		txtNombre.setText(mensaje);
		
	}
	
	private boolean validaFormulario(){
		Validador validacion = new Validador();
		boolean valido = true;
		
		 
		
		if (validacion.campoVacio(txtEDAD.getText())){
			txtEDAD.setBackground(Color.red);
			valido = false;
		}
		else {
			txtEDAD.setBackground(Color.green);
		}
		if (validacion.campoVacio(txtNombre.getText())){
			txtNombre.setBackground(Color.red);
			enviaMensaje("Campo Obligtorio", txtNombre);
			valido = false;
		}else {
			txtNombre.setBackground(Color.green);
		}
		if (validacion.campoVacio(txtTelefono.getText())){
			txtTelefono.setBackground(Color.red);
			valido = false;
		}else {
			txtTelefono.setBackground(Color.green);
		}
		
		if (validacion.verificaNumerico(txtTelefono.getText())) {
			
		}
		
		
		
		return valido;
	}//Fin metodoValidar
	
	
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioPrincipal frame = new FormularioPrincipal();
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
	public FormularioPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Datos Adoptante");
		lblNewLabel.setToolTipText("Datos Adoptante");
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		
		JLabel lblNewLabel_2 = new JLabel("RFC:");
		
		JLabel lblNewLabel_3 = new JLabel("EDAD:");
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		txtRFC = new JTextField();
		txtRFC.setColumns(10);
		
		txtEDAD = new JTextField();
		txtEDAD.setColumns(10);
		
		JButton btnValidar = new JButton("Ingresa Datos");
		
		
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				validaFormulario();
				
				
			}
		});
		
		JLabel lblNewLabel_4 = new JLabel("Telefono");
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtEDAD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtRFC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnValidar, Alignment.TRAILING)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(293, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(txtRFC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(txtEDAD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
					.addComponent(btnValidar)
					.addGap(67))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
