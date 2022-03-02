package requerimiento1;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class Principal {

	public static void main(String[] args) {
		
		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		DocumentBuilder analizador;
		Document doc;

		try {

			analizador = fabrica.newDocumentBuilder();

			// Creación de un nuevo documento vacio
			doc = analizador.newDocument();

			// Creación del elemento raiz
			Element concierto = doc.createElement("concierto");
			doc.appendChild(concierto);

			// Creación del nodo fecha
			nodoFecha(concierto, doc);

			// Creación del nodo hora
			nodoHora(concierto, doc);

			// Creación del nodo participantes
			nodoParticipantes(concierto, doc);

			// Persistencia de los datos
			guardar(doc);

			System.out.println("Persitencia del documento correcta");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// Método que crea el nodo fecha
	private static void nodoFecha(Element concierto, Document doc) {

		// Creación del elemento fecha
		Element fecha = doc.createElement("fecha");
		// Asociación del elemento fecha al elemento raiz
		concierto.appendChild(fecha);
		// Texto del elemento fecha
		Text fechaText = doc.createTextNode("20-oct-2018");
		fecha.appendChild(fechaText);
	}

	// Método que crea el nodo fecha
	private static void nodoHora(Element concierto, Document doc) {

		// Creación del elemento fecha
		Element hora = doc.createElement("hora");
		// Asociación del elemento fecha al elemento raiz
		concierto.appendChild(hora);
		// Texto del elemento fecha
		Text horaText = doc.createTextNode("21:30");
		hora.appendChild(horaText);
	}

	// Método que crea el nodo participantes
	private static void nodoParticipantes(Element concierto, Document doc) {

		// Creación del elemento participantes
		Element participantes = doc.createElement("participantes");
		// Asociación del elemento participante al elemento raiz
		concierto.appendChild(participantes);

		// Creación del participante 1

		// Creación del nodo participante
		Element participante = doc.createElement("participante");
		// Asociación del elemento participante al elemento participantes
		participantes.appendChild(participante);
		
		// Creación del nodo entrada
		Element entrada = doc.createElement("entrada");
		// Texto del elemento entrada
		Text entradaText = doc.createTextNode("21:30");
		entrada.appendChild(entradaText);
		// Asociación del elemento entrada al elemento participante
		participante.appendChild(entrada);
		
		// Creación del nodo grupo
		Element grupo = doc.createElement("grupo");
		// Texto del elemento grupo
		Text grupoText = doc.createTextNode("Las Ardillas de Dakota");
		grupo.appendChild(grupoText);
		// Asociación del elemento grupo al elemento participante
		participante.appendChild(grupo);

		// Creación del participante 2

		// Creación del nodo participante
		participante = doc.createElement("participante");
		// Asociación del elemento participante al elemento participantes
		participantes.appendChild(participante);
		
		// Creación del nodo entrada
		entrada = doc.createElement("entrada");
		// Texto del elemento entrada
		entradaText = doc.createTextNode("22:15");
		entrada.appendChild(entradaText);
		// Asociación del elemento entrada al elemento participante
		participante.appendChild(entrada);
		
		// Creación del nodo grupo
		grupo = doc.createElement("grupo");
		// Texto del elemento grupo
		grupoText = doc.createTextNode("Fito y Fitipaldis");
		grupo.appendChild(grupoText);
		// Asociación del elemento grupo al elemento participante
		participante.appendChild(grupo);

		// Creación del participante 3

		// Creación del nodo participante
		participante = doc.createElement("participante");
		// Asociación del elemento participante al elemento participantes
		participantes.appendChild(participante);
		
		// Creación del nodo entrada
		entrada = doc.createElement("entrada");
		// Texto del elemento entrada
		entradaText = doc.createTextNode("23:00");
		entrada.appendChild(entradaText);
		// Asociación del elemento entrada al elemento participante
		participante.appendChild(entrada);
		
		// Creación del nodo grupo
		grupo = doc.createElement("grupo");
		// Texto del elemento grupo
		grupoText = doc.createTextNode("Coldplay");
		grupo.appendChild(grupoText);
		// Asociación del elemento grupo al elemento participante
		participante.appendChild(grupo);

	}

	// Persistencia de los datos
	private static void guardar(Document doc) throws TransformerException {

		// Factoría de Transformes
		TransformerFactory fabricaConversor = TransformerFactory.newInstance();

		// Creación del Transfomer para serializar el dom en un fichero
		Transformer conversor = fabricaConversor.newTransformer();

		// Creación de la fuente del arbol DOM
		DOMSource fuente = new DOMSource(doc);

		// Creación del flujo del stream de salida
		StreamResult resultado = new StreamResult(new File("concierto.xml"));

		// Serialización de los datos
		conversor.transform(fuente, resultado);
	}

}
