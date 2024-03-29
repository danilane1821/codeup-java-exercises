package shapes;

public class ShapesTest {
    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(5,4);
//        Rectangle box2 = new Square(5);
//        Square box3 = new Square(4);
////        Square box4 = new Rectangle(2,1.0); // square cant be made into a rectangle because rectangle
////        // is the parent because its implied its already a rectangle.
//
//        //testing for rectangle
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        //testing for square
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
//
//        System.out.println(box3.getArea());
//        System.out.println(box3.getPerimeter());



        Measurable myShape;

        myShape = new Rectangle(5,4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());



        //Re-run your ShapesTest class. How can you determine which getArea and
        // getPerimeter methods are being called on each object?

        //It depends on what the data type is being declared as when you define a  new object.

    }
}
