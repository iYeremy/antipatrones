# Boolean Parameters

## Tipo

Desarrollo

## Descripcion

Usar argumentos booleanos en un metodo para controlar su comportamiento logico (tambien conocidos como "Flag Arguments"). Esto obliga al metodo a hacer mas de una cosa dependiendo del valor del booleano.

## Como reconocerlo

* Al llamar al metodo ves un valor como `true` o `false` que no explica que hace (ej: `save(data, true)`).
* Dentro del metodo hay un gran `if (flag) { ... } else { ... }`.
* El nombre del metodo suele ser generico.

## Problemas que causa

* Viola el principio de Responsabilidad Unica (el metodo hace dos cosas distintas).
* Reduce la legibilidad: ¿que significa ese `true` en la llamada al metodo?
* Dificulta el mantenimiento y la extension del codigo.

## Mal ejemplo

En bad-example.java el metodo `render` usa un booleano para decidir si debe imprimir en blanco y negro o en color, mezclando dos logicas.

## Buen ejemplo

En good-example.java se divide la funcionalidad en dos metodos explicitos y claros.

## Como evitarlo

* Divide el metodo en dos funciones separadas con nombres descriptivos.
* Si realmente necesitas pasar opciones, usa un `Enum` o un objeto de configuracion para que el codigo sea mas legible.
