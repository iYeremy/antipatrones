# Dead Code

## Tipo

Desarrollo

## Descripcion

Fragmentos de codigo que nunca se ejecutan o cuyos resultados nunca se utilizan. Es codigo "zombie" que vive en el proyecto sin cumplir ninguna funcion real.

## Como reconocerlo

* Metodos que no tienen llamadas desde ningun lugar del proyecto.
* Variables que se declaran y asignan, pero nunca se leen.
* Bloques de logica dentro de un "if" cuya condicion siempre es falsa.
* Clases que ya no se usan pero siguen en el repositorio.

## Problemas que causa

* Confunde a los desarrolladores, que pierden tiempo intentando entender algo que no sirve.
* Aumenta el tiempo de compilacion y el tamaño del binario final.
* Puede ocultar errores o comportamientos inesperados si alguien lo activa por accidente.

## Mal ejemplo

En bad-example.java hay un metodo antiguo de validacion que ya no se usa y una variable que se calcula pero se ignora.

## Buen ejemplo

En good-example.java simplemente se ha eliminado todo lo que no es necesario para que el codigo sea mas limpio.

## Como evitarlo

* Usa las advertencias de tu IDE (suelen marcar el codigo no usado en gris).
* Borra el codigo viejo sin miedo; para eso existe el control de versiones (Git) si necesitas recuperarlo.
* Realiza limpiezas periodicas del codigo (refactorizacion).
