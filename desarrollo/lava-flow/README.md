# Lava Flow

## Tipo

Desarrollo

## Descripcion

Ocurre cuando el codigo tiene partes muy antiguas o experimentales que nadie se atreve a tocar o borrar por miedo a que todo deje de funcionar. Se llama asi porque el codigo "fluye", se endurece y luego se construye encima de el.

## Como reconocerlo

* Encuentras archivos con comentarios como "NO TOCAR", "Preguntar a Pedro (que se fue de la empresa hace 5 años)".
* Hay metodos o clases que parecen no tener sentido con la arquitectura actual.
* Te dicen: "Esa parte funciona asi, no sabemos por que, pero no la muevas".

## Problemas que causa

* El sistema se vuelve cada vez mas pesado y complejo de entender.
* Las nuevas funcionalidades se construyen de forma "sucia" para esquivar el codigo viejo.
* Dificulta enormemente las migraciones o actualizaciones tecnologicas.

## Mal ejemplo

En bad-example.java se ve como se mantiene un motor de calculo obsoleto conviviendo con uno nuevo, simplemente por miedo a migrar los datos viejos.

## Buen ejemplo

En good-example.java se muestra un proceso de refactorizacion donde el codigo viejo se ha encapsulado o eliminado tras asegurar que la nueva logica lo cubre.

## Como evitarlo

* Escribe pruebas unitarias solidas que te den confianza para borrar codigo viejo.
* Practica la "Regla del Boy Scout": deja el codigo un poco mas limpio de como lo encontraste.
* No permitas que el codigo experimental llegue a produccion sin una revision posterior.
