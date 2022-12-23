public class Main {
    public static void main(String[] args) {

        CustomererManager customererManager =new CustomererManager();
        EmployeeManager employeeManager=new EmployeeManager();

        customererManager.Add();
        employeeManager.List();

    }
}