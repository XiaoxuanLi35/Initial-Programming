// 0 + 5 = 5
// 1 + 4 = 5
// 2 + 3 = 5
// 3 + 2 = 5
// 4 + 1 = 5
// 5 + 0 = 5

public class ForExercise02 {
    public static void main(String[] args) {
        int i = 0;
        int maximum = 5;

        for(i = 0; i <= 5; i ++){
            System.out.println(i + " + " + (maximum - i) + " = 5");
        }
    }
}
