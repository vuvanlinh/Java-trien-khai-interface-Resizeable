public class SquareResizeTest {
    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println("Pre-Resize: ");
        System.out.println(square);
        square.resize(100);
        System.out.println("After-Resized: ");
        System.out.println(square);
    }
}
