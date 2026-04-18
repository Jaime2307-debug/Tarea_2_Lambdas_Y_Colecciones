import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Main {
    private ArrayList<Integer> listaNumeros;
    private ArrayList<String> listaPalabras;
    private HashSet<Integer> listaCuadrada;
    private HashMap<String,Double> listaDeProductos;
    private Random rng;
    public void main(){
        listaPalabras = new ArrayList<>();
        listaNumeros = new ArrayList<>();
        listaCuadrada = new HashSet<>();
        listaDeProductos = new HashMap<>();
        rng = new Random();
        listaDeProductos.put("Rosario",150.00);
        listaDeProductos.put("Cirio",200.00);
        listaDeProductos.put("Escapulario",30.00);
        listaDeProductos.put("Misal",55.00);
        listaDeProductos.put("Estampas",20.00);
        listaDeProductos.put("Pulsera",50.00);
        listaDeProductos.put("Agua",15.00);
        listaDeProductos.put("Tenario",25.00);
        listaDeProductos.put("Biblia",250.00);
        listaDeProductos.put("Separador",10.00);
        listaPalabras.add("Piano");
        listaPalabras.add("Efímero");
        listaPalabras.add("Bosque");
        listaPalabras.add("Reloj");
        listaPalabras.add("Brújula");
        listaPalabras.add("Salto");
        listaPalabras.add("Misterio");
        listaPalabras.add("Cuaderno");
        listaPalabras.add("Galaxia");
        listaPalabras.add("Viento");
        listaPalabras.add("Cristal");
        listaPalabras.add("Viento");
        listaPalabras.add("Viento");
        listaPalabras.add("Viento");
        listaPalabras.add("Espejo");
        listaPalabras.add("Espejo");
        listaPalabras.add("Espejo");
        listaPalabras.add("Espejo");
        listaPalabras.add("Espejo");
        listaPalabras.add("Bosque");
        listaPalabras.add("Fuego");
        listaPalabras.add("Fuego");
        listaPalabras.add("Reloj");
        listaPalabras.add("Reloj");
        listaPalabras.add("Reloj");
        listaPalabras.add("Cristal");
        listaPalabras.add("Cristal");
        listaPalabras.add("Cristal");
        listaPalabras.add("Cristal");
        listaPalabras.add("Abismo");
        listaPalabras.add("Abismo");
        for(int i = 0; i < 10; i++){
            listaNumeros.add(rng.nextInt(20));
        }
        listaNumeros.sort(Integer::compareTo);
        System.out.println("---Listas Principales Antes---");
        /* listaNumeros.forEach(System.out::println);
        listaPalabras.forEach(System.out::println);
        listaDeProductos.forEach((producto, cantidad) -> {
            System.out.println("Producto: " + producto);
            System.out.println("Precio: "+ cantidad);
        }); */
        System.out.println(listaPalabras);
        System.out.println(listaNumeros);
        System.out.println(listaDeProductos);
        System.out.println("---Listas Principales Despues---");
        listaCuadrada = UtileriaNumeros.cuadradosDeParesUnicos(listaNumeros);
        UtileriaNumeros.multiplicador(listaNumeros,2);
        HashMap<String,Integer> palabrasConLongitud = UtileriaLetras.mapaDeLongitudes(listaPalabras);
        HashMap<String,Integer> palabrasConFrecuencia = UtileriaLetras.contadorDeFrecuencias(listaPalabras);
        ArrayList<String> lista2=UtileriaLetras.convertirAMayusculas(listaPalabras);
        ArrayList<String> lista3=UtileriaLetras.descarteDePalabras(palabrasConFrecuencia,4);
        UtileriaLetras.filtroSelectivo(listaPalabras,'D',7);
        UtileriaNumeros.modificadorDeInventario(listaDeProductos);
        System.out.println(listaNumeros);
        System.out.println(listaPalabras);
        System.out.println(listaCuadrada);
        System.out.println(palabrasConLongitud);
        System.out.println(palabrasConFrecuencia);
        System.out.println(lista2);
        System.out.println(lista3);

    }
}
