package lab0;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, world!");
    }

    /*
      С начала суток прошло N секунд (N — целое).
      Найти количество секунд, прошедших с начала последней минуты.
     */
    public static int integer(int n) {
        return n % 60;
    }

    /*
      Дано трехзначное число. Проверить истинность высказывания:
      «Цифры данного числа образуют возрастающую последовательность».
    */
    public static boolean bool(int n) {
        int a, b, c;
        a = n / 100;
        b = n / 10 % 10;
        c = n % 10;
        return (a < b & b < c);
    }

    /*
     Даны целочисленные координаты точки на плоскости. Если точка совпадает с началом координат,
     то вывести 0. Если точка не совпадает с началом координат, но лежит на оси OX или OY,
     то вывести соответственно 1 или 2. Если точка не лежит на координатных осях, то вывести 3.
    */
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

    /*Дано целое число в диапазоне 1–7. Вывести строку — название дня недели,
    соответствующее данному числу (1 — «понедельник», 2 — «вторник» и т. д.).
     */
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

    /*Дано целое число N (> 0). Используя один цикл, найти сумму
    1 + 1/(1!) + 1/(2!) + 1/(3!) + … + 1/(N!)
    (выражение N! — N–факториал — обозначает произведение всех целых чисел от 1 до N:
    N! = 1·2·…·N). Полученное число является приближенным значением константы e = exp(1).
     */
    public static double forLoop(int n) {
        double res = 1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            res += 1.0 / fact;
        }
        return res;
    }

    /*Дано целое число N (> 0). С помощью операций деления нацело и взятия остатка от деления определить,
     имеются ли в записи числа N нечетные цифры. Если имеются, то вывести True, если нет — вывести False.
     */
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

    /*Дано целое число N и набор из N целых чисел.
    Найти общее количество экстремальных (то есть минимальных и максимальных) элементов из данного набора.
    */
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

    /*Дан массив размера N и целые числа K и L (1 Ј K Ј L Ј N).
    Найти сумму элементов массива с номерами от K до L включительно.
    */
    public static int arrayTask(int[] array, int k, int l) {
        int res=0;
        for (int j = k - 1; j < l; j++) {
            res += array[j];
        }
        return res;
    }

    /*Дана матрица размера M ґ N. Для каждой строки матрицы с нечетным номером (1, 3, …)
     найти среднее арифметическое ее элементов. Условный оператор не использовать.
    */
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
