# Continuous Obsolescence

## Tipo

Procesos

## Descripcion

El equipo vive en una carrera eterna por estar al dia con las ultimas versiones de cada framework, libreria o herramienta, incluso si las versiones actuales funcionan perfectamente. El sistema nunca es estable porque siempre se esta "migrando" a algo nuevo.

## Como reconocerlo

* Pasas mas tiempo actualizando el `package.json` o el `pom.xml` que escribiendo codigo.
* Te da miedo que tu proyecto de 6 meses ya se considere "legado" (legacy).
* Se cambian tecnologias solo porque ha salido una version con un nombre mas moderno.

## Problemas que causa

* El proyecto nunca llega a estar pulido y estable.
* Se introducen bugs constantemente debido a cambios en las dependencias.
* El equipo pierde el foco en los objetivos de negocio.

## Mal ejemplo

Migrar una aplicacion de React a Vue (o de Java 17 a Java 21) a mitad del desarrollo solo porque el equipo leyó que la nueva version es un 5% mas rapida en un benchmark.

## Buen ejemplo

Actualizar solo cuando hay una necesidad real (seguridad, rendimiento critico o fin de soporte). Mantener una base tecnologica estable permite centrarse en crear valor para el usuario.

## Como evitarlo

* No actualices tus dependencias cada semana solo porque sí.
* Define una politica de actualizaciones basada en la estabilidad y seguridad.
* Valora mas la robustez del sistema que estar en la "punta de lanza" tecnologica.
