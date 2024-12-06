import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new FullTimeEmployee("Huy",5));
        employeeList.add(new FullTimeEmployee("Dong",6));
        employeeList.add(new FullTimeEmployee("Hai",19));
        employeeList.add(new FullTimeEmployee("Quynh",3));
        employeeList.add(new FullTimeEmployee("Dat",18));
        employeeList.add(new PartTimeEmployee("Thinh",6,51));
        employeeList.add(new PartTimeEmployee("Cong",9,58));
        employeeList.add(new PartTimeEmployee("Khai",16,99));
        employeeList.add(new PartTimeEmployee("Dang",8,56));
        employeeList.add(new PartTimeEmployee("Bao",92,45));
        for (int i=0;i<employeeList.size()-1;i++){
            for(int j=employeeList.size()-1;j>i;j--){
                if(employeeList.get(j).calculateSalary()<employeeList.get(j-1).calculateSalary()){
                    Employee temp = employeeList.get(j);
                    employeeList.set(j,employeeList.get(j-1));
                    employeeList.set(j-1,temp);
                }
            }
        }
        System.out.println("Danh sach sau khi sap xep");
        for (Employee employee1:employeeList){
            System.out.println(employee1.toString());
        }
        System.out.print("Nhap ten ma ban muon tim kiem: ");
        String name = scanner.nextLine();
        for (Employee employee2:employeeList){
            if(employee2.getName().equals(name)){
                if()
            }
        }

    }
}