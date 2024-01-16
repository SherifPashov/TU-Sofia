package test;

public class Ex2 {

	public static void main(String[] args) {
        // Едномерен масив
        int[] array1D = new int[]{1, 2, 3, 4, 5};

        // Двумерен масив
        int[][] array2D = new int[][]
					        		{{1, 2, 3}, 
					        		{4, 5, 6}, 
					        		{7, 8, 9}};

        printArray(array1D);
        printArray2D(array2D);
        

        // Инициализация на елементите в едномерен масив по определено правило
        for (int i = 0; i < array1D.length; i++) 
        {
            array1D[i] = i * 2;
        }

        // Инициализация на елементите в двумерен масив по определено правило
        int value = 1;
        for (int i = 0; i < array2D.length; i++) 
        {
        	
            for (int j = 0; j < array2D[i].length; j++) 
            {
                array2D[i][j] = value++;
            }
        }
        printArray2D(array2D);
        
        
        // Инициализация на елементите на масив със случайни числа
        System.out.println("Начален вид на едномерия масив");
        printArray(array1D);
        for (int i = 0; i < array1D.length; i++) 
        {
            array1D[i] = (int) (Math.random() * 100);
        }
        System.out.println("Рандом числа в едномерия масив");
        printArray(array1D);
        
        
        // Сума и разлика на едномерни масиви
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};

        int[] sumArray = new int[array1.length];
        int[] diffArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) 
        {
            sumArray[i] = array1[i] + array2[i];
            diffArray[i] = array1[i] - array2[i];
        }

        System.out.println("Сума на едномерни масиви:");
        printArray(sumArray);

        System.out.println("Разлика на едномерни масиви:");
        printArray(diffArray);
    }
	
	// Последователно обхождане на елементите в двумерен масив
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

    // Помощен метод за отпечатване на едномерен масив
    private static void printArray(int[] arr) 
    {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
