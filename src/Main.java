public class Main {
    // f(n) = f (n-2) + f (n-1)
    // f(1) = 1
    // f(2) = 1
    // f(3) = 2
    static int f(int n) {

        if (n == 1 || n == 2)
            return 1;
        else
            return f(n - 1) + f(n - 2);
    }

    public static void main(String[] args) {

        System.out.println(f(3));

    }
}
