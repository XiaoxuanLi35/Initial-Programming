/*
N is 5
1
21
321
4321
54321
 */

public class NumberTriangle3 {
    public static void main(String[] args) {

        int row, value, N = (int)(Math.random() * 9 + 1);
        System.out.printf("N is %d\n",N);

        for(row = 1; row <= N; row = row + 1){
            for(value = row; value >= 1; value = value - 1){
                //
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
