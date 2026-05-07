# No Tests

## Tipo

Testing

## Descripcion

Confiar ciegamente en que el codigo funciona porque "lo he probado a mano una vez" o porque "soy un buen desarrollador". No existe ningun tipo de prueba automatizada en el proyecto.

## Como reconocerlo

* La carpeta `test` esta vacia o no existe.
* El comando `npm test` o `mvn test` no hace nada.
* El despliegue a produccion da miedo porque no sabes que se va a romper.
* Los bugs vuelven a aparecer una y otra vez (regresiones).

## Problemas que causa

* El mantenimiento es lentisimo porque hay que probar todo a mano.
* No se puede refactorizar con confianza.
* La calidad del software depende totalmente de la memoria del desarrollador.

## Mal ejemplo

Un proyecto de 20.000 lineas de codigo sin un solo archivo de prueba. Cada cambio requiere que el desarrollador abra la app y haga 10 clics para verificar que no se rompio nada.

## Buen ejemplo

Tener una suite de pruebas automatizadas que se ejecutan en cada cambio. Si algo falla, el sistema te avisa inmediatamente antes de que el error llegue al usuario.

## Como evitarlo

* Empieza escribiendo pruebas para las partes mas criticas de tu negocio.
* Adopta una cultura de testing: ningun codigo nuevo entra sin su prueba correspondiente.
* Usa herramientas de cobertura (coverage) para ver que partes del codigo estan desprotegidas.
