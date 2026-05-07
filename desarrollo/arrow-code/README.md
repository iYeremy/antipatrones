# Arrow Code

## Tipo

Desarrollo

## Descripcion

Ocurre cuando el codigo tiene tantos niveles de anidacion (if, for, while) que empieza a parecer una punta de flecha apuntando a la derecha. Es un sintoma de logica demasiado compleja en un solo lugar.

## Como reconocerlo

* Tienes muchos bloques `if` uno dentro de otro.
* El codigo empieza muy a la derecha de la pantalla debido a los tabuladores.
* Es dificil saber que llave de cierre `}` pertenece a cual bloque.

## Problemas que causa

* Es muy dificil de leer y seguir el flujo logico.
* Favorece la aparicion de errores al olvidar casos borde.
* El cerebro humano tiene limites para seguir niveles de anidacion (usualmente mas de 3 ya es confuso).

## Mal ejemplo

En bad-example.java se ve como para validar un permiso se anidan multiples comprobaciones, creando la forma de flecha.

## Buen ejemplo

En good-example.java se usan "clausulas de guarda" (return temprano) para mantener el codigo plano y legible.

## Como evitarlo

* Usa "Return Early": si una condicion no se cumple, sal del metodo inmediatamente.
* Extrae bloques anidados a sus propios metodos.
* Invierte las condiciones de los `if` para evitar el bloque `else`.
