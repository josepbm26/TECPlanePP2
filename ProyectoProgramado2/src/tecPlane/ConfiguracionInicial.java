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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
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
		textField_1.setText("13");
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
		textField_2.setText("15");
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
		textField.setText("8");
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
				Puertas puertasPreferenciales[] = new Puertas[99];
				Puertas puertasPlatinos[] = new Puertas[99];
				Puertas puertasOro[] = new Puertas[99];
				Puertas puertasEconomicos[] = new Puertas[99];
				Persona persona1 = new Persona("Andres Barahona", "21/01/1995", "Noruego", "Inglaterra", "Costa Rica", "Oro",LQueue.obtenerHora(), 8080475, true);
				Puertas vuelo1=new Puertas("Costa Rica","DC0");
				Persona persona2 = new Persona("Andres Gutierrez", "27/05/1997", "Africano", "China", "Brasil", "Platino",LQueue.obtenerHora(), 4045654,false);
				Puertas vuelo2=new Puertas("Brasil","PV0");
				Persona persona3 = new Persona("Jose Barrantes", "26/09/2000", "Costarricense", "Estados Unidos", "Panama","Oro", LQueue.obtenerHora(), 855515,true);
				Puertas vuelo3=new Puertas("Panama","DV1");
				Persona persona4 = new Persona("Pedro Salas", "27/12/1987", "Chino", "China", "Panama", "Platino",LQueue.obtenerHora(), 787514,false);
				Puertas vuelo4=new Puertas("Panama","PC1");
				Persona persona5 = new Persona("Ana Solis", "4/05/1992", "Mexicana", "Mexico", "Chile", "Economico",LQueue.obtenerHora(), 1212154,false);
				Puertas vuelo5=new Puertas("Chile","EP0");
				colaOros.insertar(persona1);
				puertasOro[0]=vuelo1;
				colaPreferenciales.insertar(persona1);
				puertasPreferenciales[0]=vuelo1;
				colaPlatinos.insertar(persona2);
				puertasPlatinos[0]=vuelo2;
				colaOros.insertar(persona3);
				puertasOro[1]=vuelo3;
				colaPreferenciales.insertar(persona3);
				puertasPreferenciales[1]=vuelo3;
				colaPlatinos.insertar(persona4);
				puertasPlatinos[1]=vuelo4;
				colaEconomicos.insertar(persona5);
				puertasEconomicos[0]=vuelo5;
				
				//Creacion de arreglo que contiene cantidad de puertas
				JTextField cantidadPuertas[] = {textField,textField_1,textField_2};
				
				//creando la ventan de los modulos
				Modulos ventana = new Modulos(colaPreferenciales,colaPlatinos,colaOros,colaEconomicos,cantidadPuertas,puertasPreferenciales,puertasPlatinos,puertasOro,puertasEconomicos);
				frame.dispose();
				ventana.setVisible(true);
				
				//Generacion al azar si es preferencial
				Random numeroAleatorio = new Random(); //Libreria para genera un numero al azar
				int numero= numeroAleatorio.nextInt(9); //Genera un valor entre el rango 0 y 8
								
			}
		});
		btnSeguir.setBounds(327, 395, 89, 23);
		frame.getContentPane().add(btnSeguir);
							
	}
	
}






