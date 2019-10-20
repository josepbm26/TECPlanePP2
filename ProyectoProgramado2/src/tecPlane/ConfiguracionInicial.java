package tecPlane;



import java.awt.EventQueue;

import estructurasDatos.LQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class ConfiguracionInicial {
	
	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfiguracionInicial window = new ConfiguracionInicial();
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
	public ConfiguracionInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 759, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEstructura = new JLabel("Estructura");
		lblEstructura.setBounds(25, 153, 62, 14);
		frame.getContentPane().add(lblEstructura);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cola Prioridad", "Heap"}));
		comboBox.setBounds(97, 150, 126, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblEconomicas = new JLabel("Economicas");
		lblEconomicas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEconomicas.setBounds(78, 113, 78, 14);
		frame.getContentPane().add(lblEconomicas);
		
		JLabel lblVip = new JLabel("Platino");
		lblVip.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVip.setBounds(585, 113, 78, 14);
		frame.getContentPane().add(lblVip);
		
		JLabel label = new JLabel("Estructura");
		label.setBounds(490, 153, 62, 14);
		frame.getContentPane().add(label);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Cola Prioridad", "Heap"}));
		comboBox_1.setBounds(575, 150, 126, 20);
		frame.getContentPane().add(comboBox_1);
		
		JLabel label_1 = new JLabel("Puertas");
		label_1.setBounds(490, 201, 62, 14);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(575, 198, 45, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblPreferenciales = new JLabel("Preferenciales");
		lblPreferenciales.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPreferenciales.setBounds(144, 278, 90, 14);
		frame.getContentPane().add(lblPreferenciales);
		
		JLabel label_2 = new JLabel("Estructura");
		label_2.setBounds(91, 317, 62, 14);
		frame.getContentPane().add(label_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Cola Prioridad", "Heap"}));
		comboBox_2.setBounds(163, 314, 126, 20);
		frame.getContentPane().add(comboBox_2);
		
		JLabel label_3 = new JLabel("Puertas");
		label_3.setBounds(91, 371, 62, 14);
		frame.getContentPane().add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(163, 368, 45, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblSalida = new JLabel("Salida");
		lblSalida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalida.setBounds(517, 278, 78, 14);
		frame.getContentPane().add(lblSalida);
		
		JLabel label_4 = new JLabel("Estructura");
		label_4.setBounds(435, 317, 62, 14);
		frame.getContentPane().add(label_4);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Cola Prioridad", "Heap"}));
		comboBox_3.setBounds(507, 314, 126, 20);
		frame.getContentPane().add(comboBox_3);
		
		JLabel lblTecplane = new JLabel("TECplane");
		lblTecplane.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTecplane.setBounds(327, 44, 78, 20);
		frame.getContentPane().add(lblTecplane);
		
		JLabel lblOro = new JLabel("Oro");
		lblOro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOro.setBounds(360, 113, 78, 14);
		frame.getContentPane().add(lblOro);
		
		JLabel label_7 = new JLabel("Estructura");
		label_7.setBounds(278, 153, 62, 14);
		frame.getContentPane().add(label_7);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Cola Prioridad", "Heap"}));
		comboBox_4.setBounds(350, 150, 126, 20);
		frame.getContentPane().add(comboBox_4);
		
		JLabel label_8 = new JLabel("Puertas");
		label_8.setBounds(278, 201, 62, 14);
		frame.getContentPane().add(label_8);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(350, 198, 45, 20);
		frame.getContentPane().add(textField);
		
		JButton btnSeguir = new JButton("Seguir");
		btnSeguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Implementacion personas predefinidas
				LQueue colaPreferenciales= new LQueue();
				LQueue colaPlatinos=new LQueue();
				LQueue colaOros=new LQueue();
				LQueue colaEconomicos=new LQueue();
				Persona persona1 = new Persona("Andres Barahona", "21/01/1995", "Noruego", "Inglaterra", "Costa Rica", "Oro", 8080475, true);
				Persona persona2 = new Persona("Andres Gutierrez", "27/05/1997", "Africano", "China", "Brasil", "Platino", 4045654,false);
				Persona persona3 = new Persona("Jose Barrantes", "26/09/2000", "Costarricense", "Estados Unidos", "Panama", "Oro", 855515,true);
				Persona persona4 = new Persona("Pedro Salas", "27/12/1987", "Chino", "China", "Panama", "Platino", 787514,false);
				Persona persona5 = new Persona("Ana Solis", "4/05/1992", "Mexicana", "Mexico", "Chile", "Economico", 1212154,false);
				colaOros.insertar(persona1);
				colaPreferenciales.insertar(persona1);
				colaPlatinos.insertar(persona2);
				colaOros.insertar(persona3);
				colaPreferenciales.insertar(persona3);
				colaPlatinos.insertar(persona4);
				colaEconomicos.insertar(persona5);
				
				//Creacion de arreglo que contiene cantidad de puertas
				JTextField cantidadPuertas[] = {textField,textField_1,textField_2};
				
				//creando la ventan de los modulos
				Modulos ventana = new Modulos(colaPreferenciales,colaPlatinos,colaOros,colaEconomicos,cantidadPuertas);
				frame.dispose();
				ventana.setVisible(true);
			}
		});
		btnSeguir.setBounds(327, 395, 89, 23);
		frame.getContentPane().add(btnSeguir);
							
	}
}






