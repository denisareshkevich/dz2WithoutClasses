package inheritance_polymorphism;

public class Circle extends Ellipse {


    public Circle(int x, int y, int radius) {
        super(x, y, radius);
    }

    @Override
    public double countSquare() {
        return Math.pow(getRadius(),2) * pi;
    }
}
