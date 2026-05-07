# Premature Optimization

## Tipo

Procesos

## Descripcion

Gastar tiempo en hacer que el codigo sea mas rapido o eficiente antes de tener pruebas reales de que esa parte del sistema es lenta. "La optimizacion prematura es la raiz de todos los males" (Donald Knuth).

## Como reconocerlo

* Escribes algoritmos complejos y dificiles de leer para ahorrar unos pocos bytes de memoria.
* Usas tecnicas de bajo nivel cuando no son necesarias.
* El codigo es mucho mas largo de lo normal solo por una supuesta ganancia de rendimiento que no ha sido medida.

## Problemas que causa

* El codigo es mas dificil de entender y mantener.
* El desarrollo se retrasa por problemas que el usuario nunca notaria.
* A menudo, la optimizacion ni siquiera mejora el rendimiento real del sistema global.

## Mal ejemplo

En bad-example.java se usa una logica manual compleja para concatenar strings en lugar de usar un simple operador `+`, pensando que sera "mucho mas rapido" en una aplicacion que apenas tiene trafico.

## Buen ejemplo

En good-example.java se escribe el codigo de la forma mas clara posible. Si mas adelante los perfiles de rendimiento (profiling) detectan un cuello de botella, se optimiza esa parte especifica.

## Como evitarlo

* Escribe codigo limpio primero, optimiza despues (si es necesario).
* Usa herramientas de medicion (profilers) para saber donde estan los problemas reales.
* Recuerda que el tiempo de desarrollo suele ser mas caro que el tiempo de CPU.
