package WeekFour.WorkshopFour;

public class Employee extends Person{
    private String office;
    private String hourlyWage;

    public Employee(String name, String office, String hourlyWage) {
        super(name);
        this.office = office;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.hourlyWage;
    }

    public double paycheck(int hours) {
        int indexOfDollarSign = this.hourlyWage.indexOf('$');
        this.hourlyWage = this.hourlyWage.substring(indexOfDollarSign + 1);
        double hourlyWage = Double.parseDouble(this.hourlyWage);
        return hours * hourlyWage;
    }
}
