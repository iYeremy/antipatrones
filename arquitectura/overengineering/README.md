# Overengineering

## Tipo

Arquitectura

## Descripcion

Diseñar una solucion mucho mas compleja de lo que el problema requiere. Ocurre cuando se intentan anticipar problemas futuros que nunca llegan o cuando se aplican patrones de diseño sofisticados solo por "elegancia" tecnica.

## Como reconocerlo

* Tienes interfaces con una sola implementacion que nunca va a cambiar.
* El sistema usa 5 patrones de diseño diferentes para una funcionalidad que solo guarda un nombre en una base de datos.
* El codigo es dificil de leer porque hay demasiadas capas de abstraccion.
* Los desarrolladores pasan mas tiempo configurando el framework que escribiendo logica.

## Problemas que causa

* El desarrollo es mucho mas lento y costoso.
* El codigo es dificil de mantener por cualquier persona que no sea el autor original.
* Es mas facil que aparezcan bugs ocultos en la complejidad innecesaria.

## Mal ejemplo

En bad-example.java se crea un sistema de eventos, fabricas y observadores para sumar dos numeros.

## Buen ejemplo

En good-example.java se usa la solucion mas simple y directa (KISS: Keep It Simple, Stupid).

## Como evitarlo

* No resuelvas problemas que aun no tienes.
* Aplica el principio YAGNI (You Ain't Gonna Need It).
* Preguntate siempre: "¿Cual es la forma mas sencilla de hacer esto?".
