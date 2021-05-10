package preseverancePath;

public class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point getUpperPoint() {
        return new Point(x-1, y);
    }

    public Point getLowerPoint() {
        return new Point(x+1, y);
    }

    public Point getLeftPoint() {
        return new Point(x, y-1);
    }

    public Point getRightPoint() {
        return new Point(x, y+1);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;

        return result;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Point)) {
            return false;
        }

        Point point = (Point) o;

        return point.x == x &&
                point.y == y;
    }
}
