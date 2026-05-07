# Hardcoding

## Tipo

Desarrollo

## Descripcion

Escribir datos de configuracion o valores variables directamente en el codigo fuente. Esto hace que el software sea rigido y dificil de adaptar a diferentes entornos o situaciones.

## Como reconocerlo

* Credenciales de base de datos o URLs de APIs escritas directamente en las clases.
* Rutas de archivos fijas que solo existen en la computadora del desarrollador (ej: "C:/Users/Juan/...").
* Mensajes de error o textos de la interfaz que no se pueden cambiar sin recompilar todo.

## Problemas que causa

* Riesgo de seguridad si se incluyen contraseñas en el codigo.
* Imposibilidad de cambiar la configuracion sin modificar el codigo fuente y volver a desplegar.
* El software falla cuando se mueve de un ambiente (desarrollo) a otro (produccion).

## Mal ejemplo

En bad-example.java se ve una conexion a base de datos con la URL y las credenciales escritas directamente en el metodo.

## Buen ejemplo

En good-example.java se muestra como estos valores deberian obtenerse de variables de entorno o archivos de configuracion.

## Como evitarlo

* Usa archivos de configuracion (JSON, YAML, .properties).
* Usa variables de entorno para datos sensibles.
* Si el valor es una constante de negocio, definela en una clase de constantes, no la repitas.
