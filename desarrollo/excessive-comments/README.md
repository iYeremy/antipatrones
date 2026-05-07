# Excessive Comments

## Tipo

Desarrollo

## Descripcion

Llenar el codigo de comentarios innecesarios que explican lo obvio o que intentan compensar un codigo mal escrito. El codigo de calidad deberia ser como un buen chiste: si tienes que explicarlo, no es tan bueno.

## Como reconocerlo

* Comentarios que repiten lo que dice el codigo (ej: `i++; // Incrementa i`).
* Bloques de texto enormes para explicar una funcion que podria ser mas simple.
* Comentarios que explican "que" esta pasando en lugar de "por que" se tomo esa decision.

## Problemas que causa

* Los comentarios a menudo se quedan obsoletos y mienten (el codigo cambia, el comentario no).
* Ensucian la pantalla y distraen de la logica real.
* Dan una falsa sensacion de seguridad sobre un codigo que en realidad es confuso.

## Mal ejemplo

En bad-example.java se ve como cada linea tiene un comentario redundante y obvio.

## Buen ejemplo

En good-example.java se eliminan los comentarios innecesarios porque el codigo es auto-explicativo.

## Como evitarlo

* Escribe codigo tan claro que los comentarios sean redundantes.
* Usa nombres de variables y metodos descriptivos.
* Solo usa comentarios para explicar decisiones de negocio complejas o "hacks" necesarios por limitaciones externas.
