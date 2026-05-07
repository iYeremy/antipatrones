# Tight Coupling

## Tipo

Desarrollo

## Descripcion

Ocurre cuando dos o mas clases dependen demasiado la una de la otra. Un cambio en una clase obliga casi siempre a cambiar la otra. Es como si estuvieran pegadas con pegamento industrial en lugar de estar conectadas por cables intercambiables.

## Como reconocerlo

* Una clase instancia directamente a otra en su constructor (usa `new`).
* No puedes probar una clase de forma aislada sin instanciar todo el sistema.
* Cambiar la firma de un metodo en una clase rompe muchas otras partes del codigo.

## Problemas que causa

* El codigo es rigido y dificil de reutilizar.
* Las pruebas unitarias son imposibles o requieren un esfuerzo enorme.
* Es muy dificil cambiar una implementacion por otra (ej: cambiar de base de datos o de proveedor de correo).

## Mal ejemplo

En bad-example.java la clase `ReportService` esta pegada a una implementacion especifica de base de datos MySQL.

## Buen ejemplo

En good-example.java se usa una interfaz y "Inyeccion de Dependencias" para que la clase no sepa (ni le importe) que base de datos se esta usando.

## Como evitarlo

* Usa interfaces en lugar de clases concretas para las dependencias.
* Aplica Inyeccion de Dependencias (pasa las dependencias por el constructor).
* Evita que las clases conozcan los detalles internos de sus dependencias.
