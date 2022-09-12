public class Main  {
    public static void main(String[] args) {
    Book book = new Book("о чем то", "Эрик");
    Magazine magazine = new Magazine("khflhj", "Мммм");
    Printable [] printables = {book, magazine};
    for (Printable p : printables){
        p.print();
        if (p instanceof Book)
    Book.printBooks(printables);
        if (p instanceof Magazine)
          Magazine.printMagazines(printables);

        }
    }
}
