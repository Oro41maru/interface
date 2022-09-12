public class Book implements Printable {
    static String nazvanie;
    String avtor;
    public Book(String nazvanie, String avtor){
        this.avtor = avtor;
        this.nazvanie = nazvanie;
    }
    @Override
    public void print() {

        System.out.println(nazvanie+ " " + avtor);
    }
    public static void printBooks(Printable [] printable){
        System.out.println(nazvanie);
    }
}
