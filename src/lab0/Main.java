package lab0;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, world!");
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
        } else if (x == 0) {
            return 1;
        } else if (y == 0) {
            return 2;
        } else {
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

    public static double forLoop(int n) {
        double res = 1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            res += 1.0 / fact;
        }
        return res;
    }

    public static boolean whileLoop(int n) {
        int n1;
        while (n >= 1) {
            n1 = n % 10;
            if (n1 % 2 != 0) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static int minmax(int[] array) {
        int min=array[0]+1, max=array[0]-1, count1=1, count2=1;
        for (int j : array) {
            if (min > j) {
                min = j;
                count1 = 1;
            } else if (min == j) {
                count1++;
            }
            if (max < j) {
                count2 = 1;
                max = j;
            } else if (max == j) {
                count2++;
            }
        }
        return count1 + count2;
    }

    public static int arrayTask(int[] array, int k, int l) {
        int res=0;
        for (int j = k - 1; j < l; j++) {
            res += array[j];
        }
        return res;
    }

    public static double[] matrix(int[][] array, int n, int m) {
        double[] res = new double[(n-1)/2+1];
        int k=-1;
        for (int j = 0; j < n; j += 2) {
            k++;
            for(int i = 0; i < m; i++) {
                res[k] += array[j][i];
            }
            res[k] /= m;
        }
        return res;
    }
}
