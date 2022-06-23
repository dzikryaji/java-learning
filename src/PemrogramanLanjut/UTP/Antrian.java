package PemrogramanLanjut.UTP;

public class Antrian {
    private String name;
    private String phoneNumber;
    private String licenseNumber;
    private Layanan[] layanans;
    private int totalPrice;

    // Helper index in layanans
    private int indexLayanan;

    // Constructor
    public Antrian(String name, String phoneNumber, String licenseNumber){
        setName(name);
        setPhoneNumber(phoneNumber);
        setLicenseNumber(licenseNumber);
        this.indexLayanan = 0;
        setLayanans(new Layanan[3]);
        setTotalPrice(0);
    }

    // Basic Setter

    public void setName(String name){
        this.name =  name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber =  phoneNumber;
    }

    public void setLicenseNumber(String licenseNumber){
        this.licenseNumber =  licenseNumber;
    }

    public void setLayanans(Layanan[] layanans){
        this.layanans = layanans;
    }

    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }

    // Basic Getters

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public String getLicenseNumber(){
        return licenseNumber;
    }

    public Layanan[] getLayanan(){
        return layanans;
    }
    
    public int getTotalPrice(){
        return totalPrice;
    }

    // Public helper getFormatted Price
    // Ini nanti juga ditanyakan
    public String getFormattedPrice(){
        return Helper.getFormattedPrice(getTotalPrice());
    }

    // To String return a formattet string of layanan
    // Mengembalikan formatted string terhadap Antrian sesuai dengan gambar yang terlampir
    public void toStringAntrian(){
        // Rubah Kode di sini
        System.out.println("Name                : " + name);
        System.out.println("Phone               : " + phoneNumber);
        System.out.println("License             : " + licenseNumber);
        System.out.println("Daftar Layanan          :");
        for (int i = 0; i < indexLayanan; i++) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Layanan Nomor       : " + (1+i));
            System.out.println("Name                : " + layanans[i].getName());
            System.out.println("Price               : " + layanans[i].getFormattedPrice());
            System.out.println();
            System.out.println("----------------------------------------------------------");
        }
        System.out.println("Total               : " + getFormattedPrice());
        System.out.println();
    }

    // Helper untuk menambahkan layanan
    // Fungsi helper ketika akan menambahkan daftar layanan
    public void addLayanan(Layanan layanan){
        // Rubah kode di sini
        layanans[indexLayanan] = layanan;
        addTotalPrice(layanan.getPrice());
        indexLayanan++;
    }

    // Helper untuk menambahkan totalPrice
    // Fungsi helper ketika akan menambahkan totalPrice
    public void addTotalPrice(int layananPrice){
        int total = getTotalPrice() + layananPrice;
        setTotalPrice(total);
    }
}
