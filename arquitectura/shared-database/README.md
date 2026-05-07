# Shared Database

## Tipo

Arquitectura

## Descripcion

Ocurre cuando varios microservicios o aplicaciones independientes acceden y modifican la misma base de datos. Esto crea un acoplamiento oculto y muy peligroso a nivel de datos.

## Como reconocerlo

* Tienes dos servicios diferentes que consultan la misma tabla.
* Si cambias el nombre de una columna en la base de datos, tienes que actualizar y desplegar varios servicios al mismo tiempo.
* No esta claro que servicio es el "dueño" de la informacion.

## Problemas que causa

* Un servicio puede corromper los datos que otro servicio necesita.
* Es imposible escalar o migrar un servicio de forma independiente.
* Los cambios en el esquema de la base de datos se vuelven una pesadilla de coordinacion.

## Mal ejemplo

Imagina un Servicio de Facturacion y un Servicio de Usuarios leyendo ambos de la tabla `USERS`. Si Facturacion añade una columna de deuda, Usuarios podria fallar si no esta preparado.

## Buen ejemplo

Cada servicio tiene su propia base de datos (o al menos su propio esquema privado). Si un servicio necesita datos de otro, debe pedirlos a traves de una API o reaccionar a eventos, nunca leer directamente la base de datos ajena.

## Como evitarlo

* Sigue el principio de "Un Servicio, Una Base de Datos".
* Usa APIs para compartir informacion entre servicios.
* Si necesitas datos compartidos para reportes, usa un proceso de sincronizacion hacia un Data Warehouse.
