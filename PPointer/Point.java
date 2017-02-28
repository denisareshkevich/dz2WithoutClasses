package PPointer;

public class Point {
    private int x;
    private  int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }
    public double distance (Point otherpoint) {
       return Math.sqrt(Math.pow((otherpoint.getX() - getX()  ),2) + Math.pow((otherpoint.getY() - getY() ),2));
    }
}
