package test;

import java.util.Scanner;

public class CountSubstringCantainsWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
        // ������ �� ����� � ������ �� ���������
        System.out.println("�������� �����:");
        String text = scanner.nextLine();
        System.out.println("�������� ������:");
        String substring = scanner.nextLine();

        // ��������� �� ������ �� ������ �� �������� �� ������� � ������
        int occurrences = countSubstringOccurrences(text, substring);

        // ��������� �� ���������
        System.out.println("���� �������� �� �������: " + occurrences);

	}
	// ����� �� ������ �� �������� �� ������ � �����
    private static int countSubstringOccurrences(String text, String substring) {
        int count = 0;
        int index = text.indexOf(substring);

        while (index != -1) {
            count++;
            // ��������� ���������� �� ���������� �������, �� �� �� ������� �������� �����
            index = text.indexOf(substring, index + 1);
        }

        return count;
    }
}
