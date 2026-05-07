# Spaghetti Code

## Tipo

Desarrollo

## Descripcion

Codigo que carece de una estructura clara y fluye de manera desordenada, como un plato de espaguetis enredados. Es dificil de seguir porque el flujo de ejecucion salta de un lado a otro sin una logica aparente.

## Como reconocerlo

* Metodos que llaman a otros metodos de forma circular o impredecible.
* Uso excesivo de saltos en la logica (muchos if/else anidados o goto en lenguajes que lo permitan).
* No hay una separacion clara de responsabilidades.
* Leer una sola linea de codigo requiere saltar entre cinco archivos o secciones diferentes.

## Problemas que causa

* Es casi imposible de mantener o corregir sin romper algo mas.
* Los nuevos desarrolladores tardan semanas en entender como funciona una funcionalidad simple.
* Las pruebas unitarias son dificiles de escribir porque el codigo esta muy enredado.

## Mal ejemplo

En el archivo bad-example.java se muestra un proceso de pedido donde la logica de validacion, calculo de impuestos y envio esta mezclada y salta entre bloques de forma caotica.

## Buen ejemplo

En el archivo good-example.java se ve como la logica se separa en metodos claros con una secuencia lineal y facil de leer.

## Como evitarlo

* Aplica principios de diseño simples (como SOLID).
* Divide los metodos grandes en piezas pequeñas que hagan una sola cosa.
* Mantén una estructura de carpetas y archivos coherente.
* Refactoriza en cuanto sientas que el flujo se esta volviendo confuso.
