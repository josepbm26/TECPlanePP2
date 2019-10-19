package tecPlane;

import estructurasDatos.LQueue;
import tecPlane.ConfiguracionInicial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Modulos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	
	//creando las colas
	private LQueue colaGeneralPasajeros; //cola grande que contiene la subcolas peque;as ordenadas por prioridad del pasajero
	private LQueue colaPreferenciales;
	private LQueue colaPlatinos;
	private LQueue colaOros;
	private LQueue colaEconomicos;
	
	//Creacion de lista de vuelos
	String listaVuelos[] = {"Costa Rica","Brasil","Panama","Chile","Egipto","Marruecos","Turquia","China","Rusia","Paraguay","Uruguay","Belice","Ghana","Belgica","Australia",
			"Vietnam","Laos","Austria","Tailandia","Taiwan","Holanda","Monaco","Colombia","Argentina","Croacia","Suiza","Serbia","Israel","Nigeria","Libia","Francia","Polonia",
			"Ecuador","Venezuela","Nicaragua","Mexico","Guatemala","Honduras","Jamaica","Bolivia","Italia","Noruega","Irlanda","Inglaterra","Gales","Suecia","Japon","Corea del Sur"};
	
	//Metodo para agregar vuelos a los comboBox
	public void agregarVuelos(JComboBox<Object> comboBox) {
		int indice = 0;
		while (indice < listaVuelos.length) {
			comboBox.addItem(listaVuelos[indice]);
			indice++;
		}
	}
	

	public Modulos() {
		//instanciando las colas de los pasajeros
		colaGeneralPasajeros = new LQueue();
		colaPreferenciales = new LQueue();
		colaPlatinos = new LQueue();
		colaOros = new LQueue();
		colaEconomicos = new LQueue();
		
		//metiendo en orden las colas en la cola grande    //Orden en ser atendido
		colaGeneralPasajeros.enqueue(colaPreferenciales);  //1ro
		colaGeneralPasajeros.enqueue(colaPlatinos);        //2ndo
		colaGeneralPasajeros.enqueue(colaOros);            //3ro
		colaGeneralPasajeros.enqueue(colaEconomicos);      //4to
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 955, 693);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModulos = new JLabel("Modulos");
		lblModulos.setBounds(428, 25, 71, 14);
		lblModulos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblModulos);
		
		JLabel lblAsignacionDeFichas = new JLabel("Registro de pasajeros");
		lblAsignacionDeFichas.setBounds(131, 82, 124, 14);
		contentPane.add(lblAsignacionDeFichas);
		
		JLabel lblVip = new JLabel("Oro");
		lblVip.setBounds(453, 82, 46, 14);
		contentPane.add(lblVip);
		
		JLabel lblEconomico = new JLabel("Preferencial");
		lblEconomico.setBounds(131, 357, 71, 14);
		contentPane.add(lblEconomico);
		
		JLabel lblSalidas = new JLabel("Salidas");
		lblSalidas.setBounds(685, 357, 46, 14);
		contentPane.add(lblSalidas);
		
		JLabel lblPlatino = new JLabel("Platino");
		lblPlatino.setBounds(758, 82, 46, 14);
		contentPane.add(lblPlatino);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(25, 114, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento.setBounds(25, 139, 105, 14);
		contentPane.add(lblFechaDeNacimiento);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:");
		lblNacionalidad.setBounds(25, 164, 105, 14);
		contentPane.add(lblNacionalidad);
		
		JLabel lblLugarDeOrigen = new JLabel("Origen:");
		lblLugarDeOrigen.setBounds(25, 189, 84, 14);
		contentPane.add(lblLugarDeOrigen);
		
		JLabel lblNewLabel = new JLabel("Destino:");
		lblNewLabel.setBounds(25, 214, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblTipoDeUsuario = new JLabel("Tipo de usuario:");
		lblTipoDeUsuario.setBounds(25, 239, 84, 14);
		contentPane.add(lblTipoDeUsuario);
		
		JLabel lblPasaporte = new JLabel("Pasaporte:");
		lblPasaporte.setBounds(25, 264, 64, 14);
		contentPane.add(lblPasaporte);
		
		textField = new JTextField();
		textField.setBounds(141, 111, 132, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JList list = new JList();
		list.setBounds(309, 107, 156, 224);
		contentPane.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(617, 107, 156, 224);
		contentPane.add(list_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(475, 111, 132, 17);
		contentPane.add(comboBox);
		agregarVuelos(comboBox);
		
		JButton btnAtender = new JButton("Atender");
		btnAtender.setBounds(499, 185, 89, 23);
		contentPane.add(btnAtender);
		
		JButton button = new JButton("Atender");
		button.setBounds(811, 185, 89, 23);
		contentPane.add(button);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(783, 111, 132, 17);
		contentPane.add(comboBox_1);
		agregarVuelos(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(212, 402, 132, 17);
		contentPane.add(comboBox_2);
		agregarVuelos(comboBox_2);
		
		JButton button_1 = new JButton("Atender");
		button_1.setBounds(236, 476, 89, 23);
		contentPane.add(button_1);
		
		JList list_2 = new JList();
		list_2.setBounds(46, 387, 156, 224);
		contentPane.add(list_2);
		
		JList list_3 = new JList();
		list_3.setBounds(499, 387, 416, 224);
		contentPane.add(list_3);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(811, 620, 89, 23);
		contentPane.add(btnSalir);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(141, 136, 132, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(140, 161, 132, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(141, 186, 132, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(141, 211, 132, 20);
		contentPane.add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(141, 261, 132, 20);
		contentPane.add(textField_6);
	
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"(tipo)", "Economico", "Oro", "Platino", "Preferencial"}));
		comboBox_3.setBounds(141, 235, 132, 22);
		contentPane.add(comboBox_3);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PARTE AGREGAR PASAJERO
				//extrayendo los datos del pasajero
				String nombre = textField.getText();
				String fechaNacimiento = textField_1.getText();
				String nacionalidad = textField_2.getText();
				String lugarOrigen = textField_3.getText();
				String lugarDestino = textField_4.getText();
				String tipoUsuario = String.valueOf(comboBox_3.getSelectedItem());
				int pasaporte = Integer.parseInt(textField_6.getText());
				
				//crenado el pasajero
				Persona persona = new Persona(nombre,fechaNacimiento,nacionalidad,lugarOrigen,lugarDestino,tipoUsuario,pasaporte);

				//filtrando al pasajero
				if (tipoUsuario == "Preferencial") {
					colaPreferenciales.enqueue(persona);
				}
				else if (tipoUsuario == "Platino") {
					colaPlatinos.enqueue(persona);
				}
				else if(tipoUsuario == "Oro") {
					colaOros.enqueue(persona);
				}
				else if (tipoUsuario == "Economico"){
					colaEconomicos.enqueue(persona);
				}

				//mensaje de que se anadio el pasajero a la cola
				JOptionPane.showMessageDialog(null, "Datos Ingresados satisfactoriamente!");
				
				//PARTE ACTUALIZANDO LAS PUERTAS
				colaOros.meterSubColaEnListbox(list);
				colaPlatinos.meterSubColaEnListbox(list_1);
				colaPreferenciales.meterSubColaEnListbox(list_2);
				
			}
		});
		btnAgregar.setBounds(151, 292, 89, 23);
		contentPane.add(btnAgregar);
		
	}
}
