package PemrogramanLanjut.Tugas09;

public abstract class Animal extends Organism{
    private boolean isHeterotrops;

    public Animal(String name, boolean isHeterotrops) {
        super(name);
        this.isHeterotrops = isHeterotrops;
    }

    public abstract void huntingFood();
}
