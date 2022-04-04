package modelo;

import java.util.HashMap;

public class Actividad {
private String nombre;
private String fecha;
private String tipo;
private String estado;
private String horainicio;
private String horafinal;
private Proyecto proyecto;
private Participante participante;
public static HashMap<String, Actividad> actividades = new HashMap<String, Actividad>();

public Actividad(String nombre, String fecha, String tipo, String estado, Proyecto proyecto,Participante participante,String horainicio, String horafinal) {
	super();
	this.nombre = nombre;
	this.fecha = fecha;
	this.tipo = tipo;
	this.estado = estado;
	this.proyecto = proyecto;
	this.participante=participante;
	this.horainicio=horainicio;
	this.horafinal=horafinal;
}


public void addActividad(Actividad actividad) {
	actividades.put(actividad.getNombre(), actividad);
	
	
}

public Proyecto getProyecto() {
	return proyecto;
	}

	
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getFecha() {
	return fecha;
}

public void setFecha(String fecha) {
	this.fecha = fecha;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}



public Participante getParticipante() {
	return participante;
}

public void setParticipante(Participante participante) {
	this.participante = participante;
}

public void setProyecto(Proyecto proyecto) {
	this.proyecto = proyecto;
}

@Override
public String toString() {
	return nombre+ "[fecha=" + fecha + ", tipo=" + tipo + ", estado=" + estado + ", proyecto="
			+ proyecto + "]";
}



}
