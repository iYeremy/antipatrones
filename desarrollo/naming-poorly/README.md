# Naming Poorly

## Tipo

Desarrollo

## Descripcion

Asignar nombres vagos, genericos o confusos a variables, metodos y clases. El nombre no refleja la intencion real del codigo.

## Como reconocerlo

* Variables de una sola letra (x, y, a, b) en logica compleja.
* Nombres muy genericos como `data`, `info`, `process()`, `doSomething()`.
* Nombres que mienten (ej: un metodo llamado `getUserName()` que tambien borra el usuario).
* Abreviaturas que nadie mas entiende (ej: `clnt_addr_fnl`).

## Problemas que causa

* Obliga al lector a analizar toda la implementacion para saber que hace una variable.
* Aumenta la carga cognitiva y la probabilidad de cometer errores.
* El codigo deja de ser auto-explicativo y requiere comentarios innecesarios.

## Mal ejemplo

En bad-example.java se usan nombres sin sentido que hacen imposible entender que hace el bucle.

## Buen ejemplo

En good-example.java se usan nombres descriptivos que explican el proposito de cada elemento.

## Como evitarlo

* Los nombres deben ser pronunciables y buscables.
* Usa nombres que revelen la intencion (¿Que es? ¿Que hace?).
* Evita abreviaturas innecesarias.
* Los metodos deben empezar con un verbo (ej: `calculateTotal`).
