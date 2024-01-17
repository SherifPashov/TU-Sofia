import java.io.FileReader;
		import java.io.BufferedReader;
		import java.io.IOException;
		import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter file name:");
        String fileName = scanner.nextLine();

        
        try 
        {
        	//Четене на файла
            FileReader fileReader = new FileReader(fileName);
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            //Създаване на StringBuilder
            StringBuilder fileContent = new StringBuilder();
            String line;
            
            while ((line = bufferedReader.readLine()) != null) 
            {
                fileContent.append(line).append("\n");
            }

            //Принтиране на прочетения файл
            System.out.println("File content:\n" + fileContent.toString());
        } 
        catch (IOException e) 
        {
            // Принтиране на грешката
            System.out.println("Error: " + e.getMessage());
	    }
}
	


}


