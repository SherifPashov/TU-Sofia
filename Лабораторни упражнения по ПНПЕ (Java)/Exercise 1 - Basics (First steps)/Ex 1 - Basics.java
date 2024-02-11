package test;

import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {
		// Декларация и инициализация на променливи от тип byte, short, int и long
        byte byteVariable = 97;
        short shortVariable = -115;
        int intVariable = 52130;
        long longVariable = 4825932L;  // Забележете, че за long е необходимо поставяне на "L" или "l" в края

        // Инициализация на променлива от тип int със стойност 256 в шестна-десетичен формат
        int hexValue = 0x100;  // 256 в шестна-десетичен формат

        // Декларация и инициализация на променлива от тип boolean в зависимост от пола
        boolean isMale = true;  // Ако сте мъж, поставете true, в противен случай - false

        // Декларация на две променливи от тип int, задаване им стойности и размяна на стойностите им
        int firstNumber = 5;
        int secondNumber = 10;

        // Размяна на стойностите
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        // Отпечатване на резултатите
        System.out.println("byteVariable: " + byteVariable);
        System.out.println("shortVariable: " + shortVariable);
        System.out.println("intVariable: " + intVariable);
        System.out.println("longVariable: " + longVariable);
        System.out.println("hexValue: " + hexValue);
        System.out.println("isMale: " + isMale);
        System.out.println("After swapping: firstNumber = " + firstNumber + ", secondNumber = " + secondNumber);
        
        
     // Проверка дали дадено цяло число е четно или нечетно
        int number = 13;
        boolean isEven = (number % 2 == 0);
        System.out.println(number + " е " + (isEven ? "четно" : "нечетно"));

        // Проверка дали дадено цяло число се дели на 5 и 7 без остатък
        int divisibleNumber = 35;
        boolean isDivisible = (divisibleNumber % 5 == 0) && (divisibleNumber % 7 == 0);
        System.out.println(divisibleNumber + " се дели на 5 и 7 без остатък: " + isDivisible);

        // Проверка дали дадено цяло число съдържа 7 за трета цифра (отдясно на ляво)
        int numWithSeven = 987;
        boolean containsSeven = ((numWithSeven / 100) % 10 == 7);
        System.out.println(numWithSeven + " съдържа 7 за трета цифра: " + containsSeven);

        // Изчисляване на периметъра и лицето на правоъгълник
        int length = 5;
        int height = 8;
        int perimeter = 2 * (length + height);
        int area = length * height;
        System.out.println("Периметър: " + perimeter);
        System.out.println("Лице: " + area);

        // Проверка дали дадено число n (n < 100) е просто
        int n = 37;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(n + " е " + (isPrime ? "просто" : "съставно"));
        
     // Изчислява стойностите на две целочислени променливи и ги разменя, ако първата е по-голяма
        int a = 15;
        int b = 8;

        if (a > b) {
            int temp1 = a;
            a = b;
            b = temp1;
        }
        System.out.println("a = " + a + ", b = " + b);

        // Дефиниране на две променливи със случайни стойности и намиране на по-голямата/по-малката
        Random rand = new Random();
        int num1 = rand.nextInt(91) + 10;  // Случайно число между 10 и 100
        int num2 = rand.nextInt(91) + 10;

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        System.out.println("По-голямата стойност: " + max);
        System.out.println("По-малката стойност: " + min);

        // Задача 3: Намиране на най-голямото число измежду три/пет зададени числа
        int num3 = 42;
        int num4 = 68;
        int num5 = 55;

        int maxOfThree = Math.max(Math.max(num3, num4), num5);
        System.out.println("Най-голямото число измежду три числа: " + maxOfThree);

        // Извеждане на името на цифрата на български език
        int digit = 7;
        String digitName = "";

        switch (digit) {
            case 0: digitName = "Нула"; break;
            case 1: digitName = "Едно"; break;
            case 2: digitName = "Две"; break;
            case 3: digitName = "Три"; break;
            case 4: digitName = "Четири"; break;
            case 5: digitName = "Пет"; break;
            case 6: digitName = "Шест"; break;
            case 7: digitName = "Седем"; break;
            case 8: digitName = "Осем"; break;
            case 9: digitName = "Девет"; break;
            default: digitName = "Невалидна цифра";
        }
        System.out.println("Име на цифрата: " + digitName);

        // Намиране на всички прости числа в интервала от 1 до 100
        System.out.println("Прости числа в интервала от 1 до 100:");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    

	}
 // Помощен метод за проверка дали число е просто
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
