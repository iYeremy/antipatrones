# God Object

## Tipo

Desarrollo

## Descripcion

Una clase u objeto que sabe demasiado o hace demasiado. Es ese objeto central en tu sistema que parece estar conectado con todo y que contiene miles de lineas de codigo con responsabilidades que no le pertenecen.

## Como reconocerlo

* La clase tiene muchisimos metodos (mas de 50) y variables de instancia.
* Casi cualquier cambio en el sistema requiere tocar esta clase.
* El nombre de la clase es muy generico, como `SystemManager`, `App` o `MainController`.
* Es la clase que todos los desarrolladores temen abrir.

## Problemas que causa

* Es extremadamente dificil de entender y mantener.
* El acoplamiento es tan alto que no puedes reutilizar nada sin llevarte todo el "dios" contigo.
* Las pruebas unitarias son imposibles porque la clase depende de todo el universo.

## Mal ejemplo

En bad-example.java se muestra una clase `AppManager` que maneja usuarios, base de datos, logs, pagos y UI al mismo tiempo.

## Buen ejemplo

En good-example.java se ve como esa clase se ha dividido en pequeños servicios especializados y coordinados.

## Como evitarlo

* Aplica el Principio de Responsabilidad Unica (SRP).
* Si una clase empieza a crecer mucho, extrae grupos de metodos relacionados a nuevas clases mas pequeñas.
* Usa la composicion: en lugar de que una clase haga todo, haz que delegue tareas a otros objetos.
