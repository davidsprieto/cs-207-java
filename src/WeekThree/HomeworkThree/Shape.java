package WeekThree.HomeworkThree;

public class Shape {
    private boolean isFilled;
    private String color;

    public Shape() {
        this.isFilled = true;
        this.color = "Green";
    }

    public Shape(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Filled: " + this.isFilled + "\n" + "Color: " + this.color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        this.isFilled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
