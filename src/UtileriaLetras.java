import java.util.ArrayList;

public class UtileriaLetras {

    public static void filtroSelectivo(ArrayList<String> lista,char letra,int cantidadDeLetras){
        char letraTemp = Character.toLowerCase(letra);
        lista.removeIf((String palabra)->{
            char[] temp = String.valueOf(palabra).toLowerCase().toCharArray();
            if(letraTemp == temp[0]||temp.length<cantidadDeLetras){
                return true;
            }else{
                return false;
            }
        });
    }
    public static ArrayList<String> convertirAMayusculas(ArrayList<String> lista){
        ArrayList<String> listaNueva = new ArrayList<>();
        lista.stream().map((String palabra) -> palabra.toUpperCase()).forEach((String palabraNueva)->{
            listaNueva.add(palabraNueva);
        });
        return listaNueva;
    }

}
