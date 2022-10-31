import java.util.Scanner;

public class User {

    public static void main(String[] args) {
        
        String nama;
        int nohp;

        
        Scanner Masukan = new Scanner(System.in);

        
        System.out.println("Selamat Datang di Restoran EAD");
        System.out.println("Silahkan Registrasi Terlebih Dahulu");
        System.out.println("===================================");
        System.out.print("Nama : ");
        
        nama = Masukan.nextLine();
        
        System.out.print("No Hanphone : ");
        
        nohp = Masukan.nextLine();


        

        System.out.println("--------------------");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        
    }

}