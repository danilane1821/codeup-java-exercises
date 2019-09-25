package shapes;
import util.Input;

public class Circle {
    private double radius;

    public static void main(String[] args) {

    }

    public Circle (double InputRadius) {
//        Input userInput = new Input();

    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }
    public double getCircumference(){
    return 2 * Math.PI * radius;
    }

}
