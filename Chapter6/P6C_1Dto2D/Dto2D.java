

public class Dto2D
{
    public static void main(String[] args)
    {
        int[] even1D = new int[20];
        for(int index = 0; index < even1D.length; index++)
        {
            even1D[index] = index*2;
            System.out.println("" + even1D[index]);
        }
        int[][] even2d = new int[6][5];
        int ctr = 0;
        for(int rowIndex = 0; rowIndex < even2d.length; rowIndex++)
        {
            for(int collumnIndex = 0; collumnIndex < even2d[rowIndex].length; collumnIndex++)
            {
                if(ctr < even1D.length)
                {
                    even2d[rowIndex][collumnIndex] = even1D[ctr];
                }
                else
                {
                    even2d[rowIndex][collumnIndex] = -1;
                }
                ctr++;
            }
        }
        for(int rowIndex = 0; rowIndex < even2d.length; rowIndex++)
        {
            for(int collumnIndex = 0; collumnIndex < even2d[rowIndex].length; collumnIndex++)
            {
                System.out.print("[" + even2d[rowIndex][collumnIndex] + "]");
            }
            System.out.println();
        }
    }
}