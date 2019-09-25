package shapes;
import util.Input;

public class Circle {
    private double radius;
//IF YOU HAVE PRIVATE VALUES OR SOME THINGS NEED TO BE CONSISTENT OR DEPENDANT ON YOU WILL NEED TO INITIALIZE THEM WITH THE CONSTRUCTOR

    public Circle (double radius) {
        this.radius = radius;

    }

    public double getArea() {
        return Math.PI * (Math.pow(this.radius, 2));
    }
    public double getCircumference(){
    return 2 * Math.PI * this.radius;
    }

}
