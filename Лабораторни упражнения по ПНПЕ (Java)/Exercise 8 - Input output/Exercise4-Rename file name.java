import java.io.File;
	import java.util.Scanner;
public class Exercise4 {

	

	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        // Въвеждане на текущото име на файла 
	        System.out.println("Enter the current file name:");
	        String currentFileName = scanner.nextLine();

	        // Проверка да ли съществува файла
	        File currentFile = new File(currentFileName);
	        
	        if (!currentFile.exists()) 
	        {
	            System.out.println("File does not exist.");
	            
	            return;
	        }

	        // Ново име на файла
	        System.out.println("Enter the new file name:");
	        String newFileName = scanner.nextLine();
	        

	        // Проверка за съществуване на файла с новото име
	        File newFile = new File(newFileName);
	        
	        if (newFile.exists()) 
	        {
	            System.out.println("A file with the new name already exists.");
	            return;
	        }

	        // Преименуване на файла
	        if (currentFile.renameTo(newFile)) 
	        {
	        	
	            System.out.println("File renamed successfully.");
	            
	        } else 
	        {
	        	
	            System.out.println("Error renaming file.");
	        }
	    }
	}


