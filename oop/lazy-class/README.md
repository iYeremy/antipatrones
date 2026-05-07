# Lazy Class

## Tipo

OOP

## Descripcion

Una clase que no hace lo suficiente para justificar su existencia. Es el polo opuesto del God Object: es tan pequeña y tiene tan poca responsabilidad que mantenerla cuesta mas que el beneficio que aporta.

## Como reconocerlo

* La clase tiene uno o dos metodos muy cortos que podrian estar en otro lugar.
* Casi no se usa en el proyecto.
* El codigo dentro de ella es trivial.

## Problemas que causa

* Dificulta la navegacion del proyecto al tener demasiados archivos pequeños sin valor real.
* Aumenta la carga cognitiva innecesariamente.

## Mal ejemplo

En bad-example.java se ve una clase `AddressValidator` que solo hace una comprobacion de nulidad que podria estar en la clase `Address`.

## Buen ejemplo

En good-example.java se elimina la clase "vaga" y se mueve la logica a donde pertenece.

## Como evitarlo

* Si una clase es demasiado pequeña y no tiene proyeccion de crecer, eliminala.
* Usa la refactorizacion "Inline Class": mueve el contenido de la clase vaga a sus clientes o a las clases de donde provienen sus datos.
