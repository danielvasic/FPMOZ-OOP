package primjer8;

import java.util.*;

public class Program {
    public static void main (String [] args){
        /*
        SonyTV tv1 = new SonyTV();
        SonyTV tv2 = new SonyTV();
        tv1.upali();
        for (int i = 0;i<200;i++)
            tv1.smanji();
        System.out.println(tv1);
        System.out.println(tv2);

         */
        Tocka2D<Double> t1 = new Tocka2D<>(1.2d,3.3d);
        Tocka2D<Integer> t2 = new Tocka2D<>(1, 2);

        List<Tocka2D> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);
        for (int i=0;i<lista.size();i++){
            Tocka2D t = lista.get(i);
            System.out.println(t);
        }

        lista.remove(1);

        for (Tocka2D t : lista){
            System.out.println(t);
        }



    }
}
