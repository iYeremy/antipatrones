# Temporary Field

## Tipo

OOP

## Descripcion

Ocurre cuando una clase tiene campos que solo se utilizan en circunstancias muy especificas (como durante un calculo complejo) y el resto del tiempo estan vacios o no tienen sentido.

## Como reconocerlo

* Tienes campos en una clase que casi siempre son `null`.
* Metodos que asignan un valor a un campo solo para que otro metodo lo lea inmediatamente despues.
* Es dificil entender para que sirve un campo solo leyendo la definicion de la clase.

## Problemas que causa

* El estado del objeto es confuso y dificil de predecir.
* Dificulta las pruebas unitarias.
* Aumenta la complejidad innecesariamente.

## Mal ejemplo

En bad-example.java se ve como `Calculator` usa un campo de clase para guardar un resultado intermedio que solo se usa en un proceso.

## Buen ejemplo

En good-example.java se pasan los datos necesarios como parametros o se devuelven resultados, manteniendo el objeto limpio.

## Como evitarlo

* Pasa los datos como parametros entre metodos en lugar de guardarlos en campos de clase.
* Si un grupo de campos temporales se usa mucho para un calculo, extrae ese calculo a su propia clase.
