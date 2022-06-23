package PemrogramanLanjut.Tugas09;

public abstract class Organism {
    private String name;

    public Organism(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void breathe();
    public abstract void reproduction();
    public abstract void move();

    public void grow(){
        System.out.println(this.name + " grows up");
    }

    public void eat(){
        System.out.println(this.name + " eating food");
    }

    public void excretion(){
        System.out.println(this.name + " bab");
    }
}
