# Copy-Paste Tests

## Tipo

Testing

## Descripcion

Copiar y pegar la logica de una prueba para crear otra muy similar, en lugar de parametrizar o reutilizar el codigo de configuracion. Al igual que en el codigo de produccion, la duplicidad en los tests es un problema de mantenimiento.

## Como reconocerlo

* Tienes 10 metodos de prueba que son exactamente iguales excepto por un valor.
* El archivo de tests tiene miles de lineas con bloques repetidos.
* Si cambias la forma en que se instancia un objeto, tienes que editar 50 lugares en el archivo de tests.

## Problemas que causa

* El mantenimiento de la suite de tests se vuelve una carga pesada.
* Es facil cometer errores al copiar y pegar (ej: olvidar cambiar la asercion final).
* Dificulta la lectura y comprension de que se esta probando realmente.

## Mal ejemplo

En bad-example.java se ve como se repite toda la configuracion de un usuario para probar tres casos diferentes de validacion.

## Buen ejemplo

En good-example.java se usa un metodo de utilidad o tests parametrizados para eliminar la repeticion.

## Como evitarlo

* Usa metodos de factoria para crear objetos de prueba.
* Utiliza las funcionalidades de "Parameterized Tests" de tu framework (ej: `@ParameterizedTest` en JUnit 5).
* Sigue el principio DRY tambien en tus carpetas de tests.
