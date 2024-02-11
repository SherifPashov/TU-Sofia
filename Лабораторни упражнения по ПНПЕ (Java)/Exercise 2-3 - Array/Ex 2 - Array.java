package test;

public class Ex2 {

	public static void main(String[] args) {
        // Създаване на масив
        int[] array1D = new int[]{1, 2, 3, 4, 5};

        // Създаване на двумерен масив
        int[][] array2D = new int[][]
					        		{{1, 2, 3}, 
					        		{4, 5, 6}, 
					        		{7, 8, 9}};

        printArray(array1D);
        printArray2D(array2D);
        

        // Удвояване на елементите на едномерния масив
        for (int i = 0; i < array1D.length; i++) 
        {
            array1D[i] = i * 2;
        }

        // увеличаване на елементите на двумерния масив с единица
        int value = 1;
        for (int i = 0; i < array2D.length; i++) 
        {
        	
            for (int j = 0; j < array2D[i].length; j++) 
            {
                array2D[i][j] = value++;
            }
        }
        printArray2D(array2D);
        
        
        
        System.out.println("Оригинален едномерен масив");
        printArray(array1D);
        for (int i = 0; i < array1D.length; i++) 
        {
            array1D[i] = (int) (Math.random() * 100);
        }
        System.out.println("Смяна на елементите на едномерния масив с рандом числа");
        printArray(array1D);
        
        
        // Субиране и изваждане на едномерни масиви 
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};

        int[] sumArray = new int[array1.length];
        int[] diffArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) 
        {
            sumArray[i] = array1[i] + array2[i];
            diffArray[i] = array1[i] - array2[i];
        }

        System.out.println("Сумата на двата масива:");
        printArray(sumArray);

        System.out.println("Разликата на двата масива:");
        printArray(diffArray);
    }
	
	// Принтиране на двумерен масив
	private static void printArray2D(int[][] array2D)
	{
		  System.out.println("Двумерен масив:");
	        for (int row=0;row<array2D.length;row++) {
	            for (int colum=0;colum<array2D[row].length;colum++) {
	                System.out.print(array2D[row][colum] + " ");
	            }
	            System.out.println();
	        }
	}

    // Принтиране на еднимерен масив
    private static void printArray(int[] arr) 
    {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
