import java.io.File;
	import java.util.Scanner;
public class Exercise4 {

	

	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        // ��������� �� ����� �� �����, ����� �� �� ����������
	        System.out.println("Enter the current file name:");
	        String currentFileName = scanner.nextLine();

	        // �������� �� ������������ �� �����
	        File currentFile = new File(currentFileName);
	        
	        if (!currentFile.exists()) 
	        {
	            System.out.println("File does not exist.");
	            
	            return;
	        }

	        // ��������� �� ������ ��� �� �����
	        System.out.println("Enter the new file name:");
	        String newFileName = scanner.nextLine();
	        

	        // �������� �� ������������ �� ����� � ������ ���
	        File newFile = new File(newFileName);
	        
	        if (newFile.exists()) 
	        {
	            System.out.println("A file with the new name already exists.");
	            return;
	        }

	        // ������������ �� �����
	        if (currentFile.renameTo(newFile)) 
	        {
	        	
	            System.out.println("File renamed successfully.");
	            
	        } else 
	        {
	        	
	            System.out.println("Error renaming file.");
	        }
	    }
	}


