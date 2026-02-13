package oop.ocp;

public class Ellipse extends Shape {
    private double Major, Minor;
    public Ellipse(double semiMajor, double semiMinor) {
        this.Major = semiMajor; this.Minor = semiMinor;
    }
    @Override
    public double calculateArea() {
        return 3.14 * Major * Minor;
    }
}
