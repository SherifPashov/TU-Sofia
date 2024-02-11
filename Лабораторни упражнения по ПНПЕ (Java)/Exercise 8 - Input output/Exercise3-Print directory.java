import java.io.File;

public class Exercise3 {
    public static void main(String[] args) {
        // Получаване на текущата директория
        String currentDirectory = System.getProperty("user.dir");

        //Извикване на метода
        printDirectoryContents(currentDirectory);
        
    }

    // <Метод за разпечатване на съдържанието на директорията
    private static void printDirectoryContents(String path) {
        File directory = new File(path);

        // Проверка дали дадения път е директория
        if (directory.isDirectory()) 
        {
            // Извличане на списък на съдържанието на директорията
            File[] files = directory.listFiles();

            // Обхожданен на всички елементи в директорията 
                for (File file : files) 
                {
                    if (file.isDirectory()) 
                    {
                        // Рекурсивно извикване на метода за поддиректория
                        printDirectoryContents(file.getAbsolutePath());
                    }

                    // Печатане името на файловете
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
