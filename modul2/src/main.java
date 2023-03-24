import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<String>();
        ArrayList<String> deleteHewan = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        //Menambahkan Delete Hewan//
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");

        System.out.println("Hewan : " + hewan);
        System.out.println("Hewan Yang Dihapus : " + deleteHewan);



        Iterator<String> iterator = hewan.iterator();
        while (iterator.hasNext()) {
            String h = iterator.next();
            for (String i : deleteHewan) {
                if (i.equals(h)) {
                    iterator.remove();
                    break;
                }
            }
        }
        System.out.println("Output hewan : " +hewan);
}
}