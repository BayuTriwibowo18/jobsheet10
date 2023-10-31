import java.util.Scanner;

public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner sc07 = new Scanner (System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String [4][2];
        while (true) {
            System.out.print("Masukan nama: ");
            nama = sc07.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc07.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc07.nextInt();
            sc07.nextLine();

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc07.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}