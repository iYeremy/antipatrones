# Singleton Everywhere

## Tipo

Desarrollo

## Descripcion

El uso excesivo del patron Singleton para cualquier clase que parezca una utilidad o un servicio. Convierte el sistema en una red de estados globales disfrazados, lo que rompe la orientacion a objetos pura.

## Como reconocerlo

* Muchas clases tienen un metodo `getInstance()` y un constructor privado.
* Accedes a servicios desde cualquier lugar usando `MyService.getInstance().doSomething()`.
* No necesitas pasar objetos como parametros porque "todo es accesible globalmente".

## Problemas que causa

* Dificulta enormemente las pruebas unitarias (el estado global se mantiene entre tests).
* Crea dependencias ocultas entre clases.
* El codigo se vuelve rigido y dificil de extender.
* Riesgos en entornos multi-hilo si el singleton no esta bien implementado.

## Mal ejemplo

En bad-example.java se ve como se abusa del singleton para un simple validador, lo que impide inyectar diferentes configuraciones.

## Buen ejemplo

En good-example.java se usa una instancia normal que puede ser pasada o inyectada, facilitando el desacoplamiento.

## Como evitarlo

* Usa Inyeccion de Dependencias (DI) para gestionar el ciclo de vida de los objetos.
* Pregúntate si realmente necesitas una unica instancia global o si simplemente te da pereza pasar el objeto por parametro.
* Prefiere objetos con vida corta y alcance limitado.
