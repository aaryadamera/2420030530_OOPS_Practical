package labDay1_myproject;

public class matrixAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	       System.out.print("Enter number of rows and columns of matrices: ");
	       int rows = sc.nextInt();
	       int cols = sc.nextInt();
	       int[][] a = new int[rows][cols];
	       int[][] b = new int[rows][cols];
	       int[][] sum = new int[rows][cols];

	       System.out.println("Enter elements of first matrix:");
	       for (int i = 0; i < rows; i++)
	           for (int j = 0; j < cols; j++)
	               a[i][j] = sc.nextInt();

	       System.out.println("Enter elements of second matrix:");
	       for (int i = 0; i < rows; i++)
	    	   for (int j = 0; j < cols; j++)
	                b[i][j] = sc.nextInt();

	       for (int i = 0; i < rows; i++)
	    	   for (int j = 0; j < cols; j++)
	    		   sum[i][j] = a[i][j] + b[i][j];

	       System.out.println("Sum of matrices:");
	       for (int i = 0; i < rows; i++) {
	    	   for (int j = 0; j < cols; j++)
	                System.out.print(sum[i][j] + " ");
	           System.out.println();
	        }

	       sc.close();


	}

}
