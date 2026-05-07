# Boat Anchor

## Tipo

Desarrollo

## Descripcion

Mantener piezas de codigo, bibliotecas o componentes que no se utilizan actualmente, pero que se dejan ahi "porque algun dia podrian ser utiles". Al igual que el ancla de un barco en tierra firme, solo sirven para estorbar y pesar.

## Como reconocerlo

* Tienes dependencias en tu proyecto que no importas en ningun lado.
* Clases de utilidad "por si necesitamos procesar XML" cuando el proyecto solo usa JSON.
* Parametros en metodos que nunca se usan pero se mantienen "por si el cliente pide mas opciones".

## Problemas que causa

* El proyecto tarda mas en compilar y ocupa mas espacio.
* Confunde a otros desarrolladores que creen que esas partes son necesarias.
* Aumenta la superficie de ataque para posibles vulnerabilidades de seguridad.

## Mal ejemplo

En bad-example.java se ve una clase con una dependencia gigante para una funcionalidad que nadie pidio ni usa.

## Buen ejemplo

En good-example.java se ha eliminado todo lo innecesario, dejando solo lo que aporta valor real al negocio hoy.

## Como evitarlo

* Sigue el principio YAGNI (You Ain't Gonna Need It): no programes algo hasta que sea realmente necesario.
* Revisa tus dependencias y elimina las que no uses.
* No tengas miedo de borrar codigo; si lo necesitas en el futuro, es mejor escribirlo con los requisitos reales de ese momento.
