package tecPlane;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class Administracion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;


	public Administracion(String[] listaVuelos, JTextField[] listaPuertas,Puertas[] puertasPreferenciales,Puertas[] puertasPlatinos,Puertas[] puertasOro,Puertas[] puertasEconomicos,int contadorEconomico,int contadorPreferencial,int contadorOro, int contadorPlatino,int[] listaPronedios,int[] puertas_PlanLealtad) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 898, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdministracion = new JLabel("Administraci\u00F3n");
		lblAdministracion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAdministracion.setBounds(21, 21, 214, 22);
		contentPane.add(lblAdministracion);
		
		JLabel lblVerEstadoDe = new JLabel("Ver estado de puertas");
		lblVerEstadoDe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVerEstadoDe.setBounds(21, 71, 156, 14);
		contentPane.add(lblVerEstadoDe);
		
		JLabel lblNewLabel = new JLabel("Administracion de puertas");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(315, 71, 207, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEstadisticcas = new JLabel("Estadisticas");
		lblEstadisticcas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEstadisticcas.setBounds(658, 71, 109, 14);
		contentPane.add(lblEstadisticcas);
		
		JButton btnNewButton = new JButton("Ver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Tiempos de espera\n\nEconomico: \nOro:" + listaPronedios[0] + "\nPlatino:" + listaPronedios[1] + "\nPreferencial:" + listaPronedios[3]);
			}
		});
		btnNewButton.setBounds(658, 124, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblVerPromedio = new JLabel("1. Ver promedio de espera por plan de lealtad");
		lblVerPromedio.setBounds(542, 104, 330, 14);
		contentPane.add(lblVerPromedio);
		
		JLabel lblVerTiempo = new JLabel("2. Ver tiempo promedio de espera de salida ");
		lblVerTiempo.setBounds(542, 158, 307, 14);
		contentPane.add(lblVerTiempo);
		
		JButton btnNewButton_1 = new JButton("Ver");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "segundos");
			}
		});
		btnNewButton_1.setBounds(658, 183, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("3. Ver total de personas atendidas por plan de lealtad\r\n");
		lblNewLabel_1.setBounds(542, 217, 340, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnVer = new JButton("Ver");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Total de personas\n\nEconomico:  a \nOro:  a \nPlatino:  a \nPreferencial:  a");
			}
		});
		btnVer.setBounds(658, 242, 89, 23);
		contentPane.add(btnVer);
		
		JLabel lblVerTotal = new JLabel("4. Ver total de personas atentidas por puerta");
		lblVerTotal.setBounds(542, 273, 330, 14);
		contentPane.add(lblVerTotal);
		
		JButton btnNewButton_2 = new JButton("Ver");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"sad = " + puertas_PlanLealtad[0] + "asd =" + puertas_PlanLealtad[1] + "qwe = " + puertas_PlanLealtad[2]);
			}
		});
		btnNewButton_2.setBounds(658, 296, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblVerTotal_1 = new JLabel("5. Ver total de personas atentidas por cola de salida");
		lblVerTotal_1.setBounds(542, 320, 340, 14);
		contentPane.add(lblVerTotal_1);
		
		JButton btnVer_1 = new JButton("Ver");
		btnVer_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "asd");
			}
		});
		btnVer_1.setBounds(658, 345, 89, 23);
		contentPane.add(btnVer_1);
		
		JLabel lblVer = new JLabel("6. Ver total de asientos dispensadas por tipo de persona");
		lblVer.setBounds(542, 374, 340, 14);
		contentPane.add(lblVer);
		
		JButton btnVer_2 = new JButton("Ver");
		btnVer_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Total de personas por tipo de asiento: \n\nEconomico:" + contadorEconomico +  " asientos \nOro:" + contadorOro + " asientos \nPlatino:" + contadorPlatino + " asientos \nPreferencial:" + contadorPreferencial +" asientos");
			}
		});
		btnVer_2.setBounds(658, 399, 89, 23);
		contentPane.add(btnVer_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(219, 353, -24, -264);
		contentPane.add(separator);
		
		JLabel lblSeleccioneElTipo = new JLabel("Seleccione el tipo de estructura");
		lblSeleccioneElTipo.setBounds(10, 104, 214, 14);
		contentPane.add(lblSeleccioneElTipo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"(estructura)", "Cola de prioridad", "Heap"}));
		comboBox.setBounds(21, 129, 133, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"(puerta)"}));
		comboBox_1.setBounds(21, 242, 133, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_1.removeAllItems();
				String tipoUsuario = String.valueOf(comboBox_2.getSelectedItem());
				if (tipoUsuario=="Oro") {
					agregarVuelos(comboBox_1,listaVuelos,listaPuertas,0);
				}
				else if(tipoUsuario=="Platino") {
					agregarVuelos(comboBox_1,listaVuelos,listaPuertas,1);
				}
				else if(tipoUsuario=="Preferencial") {
					agregarVuelos(comboBox_1,listaVuelos,listaPuertas,2);
				}
			}
		});
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Oro", "Platino", "Preferencial"}));
		comboBox_2.setBounds(21, 184, 133, 22);
		contentPane.add(comboBox_2);
		
		JButton btnNewButton_3 = new JButton("Ver");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tipoUsuario = (String)comboBox_2.getSelectedItem();
				String vuelo = (String)comboBox_1.getSelectedItem();
				String mensajeJOPTION = null; //inicializando la variable con el mensaje completo del JOPTION PANE
				
				if (tipoUsuario == "Oro") {
					String[] asientos = buscarVuelos(puertasOro, vuelo,contadorOro);
					String asientosMensaje = "";
					int indice = 0;
					int contadorPersonas = Integer.parseInt(asientos[90]);
					
					while(indice < contadorPersonas) {
						asientosMensaje = asientosMensaje+ asientos[indice] +", ";
						indice++;
					}
					mensajeJOPTION = "*TIPO DE USUARIO*\n\nCantidad de personas: "+contadorPersonas+ "\nAsientos: "+asientosMensaje;
				}
				
				else if (tipoUsuario == "Platino") {
					String[] asientos = buscarVuelos(puertasPlatinos, vuelo,contadorPlatino);
					String asientosMensaje = "";
					int indice = 0;
					int contadorPersonas = Integer.parseInt(asientos[90]);
					
					while(indice < contadorPersonas) {
						asientosMensaje = asientosMensaje+ asientos[indice] +", ";
						indice++;
					}
					mensajeJOPTION = "*TIPO DE USUARIO*\n\nCantidad de personas: "+contadorPersonas+ "\nAsientos: "+asientosMensaje;
				}
				
				else if (tipoUsuario == "Preferencial") {
					String[] asientos = buscarVuelos(puertasPreferenciales, vuelo,contadorPreferencial);
					String asientosMensaje = "";
					int indice = 0;
					int contadorPersonas = Integer.parseInt(asientos[90]);
					
					while(indice < contadorPersonas) {
						asientosMensaje = asientosMensaje+ asientos[indice] +", ";
						indice++;
					}
					mensajeJOPTION = "*TIPO DE USUARIO*\n\nCantidad de personas: "+contadorPersonas+ "\nAsientos: "+asientosMensaje;
				}
				
				JOptionPane.showMessageDialog(null, mensajeJOPTION);
			}
		});
		btnNewButton_3.setBounds(43, 296, 73, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblSeleccioneLaPuerta = new JLabel("Seleccione la puerta deseada");
		lblSeleccioneLaPuerta.setBounds(10, 217, 185, 14);
		contentPane.add(lblSeleccioneLaPuerta);
		
		JLabel lblSeleccioneElTipo_1 = new JLabel("Seleccione el tipo de usuario ");
		lblSeleccioneElTipo_1.setBounds(10, 158, 198, 14);
		contentPane.add(lblSeleccioneElTipo_1);

		JLabel lblMduloVip = new JLabel("M\u00F3dulo VIP");
		lblMduloVip.setBounds(273, 104, 98, 14);
		contentPane.add(lblMduloVip);
		
		JLabel lblMduloEspecial = new JLabel("M\u00F3dulo Especial");
		lblMduloEspecial.setBounds(273, 273, 98, 14);
		contentPane.add(lblMduloEspecial);
		
		JLabel lblNmeroDePuertas = new JLabel("N\u00FAmero de puertas:");
		lblNmeroDePuertas.setBounds(293, 158, 133, 14);
		contentPane.add(lblNmeroDePuertas);
		
		textField = new JTextField();
		textField.setBounds(424, 155, 43, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//BOTON PARA OROS (0)
				//modificando las puertas de la ventana administracion
				listaPuertas[0] = textField;  //modficando la cantidad de puertas de los oro, los cuales ocupan el indice 0 del arreglo creaddo previamente
				comboBox_1.removeAllItems(); //vaciando el combobox con las puertas viejas
				agregarVuelos(comboBox_1,listaVuelos,listaPuertas,0);
				
				JOptionPane.showMessageDialog(null, "Se ha modificado la cantidad de puertas satisfactoriamente!\nFavor revisar");
			}
		});
		btnModificar.setBounds(398, 183, 109, 23);
		contentPane.add(btnModificar);
		
		JLabel lblNmeroDePuertas_1 = new JLabel("N\u00FAmero de puertas:");
		lblNmeroDePuertas_1.setBounds(293, 300, 133, 14);
		contentPane.add(lblNmeroDePuertas_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(424, 297, 43, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnModificar_1 = new JButton("Modificar");
		btnModificar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//BOTON PARA PREERENCIALES (2)
				//modificando las puertas de la ventana administracion
				listaPuertas[2] = textField_1;  //modficando la cantidad de puertas de los preferenciales, los cuales ocupan el indice 2 del arreglo creaddo previamente
				comboBox_1.removeAllItems(); //vaciando el combobox con las puertas viejas
				agregarVuelos(comboBox_1,listaVuelos,listaPuertas,2);
				JOptionPane.showMessageDialog(null, "Se ha modificado la cantidad de puertas satisfactoriamente!\nFavor revisar");
			}
		});
		btnModificar_1.setBounds(398, 332, 109, 23);
		contentPane.add(btnModificar_1);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnRegresar.setBounds(10, 391, 89, 23);
		contentPane.add(btnRegresar);
		
		JLabel lblOro = new JLabel("Oro:");
		lblOro.setBounds(293, 128, 48, 14);
		contentPane.add(lblOro);
		
		JLabel lblPlatino = new JLabel("Platino:");
		lblPlatino.setBounds(293, 204, 78, 14);
		contentPane.add(lblPlatino);
		
		JLabel lblNumeroDePuertas = new JLabel("Numero de puertas:");
		lblNumeroDePuertas.setBounds(293, 229, 133, 14);
		contentPane.add(lblNumeroDePuertas);
		
		textField_2 = new JTextField();
		textField_2.setBounds(424, 226, 43, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnModificar_2 = new JButton("Modificar");
		btnModificar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//BOTON PARA PLATINOS (1)
				//modificando las puertas de la ventana administracion
				listaPuertas[1] = textField_2;  //modficando la cantidad de puertas de los platino, los cuales ocupan el indice 1 del arreglo creaddo previamente
				comboBox_1.removeAllItems(); //vaciando el combobox con las puertas viejas
				agregarVuelos(comboBox_1,listaVuelos,listaPuertas,1);
				JOptionPane.showMessageDialog(null, "Se ha modificado la cantidad de puertas satisfactoriamente!\nFavor revisar");
				
			}
		});
		btnModificar_2.setBounds(398, 254, 109, 23);
		contentPane.add(btnModificar_2);
	}
	//Metodo para agregar vuelos a los comboBox
		public void agregarVuelos(JComboBox<Object> comboBox,String[] listaVuelos, JTextField[] listaPuertas, int tipoUsuario) {
			int indice = 0;
			JTextField datoTextField = listaPuertas[tipoUsuario];	//Se extrae el text field con la cantidad de puertas. 0 Oro, 1 Platino, 2 Preferencial
			int cantidadPuertas = Integer.parseInt(datoTextField.getText());		//Se parsea el dato del text field
			while (indice < cantidadPuertas) {
				comboBox.addItem(listaVuelos[indice]);
				indice++;		
			}	
		}
		//funcion para buscar un vuelo especifico en el arreglo de puertas de tipo de usuario, retornando una lista de asientos encontrados
		public String[] buscarVuelos(Puertas[] listaPuertas, String U_vuelo, int contadorPersonas) {
			String[] listaAsientos = new String[99]; //inicializando la lista de asientos que retornara esta funcion 
			int indiceListaAsientos = 0;
			int indiceListaPuertas = 0;
			int contadorAsientos = 0;
			while (indiceListaPuertas < contadorPersonas) {
				String vuelo = listaPuertas[indiceListaPuertas].getDestino();  //extrayendo el destino del (indice) vuelo del arreglo de puertas de X categoria
				if (vuelo == U_vuelo) {
					String asiento = listaPuertas[indiceListaPuertas].getNumeroAsiento();
					listaAsientos[indiceListaAsientos] = asiento;
					indiceListaAsientos ++;
					contadorAsientos++;
				}
				indiceListaPuertas ++;
			}
			listaAsientos[90] = String.valueOf(contadorAsientos); //agregando casi al final del array el contador de los asientos que se ocupa arriba
			return listaAsientos;
		}
}
