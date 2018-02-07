public class Array2D
{
    public static void main(String[] args)
    {
        int[][] array2D = new int[100][100];
        for(int rowIndex = 0; rowIndex < array2D.length; rowIndex++)
        {
            for(int collumnIndex = 0; collumnIndex < array2D[rowIndex].length; collumnIndex++)
            {
                array2D[rowIndex][collumnIndex] = (int)Math.floor((Math.random() * 10));
            }
        }
        int ctr5 = 0;
        for(int rowIndex = 0; rowIndex < array2D.length; rowIndex++)
        {
            for(int collumnIndex = 0; collumnIndex < array2D[rowIndex].length; collumnIndex++)
            {
                if(array2D[rowIndex][collumnIndex]== 5)
                {
                    ctr5++;
                    System.out.println("(" + rowIndex + "," + collumnIndex + ")");
                }
            }
        }
        for(int rowIndex = 0; rowIndex < array2D.length; rowIndex++)
        {
            for(int collumnIndex = 0; collumnIndex < array2D[rowIndex].length; collumnIndex++)
            {
                System.out.print("" + array2D[rowIndex][collumnIndex]+ " ");
            }
            System.out.println();
        }
        System.out.println("There are " + ctr5 + " fives");
    }
}