package test;

import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {
		// ���������� � ������������� �� ���������� �� ��� byte, short, int � long
        byte byteVariable = 97;
        short shortVariable = -115;
        int intVariable = 52130;
        long longVariable = 4825932L;  // ����������, �� �� long � ���������� ��������� �� "L" ��� "l" � ����

        // ������������� �� ���������� �� ��� int ��� �������� 256 � ������-��������� ������
        int hexValue = 0x100;  // 256 � ������-��������� ������

        // ���������� � ������������� �� ���������� �� ��� boolean � ���������� �� ����
        boolean isMale = true;  // ��� ��� ���, ��������� true, � �������� ������ - false

        // ���������� �� ��� ���������� �� ��� int, �������� �� ��������� � ������� �� ����������� ��
        int firstNumber = 5;
        int secondNumber = 10;

        // ������� �� �����������
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        // ����������� �� �����������
        System.out.println("byteVariable: " + byteVariable);
        System.out.println("shortVariable: " + shortVariable);
        System.out.println("intVariable: " + intVariable);
        System.out.println("longVariable: " + longVariable);
        System.out.println("hexValue: " + hexValue);
        System.out.println("isMale: " + isMale);
        System.out.println("After swapping: firstNumber = " + firstNumber + ", secondNumber = " + secondNumber);
        
        
     // �������� ���� ������ ���� ����� � ����� ��� �������
        int number = 13;
        boolean isEven = (number % 2 == 0);
        System.out.println(number + " � " + (isEven ? "�����" : "�������"));

        // �������� ���� ������ ���� ����� �� ���� �� 5 � 7 ��� �������
        int divisibleNumber = 35;
        boolean isDivisible = (divisibleNumber % 5 == 0) && (divisibleNumber % 7 == 0);
        System.out.println(divisibleNumber + " �� ���� �� 5 � 7 ��� �������: " + isDivisible);

        // �������� ���� ������ ���� ����� ������� 7 �� ����� ����� (������� �� ����)
        int numWithSeven = 987;
        boolean containsSeven = ((numWithSeven / 100) % 10 == 7);
        System.out.println(numWithSeven + " ������� 7 �� ����� �����: " + containsSeven);

        // ����������� �� ���������� � ������ �� ������������
        int length = 5;
        int height = 8;
        int perimeter = 2 * (length + height);
        int area = length * height;
        System.out.println("���������: " + perimeter);
        System.out.println("����: " + area);

        // �������� ���� ������ ����� n (n < 100) � ������
        int n = 37;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(n + " � " + (isPrime ? "������" : "��������"));
        
     // ��������� ����������� �� ��� ����������� ���������� � �� �������, ��� ������� � ��-������
        int a = 15;
        int b = 8;

        if (a > b) {
            int temp1 = a;
            a = b;
            b = temp1;
        }
        System.out.println("a = " + a + ", b = " + b);

        // ���������� �� ��� ���������� ��� �������� ��������� � �������� �� ��-��������/��-�������
        Random rand = new Random();
        int num1 = rand.nextInt(91) + 10;  // �������� ����� ����� 10 � 100
        int num2 = rand.nextInt(91) + 10;

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        System.out.println("��-�������� ��������: " + max);
        System.out.println("��-������� ��������: " + min);

        // ������ 3: �������� �� ���-�������� ����� ������� ���/��� �������� �����
        int num3 = 42;
        int num4 = 68;
        int num5 = 55;

        int maxOfThree = Math.max(Math.max(num3, num4), num5);
        System.out.println("���-�������� ����� ������� ��� �����: " + maxOfThree);

        // ��������� �� ����� �� ������� �� ��������� ����
        int digit = 7;
        String digitName = "";

        switch (digit) {
            case 0: digitName = "����"; break;
            case 1: digitName = "����"; break;
            case 2: digitName = "���"; break;
            case 3: digitName = "���"; break;
            case 4: digitName = "������"; break;
            case 5: digitName = "���"; break;
            case 6: digitName = "����"; break;
            case 7: digitName = "�����"; break;
            case 8: digitName = "����"; break;
            case 9: digitName = "�����"; break;
            default: digitName = "��������� �����";
        }
        System.out.println("��� �� �������: " + digitName);

        // �������� �� ������ ������ ����� � ��������� �� 1 �� 100
        System.out.println("������ ����� � ��������� �� 1 �� 100:");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    

	}
 // ������� ����� �� �������� ���� ����� � ������
        private static boolean isPrime(int number) {
            if (number < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
}
