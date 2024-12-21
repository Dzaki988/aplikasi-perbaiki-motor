import java.util.Scanner;

public class KonsultasiMotor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=======================");
        System.out.println("aplikasi perbaiki motor");
        System.out.println("+++++++++++++++++++++++");
        
        System.out.println("pilih gejala motormu");
        System.out.println("1. tidak bisa hidup");
        System.out.println("2  kurang bertenaga");
        System.out.println("3  gejala lain");
        
        System.out.print("masukkan pilihanmu: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        
        if (pilihan == 1) {
            System.out.println("jika tidak bisa hidup, cek busi");
        } else if (pilihan == 2) {
            System.out.println("lakukan service pada bagian CVT");
        } else if (pilihan == 3) {
            System.out.print("masukkan yang kamu alami: ");
            String gejalamu = scanner.nextLine();
            System.out.println("terima kasih, customer service kami akan menghubungi kamu secepatnya");
        } else {
            System.out.println("pilih hanya 1, 2, dan 3");
        }
        
        scanner.close();
        
    }
}
