# Long Method

## Tipo

Desarrollo

## Descripcion

Un metodo que ha crecido demasiado y hace demasiadas cosas al mismo tiempo. Es el equivalente a un parrafo de mil palabras sin puntos ni comas.

## Como reconocerlo

* El metodo tiene mas de 20-30 lineas de codigo.
* Tienes que hacer scroll varias veces para ver donde termina.
* Hay comentarios dentro del metodo para explicar "etapas" del proceso (ej: "// Validacion", "// Guardado", "// Notificacion").
* Tiene muchas variables locales diferentes.

## Problemas que causa

* Es muy dificil de leer y entender de un vistazo.
* Reutilizar una parte de la logica es imposible sin copiar y pegar.
* Las pruebas unitarias se vuelven complejas porque hay demasiados caminos posibles.

## Mal ejemplo

En bad-example.java se muestra un metodo que valida un usuario, lo guarda en la base de datos y envia un correo, todo en un solo bloque gigante.

## Buen ejemplo

En good-example.java la logica se divide en varios metodos pequeños y descriptivos, lo que hace que el flujo principal sea legible.

## Como evitarlo

* Aplica la "Regla de la Responsabilidad Unica": un metodo debe hacer solo una cosa.
* Si ves comentarios separando secciones dentro de un metodo, extrae cada seccion a su propio metodo.
* Mantén tus metodos cortos (idealmente menos de 10-15 lineas).
