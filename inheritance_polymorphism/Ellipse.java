package inheritance_polymorphism;

public  class Ellipse extends Point implements ArcedFigure,ClosedFigure {

    private int radius;

    public Ellipse(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }


    public int getRadius() {
        return radius;
    }

    @Override
    public double countSquare() {
        System.out.println("Я не знаю как посчитать пощитать площадь эллипса");
        return -1 ;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "radius=" + radius +
                '}';
    }
}
