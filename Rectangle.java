public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(final double length, final double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(final double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(final double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
