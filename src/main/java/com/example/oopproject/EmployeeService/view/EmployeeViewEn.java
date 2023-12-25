import com.example.oopproject.EmployeeService.controller.EmployeeController;
import com.example.oopproject.EmployeeService.model.Employee;

import java.util.Scanner;

public class EmployeeView {
    protected EmployeeController employeeController;
    protected Employee employee;
    private Scanner scanner;

    public EmployeeView(EmployeeController employeeController, Employee employee, Scanner scanner) {
        this.employeeController = employeeController;
        this.employee = employee;
        this.scanner = scanner;
    }

    public EmployeeView() {
        this.scanner = new Scanner(System.in);
    }

    public void getView() {
        System.out.println("Welcome to system\n1. See messages\n2. See all messages\n3. Send Messages");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                seeMessages();
                break;
            case 2:
                seeUnreadMessages();
                break;
            case 3:
                sendMessage();
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    public void sendMessage() {
        scanner.nextLine(); 

        System.out.print("Enter your message: ");
        String messageText = scanner.nextLine();

      
        employeeController.sendMessage(employee, messageText);
        System.out.println("Message sent!");
    }

    public void seeMessages() {
        for (Message message : employeeController.getUnreadMessages(employee)) {
            System.out.println(message);
        }
    }

    public void seeUnreadMessages() {
        for (Message message : employeeController.getAllMessages(employee)) {
            System.out.println(message);
        }
    }
}
