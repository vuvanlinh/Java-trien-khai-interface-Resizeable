public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(5);
        squares[1] = new Square();
        squares[2] = new Square(10, "indigo", false);

        System.out.println("Pre-Resize: ");
        for (Square Square : squares) {
            System.out.println(Square);
        }

        for (Square Square : squares) {
            Square.resize(Math.floor(Math.random() * 100));
        }
        System.out.println("After-Resized: ");
        for (Square Square : squares) {
            System.out.println(Square);
        }
    }
}
