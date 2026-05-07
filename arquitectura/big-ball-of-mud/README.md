# Big Ball of Mud

## Tipo

Arquitectura

## Descripcion

Un sistema que carece de una arquitectura definible. Es una mezcla caotica de componentes donde todo depende de todo, sin limites claros entre las diferentes partes del software. Es el resultado de años de parches y decisiones apresuradas.

## Como reconocerlo

* No hay un diagrama que explique como funciona el sistema.
* Un cambio en el modulo de "Pagos" rompe inexplicablemente el modulo de "Inventario".
* Los datos fluyen de manera desordenada entre todas las capas (si es que existen capas).
* El codigo es una maraña de dependencias circulares.

## Problemas que causa

* El sistema es extremadamente fragil.
* Es imposible predecir el impacto de un cambio.
* El costo de mantenimiento es altisimo y la moral de los desarrolladores suele ser baja.

## Mal ejemplo

En una Gran Bola de Lodo, no hay archivos separados por responsabilidad. Veras una clase gigante (o muchas clases pequeñas) todas llamandose entre si sin ningun orden jerarquico o logico.

## Buen ejemplo

Una arquitectura limpia divide el sistema en modulos (o servicios) con responsabilidades unicas y comunicaciones controladas a traves de interfaces o eventos.

## Como evitarlo

* Define limites claros (Bounded Contexts) desde el inicio.
* Aplica una arquitectura por capas o hexagonal para separar la logica de negocio de los detalles tecnicos.
* No permitas que las prisas destruyan la estructura del proyecto; invierte tiempo en refactorizar.
