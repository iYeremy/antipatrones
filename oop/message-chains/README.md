# Message Chains

## Tipo

OOP

## Descripcion

Ocurre cuando un cliente le pide un objeto a otro, luego otro a ese, y asi sucesivamente hasta llegar al dato que realmente necesita. Crea una cadena de llamadas que revela demasiada informacion sobre la estructura interna del sistema.

## Como reconocerlo

* Ves lineas de codigo como `person.getDepartment().getManager().getAddress().getCity()`.
* Si cambia la forma en que se relacionan el Departamento y el Manager, tienes que cambiar el codigo del cliente que solo queria la Ciudad.

## Problemas que causa

* Viola la Ley de Deméter (no hables con extraños).
* Crea un acoplamiento muy fuerte con la estructura de navegacion de los objetos.
* Cualquier cambio en las clases intermedias rompe el codigo del cliente.

## Mal ejemplo

En bad-example.java se ve como para obtener el nombre del pais de un usuario hay que navegar por tres objetos diferentes.

## Buen ejemplo

En good-example.java se usa la delegacion para que el cliente solo pida lo que necesita directamente.

## Como evitarlo

* Oculta la estructura interna: crea un metodo en la clase inicial que devuelva el dato final.
* Sigue el principio "Tell, Don't Ask": en lugar de pedir datos para navegar, pide al objeto que realice la accion.
