package requerimiento2.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import requerimiento2.beans.Concierto;
import requerimiento2.beans.Participante;

public class ObjectToXML {
	
	public static void main(String[] args) {
		
		JAXBContext contexto;
		
		try {
			
			// Inyección de dependencia
			contexto = JAXBContext.newInstance(Concierto.class);
			
		} catch (JAXBException e) {
			System.out.println("Error al crear el contexto");
			e.printStackTrace();
			return;
		}
		
		Marshaller m;
		
		try {
			
			// Creación del marshaller
			m = contexto.createMarshaller();			
			// Establecemos el formato del XML
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			// Creación del concierto
			Concierto concierto = new Concierto();
			concierto.setNombre("FestiMad");
			concierto.setFecha("16-06-2022");
			concierto.setHora("22:00");
			
			// Creación de participantes
			concierto.getParticipantes().add(new Participante("22:30","Loquillo"));
			concierto.getParticipantes().add(new Participante("23:00","El Drogas"));
			concierto.getParticipantes().add(new Participante("23:30","Barón Rojo"));
			concierto.getParticipantes().add(new Participante("00:00","Rosendo"));
			
			// Parseamos y creamos el fichero
			m.marshal(concierto, new File("conciertoJAXB.xml"));
			
			System.out.println("Fichero creado sin problemas");
			
		} catch (JAXBException e) {
			System.out.println("Error al convertir el objeto a XML");
			e.printStackTrace();
		}
		
	}

}
