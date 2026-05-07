# Magic Numbers

## Tipo

Desarrollo

## Descripcion

Uso de valores numericos directamente en el codigo sin una explicacion de que representan. Estos numeros aparecen "por arte de magia" y solo quien escribio el codigo sabe que significan.

## Como reconocerlo

* Ves numeros como 86400, 0.15 o 1024 repartidos por la logica sin contexto.
* Tienes que preguntar a un compañero que significa un numero especifico en una formula.
* Cambiar un valor requiere buscar y reemplazar ese numero en todo el proyecto.

## Problemas que causa

* El codigo es dificil de leer y entender.
* Es propenso a errores si el mismo numero se usa para cosas distintas.
* Dificulta el mantenimiento cuando los valores de negocio cambian.

## Mal ejemplo

En bad-example.java se usan numeros directos para calcular el precio final con impuestos y descuentos, lo que hace la formula confusa.

## Buen ejemplo

En good-example.java se usan constantes con nombres descriptivos que explican exactamente que es cada valor.

## Como evitarlo

* Define constantes (static final en Java) con nombres claros para cualquier valor numerico que tenga un significado especial.
* Si el valor viene de una configuracion externa, usa un archivo de propiedades o variables de entorno.
* Evita usar numeros incluso si crees que son "obvios".
