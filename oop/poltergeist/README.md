# Poltergeist

## Tipo

OOP

## Descripcion

Clases con un proposito limitado y efimero, cuya unica funcion es llamar a otra clase. Son "fantasmas" que aparecen, hacen una sola llamada y desaparecen, añadiendo complejidad innecesaria al sistema.

## Como reconocerlo

* Clases que solo tienen un metodo que invoca a otro metodo de otra clase.
* Clases con nombres como `ControllerManager`, `DataPasser` o `TempLogic`.
* No mantienen ningun estado y no aportan logica real.

## Problemas que causa

* El codigo se vuelve innecesariamente complejo y dificil de navegar.
* Aumenta el numero de clases sin añadir valor real.
* Consume recursos de memoria y tiempo de desarrollo.

## Mal ejemplo

En bad-example.java se ve una clase `OrderProcessor` que solo sirve para llamar a `Database` sin añadir ninguna logica adicional.

## Buen ejemplo

En good-example.java se elimina el "fantasma" y se llama directamente a la clase que tiene la responsabilidad.

## Como evitarlo

* Elimina clases que solo sirvan de "pasamanos".
* Si una clase no tiene estado ni logica propia, probablemente no deba existir.
* Revisa si puedes mover la llamada directamente al cliente.
