# Inappropriate Intimacy

## Tipo

OOP

## Descripcion

Ocurre cuando dos clases estan demasiado relacionadas y conocen demasiados detalles internos la una de la otra. Una clase pasa mas tiempo hurgando en los campos privados (o protegidos) de otra que haciendo su propio trabajo.

## Como reconocerlo

* Una clase accede directamente a los campos de otra de forma constante.
* Metodos de una clase que solo manipulan el estado de otra clase.
* Es dificil cambiar una clase sin tener que cambiar la otra debido a su profunda interdependencia.

## Problemas que causa

* Viola el principio de encapsulamiento.
* Dificulta la reutilizacion de las clases de forma independiente.
* Crea un acoplamiento fragil que rompe el sistema ante cualquier cambio menor.

## Mal ejemplo

En bad-example.java se ve como la clase `Customer` manipula directamente la lista interna de pedidos de `OrderHistory`.

## Buen ejemplo

En good-example.java se respeta la privacidad y se usan metodos publicos que mantienen la integridad de los datos.

## Como evitarlo

* Usa el principio de "Menor Privilegio": expón solo lo estrictamente necesario.
* Si dos clases necesitan estar tan juntas, quizás deberian ser una sola o una deberia heredar de la otra (con cuidado).
* Mueve el comportamiento a la clase que posee los datos.
