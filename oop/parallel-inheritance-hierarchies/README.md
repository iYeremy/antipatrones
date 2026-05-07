# Parallel Inheritance Hierarchies

## Tipo

OOP

## Descripcion

Ocurre cuando cada vez que creas una subclase para una clase, te ves obligado a crear tambien una subclase para otra clase distinta. Las dos jerarquias de herencia crecen en paralelo.

## Como reconocerlo

* Tienes una jerarquia de `ClaseA` y sus hijas, y otra de `ClaseB` y sus hijas, donde cada hija de A tiene una hija correspondiente de B.
* Los nombres de las subclases suelen ser similares (ej: `SqlDatabase` / `SqlRepository`, `OracleDatabase` / `OracleRepository`).

## Problemas que causa

* El mantenimiento se duplica.
* Es facil olvidar crear una de las subclases o cometer errores al conectarlas.
* Indica un diseño que no esta bien desacoplado.

## Mal ejemplo

En bad-example.java se ve como para cada tipo de `Engineer` hay un `EngineerManager` diferente, lo que duplica el trabajo.

## Buen ejemplo

En good-example.java se usa polimorfismo o composicion para que una sola clase pueda gestionar diferentes tipos de objetos.

## Como evitarlo

* Mueve el comportamiento de una jerarquia a la otra para que solo exista una.
* Usa patrones como el Puente (Bridge) o Estrategia (Strategy) para desacoplar las responsabilidades.
