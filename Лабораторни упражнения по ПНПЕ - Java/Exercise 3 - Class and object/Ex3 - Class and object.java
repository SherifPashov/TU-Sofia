package test;
import java.util.Random;
class Ex3 {
     public static void main(String[] args) {
        Student student = new Student("Student 1" , 10000);
        student.printInfo();

        // Създаване на обект от клас без конструктор
        MyClassWithoutConstructor obj1 = new MyClassWithoutConstructor();

        // Създаване на обект от клас с конструктор по подразбиране
        ClassWithConstructor obj2 = new ClassWithConstructor();

        // Създаване на обект от клас с overloaded constructor
        ClassWithConstructor obj3 = new ClassWithConstructor("Hello, World!");
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
            System.out.println("Exam " + (i+1) + ": "+ grades[i]+"; ");
        }
    }
}

// Клас без конструктор
class MyClassWithoutConstructor {
    // Полета и методи могат да бъдат добавени според нуждите
}

// Клас с конструктор по подразбиране и overloaded constructor
class ClassWithConstructor {
    public ClassWithConstructor() {
        System.out.println("Конструктор по подразбиране.");
    }

    public ClassWithConstructor(String message) {
        System.out.println("Конструктор със съобщение: " + message);
    }
}




