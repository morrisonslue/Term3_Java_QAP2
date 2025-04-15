public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle r1 = new MyRectangle(1, 5, 4, 1);

        // print rectangle
        System.out.println(r1);
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Height: " + r1.getHeight());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        // change points then retest
        r1.setTopLeft(new MyPoint(0, 10));
        r1.setBottomRight(new MyPoint(5, 0));

        // print new rectangle
        System.out.println("New rectangle: " + r1);
        System.out.println("New area: " + r1.getArea());
    }
}
