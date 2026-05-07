# God Class

## Tipo

OOP

## Descripcion

Una clase que intenta hacer todo el trabajo del sistema ella sola, dejando a las demas clases como simples contenedores de datos. Es el resultado de no entender la delegacion de responsabilidades.

## Como reconocerlo

* Una sola clase tiene miles de lineas mientras el resto del proyecto tiene archivos de 20 lineas.
* La clase controla el flujo completo de una funcionalidad compleja de principio a fin.
* No hay uso de polimorfismo o interfaces; todo es logica imperativa dentro de la misma clase.

## Problemas que causa

* El codigo es rigido y fragil.
* Cualquier modificacion pequeña puede tener efectos secundarios en partes lejanas de la misma clase.
* Dificulta el trabajo en equipo, ya que todos terminan editando el mismo archivo.

## Mal ejemplo

En bad-example.java se ve como `OrderProcessor` maneja hasta el ultimo detalle del proceso de compra, incluyendo impuestos y formato de recibos.

## Buen ejemplo

En good-example.java la logica se distribuye entre objetos que colaboran, cada uno con su propia logica de negocio.

## Como evitarlo

* Delega responsabilidades a las clases que poseen los datos (Tell, Don't Ask).
* Usa patrones de comportamiento para distribuir la logica.
* Mantén tus archivos pequeños y enfocados.
