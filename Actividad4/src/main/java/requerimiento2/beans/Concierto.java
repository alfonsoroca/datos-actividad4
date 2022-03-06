package requerimiento2.beans;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

// Establecemos el nombre del nodo raíz
@XmlRootElement(name = "concierto")
public class Concierto {

	// Atributos del concierto
	private String nombre;
	private String fecha;
	private String hora;
	private List<Participante> participantes;

	// Constructor
	public Concierto() {
		participantes = new ArrayList<Participante>();
	}

	// Getter y setter
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

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	// Nombramos el elemento del xml como "participante", agrupándolos a todos bajo la
	// etiqueta "participantes"
	@XmlElement(name = "grupo")
	@XmlElementWrapper(name = "grupos")
	public List<Participante> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<Participante> participantes) {
		this.participantes = participantes;
	}

	@Override
	public String toString() {
		return "Concierto [nombre=" + nombre + ", fecha=" + fecha + ", hora=" + hora + ", participantes="
				+ "\n" + participantes + "]";
	}	

}
