import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

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

    public static HashMap<String,Integer> mapaDeLongitudes(ArrayList<String> lista) {
        return (HashMap<String, Integer>) lista.stream().distinct().collect(Collectors.toMap(palabra -> palabra, longitud -> longitud.length()));
    }

    public static HashMap<String,Integer> contadorDeFrecuencias(ArrayList<String> lista){
        HashMap<String,Integer> mapaDeFrecuencias = new HashMap<>();
        lista.forEach(palabra-> mapaDeFrecuencias.merge(palabra,1,Integer::sum));
        return mapaDeFrecuencias;
    }
    public static ArrayList<String> descarteDePalabras(HashMap<String,Integer> mapaDeFrecuencias,Integer filtro){
        ArrayList<String> palabrasNoDescartadas = new ArrayList<>();
        palabrasNoDescartadas= (ArrayList<String>) mapaDeFrecuencias.entrySet().stream().filter(repetidas -> repetidas.getValue()<filtro).map(repetidas-> repetidas.getKey()).collect(Collectors.toList());
        return palabrasNoDescartadas;
    }
    public static HashSet<String> deDuplicacionDePalabras(String frase,Integer filtro){
        String[] palabras = frase.split("[\\s,;.:]+");
        HashSet<String> palabrasFiltradas = new HashSet<>();
        Arrays.stream(palabras).filter(palabra->palabra.length()<filtro).forEach(palabra ->{
            palabrasFiltradas.add(palabra.toLowerCase());
        });
        return palabrasFiltradas;
    }
    public static void topeDeFrecuencias(HashMap<String,Integer> mapaDeFrecuencias,Integer tope){
        mapaDeFrecuencias.replaceAll((palabra,frecuencia)->{
            if(frecuencia>tope){
                return tope;
            }else{
                return frecuencia;
            }
        });
    }
}
