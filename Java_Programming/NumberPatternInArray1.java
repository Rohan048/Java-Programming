public class NumberPatternInArray1 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
