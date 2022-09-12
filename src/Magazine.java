public class Magazine implements Printable{
    static String  statia;
     String comics;
    public Magazine(String statia, String comics){
        this.statia = statia;
        this.comics = comics;
    }
    @Override
    public void print() {
        System.out.println(statia + " " + comics);
    }
    public static void printMagazines(Printable [] printable){
        System.out.println(statia);
    }
}
