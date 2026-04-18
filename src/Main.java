import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {
    private ArrayList<Integer> listaNumeros;
    private ArrayList<String> listaPalabras;
    private HashSet<Integer> listaCuadrada;
    private Random rng;
    public void main(){
        listaPalabras = new ArrayList<>();
        listaNumeros = new ArrayList<>();
        listaCuadrada = new HashSet<>();
        rng = new Random();
        listaPalabras.add("pelicano");
        listaPalabras.add("pato");
        listaPalabras.add("pincel");
        listaPalabras.add("Patagonia");
        listaPalabras.add("Pierna");
        listaPalabras.add("dictongo");
        listaPalabras.add("Durazno");
        listaPalabras.add("dragon");
        for(int i = 0; i < 10; i++){
            listaNumeros.add(rng.nextInt(20));
        }
        listaNumeros.sort(Integer::compareTo);
        System.out.println("Antes");
        System.out.println(listaNumeros);
        System.out.println(listaPalabras);
        listaCuadrada = UtileriaNumeros.cuadradosDeParesUnicos(listaNumeros);
        UtileriaNumeros.multiplicador(listaNumeros,2);
        ArrayList<String> lista2=UtileriaLetras.convertirAMayusculas(listaPalabras);
        UtileriaLetras.filtroSelectivo(listaPalabras,'D',7);
        System.out.println("Despues");
        System.out.println(listaNumeros);
        System.out.println(listaPalabras);
        System.out.println(lista2);
        System.out.println(listaCuadrada);
    }
}
