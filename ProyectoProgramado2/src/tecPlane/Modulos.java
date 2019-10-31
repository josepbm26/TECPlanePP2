package tecPlane;

import estructurasDatos.LQueue;

import java.util.Random;
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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

//librerias para mandar mensajes
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Modulos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	
	//creando las colas
	private LQueue colaGeneralPasajeros; //cola grande que contiene la subcolas peque;as ordenadas por prioridad del pasajer
	private LQueue colaSalidas;//Cola para la salida de los pasajeros
	
	
	//Creacion de lista de vuelos
	String listaVuelos[] = {"Costa Rica","Brasil","Panama","Chile","Egipto","Marruecos","Turquia","China","Rusia","Paraguay","Uruguay","Belice","Ghana","Belgica","Australia",
			"Vietnam","Laos","Austria","Tailandia","Taiwan","Holanda","Monaco","Colombia","Argentina","Croacia","Suiza","Serbia","Israel","Nigeria","Libia","Francia","Polonia",
			"Ecuador","Venezuela","Nicaragua","Mexico","Guatemala","Honduras","Jamaica","Bolivia","Italia","Noruega","Irlanda","Inglaterra","Gales","Suecia","Japon","Corea del Sur"};
	
	int listaVuelos_Contadores[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	
	//Cantidad de personas por tipo de puerta
	static int Promedio_puertasOro;
	static int Promedio_puertasPlatino;
	static int Promedio_puertasPrefe;
	int[] puertas_PlanLealtad = {Promedio_puertasOro,Promedio_puertasPlatino,Promedio_puertasPrefe};
	
	//Suma de los tiempos de cada cliente segun plan de lealtad
	static int sumaOro = 0;
	static int sumaPlatino = 0;
	static int sumaPrefe = 0;
	
	//Creacion de variables que almacenan el promedio segun planesde lealtad.
	static int promedioOro;
	static int promedioPlatino;
	static int promedioPrefe;
	int[] listaPromedios = {promedioOro,promedioPlatino,promedioPrefe};		
		
	//Cantidad de asientos en los vuelos separados por tipo de usuario
	static int contadorPreferencial=2;
	static int contadorPlatino=2;
	static int contadorOro=2;
	static int contadorEconomico=1;
	private JTextField textField_4;

	public Modulos(LQueue colaPreferenciales, LQueue colaPlatinos, LQueue colaOros, LQueue colaEconomicos, JTextField[] listaPuertas,Puertas[] puertasPreferenciales, Puertas[] puertasPlatinos, Puertas[] puertasOro, Puertas[] puertasEconomicos) {
		//instanciando las colas de los pasajeros
		colaGeneralPasajeros = new LQueue();
		colaSalidas = new LQueue();
		
		//metiendo en orden las colas en la cola grande    //Orden en ser atendido
		colaGeneralPasajeros.insertar(colaPreferenciales);  //1ro
		colaGeneralPasajeros.insertar(colaPlatinos);        //2ndo
		colaGeneralPasajeros.insertar(colaOros);            //3ro
		colaGeneralPasajeros.insertar(colaEconomicos);      //4to
		
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
		lblLugarDeOrigen.setBounds(25, 214, 84, 14);
		contentPane.add(lblLugarDeOrigen);
		
		JLabel lblNewLabel = new JLabel("Destino:");
		lblNewLabel.setBounds(25, 239, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblTipoDeUsuario = new JLabel("Tipo de usuario:");
		lblTipoDeUsuario.setBounds(25, 189, 84, 14);
		contentPane.add(lblTipoDeUsuario);
		
		JLabel lblPasaporte = new JLabel("Pasaporte:");
		lblPasaporte.setBounds(25, 264, 64, 14);
		contentPane.add(lblPasaporte);
		
		textField = new JTextField();
		textField.setBounds(141, 111, 132, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//Oro
		JList list = new JList();
		list.setBounds(309, 107, 156, 224);
		contentPane.add(list);
		//Platino
		JList list_1 = new JList();
		list_1.setBounds(617, 107, 156, 224);
		contentPane.add(list_1);
		//Preferenciales
		JList list_2 = new JList();
		list_2.setBounds(46, 387, 156, 224);
		contentPane.add(list_2);
		//Salida
		JList list_3 = new JList();
		list_3.setBounds(499, 387, 416, 224);
		contentPane.add(list_3);
		
		//Oro
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(475, 111, 132, 17);
		contentPane.add(comboBox);
		agregarVuelos(comboBox,listaPuertas,0);
		//Platino
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(783, 111, 132, 17);
		contentPane.add(comboBox_1);
		agregarVuelos(comboBox_1,listaPuertas,1);
		//Preferenciales
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(212, 402, 132, 17);
		contentPane.add(comboBox_2);
		agregarVuelos(comboBox_2,listaPuertas,2);
		
		
		//Atender Oro
		JButton btnAtender = new JButton("Atender");
		btnAtender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String destino = String.valueOf(comboBox.getSelectedItem());
				colaGeneralPasajeros.atenderPasajero(list_3, 2,destino);
				System.out.println(colaOros);
				colaOros.busquedaEliminar(list.getSelectedValue().toString());
				colaSalidas.insertar(list.getSelectedValue());
				System.out.println(colaOros);
				/*
				//Calculo de promedios
				int salidaOro = obtenerHora();
				int suma = promedioTiempo_planLealtad(salidaOro,colaOros,list,sumaOro);
				promedioOro = suma / contadorOro;
				System.out.println("p = " + promedioOro);
				//Promedio_puertasOro = totalPersonasPuerta(listaVuelos,listaVuelos_Contadores,colaOros,list);*/
			}
		});
		btnAtender.setBounds(499, 185, 89, 23);
		contentPane.add(btnAtender);
		
		//Atender platino
		JButton button = new JButton("Atender");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String destino = String.valueOf(comboBox_1.getSelectedItem());
				colaGeneralPasajeros.atenderPasajero(list_3, 1,destino);
				colaPlatinos.busquedaEliminar(list_1.getSelectedValue().toString());
				colaSalidas.insertar(list_1.getSelectedValue());
				//Calculo de promedios 
				int salidaPlatino = obtenerHora();
				int suma = promedioTiempo_planLealtad(salidaPlatino,colaPlatinos,list_1,sumaPlatino);
				promedioPlatino = suma / contadorPlatino;
				System.out.println("p = " + promedioPlatino);
				//totalPersonasPuerta(listaVuelos,listaVuelos_Contadores,colaPlatinos,list_1);
			}
		});
		button.setBounds(811, 185, 89, 23);
		contentPane.add(button);
		
		//Atender Preferenciales
		JButton button_1 = new JButton("Atender");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String destino = String.valueOf(comboBox_2.getSelectedItem());
				colaGeneralPasajeros.atenderPasajero(list_3, 0,destino);
				Persona persona = (Persona)colaPreferenciales.firstOriginal();
				if (persona.getTipoUsuario()=="Platino") {
					colaPlatinos.busquedaEliminar(list_2.getSelectedValue().toString());
				}
				else if(persona.getTipoUsuario()=="Oro") {
					colaOros.busquedaEliminar(list_2.getSelectedValue().toString());
				}
				colaPreferenciales.busquedaEliminar(list_2.getSelectedValue().toString());
				colaSalidas.insertar(list_2.getSelectedValue());
				//Calculo de promedios
				int salidaPrefe = obtenerHora();
				int suma = promedioTiempo_planLealtad(salidaPrefe,colaPreferenciales,list_2,sumaPrefe);
				promedioPrefe = suma / contadorPreferencial;
				System.out.println("p = " + promedioPrefe);
				//totalPersonasPuerta(listaVuelos,listaVuelos_Contadores,colaPreferenciales,list_2);
			}
		});
		button_1.setBounds(236, 476, 89, 23);
		contentPane.add(button_1);
		
		
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
		textField_3.setBounds(141, 211, 132, 20);
		contentPane.add(textField_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(141, 261, 132, 20);
		contentPane.add(textField_6);
		
		//PARTE ACTUALIZANDO LAS PUERTAS
		colaOros.meterSubColaEnListbox(list);
		colaPlatinos.meterSubColaEnListbox(list_1);
		colaPreferenciales.meterSubColaEnListbox(list_2);
		
		//ComboBox donde iran todos los destinos
		JComboBox<Object> comboBox_4 = new JComboBox();
		comboBox_4.setBounds(141, 236, 132, 20);
		contentPane.add(comboBox_4);
	
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_4.removeAllItems();
				String tipoUsuario = String.valueOf(comboBox_3.getSelectedItem());
				if (tipoUsuario=="Oro") {
					agregarVuelos(comboBox_4,listaPuertas,0);
				}
				else if(tipoUsuario=="Platino") {
					agregarVuelos(comboBox_4,listaPuertas,1);
				}
				else if(tipoUsuario=="Preferencial") {
					agregarVuelos(comboBox_4,listaPuertas,2);
				}
				else if(tipoUsuario=="Default" || tipoUsuario=="Economico") {
					agregarTodosVuelos(comboBox_4);
				}
			}
		});
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Default", "Economico", "Oro", "Platino"}));
		comboBox_3.setBounds(141, 185, 132, 22);
		contentPane.add(comboBox_3);
		
		
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PARTE AGREGAR PASAJERO
				//extrayendo los datos del pasajero
				String nombre = textField.getText();
				String fechaNacimiento = textField_1.getText();
				String nacionalidad = textField_2.getText();
				String tipoUsuario = String.valueOf(comboBox_3.getSelectedItem());
				int horaIngreso = obtenerHora();
				String lugarOrigen = textField_3.getText();
				String lugarDestino = String.valueOf(comboBox_4.getSelectedItem());
				int pasaporte = Integer.parseInt(textField_6.getText());
				
				//Generacion al azar si es preferencial
				Random numeroAleatorio = new Random(); //Libreria para genera un numero al azar
				int numero= numeroAleatorio.nextInt(6); //Genera un valor entre el rango 0 y 5
				boolean esPreferencial=false;
				
				if(numero==3) //Si el numero es igual a 3 entonces es preferencial
					esPreferencial=true;
				
				//creando el pasajero
				Persona persona = new Persona(nombre,fechaNacimiento,nacionalidad,lugarOrigen,lugarDestino,tipoUsuario,horaIngreso,pasaporte,esPreferencial);
				//Generando el asiento del pasajero
				String [] asientos= {"V","C","P"};//Ventana,centro,pasillo
				int numeroRan=numeroAleatorio.nextInt(asientos.length);
				String numeroAsiento="";
				Puertas vuelo = new Puertas(lugarDestino,numeroAsiento);

				//filtrando al pasajero
				if (esPreferencial == true) {
					colaPreferenciales.insertar(persona);
					//generacion de asiento para preferenciales "D"
					numeroAsiento="D"+asientos[numeroRan]+String.valueOf(contadorPreferencial);
					vuelo.setNumeroAsiento(numeroAsiento);
					puertasPreferenciales[contadorPreferencial]=vuelo;
					contadorPreferencial++;
				}
				if (tipoUsuario == "Platino") {
					colaPlatinos.insertar(persona);
					if(esPreferencial==false) {
						//generacion de asiento para platinos "P"
						numeroAsiento="P"+asientos[numeroRan]+String.valueOf(contadorPlatino);
						vuelo.setNumeroAsiento(numeroAsiento);
						puertasPlatinos[contadorPlatino]=vuelo;
						contadorPlatino++;
					}
				}
				else if(tipoUsuario == "Oro") {
					colaOros.insertar(persona);
					if(esPreferencial==false) {
						//generacion de asiento para oro "O"
						numeroAsiento="O"+asientos[numeroRan]+String.valueOf(contadorOro);
						vuelo.setNumeroAsiento(numeroAsiento);
						puertasOro[contadorOro]=vuelo;
						contadorOro++;
					}
				}
				else if (tipoUsuario == "Economico"){
					colaEconomicos.insertar(persona);
					if(esPreferencial==false) {
						//generacion de asiento para economicos "E"
						numeroAsiento="E"+asientos[numeroRan]+String.valueOf(contadorEconomico);
						vuelo.setNumeroAsiento(numeroAsiento);
						puertasPreferenciales[contadorEconomico]=vuelo;
						contadorEconomico++;
					}
				}

				//mensaje de que se anadio el pasajero a la cola
				JOptionPane.showMessageDialog(null, "Datos Ingresados satisfactoriamente!" + "\n Su numero de asientos es: " +numeroAsiento);
				
				//PARTE ACTUALIZANDO LAS PUERTAS
				colaOros.meterSubColaEnListbox(list);
				colaPlatinos.meterSubColaEnListbox(list_1);
				colaPreferenciales.meterSubColaEnListbox(list_2);
				
				/*
				//MANDANDO EL MENSAJE DE CONFIRMACION DE LOS DATOS INGRESADOS
				String message = "Bienvenido(a) "+persona.getNombre()+", su destino es: "+persona.getLugarDestino()+", asiento numero: "+ numeroAsiento +" Buen viaje!";		
				String phone = "+506"+textField_4.getText();
				
				//CONCATENANDO EL NUMERO DE TELEFONO CON LA EXTENSION//"+50670650043";
				String username = "abcd";
				String password = "1234";
				String address = "http://172.18.249.126";
				String port = "8090";
				
				URL url = null;
				try {
					url = new URL(
							address+":"+port+"/SendSMS?username="+username+"&password="+password+
							"&phone="+phone+"&message="+URLEncoder.encode(message,"UTF-8"));
				} catch (MalformedURLException | UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				URLConnection connection = null;
				try {
					connection = url.openConnection();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				BufferedReader bufferedReader = null;
				try {
					bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String inputLine;
				try {
					while((inputLine = bufferedReader.readLine()) !=null){
						System.out.println(inputLine);
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					bufferedReader.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			 */
				
			}
		});
		btnAgregar.setBounds(158, 323, 89, 23);
		contentPane.add(btnAgregar);
		
		JButton btnVerInfo = new JButton("Ver Info");
		btnVerInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, colaOros.buscarPersona(list.getSelectedValue().toString())); //Ver informacion de todos los oros para pruebas
			}
		});
		btnVerInfo.setBounds(499, 235, 89, 23);
		contentPane.add(btnVerInfo);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PUERTA DE OROS
				
				//agarrando el destino escogido en la ombobox				
				String destino = String.valueOf(comboBox.getSelectedItem());
				
				//usando el metodo de actualizar la puerta de la LQueue				
				colaOros.actualizarPuerta(list, destino);
			}
		});
		btnActualizar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnActualizar.setBounds(499, 135, 89, 23);
		contentPane.add(btnActualizar);
		
		JButton btnActualizar_1 = new JButton("Actualizar");
		btnActualizar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PUERTA DE Platinos
				
				//agarrando el destino escogido en la ombobox
				String destino = String.valueOf(comboBox_1.getSelectedItem());
				
				//usando el metodo de actualizar la puerta de la LQueue
				colaPlatinos.actualizarPuerta(list_1, destino);
				
			}
		});
		btnActualizar_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnActualizar_1.setBounds(811, 135, 89, 23);
		contentPane.add(btnActualizar_1);
		
		JButton btnActualizar_2 = new JButton("Actualizar");
		btnActualizar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PUERTA DE PREERENCIALES
				
				//agarrando el destino escogido en la ombobox
				String destino = String.valueOf(comboBox_2.getSelectedItem());
				
				//usando el metodo de actualizar la puerta de la LQueue
				colaPreferenciales.actualizarPuerta(list_2, destino);
				
			}
		});
		btnActualizar_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnActualizar_2.setBounds(236, 430, 89, 23);
		contentPane.add(btnActualizar_2);
		
		JButton btnAdministrarTecPlane = new JButton("Administrar TEC Plane");
		btnAdministrarTecPlane.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Administracion ventana = new Administracion(listaVuelos,listaPuertas,puertasPreferenciales,puertasPlatinos,puertasOro,puertasEconomicos,contadorEconomico,contadorPreferencial,contadorOro,contadorPlatino,listaPromedios,puertas_PlanLealtad);
				ventana.setVisible(true);
			}
		});
		btnAdministrarTecPlane.setBounds(286, 604, 179, 23);
		contentPane.add(btnAdministrarTecPlane);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(25, 293, 105, 14);
		contentPane.add(lblTelefono);
		
		textField_4 = new JTextField();
		textField_4.setBounds(141, 292, 132, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		
	}
	
	//Metodo para agregar vuelos a los comboBox
		public void agregarVuelos(JComboBox<Object> comboBox, JTextField[] listaPuertas, int tipoUsuario) {
			int indice = 0;
			JTextField datoTextField = listaPuertas[tipoUsuario];	//Se extrae el text field con la cantidad de puertas. 0 Oro, 1 Platino, 2 Preferencial
			int cantidadPuertas = Integer.parseInt(datoTextField.getText());		//Se parsea el dato del text field
			while (indice < cantidadPuertas) {
				comboBox.addItem(listaVuelos[indice]);
				indice++;		
			}	
		}
	//Metodo para agregar todos los vuelos
		public void agregarTodosVuelos(JComboBox<Object> comboBox) {
			int indice = 0;
			while (indice < listaVuelos.length) {
				comboBox.addItem(listaVuelos[indice]);
				indice++;
			}
		}
		
		//Metodo para obtener la hora del sistema
			public static int obtenerHora() {
				LocalTime time = LocalTime.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm");
				String parseo = (String) time.format(formatter);
				int horaMinutos = Integer.parseInt(parseo);
				return horaMinutos;
			}
			
			
			
			
		//Metodo para promedio de tiempo segun plan de lealtad
			public int promedioTiempo_planLealtad(int salida,LQueue colaPlan, JList<Object> list, int suma) {
				int duracionPersona = 0;
				LQueue aux = colaPlan;
				int contador = 1;
				String nombrePersona = list.getSelectedValue().toString();	
				//System.out.println("a = "+nombrePersona);												//Nombre del pasajero extraido del list box.
				while(aux.size() >= contador) {
					//System.out.print(aux.toString());
					Persona persona = (Persona) aux.first().getElement();	
					//System.out.println("b = " + persona.getNombre());										//Nombre del pasajero extraido de la cola.
					if (persona.getNombre() == nombrePersona) {											//Extrae todo, como saco solo el nombre?
						//System.out.println("--------------entro");
						int ingreso = persona.getHoraIngreso();
						duracionPersona = salida - ingreso;
						//System.out.println("dP =" + duracionPersona);
						//System.out.println("S0 =" + suma);
						suma = suma + duracionPersona;
						//System.out.println("S1 =" + suma);
						//aux.eliminar();
						//System.out.print(aux.toString());
						return suma;
					}
					else {
						//System.out.println("--------------no entro");
						//aux.eliminar();
						//System.out.print(aux.toString());
					contador++;
					}
				}
				return suma;
				
			
			}
	
		//Metodos para promedio de personas atendidas por puerta
		//Metodo para promedio de personas atendidas por tipo de puerta
			/*
			public int totalPersonasPuerta(String[] listaVuelos, int[] listaVuelos_Contadores,LQueue colaPlan,JList<Object> list) {
				String nombrePersona = list.getSelectedValue().toString();																//Identificador de la puerta
				System.out.println("N = " + nombrePersona);
				//Persona persona = null;
				int contador = 0;
				LQueue aux = colaPlan;
				while(aux.size() >= contador) {
					Persona persona = (Persona) aux.first().getElement();
					System.out.println("p =" + persona.getNombre());
					if (nombrePersona == persona.getNombre()) {
						return getNombrePuerta(listaVuelos,persona,listaVuelos_Contadores);
					}
					aux.eliminar();
					contador++;
				}
				return 0;
			}
		
		//Metodo para extraer el nombre o identificador de la puerta.
			public int getNombrePuerta(String[] listaVuelos,Persona persona,int[] listaVuelos_Contadores) {
				int contador = 0;
				for (;contador < listaVuelos.length; contador++) {
					if (listaVuelos[contador] == persona.getLugarDestino()) {
						listaVuelos_Contadores[contador]++;
						System.out.println("C = " + listaVuelos_Contadores[contador]);
						return listaVuelos_Contadores[contador];
					}
				}
				return listaVuelos_Contadores[contador];
			} */	
		
}
