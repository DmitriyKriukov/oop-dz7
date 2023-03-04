import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UserInterfaceView {
    private Controller controller = new Controller();

    public void runInterface() {
        try {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\nВыберите пункт меню: \n1 - добавить сотрудника \n2 - удалить сотрудника \n" +
                        "3 - изменить данные сотрудника \n4 - показать список сотрудников \n0 - выход.");
                String request = scanner.nextLine();
                if (request.equals("1")) {
                    System.out.println("Введите имя сотрудника: ");
                    String firstName = scanner.nextLine();
                    System.out.println("Введите фамилию сотрудника: ");
                    String lastName = scanner.nextLine();
                    System.out.println("Введите должность сотрудника: ");
                    String position = scanner.nextLine();
                    System.out.println("Введите возраст сотрудника: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    controller.addEmployee(firstName, lastName, position, age);
                } else if (request.equals("2")) {
                    System.out.println("Введите id сотрудника: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    controller.removeEmployee(id);
                } else if (request.equals("3")) {
                    System.out.println("Введите id : ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("\nВыберите параметр: \n1 - имя \n2 - фамилия \n" +
                            "3 - должность \n4 - возраст.");
                    String request2 = scanner.nextLine();
                    if (request2.equals("1")) {
                        System.out.println("Введите имя : ");
                        String firstName = scanner.nextLine();
                        controller.changeEmployeeFirstName(id, firstName);
                    } else if (request2.equals("2")) {
                        System.out.println("Введите фамилию : ");
                        String lastName = scanner.nextLine();
                        controller.changeEmployeeLastName(id, lastName);
                    } else if (request2.equals("3")) {
                        System.out.println("Введите должность : ");
                        String position = scanner.nextLine();
                        controller.changeEmployeePosition(id, position);
                    } else if (request2.equals("4")) {
                        System.out.println("Введите возраст : ");
                        int age = Integer.parseInt(scanner.nextLine());
                        controller.changeEmployeeAge(id, age);
                    }
                } else if (request.equals("4")) {
                    controller.showEmployee();
                } else if (request.equals("0"))
                    break;

            }
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

    }
}


