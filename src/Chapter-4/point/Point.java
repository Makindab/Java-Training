public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
    public Point translate(double dx, double dy) {
        dx += this.x;
        dy += this.y;

        return new Point(dx, dy);
    }
}