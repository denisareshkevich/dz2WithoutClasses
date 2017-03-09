package inheritance_polymorphism;
import static java.lang.Math.*;
public class Triangle extends Point implements CourneredFigure, ClosedFigure {
    @Override
    public String toString() {
        return "Triangle{" +
                "pointOfCourner1=" + pointOfCourner1 +
                ", pointOfCourner2=" + pointOfCourner2 +
                ", pointOfCourner3=" + pointOfCourner3 +
                ", ab=" + ab +
                ", bc=" + bc +
                ", ac=" + ac +
                '}';
    }

    public Triangle(int x, int y, Point pointOfCourner1, Point pointOfCourner2, Point pointOfCourner3) {
        super(x, y);
        this.pointOfCourner1 = pointOfCourner1;
        this.pointOfCourner2 = pointOfCourner2;
        this.pointOfCourner3 = pointOfCourner3;
    }

    protected Point pointOfCourner1 = new Point(1,2);
    protected Point pointOfCourner2 = new Point(3,4);
    protected Point pointOfCourner3 = new Point(5,6);
    protected double ab = getLength(pointOfCourner1, pointOfCourner2);
    protected double bc = getLength(pointOfCourner2, pointOfCourner3);
    protected double ac = getLength(pointOfCourner3, pointOfCourner1);
    @Override
    public double perimetr(){
        return ab+bc+ac;
    }
    @Override
    public double countSquare() {
        return (ab * bc * sinusCounterSecPoint(pointOfCourner1, pointOfCourner2, pointOfCourner3))/2;
    }

    @Override
    public double sinusCounterSecPoint(Point firstPoint, Point secondPoint, Point thirdPoint) {
//              [BA x BC]                  (x1-x2)*(y3-y2)-(x3-x2)*(y1-y2)
//        sinB =  --------- = --------------------------------------------------------------------
//                |BA||BC|     SQRT( SQR(x1-x2) + SQR(y1-y2) ) * SQRT( SQR(x3-x2) + SQR(y3-y2) )

        return ((firstPoint.getX() - secondPoint.getX()) * (thirdPoint.getY() - secondPoint.getY())) -
                ((thirdPoint.getX() - secondPoint.getX()) * (firstPoint.getY() - secondPoint.getY())) /
                        (sqrt(pow(firstPoint.getX() - secondPoint.getX(), 2) + pow(firstPoint.getY()
                                - secondPoint.getY(), 2))) * (sqrt(pow(thirdPoint.getX() - secondPoint.getX(), 2)) +
                        (pow(thirdPoint.getY() - secondPoint.getY(), 2)));
    }
}
