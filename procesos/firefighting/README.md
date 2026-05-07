# Firefighting

## Tipo

Procesos

## Descripcion

Un estado constante de crisis donde el equipo pasa todo su tiempo resolviendo problemas urgentes (apagando fuegos) en lugar de trabajar en nuevas funcionalidades o en mejorar la calidad del sistema.

## Como reconocerlo

* La mitad de los desarrolladores estan arreglando bugs criticos en produccion.
* Nunca hay tiempo para refactorizar o escribir tests.
* Se saltan los procesos de revision para poder subir arreglos rapido.

## Problemas que causa

* El sistema se degrada cada vez mas, generando mas bugs.
* El equipo esta estresado y no se avanza en los objetivos de negocio.
* Se introducen mas errores al intentar arreglar otros de forma apresurada.

## Mal ejemplo

Un equipo que no puede empezar el Sprint porque tiene 20 incidencias de ayer que hay que arreglar "ya mismo", y asi todos los dias.

## Buen ejemplo

Invertir tiempo en la raiz del problema. Si algo falla mucho, se detiene todo para arreglarlo bien y añadir tests que eviten que vuelva a pasar. Es mejor prevenir incendios que ser un gran bombero.

## Como evitarlo

* Dedica una parte de cada ciclo (Sprint) a deuda tecnica y refactorizacion.
* Automatiza las pruebas y el despliegue.
* Analiza por que ocurren los fallos (Post-mortems) para evitar que se repitan.
