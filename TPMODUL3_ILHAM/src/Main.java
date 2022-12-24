import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            Restaurant Barista = new Restaurant();
                int CustomerID, orderQty;
            try {
                System.out.print("Masukkan Customer ID: ");
                CustomerID = input.nextInt();

                System.out.print("Berapa Banyak Pesanan Anda: ");
                orderQty = input.nextInt();

                Thread t1 = new Thread(Barista);
                Waiters waiters = new Waiters(orderQty, CustomerID);
                Thread t2 = new Thread(waiters);

                t1.start();
                t2.start();
                t1.join();
                t2.join();
            }catch(Exception a){
                System.out.println("Inputan Harus dalam Integer");
        }
    }
    }
}