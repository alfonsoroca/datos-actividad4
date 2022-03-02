package requerimiento2.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import requerimiento2.beans.Concierto;

public class XMLToObject {

	public static void main(String[] args) {
		try {
			// Creación del contexto e inyección de dependencia
			JAXBContext contexto = JAXBContext.newInstance(Concierto.class);
			
			// Creación del unmarshaller
			Unmarshaller u = contexto.createUnmarshaller();
			
			// Fichero a leer
			File fichero = new File("conciertoJAXB.xml");
			
			if (fichero.exists()) {
				// Casting a objeto Concierto
				Concierto c = (Concierto) u.unmarshal(fichero);
				System.out.println(c);
			} else {
				System.out.println("Fichero XML conciertoJAXB.xml no encontrado");
			}

		} catch (JAXBException e) {
			System.out.println(e.getMessage());
		}
	}
}