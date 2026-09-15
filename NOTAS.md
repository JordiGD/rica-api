¿Cuál es la raíz del Agregado Investigador?	
La raíz del Agregado es Investigador.
Porque concentra el estado y la identidad del agregado: id, nombre, correo institucional y grupo de investigación.
Es la entidad principal del módulo de investigadores.

¿Qué vive dentro del límite?	
-id
-nombreCompleto
-correoInstitucional (como Value Object, en la clase CorreoInstitucional.java)
-grupoInvestigacion
Esto se ve claramente en Investigador.java

¿Por qué Publicacion NO está dentro de este límite?	
Publicacion no está dentro del límite porque no forma parte del agregado de Investigador.

En Publicacion.java, la entidad está modelada como documento Mongo (@Document) y guarda el correo del investigador como referencia (investigadorCorreo), no como subcolección dentro de Investigador.
Además, un investigador puede tener muchas publicaciones; si se metieran dentro del agregado, el agregado crecería demasiado y se rompería la regla de “agregados pequeños” de Vernon. Eso causaría cargas y transacciones grandes cada vez que se modifica un investigador.

¿Qué pasaría si alguien agrega un campo List<Publicacion> publicaciones directo en Investigador?	
Se rompería el límite del agregado:

-Dos transacciones distintas sobre el mismo investigador podrían pisarse la lista de publicaciones de otra persona.
-El agregado dejaría de ser pequeño y más difícil de mantener.
-Las publicaciones dejarían de poder evolucionar o desplegarse de forma independiente.

En otras palabras, se mezclarían dos responsabilidades distintas: la identidad y datos del investigador, y el ciclo de vida de sus publicaciones.