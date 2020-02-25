public class MatrixSmallest
{
    public static double[][] matrixSmallest(double[][] a, double[][] b)
    {
        double [][] result = new double[a.length][a[0].length];
        for(int i = 0; i < a.length; i++)
        {
            if(a.length != b.length || a[0].length != b[0].length)
            {
                return null;
            }
            
            for(int j = 0; j < a[0].length; j++)
            {
                if(a[i][j] < b[i][j])
                {
                    result[i][j] = a[i][j];
                }
                else
                {
                    result[i][j] = b[i][j];
                }
            }
        }
        return result;
    }
  public static void printDoubleMatrix(String name, double[][] a)
  {
    if (a == null)
    {
      System.out.printf("%s: null\n", name);    
      return;
    }
    System.out.printf("%s:\n", name);    
    for (int i = 0; i < a.length; i++)
    {
      for (int j = 0; j < a[i].length; j++)
      {
        System.out.printf("%7.1f", a[i][j]);
      }
      System.out.printf("\n");
    }
    System.out.printf("\n");
  }
  
  
  public static void main(String[] args)
  {
    double[][] a = { {3.2, 2.1, 5.3},
                     {8.0, 4.9, 5.7} };
    double[][] b = { {1.1, 2.2, 3.3}, 
                     {4.4, 5.5, 6.6} };
      
    double[][] result = matrixSmallest(a, b);
    printDoubleMatrix("a", a);
    printDoubleMatrix("b", b);
    printDoubleMatrix("result", result);
  }
}