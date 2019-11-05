public class Program {
    public static void main (String [] args){
        Object objekt_1 = new Object();


        Student objekt_2 = new Student(
                "Ivo",
                "Ivic",
                "1111",
                "Informatika",
                "01/01/2000"
        );
        objekt_2.setIme("Pero");
        System.out.println(objekt_1);
        System.out.println(objekt_2);
    }
}
