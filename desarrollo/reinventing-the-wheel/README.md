# Reinventing the Wheel

## Tipo

Desarrollo

## Descripcion

Gastar tiempo y recursos en crear una solucion propia para un problema que ya ha sido resuelto de forma estandar por el lenguaje o por bibliotecas externas confiables.

## Como reconocerlo

* Encuentras metodos personalizados para tareas comunes como formatear fechas, validar emails o parsear JSON.
* El proyecto tiene su propio motor de base de datos o su propio framework web "casero".
* Los desarrolladores pasan mas tiempo manteniendo utilidades basicas que creando funcionalidades de negocio.

## Problemas que causa

* Alto costo de mantenimiento: tu solucion propia tendra bugs que las bibliotecas estandar ya corrigieron hace años.
* Falta de documentacion y soporte.
* Dificultad para integrar nuevos desarrolladores que ya conocen las herramientas estandar.

## Mal ejemplo

En bad-example.java se escribe un metodo complejo para capitalizar un texto, algo que ya existe en bibliotecas comunes.

## Buen ejemplo

En good-example.java se utiliza una biblioteca estandar (o funciones integradas del lenguaje) que es mas segura y eficiente.

## Como evitarlo

* Antes de programar una utilidad, busca si ya existe en el lenguaje (SDK) o en una libreria popular (ej: Apache Commons, Guava).
* Valora si el tiempo de desarrollar y mantener tu solucion es menor al de aprender una herramienta existente.
* Prefiere estandares de la industria sobre soluciones creativas pero aisladas.
