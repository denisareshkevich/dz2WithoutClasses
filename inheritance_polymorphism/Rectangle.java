package inheritance_polymorphism;

public class Rectangle extends Quadrangle {


    public Rectangle(int x, int y, Point pointOfLeftHighCourner, Point pointOfRightHighCourner,
                     Point pointOfLeftBottomCourner, Point pointOfRightBottomCourner,
                     double a, double b, double c, double d) {
        super(x, y, pointOfLeftHighCourner, pointOfRightHighCourner, pointOfLeftBottomCourner,
                pointOfRightBottomCourner, a, b, c, d);
    }

    @Override
    public double perimetr() {
        return (2 * a)+(2 * b);
    }

    @Override
    public double countSquare() {
        return a * b;
    }

    @Override
    protected double diagonal2_4() {
        return diagonal1_3();
    }
}
