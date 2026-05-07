# Flaky Tests

## Tipo

Testing

## Descripcion

Pruebas que a veces pasan y a veces fallan sin que haya habido ningun cambio en el codigo. Son pruebas inestables que destruyen la confianza del equipo en la suite de testing.

## Como reconocerlo

* El test falla en el servidor de CI pero pasa en tu maquina local (o viceversa).
* Si vuelves a ejecutar el test fallido, esta vez pasa ("problemas de red", "cuestion de tiempo").
* El test depende de servicios externos, de la hora del sistema o de condiciones de carrera (hilos).

## Problemas que causa

* El equipo deja de prestar atencion a los fallos reales.
* Se pierde mucho tiempo depurando problemas que no son bugs del codigo.
* Ralentiza el proceso de despliegue.

## Mal ejemplo

Un test que espera que una respuesta asincrona llegue en menos de 100ms. Si el servidor esta un poco lento, el test falla aunque el codigo sea correcto.

## Buen ejemplo

Eliminar la aleatoriedad. Usar mocks para el tiempo y para servicios externos, y usar esperas inteligentes (polling) en lugar de tiempos fijos (`sleep`).

## Como evitarlo

* No uses `Thread.sleep()`. Usa librerias que esperen a que una condicion se cumpla (como Awaitility).
* Aisla los tests de factores externos (red, base de datos shared).
* Si un test es flaky y no puedes arreglarlo rapido, desactivalo hasta que puedas darle una solucion estable.
