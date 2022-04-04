package modelo;

import java.util.HashMap;
import java.util.LinkedList;

public class Proyecto {
	private LinkedList<Actividad> acti =new LinkedList<Actividad>();
	private LinkedList<Participante> parti =new LinkedList<Participante>();

	public static HashMap<String, Proyecto> proyectos = new HashMap<String, Proyecto>();
	private int numActividades;
	private int numParticipantes;
	private String nombre;
	private String declaracion;
	private String fechaInicial;
	public String getFechaFinal() {
		return fechaFinal;
	}



	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}


	private String fechaFinal;
	private Participante creadorProyecto;

	
	
    public Proyecto(String nombre, String declaracion, String fechaInicial , String fechaFinal , Participante creadorProyecto) {
		this.nombre = nombre;
		this.declaracion = declaracion;
		this.numActividades=0;
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
		this.creadorProyecto = creadorProyecto;
		}
    
    
	
	public void addProyecto(Proyecto proyecto) {
		proyectos.put(proyecto.getNombre(), proyecto);
		this.numParticipantes+=1;
		parti.add(creadorProyecto);
		
	}
	
	public void addActividad(Actividad actividad) {
		this.numActividades+=1;
		if (!(parti.contains(actividad.getParticipante()))){
			this.numParticipantes+=1;
		}
		acti.add(actividad);
	
	}
	public void printInfo() {
		System.out.println("nombre proyecto : " +this.nombre);
		System.out.println("Actividades: " +this.numActividades);
		System.out.println("Numero de Participantes: " +this.numParticipantes);
		System.out.println("Creador del Proyecto: "+this.creadorProyecto);
		
	}
		
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}


	


	public String getDeclaracion() {
		return declaracion;
	}


	public String toString() {
	
		return( nombre+" [ numActividades=" + numActividades + ", declaracion=" + declaracion +", numeroParticipantes=" + numParticipantes + "]");
		
	}

	
	

}
