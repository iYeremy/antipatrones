# Overmocking

## Tipo

Testing

## Descripcion

Uso excesivo de objetos simulados (Mocks) en las pruebas. Cuando simulas casi todas las clases que interactuan con la que estas probando, terminas testeando solo la configuracion del mock y no el comportamiento real del sistema.

## Como reconocerlo

* Tienes mas lineas de codigo configurando mocks (`when(...).thenReturn(...)`) que ejecutando la prueba real.
* Si cambias la firma de un metodo interno, fallan tests que no deberian saber nada de ese metodo.
* Los tests siempre pasan, pero al ejecutar la aplicacion real, nada funciona porque la integracion entre objetos falla.

## Problemas que causa

* Las pruebas no detectan errores de integracion.
* El mantenimiento de los tests es muy pesado debido a la configuracion de los mocks.
* Da una falsa sensacion de seguridad.

## Mal ejemplo

En bad-example.java se simulan incluso objetos simples de datos (POJOs), lo que hace que el test sea ilegible y fragil.

## Buen ejemplo

En good-example.java se usan objetos reales siempre que sea posible (especialmente si no tienen dependencias externas como DB o red) y se reservan los mocks solo para lo estrictamente necesario.

## Como evitarlo

* No simules objetos de datos (DTOs, Entidades).
* Prefiere usar implementaciones reales si son rapidas y sencillas.
* Si tienes que simular demasiado, quizas tu clase tiene demasiadas dependencias (violacion de SRP).
