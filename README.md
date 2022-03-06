# Introducción

En la rama master del repositorio se encuentra el código de la actividad "AE-4. Manejo de XML" realizada por el grupo.

# Estructura de la aplicación

Para la resolución de la actividad hemos utilizado un proyecto Maven con las especificaciones que se encuentran en el archivo ![pom](/Actividad4/pom.xml).

La estructura por la que hemos optado es para la resolución de la actividad la siguiente.
![](/Actividad4/images/estructura.png)

# Requerimiento 1
## Paquete requerimiento1
El paquete ![requerimiento1](/Actividad4/src/main/java/requerimiento1) contiene las clases que van a dar solución al requerimiento 1.

### Clase Principal
El código de la clase ![Principal](/Actividad4/src/main/java/requerimiento1/Principal.java) se encarga de la creación un archivo llamado ![concierto.xml](/Actividad4/concierto.xml) con el contenido solicitado en el requerimiento 1 de la actividad. ![](/Actividad4/images/principalExec.png)

### Clase LecturaXML
El código de la clase ![LecturaXML](/Actividad4/src/main/java/requerimiento1/LecturaXML.java) se encarga de la lectura del fichero ![concierto.xml](/Actividad4/concierto.xml) generado por la clase ![Principal](/Actividad4/src/main/java/requerimiento1/Principal.java). ![](/Actividad4/images/lecturaXMLExec.png)

# Requerimiento 2
## Paquete requerimiento2.beans
El paquete ![requerimiento2.beans](/Actividad4/src/main/java/requerimiento2/beans) contiene las clases que definen las entidades que van a ser utilizadas para dar solución al requerimiento 2.

### Clase Concierto
El código de la clase ![Concierto](/Actividad4/src/main/java/requerimiento2/beans/Concierto.java) define la estructura del fichero XML de la entidad concierto. Dentro de esta clase se referencia a la entidad participante que es definida en la clase ![Participante](/Actividad4/src/main/java/requerimiento2/beans/Participante.java).

### Clase Participante
El código de la clase ![Participante](/Actividad4/src/main/java/requerimiento2/beans/Participante.java) define la estructura del fichero XML de la entidad participante.

## Paquete requerimiento2.main
El paquete ![requerimiento2.main](/Actividad4/src/main/java/requerimiento2/main) contiene las clases que contienen los métodos main para dar solución al requerimiento 2.

### Clase ObjectToXML
El código de la clase ![ObjectToXML](/Actividad4/src/main/java/requerimiento2/main/ObjectToXML.java) se encarga de convertir un objeto en un fichero XML denominado ![conciertoJAXB.xml](/Actividad4/conciertoJAXB.xml).![](/Actividad4/images/objectToXMLExec.png)


### Clase XMLToObject
El código de la clase ![XMLToObject](/Actividad4/src/main/java/requerimiento2/main/XMLToObject.java) se encarga de la lectura del fichero ![conciertoJAXB.xml](/Actividad4/conciertoJAXB.xml).![](/Actividad4/images/XMLToObjectExec.png)



