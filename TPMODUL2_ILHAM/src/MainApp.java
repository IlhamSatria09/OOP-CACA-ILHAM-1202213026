public class MainApp {
    public static void main(String[] args) {
        // Deklarasi
        Perangkat perangkat1 = new Perangkat("Adata",2,(float)1.80);
        Laptop laptop1 = new Laptop("Seagate", 8, (float)2.40, false);
        Handphone handphone1 = new Handphone("Sandisk",3,(float)2.20,false);

        perangkat1.informasi();
        System.out.println();
        laptop1.informasi();
        laptop1.bukaGame("Valorant");
        laptop1.kirimEmail("ilhamsatria@student.telkomuniversity.com");
        laptop1.kirimEmail("ilhamsatria@gmail.com","whoami@student.telkomuniversity.com");

        System.out.println();
        handphone1.informasi();
        handphone1.telfon(08123456789);
        handphone1.kirimSMS(08123456789, 08198765432);
    }
}
