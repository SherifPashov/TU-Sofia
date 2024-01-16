package test;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		System.out.println("Въведете символен низ:");
        String inputString = scanner.nextLine();
        
        StringBuilder reversed = new StringBuilder(inputString);
     // Обръщане на символния низ
        String reversedString =reversed.reverse().toString();
     // Извеждане на обратно обрънатия низ
        System.out.println("Обратен низ: " + reversedString);

	}

}
