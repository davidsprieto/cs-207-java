package WeekOne.HomeworkOne;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int xVal, int yVal) {
        this.x = xVal;
        this.y = yVal;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPoint(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public String toString() {
        String x = String.valueOf(this.x);
        String y = String.valueOf(this.y);
        return "(" + x + ", " + y + ")";
    }

    public double distance(Point point) {
        return Math.sqrt((Math.pow(this.x - point.x, 2)) + Math.pow(this.y - point.y, 2));
    }

    // Testing Point Class:
    public static void main(String[] args) {
        Point pointOne = new Point();
        Point pointTwo = new Point(3, 4);
        double distanceOne = pointOne.distance(pointTwo);

        System.out.println("The distance from " + pointOne.toString() + " to " + pointTwo.toString() + " is: " + distanceOne + "\n");

        pointOne.setPoint(1, 4);
        pointTwo.setPoint(2, 3);
        double distanceTwo = pointOne.distance(pointTwo);

        System.out.println("P1 new coordinates are: \n" + "x = " + pointOne.getX() + "\n" + "y = " + pointOne.getY());
        System.out.println("P2 new coordinates are: \n" + "x = " + pointTwo.getX() + "\n" + "y = " + pointTwo.getY() + "\n");

        System.out.println("The distance from " + pointOne.toString() + " to " + pointTwo.toString() + " is: " + distanceTwo + "\n");
    }
}
