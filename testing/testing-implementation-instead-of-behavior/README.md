# Testing Implementation Instead of Behavior

## Tipo

Testing

## Descripcion

Ocurre cuando las pruebas estan tan ligadas a los detalles internos del codigo que cualquier refactorizacion (cambiar el "como" sin cambiar el "que") las rompe. El test deberia ser una caja negra.

## Como reconocerlo

* El test comprueba que se llamo a un metodo privado especifico.
* El test verifica el orden exacto de las llamadas internas aunque el resultado final sea el mismo.
* Tienes que cambiar el test cada vez que cambias un nombre de variable interna.

## Problemas que causa

* El testing se convierte en una barrera para la refactorizacion en lugar de un apoyo.
* Las pruebas son redundantes y no validan el valor de negocio.

## Mal ejemplo

En bad-example.java el test verifica que se llamo al metodo `internalSort()` tres veces, lo cual es un detalle interno que al usuario no le importa.

## Buen ejemplo

En good-example.java el test verifica que la lista final esta ordenada, sin importar que algoritmo o pasos internos se usaron.

## Como evitarlo

* Testea los resultados publicos de tus metodos.
* Imagina que no puedes ver el codigo fuente de la clase: ¿como probarias que funciona correctamente?
* No uses reflexion para testear metodos privados.
