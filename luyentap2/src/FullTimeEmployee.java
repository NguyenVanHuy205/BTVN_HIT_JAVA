public class FullTimeEmployee extends Employee{
    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return 8*paymentPerHour;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "name='" + name + '\'' +
                ", paymentPerHour='" + paymentPerHour + '\'' +
                ", calculateSalary=" + calculateSalary() +
                '}';
    }
}
