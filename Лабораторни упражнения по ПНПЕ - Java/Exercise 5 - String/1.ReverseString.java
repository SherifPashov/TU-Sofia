package test;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		System.out.println("�������� �������� ���:");
        String inputString = scanner.nextLine();
        
        StringBuilder reversed = new StringBuilder(inputString);
     // �������� �� ��������� ���
        String reversedString =reversed.reverse().toString();
     // ��������� �� ������� ��������� ���
        System.out.println("������� ���: " + reversedString);

	}

}
