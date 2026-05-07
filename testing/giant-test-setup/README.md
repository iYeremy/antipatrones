# Giant Test Setup

## Tipo

Testing

## Descripcion

Ocurre cuando necesitas configurar una cantidad enorme de objetos y estados solo para probar una funcionalidad pequeña. Si el bloque `@Before` o el metodo de configuracion de tus tests tiene 100 lineas, tienes un problema.

## Como reconocerlo

* Pasas mas tiempo preparando los datos del test que ejecutando la accion a probar.
* Hay muchos objetos que se instancian pero que no tienen nada que ver con el test actual.
* El setup del test es tan complejo que es dificil entender que condiciones iniciales son importantes.

## Problemas que causa

* Los tests son lentos y fragiles.
* Es muy dificil crear nuevos tests porque da pereza configurar todo de nuevo.
* Indica que tus clases estan demasiado acopladas o que tienen demasiadas responsabilidades.

## Mal ejemplo

En bad-example.java se ve como para probar un cambio de nombre de usuario hay que configurar el sistema de pagos, la base de datos y el motor de emails.

## Buen ejemplo

En good-example.java se desacopla la clase de sus dependencias, permitiendo probarla con un setup minimo y enfocado.

## Como evitarlo

* Usa Inyeccion de Dependencias para pasar solo lo necesario.
* Utiliza el patron "Object Mother" o "Data Builders" para ocultar la complejidad de la creacion de objetos.
* Si una clase necesita tanto setup, quizas deba dividirse en varias clases mas pequeñas.
