# Feature Envy

## Tipo

Desarrollo

## Descripcion

Ocurre cuando un metodo parece mas interesado en los datos de otra clase que en los de la suya propia. Es como si el metodo "envidiara" a la otra clase y quisiera vivir en ella.

## Como reconocerlo

* Un metodo llama a muchos metodos `get` de otro objeto para realizar un calculo.
* La logica del metodo usa exclusivamente datos externos.
* Si mueves el metodo a la otra clase, el codigo se vuelve mas simple y limpio.

## Problemas que causa

* Viola el principio de encapsulamiento.
* Crea un acoplamiento innecesario entre clases.
* Hace que la logica este en el lugar equivocado, dificultando el mantenimiento.

## Mal ejemplo

En bad-example.java la clase `Cart` calcula el precio total de un item accediendo a todos sus detalles internos en lugar de que el item lo haga.

## Buen ejemplo

En good-example.java se mueve la responsabilidad del calculo a la clase `Item`, donde pertenecen los datos.

## Como evitarlo

* Sigue el principio "Tell, Don't Ask": dile a los objetos que hagan cosas, no les pidas sus datos para hacerlas tú.
* Si un metodo usa demasiados datos de otra clase, muévelo a esa clase.
