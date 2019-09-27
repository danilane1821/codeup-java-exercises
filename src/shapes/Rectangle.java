package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    @Override
    public void setLength(double length) {
        super.length = length;
    }

    @Override
    public void setwidth(double width){
        super.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * super.length) + (2 * super.width);
    }

    @Override
    public double getArea() {
        return super.length * super.width;
    }

    public Rectangle(double length, double width) {
        super(length,width);
    }


    //    protected double length;
//    protected double width;
//
//    public Rectangle (double len, double wid) {
//
//        this.length = len;
//        this.width = wid;
//
//    }
//
//
//    public double getArea () {
//        return length * width;
//    }
//
//    public double getPerimeter (){
//        return (2 * this.length) + (2 * this.width);
//    }

    // we dont use these here but might later for other things
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
}
