import java.io.File;

public class Exercise3 {
    public static void main(String[] args) {
        // ���������� �� �������� ����������
        String currentDirectory = System.getProperty("user.dir");

        // ��������� �� ������ �� ������������ �� ������������ �� ������������
        printDirectoryContents(currentDirectory);
    }

    // ����� �� ������������ �� ������������ �� ����������
    private static void printDirectoryContents(String path) {
        File directory = new File(path);

        // �������� ���� ������� ��� � ����������
        if (directory.isDirectory()) 
        {
            // ��������� �� ������ ��� ������������ �� ������������
            File[] files = directory.listFiles();

            // ��������� �� ������ �������� � ������������
            if (files != null) {
                for (File file : files) 
                {
                    if (file.isDirectory()) 
                    {
                        // ���������� ��������� �� ������ �� �������������
                        printDirectoryContents(file.getAbsolutePath());
                    }

                    // �������� �� ����� � ��������� �� ���������
                    System.out.print(file.getName());
                    
                    if (file.isFile()) 
                    {
                        System.out.print(" [" + file.length() + "]");
                    } 
                    else if (file.isDirectory()) 
                    {
                        System.out.print(" <dir>");
                    }
                    
                    System.out.println();
                }
            }
        }
        else 
        {
            System.out.println("Invalid directory path.");
        }
   }
}
