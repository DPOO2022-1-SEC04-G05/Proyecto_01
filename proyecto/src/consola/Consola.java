package consola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
import controler.Loader;
import modelo.Actividad;
import modelo.Participante;
import modelo.Proyecto;



public class Consola {
	
	public static void main(String[] args) {
		Consola consola = new Consola();
		consola.ejecutarAplicacion();
		}
	
	public void ejecutarAplicacion()
	{
	

		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opcion"));
				if (opcion_seleccionada == 1)
					System.out.println("hola");
				else if (opcion_seleccionada == 2 ) {
					System.out.println("Crear Participante");
					String nombre = (input("Por ingrese nombre de nuevo participante"));
					String descripcion = (input("Por ingrese correo participante "));
					Loader.crearParticipante(nombre, descripcion);
				}
				else if (opcion_seleccionada == 3 ) {
				
					String nombre = (input("Por ingrese nombre del proyecto"));
					String descripcion = (input("Por ingrese la descripcion del proyecto "));
					String fecha1 = (input("Por ingrese fecha inicial"));
					String fecha2 = (input("Por ingrese fecha final "));
					String participante = (input("Por ingrese nombre del creador del proyecto"));
					Participante hola= Participante.particpantes.get(participante);
					Loader.crearProyecto(nombre, descripcion,fecha1,fecha2,hola);
				}
				else if (opcion_seleccionada == 4 ) {
					String nombre = (input("Por ingrese nombre de la actividad"));
					String fecha = (input("Por ingrese la fecha"));
					String tipo = (input("Por ingrese el tipo de actividad"));
					String estado = (input("Por ingrese el estado de la actividad"));
					String nombrep = (input("Por ingrese nombre del proyecto"));
					String nombrepa = (input("Por ingrese nombre del participante"));
					int opcion =0;
					System.out.println("Hora incio actividad Ingrese opcion a desear");
					System.out.println("0. Hora inicio actual");
					System.out.println("1. Cronometrar actividad");
					System.out.println("2. Ingresar manualmente");
					opcion = Integer.parseInt(input("Ingrese opcion deseada"));
				
					String horainicio ="";
					String horafinal="";
					if (opcion == 0){
						
						 LocalDateTime now = LocalDateTime.now();  
					       
					     DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
					     String formatDateTime = now.format(format);  
					     System.out.println("hora inicio : " +formatDateTime);  
					     horainicio =formatDateTime;
						 horafinal = (input("Por ingrese hora final de la actividad en el formato dd-MM-yyyy HH:mm:ss"));
						}
					else if (opcion ==1) {
						int ti=0;
						System.out.println("Cronometro actividad");
						System.out.println("Contador 0.0.0 inciando...");
						long start = System.currentTimeMillis();
						ti = Integer.parseInt(input("Ingrese 1 para para cronometro"));
						if (ti==1) {
							long elapsedTimeMillis = System.currentTimeMillis()-start;
							float elapsedTimeMin = elapsedTimeMillis/(60*1000F);
							 System.out.println("Total timepo : " +elapsedTimeMin +"Min");
						}else {System.out.println("Error");}
						
					
						
						      
						
					}
					else if (opcion==2) {
						 horainicio = (input("Por ingrese hora inicio de la actividad"));
						 horafinal = (input("Por ingrese hora final de la actividad"));
					}
					
					Participante holap= Participante.particpantes.get(nombrepa);
					Proyecto hola=Proyecto.proyectos.get(nombrep);
					Loader.crearActividad(nombre, fecha,tipo,estado, hola,holap,horainicio, horafinal);
				}
					
				else if (opcion_seleccionada == 5 ) {
					System.out.println("Consulta proyectos");
					for (String i : Proyecto.proyectos.keySet()) {
						  System.out.println(i);
						}
					String nombre = (input("Por ingrese nombre del Proyecto a consultar "));
					Proyecto hola=Proyecto.proyectos.get(nombre);
					hola.printInfo();
					
					
					
				}	
				
				else if (opcion_seleccionada == 6 ) {
					System.out.println("Consulta actividades");
					for (String i : Actividad.actividades.keySet()) {
						  System.out.println(i);
						}
					String nombre = (input("Por ingrese nombre de la actividad a consultar "));
					Actividad hola=Actividad.actividades.get(nombre);
					System.out.println(hola);
					
					
					
				}
				
				else if (opcion_seleccionada == 7 ) {
					System.out.println("Consulta Participante");
					for (String i : Participante.particpantes.keySet()) {
						  System.out.println(i);
						}
					String nombre = (input("Por ingrese nombre del participante a consultar "));
					Participante hola=Participante.particpantes.get(nombre);
					hola.mostrarInforme();
					
					
					
				}
				
				else if (opcion_seleccionada == 8 ) {
					System.out.println("Editar fecha proyecto");
					for (String i : Proyecto.proyectos.keySet()) {
						  System.out.println(i);
						}
					String nombre = (input("Por ingrese nombre del proyecto a modificar "));
					Proyecto hola=Proyecto.proyectos.get(nombre);
					System.out.println("fecha final : "+hola.getFechaFinal());
					String paa = (input("Por favor ingrese nueva fecha Final "));
					hola.setFechaFinal(paa);
					System.out.println("Nueva fecha final : " +hola.getFechaFinal());
					
					
					
				}
				
				else if (opcion_seleccionada == 9 ) {
					System.out.println("Editar fecha Actividad");
					for (String i : Actividad.actividades.keySet()) {
						  System.out.println(i);
						}
					String nombre = (input("Por ingrese nombre de la actividad a modificar "));
					Actividad hola=Actividad.actividades.get(nombre);
					System.out.println("fecha final : "+hola.getFecha());
					String paa = (input("Por favor ingrese nueva fecha Final "));
					hola.setFecha(paa);
					System.out.println("Nueva fecha final : " +hola.getFecha());
					
					
					
				}
				else if (opcion_seleccionada == 10)
				{
					System.out.println("Saliendo de la aplicacionn ...");
					continuar = false;
				}
			
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los numeros de las opciones.");
			}
		}
	}
	public void mostrarMenu()
	{
		System.out.println("\nBienvenidos\n");
		System.out.println("\nPara correr el programa con exito es necesario crear primero un participante luego un proyecto y por ultimo una actividad\n");
		System.out.println("1. Cargar archvos");
		System.out.println("2. Crear participante");
		System.out.println("3. Crear Proyecto");
		System.out.println("4. Crear Actividad");
		System.out.println("5. Consultar Proyecto");
		System.out.println("6. Consultar Actividad");
		System.out.println("7. Consultar Participante");
		System.out.println("8. Editar fecha de Proyecto ");
		System.out.println("9. Editar fecha de Actividad ");
		
	    System.out.println("10. Salir \n");
	}
	
	
	
	
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

}
