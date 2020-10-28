public class Calc00 {
    public static void main(String args[]) {

        int a = 1;
        int b = 4;
        int sum_c = 0;

        sum_c = a + b;

        System.out.println(sum_c);

        if (sum_c % 2 == 0) {
            System.out.println(calc_def(a, b));
        } else {
            System.out.println(sum_c);
        }

    }

    static int calc_def(int x, int y) {
        return(x * y);
    }

}
