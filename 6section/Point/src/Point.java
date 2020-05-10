import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return sqrt(pow(getX(), 2) + pow(getY(), 2));
    }
    public double distance(int x, int y) {
        return sqrt(pow(getX() - x, 2) + pow(getY() - y, 2));
    }

    public double distance(Point point) {
        return sqrt(pow(getX() - point.getX(), 2) + pow(getY() - point.getY(), 2));
    }


}
