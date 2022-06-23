package PemrogramanLanjut.Tugas09;

public class Panda extends Animal implements Mammals, Viviparous{
    public Panda(String name, boolean isHeterotrops) {
        super(name, isHeterotrops);
    }

    @Override
    public void huntingFood() {
        System.out.println(getName() + " mencari bambu");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " bernafas dengan patu-paru");
    }

    @Override
    public void reproduction() {
        System.out.println(getName() + " beranak");
    }

    @Override
    public void move() {
        System.out.println(getName() + " berlari dan memanjat");
    }

    @Override
    public void brastfeeding() {
        System.out.println(getName() + " menyusui bayinya");
    }

    @Override
    public void beranak() {
        System.out.println(getName() + " beranak dengan melahirkan");
    }
}
