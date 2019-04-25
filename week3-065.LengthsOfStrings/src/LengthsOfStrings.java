import java.util.ArrayList;

public class LengthsOfStrings {
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> listaContagem = new ArrayList<Integer>();
        int tamanhoString = 0;
        for (String lista : list) {
            tamanhoString = lista.length();
            listaContagem.add(tamanhoString);
        }
        return listaContagem;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ciao");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);
        
        System.out.println("The lengths of the Strings: " + lengths);
    }
}
