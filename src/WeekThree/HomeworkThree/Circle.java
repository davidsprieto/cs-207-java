package WeekThree.HomeworkThree;

public class Circle extends Shape {
    private Double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(Double radius, boolean isFilled, String color) {
        super(isFilled, color);
        this.radius = radius;
    }

    public Double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Radius: " + this.radius + "\n" + "Area: " + this.getArea() + "\n" + super.toString();
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
