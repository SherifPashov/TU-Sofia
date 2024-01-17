package test;

import java.util.Scanner;

public class UpperCaseString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
	     	
	        System.out.println("Въведете текс с <upcase></upcase> съдържащо в него:");
	        
	        // String text1 = "We are living in a <upcase>yellow submarine</upcase>. We don't have <upcase>anything</upcase> else.";
	        
	        String text1 = scanner.nextLine();
	        
	        String modifiedText = changeCaseInsideTags(text1);

	        // Принтиране на текста 
	        System.out.println("Пробразен текст: " + modifiedText);
	    
		}
		
	    private static String changeCaseInsideTags(String text) 
	    {
	        StringBuilder result = new StringBuilder();
	        
	        int startIndex=text.indexOf("<upcase>");
	        int endIndex=text.indexOf("</upcase>");
	        
	        if(startIndex != -1)
	        {
	        	
	        	result.append(text.substring(0, startIndex));
	        }
	        
	        while(startIndex != -1)
	        {
	        	
	        	result.append(text.substring(startIndex+8, endIndex).toUpperCase());
	        	
	        	
	        	startIndex=text.indexOf("<upcase>",startIndex+1);
	        	
	        	if(startIndex == -1)
	        	{
	        		break;
	        	}
	        	result.append(text.substring(endIndex+9, startIndex));
	        	
	            endIndex=text.indexOf("</upcase>",endIndex+1);
	            
	            
	        }
	        
	        result.append(text.substring(endIndex+9, text.length()));
	        
	        return result.toString();

	    }

	}


