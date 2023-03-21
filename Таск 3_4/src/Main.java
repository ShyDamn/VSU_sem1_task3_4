import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final Rectangle L = new Rectangle(0, 1, 3, -6 );
    public static final Rectangle P = new Rectangle(-2, 4, 0, -4);
    public static final Rectangle Z = new Rectangle(-6, 0, -2, -2);
    public static final Circle C = new Circle(4, 5, 3);
    public static final Circle M = new Circle(-3, 6, 5);

    public static SimpleColor getColor(double x, double y) {
        if (C.isPointInCircle(x, y) && (L.isPointAboveRectangle(x, y)) {
            return SimpleColor.YELLOW;
        }
        if (C.isPointInCircle(x, y))  {
            return SimpleColor.BLUE;
        }
        if (P.isPointBelowOfParabola(x, y)) {
            return SimpleColor.BLUE;
        }
        if (!L.isPointAboveLine(x, y) && x > 2) {
            return SimpleColor.BLUE;
        }
        if (!L.isPointAboveLine(x, y)) {
            return SimpleColor.GREY;
        }
        return SimpleColor.ORANGE;
    }


    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.3f, %.3f) -> %s%n", x, y, getColor(x, y));

    }

    public static void tests() {
        printColorForPoint(3, 2);
        printColorForPoint(0, 5);
        printColorForPoint(-8, -3);
        printColorForPoint(3, -3);

    }


    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        tests();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input x, y:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        printColorForPoint(x, y);
    }
}


