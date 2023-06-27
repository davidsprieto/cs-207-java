package WeekOne.HomeworkOne;

public class Clothing {

    public Double price;
    public String type;
    public String size;


    public Clothing() {
        this.price = 29.9;
        this.type = "T-Shirt";
        this.size = "Medium";
    }

    public Clothing(Double price, String type, String size) {
        this.price = price;
        this.type = type;
        this.size = size;
    }

    public void increasePrice() {
        this.price += 5.0;
    }

    public void increasePrice(Double x) {
        this.price += x;
    }

    public void details() {
        System.out.println("Item: " + this.type);
        System.out.println("Size: " + this.size);
        System.out.println("Price: $" + this.price);
        System.out.print("\n");
    }

    // Testing Clothing Class:
    public static void main(String[] args) {
        Clothing clothingOne = new Clothing();
        clothingOne.details();

        clothingOne.increasePrice();
        clothingOne.details();

        clothingOne.increasePrice(7.0);
        clothingOne.details();

        Clothing clothingTwo = new Clothing(31.2, "Jeans", "Small");
        clothingTwo.details();

        clothingTwo.increasePrice(10.0);
        clothingTwo.details();

        clothingTwo.increasePrice(4.0);
        clothingTwo.details();
    }

}
