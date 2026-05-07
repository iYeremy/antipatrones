# Primitive Obsession

## Tipo

Desarrollo

## Descripcion

Uso excesivo de tipos primitivos (int, string, double) para representar conceptos del mundo real que tienen sus propias reglas. Es como usar un martillo para todo, incluso cuando necesitas un destornillador.

## Como reconocerlo

* Ves strings que en realidad son correos, telefonos o direcciones.
* Se usan numeros para representar estados o tipos (ej: 1 = Pendiente, 2 = Pagado).
* Tienes logica de validacion repetida cada vez que usas uno de estos valores.

## Problemas que causa

* El codigo pierde significado semantico (un String no te dice si es un nombre o un ZIP).
* Riesgo de mezclar valores que no deberian mezclarse (ej: sumar un ID de usuario con un precio porque ambos son `int`).
* Dificulta la validacion centralizada.

## Mal ejemplo

En bad-example.java se usa un `String` para manejar un email, lo que obliga a validarlo manualmente en cada metodo que lo use.

## Buen ejemplo

En good-example.java se crea una clase `Email` que encapsula la logica y asegura que solo existan correos validos en el sistema.

## Como evitarlo

* Crea pequeñas clases (Value Objects) para conceptos importantes (Email, Dinero, Telefono).
* Usa `Enums` en lugar de constantes numericas para representar estados.
* Si un dato tiene reglas propias (ej: un codigo postal debe tener 5 digitos), dale su propia clase.
