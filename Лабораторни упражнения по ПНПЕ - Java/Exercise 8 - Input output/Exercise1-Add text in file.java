import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Exercise1 {

	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);

	        // ��� �� �����
	        String fileName = "test.txt";

	        // ��������� �� ����� �� �����������
	        System.out.println("Enter text:");
	        
	        String inputText = scanner.nextLine();

	        // ��������� �� ������ ����� � ����� �� ������
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


