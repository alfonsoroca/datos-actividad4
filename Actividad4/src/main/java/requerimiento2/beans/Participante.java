package requerimiento2.beans;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


//Establecemos el nombre del nodo raíz
@XmlRootElement(name = "participante")
// Establecemos el orden de las etiquetas
@XmlType(propOrder = {
		"hora",
		"grupo"
})
public class Participante {
	
	private String hora;
	private String grupo;
	
	// Constructores vacíos y completos
	public Participante() {
		super();
	}

	public Participante(String hora, String grupo) {
		super();
		this.hora = hora;
		this.grupo = grupo;
	}

	// Getter y setter
	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	// Sobrescritura método toString()
	@Override
	public String toString() {
		return "Participante [hora=" + hora + ", grupo=" + grupo + "]";
	}	
	
}