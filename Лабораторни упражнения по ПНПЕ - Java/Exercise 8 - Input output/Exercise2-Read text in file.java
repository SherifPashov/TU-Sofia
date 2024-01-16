import java.io.FileReader;
		import java.io.BufferedReader;
		import java.io.IOException;
		import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        // ��������� �� ��� �� ����� �� �����������
        System.out.println("Enter file name:");
        String fileName = scanner.nextLine();

        // ��������� �� ������ ����� �� ������
        try 
        {
        	
            FileReader fileReader = new FileReader(fileName);
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            // ������ �� ����� �� �����
            StringBuilder fileContent = new StringBuilder();
            String line;
            
            while ((line = bufferedReader.readLine()) != null) 
            {
                fileContent.append(line).append("\n");
            }

            // ��������� �� ���������� ����� �� ���������
            System.out.println("File content:\n" + fileContent.toString());
        } 
        catch (IOException e) 
        {
            // ����������� ��� ������
            System.out.println("Error: " + e.getMessage());
	    }
}
	


}


