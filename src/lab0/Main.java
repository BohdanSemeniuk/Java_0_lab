package lab0;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(integer(876));
        System.out.println(bool(369));
        System.out.println(cond(3, 0));
        System.out.println(caseSw(5));
        System.out.println(forLoop(1));
        System.out.println(whileLoop(4684));
    }

    public static int integer(int n) {
        return n % 60;
    }

    public static boolean bool(int n) {
        int a, b, c;
        a = n / 100;
        b = n / 10 % 10;
        c = n % 10;
        return (a < b & b < c);
    }

    public static int cond(float x, float y) {
        if (x == 0 && y == 0) {
            return 0;
        }
        else if (x == 0 && y != 0.0) {
            return 1;
        }
        else if (x != 0 && y == 0.0) {
            return 2;
        }
        else {
            return 3;
        }
    }
    public static String caseSw(int n) {
        return switch (n) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "";
        };
    }
    public static float forLoop(int n) {
        float res = 1.00f;
        for (int i = 1; i <= n; i++) {
            int f = 1;
            for (int j = 1; j <= i; j++) {
                f *= j;
            }
            res += 1.00 / f;
        }
        return res;
    }
    public static boolean whileLoop(int n) {
        int n1;
        while (n > 1) {
            n1 = n % 10;
            if (n1 % 2 != 0) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
}
