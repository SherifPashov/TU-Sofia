import java.util.Objects;
public class Exercise1 {
	public static void main(String[] args) {
       
        // 1-2 Person Test
            Person person1 = new Person("Alice", "Smith", 1990);
            System.out.println(person1.getName() + " " + person1.getLastName() + ", " + person1.getYearOfBirth());
       
            Person person2 = new Person("Bob", "Johnson");
            System.out.println(person2.getName() + " " + person2.getLastName() + ", " + person2.getYearOfBirth());
        
            Person person3 = new Person("Charlie");
            System.out.println(person3.getName() + " " + person3.getLastName() + ", " + person3.getYearOfBirth());
       
            Person person4 = new Person();
            System.out.println(person4.getName() + " " + person4.getLastName() + ", " + person4.getYearOfBirth());
        
            //Person invalidNamePerson = new Person(null, "Doe", 1990);
       
            //Person invalidLastNamePerson = new Person("John", "Doe1", 1990);
       
            //Person invalidYearOfBirthPerson = new Person("John", "Doe", -1990);
        // 3-4 Student Test
            
         // Тестове за създаване на обекти от класа Student
            Student student1 = new Student("Alice", "Smith", 1990, 123456789L);
            System.out.println(student1);

            Student student2 = new Student("Bob", "Johnson", 1995);
            System.out.println(student2);

            // Опит за създаване на студент с невалиден факултетен номер
            //Student invalidStudent = new Student("Charlie", "Brown", 1985, -123456789L);
	       
	    }
	

	public static class Person {
	    private static final String DEFAULT_NAME = "John";
	    private static final String DEFAULT_LAST_NAME = "Doe";
	    private static final int DEFAULT_YEAR_OF_BIRTH = 1970;

	    private String name;
	    private String lastName;
	    private int yearOfBirth;

	    // Конструктори
	    public Person() {
	    	setName(DEFAULT_NAME);
	        setLastName(DEFAULT_LAST_NAME);
	        setYearOfBirth(DEFAULT_YEAR_OF_BIRTH);
	    }

	    public Person(String name) {
	    	setName(name);
	    	setLastName(DEFAULT_LAST_NAME);
	        setYearOfBirth(DEFAULT_YEAR_OF_BIRTH);
	    }

	    public Person(String name, String lastName) {
	    	setName(name);
	        setLastName(lastName);
	        setYearOfBirth(DEFAULT_YEAR_OF_BIRTH);
	    }

	    public Person(String name, String lastName, int yearOfBirth) {
	        setName(name);
	        setLastName(lastName);
	        setYearOfBirth(yearOfBirth);
	    }

	    // Методи за четене и запис
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        if (isValidName(name)) {
	            this.name = name;
	        } else {
	            throw new IllegalArgumentException("Invalid name");
	        }
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        if (isValidName(lastName)) {
	            this.lastName = lastName;
	        } else {
	            throw new IllegalArgumentException("Invalid last name");
	        }
	    }

	    public int getYearOfBirth() {
	        return yearOfBirth;
	    }

	    public void setYearOfBirth(int yearOfBirth) {
	        if (isValidYearOfBirth(yearOfBirth)) {
	            this.yearOfBirth = yearOfBirth;
	        } else {
	            throw new IllegalArgumentException("Invalid year of birth");
	        }
	    }

	    // Помощни методи за валидация
	    private boolean isValidName(String value) {
	        return value != null && !value.trim().isEmpty() && value.matches("^[a-zA-Z]+$");
	    }

	    private boolean isValidYearOfBirth(int value) {
	        return value >= 0;
	    }
	}

	public static class Student extends Person {
	    private static final long MIN_FACULTY_NUMBER = 100000000L;
	    private static final long MAX_FACULTY_NUMBER = 999999999L;

	    private long facultyNumber;

	    // Конструктори
	    public Student(String name, String lastName, int yearOfBirth, long facultyNumber) {
	        super(name, lastName, yearOfBirth);
	        setFacultyNumber(facultyNumber);
	    }

	    public Student(String name, String lastName, int yearOfBirth) {
	        this(name, lastName, yearOfBirth, MAX_FACULTY_NUMBER);
	    }

	    // Метод за четене
	    public long getFacultyNumber() {
	        return facultyNumber;
	    }

	    // Метод за запис
	    public void setFacultyNumber(long facultyNumber) {
	        if (isValidFacultyNumber(facultyNumber)) {
	            this.facultyNumber = facultyNumber;
	        } else {
	            throw new IllegalArgumentException("Invalid faculty number");
	        }
	    }

	    // Помощен метод за валидация
	    private boolean isValidFacultyNumber(long value) {
	        return value >= MIN_FACULTY_NUMBER && value <= MAX_FACULTY_NUMBER;
	    }

	    // Пренаписване на метода toString за форматиране на информацията
	    //Override
	    public String toString() {
	        return "Name"+super.name+", LastName: "+super.lastName+", YearOfBirth: "+super.yearOfBirth+", Faculty Number: " + facultyNumber;
	    }
	}  
	    
}
	

	



