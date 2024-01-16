import java.io.File;
	import java.util.Scanner;
public class Exercise5 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // ��������� �� ����� �� �����, ����� �� �� ������
        System.out.println("Enter the file name to delete:");
        
        String fileNameToDelete = scanner.nextLine();

        // �������� �� ������������ �� �����
        File fileToDelete = new File(fileNameToDelete);
        
        if (!fileToDelete.exists()) 
        {
            System.out.println("File does not exist.");
            return;
        }

        // ��������� �� �����
        if (fileToDelete.delete()) 
        {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Error deleting file.");
        }
        
    }
	


}
