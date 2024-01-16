import java.io.File;

public class Exercise3 {
    public static void main(String[] args) {
        // Получаване на текущата директория
        String currentDirectory = System.getProperty("user.dir");

        // Извикване на метода за разпечатване на съдържанието на директорията
        printDirectoryContents(currentDirectory);
    }

    // Метод за разпечатване на съдържанието на директория
    private static void printDirectoryContents(String path) {
        File directory = new File(path);

        // Проверка дали дадения път е директория
        if (directory.isDirectory()) 
        {
            // Извличане на списък със съдържанието на директорията
            File[] files = directory.listFiles();

            // Обхождане на всички елементи в директорията
            if (files != null) {
                for (File file : files) 
                {
                    if (file.isDirectory()) 
                    {
                        // Рекурсивно извикване на метода за поддиректория
                        printDirectoryContents(file.getAbsolutePath());
                    }

                    // Печатане на името и дължината на файловете
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
