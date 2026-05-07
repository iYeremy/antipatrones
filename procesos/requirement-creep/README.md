# Requirement Creep

## Tipo

Procesos

## Descripcion

Ocurre cuando los requisitos de una funcionalidad cambian constantemente mientras se esta desarrollando. A diferencia del Scope Creep (añadir mas funciones), aqui la misma funcion cambia de direccion una y otra vez.

## Como reconocerlo

* Tienes que borrar y reescribir la misma logica tres veces en la misma semana.
* El cliente o el Product Owner no tienen claro que necesitan realmente.
* "Ayer dijimos que era asi, pero hoy hemos pensado que mejor sea de esta otra forma".

## Problemas que causa

* El equipo se frustra y pierde la confianza en el liderazgo.
* El codigo se llena de parches y "hacks" para adaptarse a los cambios constantes.
* El proyecto nunca avanza hacia la finalizacion.

## Mal ejemplo

Desarrollar un sistema de autenticacion que primero iba a ser por email, luego por redes sociales, luego por biometria y al final vuelve a ser por email, todo sin haber terminado la primera version.

## Buen ejemplo

Congelar los requisitos de una tarea antes de empezar a programarla. Si hay cambios drasticos, se detiene la tarea actual, se analiza y se crea una nueva con los nuevos requisitos claros.

## Como evitarlo

* No empieces a programar hasta que el requisito este "Refinado" y sea comprensible.
* Usa prototipos de baja fidelidad (mockups) para que el cliente valide la idea antes de tirar una sola linea de codigo.
* Define ciclos de desarrollo cortos (Sprints) para reducir el riesgo de cambios a mitad de camino.
