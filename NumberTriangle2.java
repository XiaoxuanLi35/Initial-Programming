/*
N is 5
12345
1234
123
12
1
 */
public class NumberTriangle2 {
        public static void main(String[] args) {

            int row, value, N = (int)(Math.random() * 9 + 1);

            System.out.printf("N is %d\n",N);

// Use a ‘for’ iteration to repeat the required lines
            for(row = N; row >= 1; row = row - 1) {
// Use a ‘for’ iteration to repeat the required values
                for(value = 1; value <= row; value = value + 1) {
                    System.out.print(value);
                }
                System.out.println();
            }
        }
    }
