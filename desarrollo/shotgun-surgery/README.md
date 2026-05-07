# Shotgun Surgery

## Tipo

Desarrollo

## Descripcion

Ocurre cuando cada vez que quieres hacer un pequeño cambio en el sistema, tienes que "disparar" a muchas clases diferentes para lograrlo. La responsabilidad de una sola funcionalidad esta dispersa por todo el codigo.

## Como reconocerlo

* Un cambio simple (como agregar un nuevo tipo de descuento) requiere editar 10 archivos distintos.
* Es facil olvidar actualizar uno de esos archivos, lo que genera bugs inconsistentes.
* Sientes que el codigo esta "demasiado roto" en piezas pequeñas sin cohesion.

## Problemas que causa

* Alto riesgo de errores por omision.
* El mantenimiento se vuelve lento y frustrante.
* Dificulta enormemente la comprension de como funciona una funcionalidad completa.

## Mal ejemplo

En bad-example.java se ve como para cambiar el formato de una moneda hay que editar la logica en multiples clases que manejan dinero por su cuenta.

## Buen ejemplo

En good-example.java se centraliza la logica de formato en una sola clase, de modo que un cambio solo afecta a un lugar.

## Como evitarlo

* Mueve los metodos o campos que cambian juntos a una misma clase.
* Busca centralizar responsabilidades comunes.
* Usa encapsulamiento para ocultar detalles de implementacion que podrian cambiar.
