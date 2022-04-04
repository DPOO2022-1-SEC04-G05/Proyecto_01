package controler;

import modelo.Actividad;
import modelo.Participante;
import modelo.Proyecto;

public class Loader {
	
	public static void crearProyecto(String nombre, String descripcion, String fecha1 , String fecha2 , Participante hh) {
		Proyecto  proyecto = new Proyecto( nombre,  descripcion ,fecha1 , fecha2 ,hh);
		proyecto.addProyecto(proyecto);
		System.out.println("Proyecto creado con exito! :"+proyecto);
	
		
	}
	
	
	public static void crearActividad(String nombre, String fecha, String tipo, String estado, Proyecto proyecto, Participante participante, String horainicio, String horafinal) {
		Actividad  actividad = new Actividad( nombre,  fecha, tipo, estado, proyecto, participante,horainicio,horafinal);
	    actividad.addActividad(actividad);
		proyecto.addActividad(actividad);
		participante.addActividad(actividad);
		
		
	}
	
	public static void crearParticipante(String nombre, String correo) {
		Participante participante = new Participante(nombre, correo);
		participante.addParticipante(participante);
		System.out.println("Participante creado con exito! :"+participante);
	}

}
