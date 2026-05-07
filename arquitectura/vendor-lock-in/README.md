# Vendor Lock-in

## Tipo

Arquitectura

## Descripcion

Diseñar un sistema tan dependiente de las caracteristicas especificas de un proveedor (nube, base de datos, framework) que cambiar a otro se vuelve prohibitivamente costoso o imposible.

## Como reconocerlo

* Usas funciones o APIs que solo existen en un proveedor especifico (ej: AWS Lambda, Google BigQuery) sin ninguna capa de abstraccion.
* Tu codigo esta lleno de librerias propietarias del proveedor.
* No puedes ejecutar el sistema localmente de forma completa porque depende de servicios en la nube muy especificos.

## Problemas que causa

* Estas a merced de los cambios de precios o politicas del proveedor.
* Si el proveedor tiene una caida masiva, no tienes plan de respaldo.
* Dificulta enormemente la migracion a otras tecnologias mas modernas o baratas.

## Mal ejemplo

En bad-example.java se ve codigo que usa directamente clases de un proveedor de servicios de mensajeria sin usar una interfaz.

## Buen ejemplo

En good-example.java se usa una interfaz propia, de modo que el proveedor se puede cambiar facilmente sin tocar la logica de negocio.

## Como evitarlo

* Usa capas de abstraccion (interfaces) para servicios externos.
* Prefiere estandares abiertos (como SQL, Docker, Kubernetes).
* Evalua siempre el costo de salida antes de adoptar una tecnologia propietaria.
