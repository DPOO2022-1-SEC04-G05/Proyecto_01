package modelo;
import java.util.LinkedList;
import java.util.HashMap;
public class Participante {
	
	private String nombre;
	




	private String correo;
	public LinkedList<Actividad> numacti =new LinkedList<Actividad>();
	public static HashMap<String, Participante> particpantes = new HashMap<String, Participante>();
	public static HashMap<Actividad, Integer> actividadhora = new HashMap<Actividad, Integer>();
	public static int  numactividades;
	
	
	public Participante(String nombre, String correo) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		numactividades=0;
	}
	
	public void addParticipante(Participante participante) {
		particpantes.put(participante.getNombre(), participante);
	}
	
	public void addActividad(Actividad actividad) {
		numactividades+=1;
		numacti.add(actividad);
		System.out.println(numacti);
	}
	
	
	public void mostrarInforme() {
		System.out.println("Nombre: " +nombre);
		System.out.println("Correo: " +correo);
		System.out.println("Total Actividades: " +numactividades);
		System.out.println("Actividades: ");
		for (Actividad i : numacti) {
			  System.out.println(i);
			}
	}
	
	
	
	@Override
	public String toString() {
		return nombre;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
