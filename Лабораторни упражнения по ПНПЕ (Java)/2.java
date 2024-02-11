import java.util.Random;
class HelloWorld {
     public static void main(String[] args) {
        Student student = new Student("Student 1" , 10000);
        student.printInfo();
    }
}
 
class Student {
    String name;
    int facultyNumber;
    double[] grades = new double[10];
 
    public Student(String name, int facultyNumber) {
        this.name = name;
        this.facultyNumber = facultyNumber;
        Random random = new Random();
        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(5) + 2;
        }
    }
 
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Faculty Number : " + facultyNumber);
        System.out.println("Grades : ");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Exam " + (i+1) + ": "+ grades[i]+"; ");
        }
    }
}