# Commented-out Code

## Tipo

Desarrollo

## Descripcion

Dejar bloques de codigo deshabilitados mediante comentarios "por si acaso" se necesitan en el futuro. Es una forma de basura digital que ensucia los archivos.

## Como reconocerlo

* Grandes bloques de codigo gris (comentado) en medio de funciones activas.
* Archivos donde la mitad del contenido esta comentado.
* Comentarios que dicen "Vovler a habilitar si falla la nueva API".

## Problemas que causa

* Reduce la legibilidad y hace que el archivo parezca descuidado.
* El codigo comentado no se actualiza, por lo que si se intenta usar meses despues, probablemente ya no funcione (esta roto).
* Distrae a otros desarrolladores que no saben si ese codigo es importante o si deben borrarlo.

## Mal ejemplo

En bad-example.java se ve como se dejo una implementacion antigua comentada justo debajo de la nueva.

## Buen ejemplo

En good-example.java el archivo esta limpio y solo contiene lo que realmente se ejecuta.

## Como evitarlo

* Confia en Git. Si borras algo y lo necesitas luego, puedes buscar en el historial.
* Si realmente necesitas guardar algo temporalmente, hazlo en una rama aparte o en un bloc de notas personal, no en el codigo principal.
* Configura reglas en tu linter para detectar y avisar sobre codigo comentado.
