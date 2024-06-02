import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        // 2) creo un oggetto dello stesso tipo dell' HashSet ''String'' e lo riempio;
        String cercaAnimale = "ornitorinco";
        // 3) utilizzo l' if-else per cercare se il nuovo oggetto è all'interno della lista;
        // 4) utilizzando .contains() cerco all'interno del metodo setAnimali se il nuovo oggetto si trova nella lista.
        // 5) a seguire le relative stampe
        if (setAnimali().contains(cercaAnimale)){
            System.out.println(cercaAnimale + " è nella lista");
        }else {
            System.out.println(cercaAnimale + " non è nella lista");
        }

    }
    // 1) creo un metodo che restituisce un HashSet pieno
    private static HashSet<String> setAnimali() {
        HashSet<String> animaliQuattroZampe = new HashSet<String>();
        animaliQuattroZampe.add("cane");
        animaliQuattroZampe.add("gatto");
        animaliQuattroZampe.add("cavallo");
        animaliQuattroZampe.add("mucca");
        return animaliQuattroZampe;
    }

}