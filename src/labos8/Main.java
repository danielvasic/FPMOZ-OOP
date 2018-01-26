package labos8;



import java.util.*;

/**
 * Created by Daniel on 26.1.2018..
 */
public class Main {
    public static void main (String [] args) {
        String[] niz = {"Ivan", "Ena", "Marko", "Ivana"};
        List<String> mojaLista = Arrays.asList(niz);
        System.out.println(mojaLista);
        Collections.sort(mojaLista);
        System.out.println(mojaLista);
        int pozicija = Collections.binarySearch(mojaLista, "Ivan");
        System.out.println (pozicija);
        System.out.println (mojaLista.get(pozicija));

        Collections.shuffle(mojaLista);
        System.out.println (mojaLista);
        List <Programer> programeri = new ArrayList<Programer>();
        programeri.add(new Programer("Ivo", "Ivić", 600.0f));
        programeri.add(new Programer("Iva", "Ivić", 1200.0f));
        programeri.add(new Programer("Marko", "Markić", 700.0f));

        Iterator<Programer> iterator = programeri.iterator();
        while (iterator.hasNext()) {
            Programer trenutni = iterator.next();
            if (trenutni.getPlaca()<700.0f)
                iterator.remove();
        }

        iterator = programeri.iterator();
        while (iterator.hasNext()) {
            Programer trenutni = iterator.next();
            System.out.println(trenutni.getIme() + " " + trenutni.getPrezime());
        }

    }
}
