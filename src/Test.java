import java.util.Scanner;

public class Test {
    int a,b,sum;
    public int summa(int a, int b) {
        return sum = a+b;
    }

    public static void main(String[] args) {
        Test test = new Test();
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();
        System.out.println(test.summa(a, b));

    }
}
