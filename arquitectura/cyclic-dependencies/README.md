# Cyclic Dependencies

## Tipo

Arquitectura

## Descripcion

Ocurre cuando dos o mas componentes (clases, paquetes o servicios) dependen directamente entre si, creando un circulo cerrado. Esto hace que sea imposible separar un componente del otro.

## Como reconocerlo

* La Clase A importa a la Clase B, y la Clase B importa a la Clase A.
* Al intentar compilar un modulo de forma aislada, te das cuenta de que necesitas el otro modulo, y viceversa.
* Es el sintoma mas claro de una arquitectura enredada (Spaghetti Architecture).

## Problemas que causa

* Dificulta enormemente las pruebas unitarias.
* Impide la reutilizacion de componentes.
* Puede causar errores de inicializacion o de ejecucion (ej: desbordamiento de pila en llamadas recursivas).

## Mal ejemplo

En bad-example.java se ve como `Employee` necesita a `Department` y `Department` necesita a `Employee` para existir, creando un bucle infinito de dependencias.

## Buen ejemplo

En good-example.java se rompe el ciclo usando una interfaz o moviendo la logica comun a un tercer componente.

## Como evitarlo

* Usa el Principio de Inversion de Dependencia (DIP).
* Asegurate de que las dependencias fluyan en una sola direccion (ej: de arriba hacia abajo).
* Si dos clases dependen tanto entre si, quizas deban estar en el mismo paquete o ser una sola clase.
