public class Rectangle {
    public double x0;
    public double y0;
    public double x1;
    public double y1;

    public Rectangle(double x0, double y0, double x1, double y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }

    public boolean isPointInsideRectangle(double x, double y) {
        if ((x > x0) && (x < x1)) {
            if ((y < y1) && (y > y0)) {
                return true;
            }
        }
        return false;
    }
}