package WeekTwo.WorkshopTwo;

public class Automobile {
    private String make;
    private String model;
    private boolean power = false;
    private char gear = 'P';
    private int volume = 6;

    public Automobile(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public boolean isPower() {
        return power;
    }

    public char getGear() {
        return gear;
    }

    public void setGear(char gear) {
        this.gear = gear;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (this.volume < 29) {
            this.volume += 2;
        } else {
            this.volume = 30;
        }
    }

    public void decreaseVolume() {
        if (this.volume > 1) {
            this.volume -= 2;
        } else {
            this.volume = 0;
        }
    }

    public void setPower() {
        this.power = !this.power;
    }
}
