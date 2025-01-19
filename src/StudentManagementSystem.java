import java.util.ArrayList;

public class StudentManagementSystem {
   private ArrayList<Student> students;
   private int currentId;

   public StudentManagementSystem() {
       students = new ArrayList<>();
       currentId = 1;
   }

   public void addStudent(String name, String email) {
       Student newStudent = new Student(currentId++, name, email);
       students.add(newStudent);
       System.out.println("Student added: " + newStudent);
   }

   public void listStudents() {
       if(students.isEmpty()) {
           System.out.println("There are no students");
       }else{
           for (Student student : students) {
               System.out.println(student);
           }
       }
   }

   public void updateStudent(int id, String name, String email) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setEmail(email);
                System.out.println("Student updated: " + student);
                return;
            }
        }
        System.out.println("Student not found");
   }

   public void deleteStudent(int id) {
       for (Student student : students) {
           if (student.getId() == id) {
               students.remove(student);
               System.out.println("Student removed: " + student);
               return;
           }
       }
       System.out.println("Student not found");
   }
}
