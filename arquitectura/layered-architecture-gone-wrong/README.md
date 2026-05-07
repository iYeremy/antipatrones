# Layered Architecture Gone Wrong

## Tipo

Arquitectura

## Descripcion

Ocurre cuando la arquitectura por capas se vuelve un obstaculo en lugar de una ayuda. Esto sucede por tener demasiadas capas (sobre-ingenieria) o por permitir que las capas se salten unas a otras (caos).

## Como reconocerlo

* Tienes que crear 5 archivos diferentes para añadir un campo simple a la base de datos (Controller, DTO, Service, Repository, Entity).
* Ves al Controller llamando directamente al Repository, saltandose la capa de Servicio.
* Hay capas que solo sirven de "pasamanos" y no tienen logica.

## Problemas que causa

* El desarrollo se vuelve lento y burocratico.
* La arquitectura deja de ser confiable; no sabes si la logica de negocio esta en el Servicio o en el Controller.
* Dificulta el mantenimiento y la comprension del flujo de datos.

## Mal ejemplo

En bad-example.java se ve un controlador que hace logica de base de datos directamente, rompiendo la separacion de capas.

## Buen ejemplo

En good-example.java se respeta el flujo de informacion: el controlador recibe, el servicio decide y el repositorio guarda.

## Como evitarlo

* Mantén el numero de capas al minimo necesario.
* Sé estricto con las reglas de dependencia: una capa solo puede hablar con la inmediata inferior.
* Si una capa no aporta valor (como un servicio que solo llama al repositorio), evalua si realmente la necesitas para ese caso concreto.
