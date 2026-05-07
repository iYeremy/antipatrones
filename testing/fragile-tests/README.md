# Fragile Tests

## Tipo

Testing

## Descripcion

Pruebas que fallan ante cualquier cambio minimo en el sistema, incluso si la funcionalidad sigue siendo correcta. Son pruebas "de cristal" que requieren mantenimiento constante.

## Como reconocerlo

* Cambias el texto de un boton y fallan 10 tests unitarios.
* Los tests dependen de un orden especifico de ejecucion.
* Las pruebas dependen de datos exactos en una base de datos externa.
* Hay muchos "sleeps" o esperas manuales en los tests.

## Problemas que causa

* El equipo empieza a ignorar los fallos en los tests ("bah, seguro que es por el servidor").
* Mantener los tests lleva mas tiempo que desarrollar nuevas funciones.
* Dan una falsa sensacion de error.

## Mal ejemplo

En bad-example.java se ve un test que comprueba el formato exacto de un string de error, de modo que si cambias una coma, el test falla.

## Buen ejemplo

En good-example.java se comprueba que la funcionalidad es correcta (ej: que se lanzo una excepcion) sin importar los detalles irrelevantes de formato.

## Como evitarlo

* No testees detalles de implementacion, testea comportamientos.
* Evita dependencias externas en los tests unitarios.
* Usa aserciones flexibles (ej: `contains` en lugar de `equals` para mensajes).
