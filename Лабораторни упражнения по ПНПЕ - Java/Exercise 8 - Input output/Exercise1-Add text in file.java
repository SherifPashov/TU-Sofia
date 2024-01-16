import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Exercise1 {

	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);

	        // Име на файла
	        String fileName = "test.txt";

	        // Въвеждане на текст от потребителя
	        System.out.println("Enter text:");
	        
	        String inputText = scanner.nextLine();

	        // Създаване на файлов поток и запис на текста
	        try
	        {
	        	FileWriter fileWriter = new FileWriter(fileName);
	        	
	            fileWriter.write(inputText);
	            
	            fileWriter.close();
	            
	            System.out.println("File saved.");
	        } 
	        catch (IOException e) 
	        {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
		
}


