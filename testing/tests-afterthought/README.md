# Tests Afterthought

## Tipo

Testing

## Descripcion

Escribir las pruebas solo al final del desarrollo, usualmente por obligacion o para cumplir con una metrica de cobertura, en lugar de usarlas como guia para el diseño del codigo.

## Como reconocerlo

* Las pruebas solo comprueban el "camino feliz" y no casos borde.
* El codigo es muy dificil de testear porque no se diseño pensando en la testabilidad.
* Se escriben pruebas inutiles solo para subir el porcentaje de cobertura (coverage).

## Problemas que causa

* Las pruebas suelen ser de mala calidad y no detectan bugs reales.
* El desarrollador siente que escribir pruebas es una perdida de tiempo y una carga extra.
* No se aprovecha el feedback que dan las pruebas para mejorar el diseño del codigo.

## Mal ejemplo

Terminar una funcionalidad completa y pasar el viernes por la tarde escribiendo 50 tests rapido para poder decir que "esta testeado" antes de irse a casa.

## Buen ejemplo

Escribir las pruebas a la par que el codigo (o incluso antes, como en TDD). Esto asegura que el codigo sea modular, facil de probar y que las pruebas realmente aporten valor.

## Como evitarlo

* Intenta escribir al menos un test antes de terminar la implementacion de una funcion.
* Si te cuesta mucho testear una clase, significa que tu diseño esta mal; corrige el diseño, no fuerces el test.
* Valora mas la calidad y utilidad de los tests que el numero total de ellos.
