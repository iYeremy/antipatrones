# Kitchen Sink Architecture

## Tipo

Arquitectura

## Descripcion

Ocurre cuando se añade funcionalidad a un componente o servicio sin ningun criterio, hasta que termina haciendo de todo. Se llama asi porque parece que han metido hasta el fregadero de la cocina (kitchen sink) dentro del sistema.

## Como reconocerlo

* Tienes un servicio llamado `CommonService` o `UtilService` que tiene miles de lineas.
* No sabes donde poner una nueva funcionalidad, asi que la pones en el servicio principal porque "ya tiene de todo".
* El servicio tiene dependencias de casi todos los demas modulos del sistema.

## Problemas que causa

* El componente se vuelve imposible de testear.
* Cualquier error en una funcionalidad pequeña puede tirar abajo todo el servicio gigante.
* Es una pesadilla de mantener y escalar.

## Mal ejemplo

Un microservicio de "Gestion de Usuarios" que tambien gestiona las facturas, el envio de correos, las promociones de marketing y las estadisticas de acceso.

## Buen ejemplo

Dividir las responsabilidades en servicios pequeños y especializados. Si el servicio se llama "Usuarios", solo debe gestionar datos y acciones de usuarios. El resto debe ir a otros servicios (Facturacion, Notificaciones, etc).

## Como evitarlo

* Sé estricto con la definicion de tus servicios y componentes.
* Si un componente empieza a tener mas de 3 o 4 responsabilidades claras, dividelo.
* Aplica el principio de alta cohesion y bajo acoplamiento.
