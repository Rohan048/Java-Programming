public class CharacterPatternInArray2 {
    public static void main(String[] args) {
        char i, j, count = 'A';
        for (i = 'A'; i <= 'E'; i++) {
            for (j = 'A'; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.print("\n");
        }
    }
}
