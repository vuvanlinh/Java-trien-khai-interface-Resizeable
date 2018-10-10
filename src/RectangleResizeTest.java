public class RectangleResizeTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(5,6);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(3,4);

        System.out.println("Pre-Resize: ");
        for (Rectangle Rectangle : rectangles) {
            System.out.println(Rectangle);
        }

        for (Rectangle Rectangle : rectangles) {
            Rectangle.resize(Math.floor(Math.random() * 100));
        }
        System.out.println("After-Resized: ");
        for (Rectangle Rectangle : rectangles) {
            System.out.println(Rectangle);
        }
    }
}
