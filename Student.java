import java.time.LocalDate;
public class Student {
    String id;
    String name;
    String email;
    String password;
    LocalDate enrollmentDate;
    String status;

    public static int totalStudents = 0;

    public Student(String id, String name, String email, String password, LocalDate enrollmentDate, String status) {
        this.id = id;
        this.name = name;
        setEmail(email);
        this.password = password;
        this.enrollmentDate = enrollmentDate;
        this.status = status;
        totalStudents++;
    }

    public Student(String id, String name) {
        this(id, name, "noemail@example.com", "defaultpass", LocalDate.now(), "active");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            this.email = "invalid@example.com";
        }
    }

    public void setPassword(String password) {
        if (password != null && password.length() >= 6) {
            this.password = password;
        } else {
            this.password = "defaultpass";
        }
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
    public void displayInfo() {
        System.out.println("Student ID     : " + id);
        System.out.println("Name           : " + name);
        System.out.println("Email          : " + email);
        System.out.println("Enrollment Date: " + enrollmentDate);
        System.out.println("Status         : " + status);
    }
    public static void main(String[] args) {
        Student s1 = new Student("ST001", "Sokha", "sokha@example.com", "pass123", LocalDate.of(2024, 9, 1), "active");
        Student s2 = new Student("ST002", "Rithy");
        s1.displayInfo();
        System.out.println("--------------------");
        s2.displayInfo();
        System.out.println("Total Students: " + Student.getTotalStudents());
    }
}
