import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class UtileriaNumeros {

    public static void multiplicador(ArrayList<Integer> lista, int factor){
        lista.replaceAll((Integer elemento)->{
            elemento*=factor;
            return elemento;
        });
    }
    public static HashSet<Integer> cuadradosDeParesUnicos(ArrayList<Integer> lista){
        HashSet<Integer> hashSet = new HashSet<>();
        lista.stream().filter(valor-> valor%2==0).map(valor -> valor*valor).forEach(hashSet::add);
        return hashSet;
    }
    public static void modificadorDeInventario(HashMap<String,Double> inventario){
        inventario.forEach((String producto, Double precio)->{
            System.out.println("Producto: " + producto);
            if(precio==null) {
                System.out.println("Precio: " + "null");
            }else{
                System.out.println("Precio: " + precio*0.90);
            }
        });
    }
}
