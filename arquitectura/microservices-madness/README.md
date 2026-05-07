# Microservices Madness

## Tipo

Arquitectura

## Descripcion

Adoptar una arquitectura de microservicios sin tener la necesidad real, el equipo suficiente o la infraestructura adecuada. Es intentar usar un camion de carga gigante para llevar una sola bolsa de pan a la vuelta de la esquina.

## Como reconocerlo

* Tienes mas microservicios que desarrolladores en el equipo.
* Cada servicio solo tiene 1 o 2 tablas en su base de datos.
* El equipo pasa mas tiempo luchando con Docker, Kubernetes y la red que escribiendo codigo.
* La latencia entre servicios hace que la aplicacion se sienta lenta.

## Problemas que causa

* Complejidad operativa abrumadora.
* Dificultad extrema para depurar un error que viaja por 5 servicios diferentes.
* Costos de infraestructura innecesariamente altos.

## Mal ejemplo

Un sistema de blog sencillo dividido en: Servicio de Usuarios, Servicio de Posts, Servicio de Comentarios y Servicio de Tags, todos en contenedores separados y bases de datos distintas.

## Buen ejemplo

Un monolito bien estructurado (Monolito Modular) donde todas las funcionalidades viven en el mismo proyecto pero separadas por paquetes claros. Es mucho mas facil de desplegar y mantener para un equipo pequeño.

## Como evitarlo

* Empieza siempre con un monolito. Solo extrae microservicios cuando tengas problemas reales de escalabilidad o cuando equipos diferentes necesiten trabajar de forma independiente.
* Asegurate de que tu equipo tiene experiencia en devops antes de lanzarte a los microservicios.
