public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(0, 0, 4, 3);
        System.out.println(line1);

        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());

        line1.setBeginXY(1, 1);
        line1.setEndXY(5, 5);
        System.out.println("Updated line: " + line1);

        int[] beginXY = line1.getBeginXY();
        int[] endXY = line1.getEndXY();

        System.out.println("Beginning point: (" + beginXY[0] + "," + beginXY[1] + ")");
        System.out.println("End point: (" + endXY[0] + "," + endXY[1] + ")");
    }
}
