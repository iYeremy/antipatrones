# Data Clumps

## Tipo

OOP

## Descripcion

Ocurre cuando encuentras un grupo de variables que siempre van juntas a todas partes (como parametros de metodos o campos en clases). Si el mismo grupo de datos aparece en varios lugares, es probable que esos datos deban estar en su propia clase.

## Como reconocerlo

* Metodos que reciben los mismos 3 o 4 parametros (ej: `startDate`, `endDate`, `timeZone`).
* Clases que tienen los mismos campos repetidos (ej: `street`, `city`, `zipCode`).

## Problemas que causa

* El codigo es mas dificil de leer y mantener.
* Si necesitas añadir un dato nuevo al grupo, tienes que cambiar muchos metodos.
* Indica una falta de abstraccion en el dominio.

## Mal ejemplo

En bad-example.java se ve como se pasan coordenadas X e Y como parametros separados en varios metodos.

## Buen ejemplo

En good-example.java se crea una clase `Point` que agrupa esos datos y simplifica las firmas de los metodos.

## Como evitarlo

* Extrae el grupo de datos a una clase pequeña (Value Object).
* Pasa el objeto completo en lugar de sus partes individuales.
