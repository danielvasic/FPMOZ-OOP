package labos07;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Daniel on 26.1.2018..
 */
public class Main {

    public static void main (String [] args) {
        Tocka<Integer> tocka1 = new Tocka<Integer>(1,1);
        Tocka<Double> tocka2 = new Tocka<Double>(1.0, 1.0);
        System.out.println(tocka1);
        System.out.println (tocka2);
    }
}
