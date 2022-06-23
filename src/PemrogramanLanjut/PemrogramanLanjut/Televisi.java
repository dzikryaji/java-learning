package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class Televisi {
    private boolean hidup;
    private int channel = 1;
    private int volume = 50;
    private int maxVolume = 100;
    private int maxChannel = 15;
    
    void hidupkan(){
        if (hidup == true) {//memastikan keadaan televisi hidup atau mati
            System.out.println("...");
        } else {
            channel = 1;
            volume = 50;
            hidup = true;
            System.out.println("Televisi Hidup");
            System.out.printf("Channel Aktif = %d. Volume = %d \n \n",channel, volume);
        }
    }
    void upChannel(){
        if (hidup == true) {//memastikan keadaan televisi hidup atau mati
            channel += 1;
            if (channel > maxChannel) {//memastikan apakah channel lebih dari maxChannel
                channel = 1;
                System.out.println("Anda sekarang menonton Channel " + channel);
            } else {
                System.out.println("Anda sekarang menonton Channel " + channel);
            }
        } else {
            System.out.println("...");
        }
    }
    void upChannel(int tambah){
        if (hidup == true) {//memastikan keadaan televisi hidup atau mati
            channel += tambah;
            if (channel > maxChannel) {//memastikan apakah channel lebih dari maxChannel
                channel = channel - maxChannel;
                System.out.println("Anda sekarang menonton Channel " + channel);
            } else {
                System.out.println("Anda sekarang menonton Channel " + channel);
            }
        } else {
            System.out.println("...");
        }
    }
    void downChannel(){
        if (hidup == true) {//memastikan keadaan televisi hidup atau mati
            channel -= 1;
            if (channel < 1) {//memastikan apakah channel kurang dari satu
                channel = maxChannel;
                System.out.println("Anda sekarang menonton Channel " + channel);
            } else {
                System.out.println("Anda sekarang menonton Channel " + channel);
            }
        } else {
            System.out.println("...");
        }
    }
    void downChannel(int kurang){
        if (hidup == true) {//memastikan keadaan televisi hidup atau mati
            channel -= kurang;
            if (channel < 1) {//memastikan apakah channel kurang dari satu
                channel = maxChannel - 1 + channel;
                System.out.println("Anda sekarang menonton Channel " + channel);
            } else {
                System.out.println("Anda sekarang menonton Channel " + channel);
            }  
        } else {
            System.out.println("...");
        }
    }
    void upVolume(){
        if (hidup == true) {//memastikan keadaan televisi hidup atau mati
            volume += 1;
            if (volume > maxVolume) {//memastikan apakah volume lebih dari maxVolume
                volume = maxVolume;
                System.out.println("Volume maximal");
                System.out.println("Volume : 100");
            } else {
                System.out.println("Volume naik menjadi " + volume);
            }
        } else {
            System.out.println("...");
        }
    }
    void upVolume(int tambah){
        if (hidup == true) {//memastikan keadaan televisi hidup atau mati
            volume += tambah;
            if (volume > maxVolume) {//memastikan apakah volume lebih dari maxVolume
                volume = maxVolume;
                System.out.println("Volume maximal");
                System.out.println("Volume : 100");
            } else {
                System.out.println("Volume naik menjadi " + volume);
            }
        } else {
            System.out.println("...");
        }
    }
    void downVolume(){
        if (hidup == true) {//memastikan keadaan televisi hidup atau mati
            volume -= 1;
            if (volume < 1) {//memastikan apakah volume kurang dari 1
                volume = 0;
                System.out.println("Mode hening");
                System.out.println("Volume : 0");
            } else {
                System.out.println("Volume turun menjadi " + volume);
            }
        } else {
            System.out.println("...");
        }
    }
    void downVolume(int kurang){
        if (hidup == true) {//memastikan keadaan televisi hidup atau mati
            volume -= kurang;
            if (volume < 1) {//memastikan apakah volume kurang dari 1
                volume = 0;
                System.out.println("Mode hening");
                System.out.println("Volume : 0");
            } else {
                System.out.println("Volume turun menjadi " + volume);
            }
        } else {
            System.out.println("...");
        }
    }
    void gantiChannel(int ganti){
        if (hidup == true) {//memastikan keadaan televisi hidup atau mati
            if (ganti > maxChannel || ganti < 1) {//memastikan apakah input lebih besar dari maxChannel atau lebih kecil dari satu
                System.out.println("...");
                System.out.println("Anda sekarang menonton Channel " + channel);
            } else {
                channel = ganti;
                System.out.println("Anda sekarang menonton Channel " + channel);
            }
        } else {
            System.out.println("...");
        }
    }
    void matikan(){
        if (hidup == true) {//memastikan keadaan televisi hidup atau mati
            hidup = false;
            System.out.println("Televisi Mati.. Hzhzhzhz..");
        } else {
            System.out.println("...");
        }
    }
}
