# Middle Man

## Tipo

OOP

## Descripcion

Ocurre cuando una clase delega casi todo su trabajo a otra clase diferente. Si un objeto solo sirve como intermediario y no añade logica propia, es probable que sea un "Hombre de en medio" innecesario.

## Como reconocerlo

* La mayoria de los metodos de la clase solo llaman a un metodo de otro objeto.
* Si borras la clase y haces que el cliente llame directamente al objeto final, el codigo se vuelve mas sencillo.

## Problemas que causa

* Añade una capa de complejidad sin aportar valor.
* Hace que seguir el flujo de ejecucion sea mas lento y confuso.

## Mal ejemplo

En bad-example.java se ve como `Department` solo sirve para pasar llamadas a `Manager`.

## Buen ejemplo

En good-example.java se elimina el intermediario y se permite que el cliente hable con quien realmente hace el trabajo.

## Como evitarlo

* Si una clase ha delegado demasiadas responsabilidades, usa la refactorizacion "Remove Middle Man": permite que el cliente acceda directamente al objeto delegado.
* Valora si la encapsulacion que aporta el intermediario compensa la complejidad de mantenerlo.
