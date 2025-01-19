import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            boolean isExit = false;

            switch (choice) {
                case 1:
                    System.out.print("Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Student Email: ");
                    String email = scanner.nextLine();
                    studentManagementSystem.addStudent(name, email);
                    break;
                case 2:
                    studentManagementSystem. listStudents();
                    break;
                case 3:
                    System.out.print("To be Updated Student ID: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Student New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Student New Email: ");
                    String newEmail = scanner.nextLine();
                    studentManagementSystem.updateStudent(updateId, newName, newEmail);
                    break;
                case 4:
                    System.out.print("To be Deleted Student ID: ");
                    int deleteId = scanner.nextInt();
                    studentManagementSystem.deleteStudent(deleteId);
                    break;

                case 5:
                    System.out.println("Exit Program");
                    boolean isExited = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }

            if (isExit) {
                break;
            }
        }
    }
}