# Slow Test Suite

## Tipo

Testing

## Descripcion

Una coleccion de pruebas que tarda demasiado tiempo en ejecutarse (minutos u horas). Esto rompe el ciclo de feedback rapido que es la razon de ser de los tests automatizados.

## Como reconocerlo

* Los desarrolladores no ejecutan los tests en sus maquinas porque "tardan una eternidad".
* El servidor de CI tarda mas de 15-20 minutos en dar un resultado.
* Casi todos los tests son de integracion o de interfaz (E2E), y hay muy pocos tests unitarios rapidos.

## Problemas que causa

* El equipo deja de ejecutar las pruebas con frecuencia, lo que aumenta el riesgo de introducir bugs.
* El proceso de despliegue se vuelve extremadamente lento.

## Mal ejemplo

Un proyecto donde cada test unitario levanta todo el contexto de Spring Boot y se conecta a una base de datos real, tardando 10 segundos por cada prueba simple.

## Buen ejemplo

Una "Piramide de Tests" equilibrada: miles de tests unitarios que se ejecutan en milisegundos, cientos de tests de integracion algo mas lentos, y solo unos pocos tests E2E muy especificos.

## Como evitarlo

* Asegurate de que tus tests unitarios no dependan de IO (red, disco, base de datos).
* Paraleliza la ejecucion de los tests.
* Identifica y optimiza los tests mas lentos.
