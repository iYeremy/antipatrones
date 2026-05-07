# Copy-Paste Programming

## Tipo

Desarrollo

## Descripcion

Consiste en copiar y pegar bloques de codigo de un lugar a otro en lugar de crear soluciones reutilizables. Esto genera duplicidad y hace que el mantenimiento sea una pesadilla.

## Como reconocerlo

* Encuentras el mismo fragmento de codigo en varias clases o metodos.
* Al corregir un error en un sitio, te das cuenta de que el mismo error existe en otros cinco lugares.
* Cambios pequeños requieren editar multiples archivos que hacen casi lo mismo.

## Problemas que causa

* El tamaño del codigo crece innecesariamente.
* Es muy facil olvidar actualizar una de las copias, lo que genera inconsistencias y bugs.
* Dificulta la legibilidad y la evolucion del sistema.

## Mal ejemplo

En bad-example.java se ve como la logica para formatear un reporte se repite exactamente igual en dos metodos distintos.

## Buen ejemplo

En good-example.java se extrae la logica comun a un metodo privado reutilizable, eliminando la duplicacion.

## Como evitarlo

* Sigue el principio DRY (Don't Repeat Yourself).
* Si vas a copiar codigo, detente y piensa si puedes crear una funcion o una clase de utilidad.
* Usa herramientas de analisis de codigo que detecten bloques duplicados.
