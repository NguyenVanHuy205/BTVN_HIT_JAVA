public class PartTimeEmployee extends Employee{
    private int workingHours;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return workingHours*paymentPerHour;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "name='" + name + '\'' +
                ", paymentPerHour='" + paymentPerHour + '\'' +
                ", workingHours='" + workingHours + '\'' +
                ", calculateSalary=" + calculateSalary() +
                '}';
    }
}
