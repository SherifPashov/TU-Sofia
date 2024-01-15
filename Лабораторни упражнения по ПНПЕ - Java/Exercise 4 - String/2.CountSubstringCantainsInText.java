package test;

import java.util.Scanner;

public class CountSubstringCantainsWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
        // Четене на текст и подниз от конзолата
        System.out.println("Въведете текст:");
        String text = scanner.nextLine();
        System.out.println("Въведете подниз:");
        String substring = scanner.nextLine();

        // Извикване на метода за броене на срещания на подниза в текста
        int occurrences = countSubstringOccurrences(text, substring);

        // Извеждане на резултата
        System.out.println("Брой срещания на подниза: " + occurrences);

	}
	// Метод за броене на срещания на подниз в текст
    private static int countSubstringOccurrences(String text, String substring) {
        int count = 0;
        int index = text.indexOf(substring);

        while (index != -1) {
            count++;
            // Търсенето продължава от следващата позиция, за да се избегне безкраен цикъл
            index = text.indexOf(substring, index + 1);
        }

        return count;
    }
}
