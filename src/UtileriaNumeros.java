import java.util.ArrayList;

public class UtileriaNumeros {

    public static void multiplicador(ArrayList<Integer> lista, int factor){
        lista.replaceAll((elemento)->{
            System.out.println(elemento);
            return 0;
        });
    }
}
