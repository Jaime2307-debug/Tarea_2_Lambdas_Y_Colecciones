# 📦 Proyecto de Colecciones, Lambdas

Este proyecto demuestra el uso de la API de **Streams**, expresiones **Lambda** y el manejo avanzado de colecciones (`ArrayList`, `HashMap`, `HashSet`) en Java para el procesamiento de datos.

##  Descripción
El objetivo de este proyecto es implementar una serie de métodos estáticos que resuelven problemas comunes de manipulación de datos, aplicando un enfoque funcional y declarativo. Se cubren tareas de filtrado, transformación, cálculo de frecuencias y eliminación de duplicados.

## Métodos Implementados

1.  **`multiplicador`**: Utiliza `replaceAll` con una lambda para multiplicar cada `Integer` de una lista por un factor dado.
2.  **`filtroSelectivo`**: Filtra un `ArrayList<String>` eliminando cadenas que inician con una letra específica o tienen una longitud menor a N.
3.  **`convertirAMayusculas`**: Transforma una lista a mayúsculas usando `stream()`, `map()` y `forEach()`.
4.  **`cuadradosDeParesUnicos`**: Procesa una lista de números para obtener un `HashSet` con los cuadrados de los números pares.
5.  **`mapaDeLongitudes`**: Convierte una lista de palabras en un `HashMap` donde la clave es la palabra y el valor es su longitud.
6.  **`modificadorDeInventario`**: Recorre un mapa de precios y muestra en consola el catálogo aplicando un descuento del 10%.
7.  **`contadorDeFrecuencias`**: Utiliza el método `merge()` para construir un mapa que cuenta las apariciones de cada palabra.
8.  **`descarteDePalabras`**: Filtra un mapa de frecuencias para extraer en una lista solo las palabras con frecuencia inferior a un valor dado.
9.  **`deDuplicacionDePalabras`**: Procesa una frase, la divide por delimitadores complejos y guarda palabras cortas únicas en minúsculas.
10. **`topeDeFrecuencias`**: Genera una lista inicial de palabras para estandarizar las pruebas del sistema.

## Compilación y Ejecución

### Requisitos
* Tener instalado el **JDK 16** o superior (`Esto ya que desde el 16 hay metodos que se actualizaron mucho`).

### Pasos
1.  **Clonar o descargar** la carpeta **src**.
2.  **Compilar** desde la terminal:
    ```
    javac Main.java
    ```
    o desde el propio Intellij IDEA.
3.  **Ejecutar** el programa:
    ```
    java Main
    ```
    o en Intellij IDEA con **Run**.
## Ejemplo de Salida
```text
=== PRUEBAS DE MÉTODOS DE COLECCIONES ===

1. Antes de multiplicar: [5, 6, 7, 2, 9]
   Después (x5): [25, 30, 35, 10, 45]
   
2. Lista antes de filtrar: [Luna, Luna, Luna, Luna, Motor, Motor, Cristal, Cristal, Cristal, Cristal, Cristal, Cristal, Arena, Arena, Arena, Trueno, Trueno, Trueno, Trueno, Trueno, Nube, Reloj, Reloj, Reloj, Reloj, Fuego, Fuego, Sombra, Sombra, Sombra, Sombra, Sombra, Sombra, Sombra, Rio, Rio, Rio]
   Lista filtrada: [Cristal, Cristal, Cristal, Cristal, Cristal, Cristal, Trueno, Trueno, Trueno, Trueno, Trueno, Sombra, Sombra, Sombra, Sombra, Sombra, Sombra, Sombra]
   
3. Convertir a mayúsculas: [CRISTAL, CRISTAL, CRISTAL, CRISTAL, CRISTAL, CRISTAL, TRUENO, TRUENO, TRUENO, TRUENO, TRUENO, SOMBRA, SOMBRA, SOMBRA, SOMBRA, SOMBRA, SOMBRA, SOMBRA]

4. Original: [8, 6, 8, 8, 10, 9, 8, 3, 10, 7]
   Cuadrados de pares únicos: [64, 36, 100]
   
5. Mapa de Longitudes: {Cristal=7, Sombra=6, Trueno=6}

6. Catálogo con descuento (10%):
Producto: Laptop
Precio: 11250.891
Producto: Monitor
Precio: 3149.9100000000003
Producto: Mouse
Precio: 224.55
Producto: Audifonos
Precio: 1169.505
Producto: Teclado
Precio: 809.775
7. Mapa de frecuencias: {Sombra=7, Cristal=6, Trueno=5}

8. Palabras con frecuencia menor a 2: []

9. Palabras de la frase con menos de 5 letras (sin repetidos): [alma, era, el, en, un, del]

10. Mapa de frecuencias original: {Sombra=7, Cristal=6, Trueno=5}
Mapa tras aplicar tope de (3): {Sombra=3, Cristal=3, Trueno=3}
