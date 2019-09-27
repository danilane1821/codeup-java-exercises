package shapes;

public class Square extends Quadrilateral{
    @Override
    public void setwidth(double width) {
        super.width = width;
        super.length = width;
    }

    @Override
    public void setLength(double length) {
        super.length = length;
        super.width = length;
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
