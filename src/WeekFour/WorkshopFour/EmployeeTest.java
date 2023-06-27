package WeekFour.WorkshopFour;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee fredEmployee = new Employee("Fred", "RR 205", "$38.50");
        System.out.println(fredEmployee.toString());
        System.out.println(fredEmployee.paycheck(20));

        Person fredPerson = new Person("Fred");
        System.out.println(fredEmployee.equals(fredPerson));
    }

}
