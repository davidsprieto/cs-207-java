package WeekFour.WorkshopFour;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object other) {
        boolean equals = false;

        if (other == null) {
            return false;
        } else if (this.getClass() != other.getClass()) {
            return false;
        } else {
            Person p = (Person) other;
            equals = this.getName().equals(p.getName());
        }
        return equals;
    }
}
