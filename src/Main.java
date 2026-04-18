import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("=== PRUEBAS DE MÉTODOS DE COLECCIONES ===\n");

        // --- 1. Multiplicador (Integers Aleatorios) ---
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        ArrayList<String> listaPalabras = new ArrayList<>();
        listaPalabras.add("Luna");
        listaPalabras.add("Luna");
        listaPalabras.add("Luna");
        listaPalabras.add("Luna");

        listaPalabras.add("Motor");
        listaPalabras.add("Motor");

        listaPalabras.add("Cristal");
        listaPalabras.add("Cristal");
        listaPalabras.add("Cristal");
        listaPalabras.add("Cristal");
        listaPalabras.add("Cristal");
        listaPalabras.add("Cristal");

        listaPalabras.add("Arena");
        listaPalabras.add("Arena");
        listaPalabras.add("Arena");

        listaPalabras.add("Trueno");
        listaPalabras.add("Trueno");
        listaPalabras.add("Trueno");
        listaPalabras.add("Trueno");
        listaPalabras.add("Trueno");

        listaPalabras.add("Nube");

        listaPalabras.add("Reloj");
        listaPalabras.add("Reloj");
        listaPalabras.add("Reloj");
        listaPalabras.add("Reloj");

        listaPalabras.add("Fuego");
        listaPalabras.add("Fuego");

        listaPalabras.add("Sombra");
        listaPalabras.add("Sombra");
        listaPalabras.add("Sombra");
        listaPalabras.add("Sombra");
        listaPalabras.add("Sombra");
        listaPalabras.add("Sombra");
        listaPalabras.add("Sombra");

        listaPalabras.add("Rio");
        listaPalabras.add("Rio");
        listaPalabras.add("Rio");
        String textoLargo = "En algún lugar entre el silencio del amanecer y el murmullo constante del mundo, existe un momento extraño en el que todo parece detenerse. No es algo que ocurra siempre, ni algo que todos noten, pero cuando sucede, es como si el tiempo decidiera respirar profundamente antes de continuar. En ese instante, el aire se siente diferente, más ligero, más claro, como si cada pensamiento pudiera organizarse por sí mismo sin esfuerzo.";
        for (int i = 0; i < 5; i++) {
            listaNumeros.add(random.nextInt(10) + 1);
        }
        // Multiplicador
        System.out.println("1. Antes de multiplicar: " + listaNumeros);
        UtileriaNumeros.multiplicador(listaNumeros, 5);
        System.out.println("   Después (x5): " + listaNumeros);

        // Filtro Selectivo
        ArrayList<String> listaFiltro = listaPalabras;
        System.out.println("2. Lista antes de filtrar: " + listaFiltro);
        // Filtra palabras que empiecen con 'B' o midan menos de 6
        UtileriaLetras.filtroSelectivo(listaFiltro, 'B', 6);
        System.out.println("   Lista filtrada: " + listaFiltro);

        // Convertir a Mayusculas
        ArrayList<String> listaBase = listaPalabras;
        ArrayList<String> mayusculas = UtileriaLetras.convertirAMayusculas(listaBase);
        System.out.println("3. Convertir a mayúsculas: " + mayusculas);

       // Cuadrados Unicos
        ArrayList<Integer> listaPares = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listaPares.add(random.nextInt(10) + 1);
        }
        HashSet<Integer> cuadrados = UtileriaNumeros.cuadradosDeParesUnicos(listaPares);
        System.out.println("4. Original: " + listaPares);
        System.out.println("   Cuadrados de pares únicos: " + cuadrados);

        // Mapa De Longitudes
        HashMap<String, Integer> mapaLong = UtileriaLetras.mapaDeLongitudes(listaPalabras);
        System.out.println("5. Mapa de Longitudes: " + mapaLong);

        // Modificador De Inventario
        HashMap<String, Double> inventario = new HashMap<>();
        inventario.put("Laptop", 12500.99);
        inventario.put("Mouse", 249.50);
        inventario.put("Teclado", 899.75);
        inventario.put("Monitor", 3499.80);
        inventario.put("Audifonos", 1299.45);
        System.out.println("6. Catálogo con descuento (10%):");
        UtileriaNumeros.modificadorDeInventario(inventario);

        //Contador De Frecuencias
        ArrayList<String> listaConRepeticiones = listaPalabras;
        HashMap<String, Integer> freqs = UtileriaLetras.contadorDeFrecuencias(listaConRepeticiones);
        System.out.println("7. Mapa de frecuencias: " + freqs);

        // Descarte de Palabras (Frecuencia menor a X)
        ArrayList<String> descartadas = UtileriaLetras.descarteDePalabras(freqs, 2);
        System.out.println("8. Palabras con frecuencia menor a 2: " + descartadas);

        // DeDuplicación de Frase Larga
        String frase = "El Piano sonaba en el Bosque... el Viento fuerte era un Espejo del alma.";
        HashSet<String> fraseProcesada = UtileriaLetras.deDuplicacionDePalabras(frase, 5);
        System.out.println("9. Palabras de la frase con menos de 5 letras (sin repetidos): " + fraseProcesada);

        // Tope de frecuencias
        // Usamos el mapa de frecuencias generado en el paso 7
        System.out.println("10. Mapa de frecuencias original: " + freqs);
        int limiteMaximo = 3;
        UtileriaLetras.topeDeFrecuencias(freqs, limiteMaximo);
        System.out.println("Mapa tras aplicar tope de (" + limiteMaximo + "): " + freqs);
    }
}
