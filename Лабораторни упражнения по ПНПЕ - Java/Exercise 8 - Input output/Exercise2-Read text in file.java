import java.io.FileReader;
		import java.io.BufferedReader;
		import java.io.IOException;
		import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на име на файла от потребителя
        System.out.println("Enter file name:");
        String fileName = scanner.nextLine();

        // Създаване на файлов поток за четене
        try 
        {
        	
            FileReader fileReader = new FileReader(fileName);
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            // Четене на текст от файла
            StringBuilder fileContent = new StringBuilder();
            String line;
            
            while ((line = bufferedReader.readLine()) != null) 
            {
                fileContent.append(line).append("\n");
            }

            // Извеждане на прочетения текст на конзолата
            System.out.println("File content:\n" + fileContent.toString());
        } 
        catch (IOException e) 
        {
            // Информиране при грешка
            System.out.println("Error: " + e.getMessage());
	    }
}
	


}


