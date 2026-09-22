# Composite en Java: productos y cajas

Grupo 2: Lina Castañeda, Gerardo Ropero y Juan Riaño.

Este proyecto calcula el precio de un pedido con productos y cajas anidadas. Adapta a Java el problema presentado por [Refactoring.Guru: Composite](https://refactoring.guru/es/design-patterns/composite), en las secciones «Problema» y «Solución».

El código, los productos y los precios de esta entrega son una implementación didáctica propia. Los precios son ficticios y están expresados en pesos colombianos enteros (COP).

## Ejecutar

Necesitas un JDK 8 o posterior. El proyecto se comprobó con OpenJDK 17. No usa Maven, Gradle ni librerías externas.

Extrae el ZIP antes de ejecutar. Abre una terminal en la carpeta que contiene este README.

En Windows:

```bat
ejecutar.bat
```

En macOS o Linux:

```bash
bash ejecutar.sh
```

También puedes compilar y ejecutar directamente:

```bash
javac -encoding UTF-8 -d out src/com/grupo2/composite/*.java
java -cp out com.grupo2.composite.Main
```

Si `javac` no se reconoce, revisa que tengas un JDK instalado y que su carpeta `bin` esté en el PATH.

En un IDE, abre la carpeta como proyecto Java, configura `src` como carpeta de código fuente y ejecuta `com.grupo2.composite.Main`.

## Archivos y roles

| Archivo | Rol en Composite | Responsabilidad |
| --- | --- | --- |
| `Componente.java` | Component | Contrato con `getNombre()`, `calcularPrecio()` y `mostrar(...)`. |
| `Producto.java` | Leaf | Guarda nombre y precio. |
| `Caja.java` | Composite | Gestiona su contenido con `agregar()` y `quitar()`. |
| `Main.java` | Client | Construye este pedido y muestra sus resultados. |
| `PruebasComposite.java` | Verificación | Comprueba precios y cambios en el pedido. |

Los cuatro archivos del programa están en `src/com/grupo2/composite/`. Las comprobaciones están en `test/com/grupo2/composite/`.

## Pedido de la demostración

| Elemento | Contenido o precio | Subtotal en COP |
| --- | --- | ---: |
| Papeleria | Cuaderno (12000) y Lapicero (3000) | 15000 |
| Caja regalo | Papeleria (15000) y USB (25000) | 40000 |
| Pedido | Audifonos (60000) y Caja regalo (40000) | 100000 |

Los subtotales de las cajas ya incluyen sus productos. El total también se puede verificar sumando solo los cuatro productos: `60000 + 25000 + 12000 + 3000 = 100000`.

En el ejemplo, `Pedido` es otra instancia de `Caja`: funciona como agrupación principal. No cobra un precio propio. Esta versión no incluye impuestos, envío ni costo de empaquetado.

## Qué señalar al explicar el código

1. Abre `Componente.java`. `calcularPrecio()` devuelve un `int` en pesos enteros. `mostrar()` sirve para visualizar el pedido en consola.
2. Abre `Producto.java`. Su cálculo devuelve directamente el campo `precio`.
3. Abre `Caja.java`. Observa `List<Componente> contenido` y la llamada `hijo.calcularPrecio()` dentro del bucle.
4. Abre `Main.java`. Sigue la construcción: Papeleria, Caja regalo y Pedido.
5. Ejecuta el programa. El mismo método `mostrarPrecio(Componente elemento)` recibe `lapicero`, `regalo` y `pedido`.

Para seguir una llamada concreta: Pedido consulta Audifonos y Caja regalo. Caja regalo consulta Papeleria y USB. Papeleria devuelve 15000, Caja regalo devuelve 40000 y Pedido devuelve 100000.

Las diapositivas usan los mismos nombres y valores. Los bloques abreviados están identificados como fragmentos. Las notas de cada diapositiva incluyen una guía oral y la fuente.

## Comprobaciones

En Windows:

```bat
probar.bat
```

En macOS o Linux:

```bash
bash probar.sh
```

Se comprueba una caja vacía, un producto individual, el pedido anidado, la eliminación de un producto, la modificación de una caja interior y el rechazo de precios negativos. `salida_esperada.txt` contiene la salida de la demostración.

## Alcance del modelo

Construye un árbol sin ciclos: no agregues una caja dentro de sí misma ni dentro de una de sus descendientes. Cada instancia representa un artículo del pedido. Si agregas dos veces la misma instancia, se contará dos veces. Los valores del ejercicio caben en un `int`; no es un sistema de facturación comercial.

## Agregar al repositorio del grupo

Copia esta carpeta en el repositorio con el nombre que acuerden, por ejemplo `Composite/`. `.gitignore` excluye la carpeta `out/` y los archivos compilados. El proyecto se puede ejecutar sin conexión.

## Referencia

Refactoring.Guru. **Composite**. Secciones «Problema», «Solución» y «Estructura». Consulta: 22 de septiembre de 2026.

https://refactoring.guru/es/design-patterns/composite

El diseño de las diapositivas sigue el PDF del grupo, `Patrones estructurales.pdf`.
