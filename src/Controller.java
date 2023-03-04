import model.Company;

public class Controller {
    private Company company = new Company();

    public void addEmployee(String firstName, String lastName, String position, int age){
        company.addEmployee(firstName, lastName, position, age);
    }

    public void removeEmployee(int id){
        company.removeEmployee(id);
    }

    public void changeEmployeeFirstName(int id, String firstName){
        company.changeEmployeeFirstName(id, firstName);
    }

    public void changeEmployeeLastName(int id, String lastName){
        company.changeEmployeeLastName(id, lastName);
    }

    public void changeEmployeePosition(int id, String position){
        company.changeEmployeePosition(id, position);
    }

    public void changeEmployeeAge(int id, int age){
        company.changeEmployeeAge(id, age);
    }

    public void showEmployee(){
        company.showEmployeeList();
    }
}
