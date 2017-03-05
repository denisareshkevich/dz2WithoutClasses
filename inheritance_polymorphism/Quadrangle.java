package inheritance_polymorphism;

import static java.lang.Math.*;

public class Quadrangle extends Triangle {

    public Quadrangle(int x, int y, Point pointOfCourner1, Point pointOfCourner2, Point pointOfCourner3,
                      Point pointOfCourner4, double a, double b, double c, double d) {
        super(x, y, pointOfCourner1, pointOfCourner2, pointOfCourner3);
        this.pointOfCourner4 = pointOfCourner4;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Quadrangle(int x, int y, Point pointOfCourner1, Point pointOfCourner2, Point pointOfCourner3) {
        super(x, y, pointOfCourner1, pointOfCourner2, pointOfCourner3);
    }
    protected Point pointOfCourner4 = new Point(7,8);

     protected double a = getLength(pointOfCourner1, pointOfCourner2);
     protected double b = getLength(pointOfCourner2, pointOfCourner3);
     protected double c = getLength(pointOfCourner3, pointOfCourner4);
     protected double d = getLength(pointOfCourner4, pointOfCourner1);
    protected final double p = perimetr()/2;
    @Override
    public double countSquare() {
        return sqrt(p * (p - a) * (p - b) * (p - c) * (p - d));
    }
    protected double diagonal1_3 (){
       return getLength(pointOfCourner1, pointOfCourner3);
    }
    protected double diagonal2_4(){
        return getLength(pointOfCourner2, pointOfCourner4);
    }

    @Override
    public String toString() {
        return "Quadrangle{" +
                "pointOfCourner4=" + pointOfCourner4 +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", p=" + p +
                '}';
    }
}
