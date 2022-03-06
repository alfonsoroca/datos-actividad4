package requerimiento1;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LecturaXML {

	public static void main(String[] args) {

		// Factoria para crear objetos que lean el fichero
		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();

		// Objeto que leerá el fichero
		DocumentBuilder analizador;

		// Nodo documento
		Document doc;

		// Nodo raiz
		Node raiz;

		try {

			analizador = fabrica.newDocumentBuilder();
			// Deserialización del fichero
			doc = analizador.parse("concierto.xml");
			// Ponemos la referencia raiz en el documento
			raiz = doc.getDocumentElement();
			// Impresión de los nodos
			imprimirNodos(raiz);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void imprimirNodos(Node raiz) {

		// Obtención de todos los nodos hijos del elemento raiz "concierto"
		NodeList nodos = raiz.getChildNodes();

		// Obtención del nodo fecha
		Node fecha = nodos.item(0).getChildNodes().item(0);
		
		// Obtención del nodo hora
		Node hora = nodos.item(1).getChildNodes().item(0);

		// Impresión de los textos de los nodos fecha y hora
		System.out.println("Fecha y hora del concierto: " + fecha.getTextContent() + " - " + hora.getTextContent());

		System.out.println("Participan los siguientes grupos:");

		// Iteración de los nodos hijos del elemento raiz "concierto"
		for (int i = 0; i < nodos.getLength(); i++) {

			// Almacenamiento de los nodos hijos del elemento raiz "concierto"
			Node nodoHijo = nodos.item(i);

			// Comprobamos si el nodo se llama "participantes"
			if (nodoHijo.getNodeName() == "participantes") {

				// Obtención de los nodos participante
				NodeList nodosParticipantes = nodoHijo.getChildNodes();

				// Iteración del nodo participantes
				for (int j = 0; j < nodosParticipantes.getLength(); j++) {

					// Obtención del primer nodo (hora) del nodo participante
					Node horaParticipante = nodosParticipantes.item(j).getFirstChild();
					// Obtención del último nodo (grupo) del nodo participante
					Node grupo = nodosParticipantes.item(j).getLastChild();

					System.out.println("	" +horaParticipante.getTextContent() + " - " + grupo.getTextContent());
				}
			}
		}
	}
}