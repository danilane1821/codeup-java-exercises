package shapes;

public class Square extends Quadrilateral{
    @Override
    public void setwidth(double num) {

    }

    @Override
    public void setLength(double num) {

    }

    @Override
    public double getArea() {
        return Math.pow(super.length,2);
    }

    @Override
    public double getPerimeter() {
       return 4 * super.length;
    }

    public Square(double side) {
        super(side,side);
    }

    //    public Square (double side) {
//        super(side,side);
//    }
//
//    @Override
//    public double getArea() {
//        return Math.pow(super.length,2);
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 4 * super.length;
//    }
}
