package test;

import java.util.Scanner;

public class CountSubstringCantainsWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
        // ������ �� ����� � ������ �� ���������
        System.out.println("Въведи текс:");
        String text = scanner.nextLine();
        System.out.println("Специална дума:");
        String substring = scanner.nextLine();

        // Използване на метода
        int occurrences = countSubstringOccurrences(text, substring);

        // Принтиране
        System.out.println("Брой пъти срещната дума: " + occurrences);

	}
	// Метод за преброяване на брой пъти срещната дума в текста
    private static int countSubstringOccurrences(String text, String substring) {
        int count = 0;
        int index = text.indexOf(substring);

        while (index != -1) 
        {
            count++;

            index = text.indexOf(substring, index + 1);
        }

        return count;
    }
}
