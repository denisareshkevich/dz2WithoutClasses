package PPointer;

import PPointer.Point;

public class Rectangle {
    Point pointOfLeftBottomCourner = new Point (1,1);
    Point pointOfRightHighCourner = new Point(2,2);

public int square (){
return Math.abs((pointOfLeftBottomCourner.getX() - pointOfRightHighCourner.getX()) * (pointOfLeftBottomCourner.getY() - pointOfRightHighCourner.getY())) ;
}
public double diagonalLenth(){
   return (pointOfLeftBottomCourner.distance(pointOfRightHighCourner));
}
}
