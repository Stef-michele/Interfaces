import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(1, 2));  // Perimeter 6
        rectangles.add(new Rectangle(3, 4));  // Perimeter 14
        rectangles.add(new Rectangle(5, 1));  // Perimeter 12
        rectangles.add(new Rectangle(2, 2));  // Perimeter 8
        rectangles.add(new Rectangle(6, 3));  // Perimeter 18
        rectangles.add(new Rectangle(1, 1));  // Perimeter 4
        rectangles.add(new Rectangle(4, 3));  // Perimeter 14
        rectangles.add(new Rectangle(0, 6));  // Perimeter 12
        rectangles.add(new Rectangle(2, 5));  // Perimeter 14
        rectangles.add(new Rectangle(1, 4));  // Perimeter 10

        Filter filter = new BigRectangleFilter();

        System.out.println("Rectangles with a perimeter > 10");
        for (Rectangle rect : rectangles) {
            if (filter.accept(rect)) {
                System.out.println("Rectangle [width=" + rect.width + ", height=" + rect.height + ", perimeter=" + (2 * (rect.width + rect.height)) + "]");
            }
        }

    }
}
