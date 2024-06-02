import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // creo un oggetto dello stesso tipo dell' HashSet ''String'' e lo riempio richiamando setAnimali()
        Set<String> animali = new HashSet<String>(setAnimali());
        //Stampo animali per verificare se il nuovo set è stato popolato
        System.out.println("gli animali nella lista sono : " + animali);


    }
    // creo un metodo che restituisce un HashSet pieno
    private static HashSet<String> setAnimali() {
        HashSet<String> animaliQuattroZampe = new HashSet<String>();
        animaliQuattroZampe.add("cane");
        animaliQuattroZampe.add("gatto");
        animaliQuattroZampe.add("cavallo");
        animaliQuattroZampe.add("mucca");
        return animaliQuattroZampe;
    }

}