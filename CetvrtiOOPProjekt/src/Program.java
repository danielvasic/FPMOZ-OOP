public class Program {

    public static void main (String [] args){
        Item stavka = new Item("123", "I1", 12.0);

        Beverage pivo = new Beverage("321", "Ožujsko", 3.0);

        System.out.println(stavka.cijenaUkupno(5));
    }
}
