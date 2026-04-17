import java.util.ArrayList;

public class Main {
    private ArrayList<Integer> listaNumeros;
    public Main(){
        listaNumeros = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            listaNumeros.add(i);
        }
        UtileriaNumeros.multiplicador(listaNumeros,2);
    }
}
