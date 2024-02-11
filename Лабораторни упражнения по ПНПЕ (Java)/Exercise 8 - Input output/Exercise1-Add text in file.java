import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Exercise1 {

	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);

	        // име на файла 
	        String fileName = "test.txt";

	        System.out.println("Enter text:");
	        
	        String inputText = scanner.nextLine();

	        try
	        {
				//Отваряне на фйла 
	        	FileWriter fileWriter = new FileWriter(fileName);
	        	
				//Запис на файла
	            fileWriter.write(inputText);
	            
				//Затваряне на файла
	            fileWriter.close();
	            
	            System.out.println("File saved.");
	        } 
	        catch (IOException e) 
	        {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
		
}


