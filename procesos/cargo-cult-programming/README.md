# Cargo Cult Programming

## Tipo

Procesos

## Descripcion

Ocurre cuando se copian patrones, tecnologias o formas de trabajar solo porque a otros les funciono, pero sin entender realmente por que se usan o si se adaptan a nuestro problema. Se llama asi por las tribus que imitaban pistas de aterrizaje esperando que cayeran provisiones del cielo.

## Como reconocerlo

* Se usan herramientas complejas (como Kubernetes o Kafka) para proyectos minusculos solo porque "Google las usa".
* Se copian bloques de codigo de StackOverflow que incluyen partes innecesarias para el caso actual.
* El equipo sigue rituales (como reuniones diarias de 1 hora) solo porque "es Agile".

## Problemas que causa

* El sistema es innecesariamente complejo.
* El equipo no sabe resolver problemas cuando algo falla porque no entiende los cimientos.
* Gran perdida de tiempo en tareas que no aportan valor real.

## Mal ejemplo

Configurar un cluster de microservicios para una aplicacion que podria ser un script de 100 lineas, simplemente por seguir la moda.

## Buen ejemplo

Entender los principios antes que las herramientas. Usar lo que realmente necesitas segun el contexto de tu proyecto.

## Como evitarlo

* Pregunta siempre: "¿Por que estamos usando esto?".
* No apliques un patron de diseño si no entiendes que problema resuelve.
* Sé critico con las modas tecnologicas (Hype Driven Development).
