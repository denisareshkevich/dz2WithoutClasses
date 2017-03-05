package inheritance_polymorphism;

public class Point extends Figure2D {


        private int x;
        private int y;
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        public double getLength(Point firstPoint,Point secondPoint) {
            return Math.sqrt(Math.pow((firstPoint.getX() - secondPoint.getX()  ),2)
                    + Math.pow((firstPoint.getY() - secondPoint.getY() ),2));
        }
}
