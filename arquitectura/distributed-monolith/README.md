# Distributed Monolith

## Tipo

Arquitectura

## Descripcion

Ocurre cuando se intenta construir una arquitectura de microservicios, pero estos estan tan acoplados entre si que deben desplegarse y cambiarse siempre al mismo tiempo. Tienes todas las desventajas de los microservicios y ninguna de sus ventajas.

## Como reconocerlo

* Para que el Servicio A funcione, el Servicio B debe estar levantado y responder inmediatamente.
* Un cambio en la base de datos de un servicio obliga a cambiar el codigo de otros tres servicios.
* Hay que desplegar todos los servicios juntos ("Big Bang release").
* Hay demasiada comunicacion sincrona (muchos saltos de API HTTP).

## Problemas que causa

* El sistema es mucho mas complejo de gestionar que un monolito simple.
* La disponibilidad baja drasticamente: si un servicio falla, todo el sistema cae.
* La red se convierte en el principal cuello de botella.

## Mal ejemplo

Imagina tres servicios (Usuario, Pedidos, Pagos) donde cada uno llama al otro por HTTP para completar una operacion simple, compartiendo incluso la misma base de datos.

## Buen ejemplo

Los microservicios de verdad son autonomos. Usan comunicacion asincrona (eventos) y tienen sus propios datos, de modo que pueden funcionar incluso si otros servicios estan caidos temporalmente.

## Como evitarlo

* Minimiza las llamadas sincronas entre servicios.
* Usa un bus de eventos para la comunicacion asincrona.
* Asegurate de que cada servicio sea dueño de sus propios datos.
