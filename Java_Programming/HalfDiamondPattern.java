public class HalfDiamondPattern {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.print("\n");
        }

        for(i=5-1;i>=1;i--)
        {
            for(j=1;j<i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.print("\n");
        }
    }
}
