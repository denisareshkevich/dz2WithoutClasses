package inheritance_polymorphism;

public class Quadrate extends Rectangle {

    public Quadrate(int x, int y, Point pointOfLeftHighCourner, Point pointOfRightHighCourner,
                    Point pointOfLeftBottomCourner, Point pointOfRightBottomCourner, double a, double b,
                    double c, double d) {
        super(x, y, pointOfLeftHighCourner, pointOfRightHighCourner, pointOfLeftBottomCourner,
                pointOfRightBottomCourner, a, b, c, d);
    }

    @Override
    public double perimetr() {
        return 4*a;
    }

    @Override
    public double countSquare() {
        return Math.pow(a,2);
    }


}
