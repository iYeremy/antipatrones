# Callback Hell

## Tipo

Desarrollo

## Descripcion

Ocurre cuando anidamos multiples funciones de respuesta (callbacks) unas dentro de otras, creando una estructura de codigo muy profunda y dificil de leer. Es muy comun en programacion asincrona.

## Como reconocerlo

* El codigo tiene forma de "piramide" invertida hacia la derecha.
* Cada funcion depende del resultado de la anterior y se define dentro de ella.
* Es muy dificil manejar errores porque cada nivel necesita su propio bloque de control.

## Problemas que causa

* El flujo de ejecucion es muy confuso.
* Depurar errores es una pesadilla.
* Es casi imposible añadir logica intermedia sin romper toda la cadena.

## Mal ejemplo

En bad-example.java se ve como para procesar una orden hay que anidar tres niveles de respuestas asincronas.

## Buen ejemplo

En good-example.java se utilizan alternativas modernas (como promesas o async/await) para aplanar el codigo.

## Como evitarlo

* Usa abstracciones modernas para la asincronia (Promises, Future, CompletableFuture).
* Extrae cada callback a una funcion con nombre.
* No anides mas de dos niveles de profundidad.
