import java.io.File;
	import java.util.Scanner;
public class Exercise5 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане името на файла за изтриване
        System.out.println("Enter the file name to delete:");
        
        String fileNameToDelete = scanner.nextLine();

        // Проверка за съществуване на файла
        File fileToDelete = new File(fileNameToDelete);
        
        if (!fileToDelete.exists()) 
        {
            System.out.println("File does not exist.");
            return;
        }

        // Изтриване на файла
        if (fileToDelete.delete()) 
        {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Error deleting file.");
        }
        
    }
	


}
