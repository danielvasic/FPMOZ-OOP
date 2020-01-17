import java.util.*;

public class Lista {
    public static void main (String [] args){

        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Daniel", "Vasic", "2320", 3.5f));
        studenti.add(new Student("Pero", "Peric", "1234", 4.5f));

        System.out.println(studenti);

        Comparator<Student> usporednik = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.prosjek < o2.prosjek) return 1;
                if (o1.prosjek > o2.prosjek) return -1;
                return 0;
            }
        };

        Collections.sort(studenti, usporednik);
        System.out.println(studenti);
        float suma = 0;
        /*
        for (Student s : studenti){
            suma += s.prosjek;
        }
         */

        for (int i=0;i<studenti.size();i++){
            Student s = studenti.get(i);
            suma += s.prosjek;
        }
        System.out.println(suma);

    }
}
