public class Kapal extends TransportasiAir{
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin) {
        super(jumlahKursi, biaya);
        this.mesin = mesin;        
    }

    @Override
    public void informasi() {
        System.out.println(("Transportasi air jenis Kapal dengan kursi berjumlah " + jumlahKursi + " ditetapkan dengan biaya sebesar Rp."+biaya));
    }

    @Override
    public void berlayar() {
        System.out.println("Transportasi Air jenis kapal sedang berlayar menggunakan mesin " + mesin + " dengan kecepatan yang tidak stabil");
    }

    public void berlabuh(int kecepatan) {
        System.out.println("Transportasi Air jenis kapal sedang berlayar menggunakan mesin Diesel dengan kecepatan stabil di kisaran "+ kecepatan + " knot");
    }
    
    public void berlabuh () {
        System.out.println("Transportasi air jenis Kapal berlabuh di pantai");
    }
}
