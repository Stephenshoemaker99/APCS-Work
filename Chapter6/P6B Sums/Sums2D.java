public class Sums2D
{
    public static void main(String[] args)
    {
        int[][] array2D = new int[2][2];
        int ctr =  1;
        for(int columnIndex = 0; columnIndex < array2D.length; columnIndex++ )
        {
            for(int rowIndex = 0; rowIndex < array2D[columnIndex].length; rowIndex++)
            {
                array2D[columnIndex][rowIndex]= ctr;
                ctr++;
            }
        }
        for(int columnIndex = 0; columnIndex < array2D.length; columnIndex++)
        {
            for(int rowIndex = 0; rowIndex < array2D[columnIndex].length; rowIndex++)
            {
                System.out.print("[" + array2D[columnIndex][rowIndex] + "]");
            }
            System.out.println();
        }
        int totalSum = 0;
        for(int columnIndex = 0; columnIndex < array2D.length; columnIndex++ )
        {
            for(int rowIndex = 0; rowIndex < array2D[columnIndex].length ; rowIndex++)
            {
                totalSum += array2D[columnIndex][rowIndex];
            }
        }
        System.out.println("Total Sum: " + totalSum);
        int rowSum = 0;
        for(int rowIndex = 0; rowIndex < array2D.length; rowIndex++)
        {
            for(int columnIndex = 0; columnIndex< array2D[rowIndex].length; columnIndex++)
            {
                rowSum += array2D[rowIndex][columnIndex];
            }
            System.out.print("Row: " + rowIndex);
            System.out.println("Sum: "+ rowSum);
            rowSum = 0;
        }
        int collumnSum = 0;
        for(int columnIndex = 0; columnIndex < array2D[0].length; columnIndex++)
        {
            for(int rowIndex = 0; rowIndex <array2D.length; rowIndex++)
            {
                collumnSum+= array2D[rowIndex][columnIndex];
            }
            System.out.print("Column: " + columnIndex);
            System.out.println("Sum: "+ collumnSum);
            collumnSum = 0;
        }
    }
}
