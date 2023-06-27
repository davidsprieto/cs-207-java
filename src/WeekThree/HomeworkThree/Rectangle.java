package WeekThree.HomeworkThree;

public class Rectangle extends Shape {
    private Double width;
    private Double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 2.0;
    }

    public Rectangle(Double width, Double length) {
        this.setLW(width, length);
    }

    public Rectangle(Double width, Double length, boolean isFilled, String color) {
        super(isFilled, color);
        this.setLW(width, length);
    }

    public void setLW(Double x, Double y) {
        this.width = Math.min(x, y);
        this.length = Math.max(x, y);
    }

    public Double getArea() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "Width: " + this.width + "\n" + "Length: " + this.length + "\n" + "Area: " + this.getArea() + "\n" + super.toString();
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
}
