package inheritance_polymorphism;

public class ShapeUtils {
    private void figureDefine(Figure2D figure2D){
    if (figure2D instanceof Rectangle){
        System.out.println("Это прямоугольник");
    }
    else if (figure2D instanceof Triangle){
        System.out.println("Это треугольник");
    }
    }
}

