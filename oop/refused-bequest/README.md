# Refused Bequest

## Tipo

OOP

## Descripcion

Ocurre cuando una subclase hereda de una clase padre pero no utiliza la mayoria de los metodos o datos que esta le hereda. Es como recibir una herencia de un pariente y tirar casi todo a la basura porque no te sirve.

## Como reconocerlo

* Metodos heredados que lanzan una excepcion del tipo `UnsupportedOperationException`.
* Metodos heredados que estan vacios (sin implementacion).
* La subclase solo quiere una pequeña parte de la funcionalidad del padre.

## Problemas que causa

* Viola el principio de sustitucion de Liskov (LSP).
* Crea una jerarquia de clases confusa e ilogica.
* Los desarrolladores que usan la subclase pueden llamar a metodos que creen que funcionan, pero que en realidad fallan.

## Mal ejemplo

En bad-example.java una clase `Penguin` (Pinguino) hereda de `Bird` (Ave), pero tiene que lanzar una excepcion en el metodo `fly()` porque no puede volar.

## Buen ejemplo

En good-example.java se usa composicion o una jerarquia de interfaces mas refinada para evitar heredar comportamientos imposibles.

## Como evitarlo

* Si no necesitas la mayoria de lo que heredas, no uses herencia. Usa composicion.
* Divide las clases padres en piezas mas pequeñas y especificas.
* Usa interfaces para definir comportamientos opcionales.
