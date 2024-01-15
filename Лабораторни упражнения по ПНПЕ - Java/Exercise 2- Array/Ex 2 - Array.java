package test;

public class Ex2 {

	public static void main(String[] args) {
        // ��������� �����
        int[] array1D = new int[]{1, 2, 3, 4, 5};

        // �������� �����
        int[][] array2D = new int[][]
					        		{{1, 2, 3}, 
					        		{4, 5, 6}, 
					        		{7, 8, 9}};

        printArray(array1D);
        printArray2D(array2D);
        

        // ������������� �� ���������� � ��������� ����� �� ���������� �������
        for (int i = 0; i < array1D.length; i++) 
        {
            array1D[i] = i * 2;
        }

        // ������������� �� ���������� � �������� ����� �� ���������� �������
        int value = 1;
        for (int i = 0; i < array2D.length; i++) 
        {
        	
            for (int j = 0; j < array2D[i].length; j++) 
            {
                array2D[i][j] = value++;
            }
        }
        printArray2D(array2D);
        
        
        // ������������� �� ���������� �� ����� ��� �������� �����
        System.out.println("������� ��� �� ��������� �����");
        printArray(array1D);
        for (int i = 0; i < array1D.length; i++) 
        {
            array1D[i] = (int) (Math.random() * 100);
        }
        System.out.println("������ ����� � ��������� �����");
        printArray(array1D);
        
        
        // ���� � ������� �� ��������� ������
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};

        int[] sumArray = new int[array1.length];
        int[] diffArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) 
        {
            sumArray[i] = array1[i] + array2[i];
            diffArray[i] = array1[i] - array2[i];
        }

        System.out.println("���� �� ��������� ������:");
        printArray(sumArray);

        System.out.println("������� �� ��������� ������:");
        printArray(diffArray);
    }
	
	// �������������� ��������� �� ���������� � �������� �����
	private static void printArray2D(int[][] array2D)
	{
		  System.out.println("�������� �����:");
	        for (int row=0;row<array2D.length;row++) {
	            for (int colum=0;colum<array2D[row].length;colum++) {
	                System.out.print(array2D[row][colum] + " ");
	            }
	            System.out.println();
	        }
	}

    // ������� ����� �� ����������� �� ��������� �����
    private static void printArray(int[] arr) 
    {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
