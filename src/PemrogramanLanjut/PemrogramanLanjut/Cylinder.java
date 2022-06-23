package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }
    
    public Cylinder(double height, double radius) {
        this.height = height;
        setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea(){
        return (2*(Math.PI*getRadius()*getRadius()))+(2*Math.PI*getRadius()*height);
    }
    
    public double getVolume(){
        return super.getArea()*height;
    }
    
}
