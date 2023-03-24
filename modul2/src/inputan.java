import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class inputan {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<String>();
        ArrayList<String> deleteHewan = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        String myInput;
        System.out.printf("Masukkan Hewan : ");
        myInput = input.nextLine();
        myInput = myInput.replaceAll("\\[", "");
        myInput = myInput.replaceAll("\\]", "");
        String data[];
        data = myInput.split(",");
        for (String i : data) {
            hewan.add(i);
        }
        System.out.print("Hewan yang dihapus : ");
        String delHewan;
        delHewan = input.nextLine();
        delHewan = delHewan.replaceAll("\\[", "");
        delHewan = delHewan.replaceAll("\\]", "");
        data = null;
        data = delHewan.split(",");
        for (String i : data) {
            deleteHewan.add(i);
        }

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