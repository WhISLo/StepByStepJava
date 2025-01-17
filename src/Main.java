import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    class TypeAndOpertions{
    int a = 10;
    int b = 20;
    String c = "Hello";
    String d = "World";
    float e = 3.14f;
    float g = 9.8f;
    byte h = 127;
    byte i = -128;
    public int sum(int a, int b) {
        return a + b;
    }
    public int mult(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }
    public int dif(int a, int b) {
        return a - b;
    }
}

public static class MyArray {
        int[] ar = new int[10];
        int[] ar2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        public static int Max(int[] a) {
            int Max = a[0];
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] > a[i + 1]) {
                    Max = a[i];
                }
            }
            return Max;
        }
        public static int Min(int[] a) {
            int Min = a[0];
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] < a[i+1]) {
                    Min = a[i];
                }
            }
            return Min;
        }
        public static int[] ArrSum(int[] a, int[] b){
            if (a.length != b.length) {
                return null;
            }
            int[] arr = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                arr[i] = a[i] + b[i];
            }
            return arr;
        }
        public static int[] ArrMult(int[] a, int[] b){
            if (a.length != b.length) {
                return null;
            }
            int[] arr = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                arr[i] = a[i] * b[i];
            }
            return arr;
        }


    }
    public class Cicles{
        public static void endless(){
        while (0 == 0){
            System.out.println("CTRL + C to stop");
            }
        }
        public static void AnyTimes(int n) {
            for (int i = 0; i < n; i++) {
                System.out.println("step" + i);
            }
        }
    }
    public class Recusion{
        public static int Fact(int n) {
            return n * Fact(n-1);
        }
    }

    public class NowIDynamic {
        //I not sure that i can create tasks myself so i just will do tihs one
        public static ArrayList<int[]> AnyOfArrays() {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            ArrayList<int[]> list = new ArrayList<int[]>(n);
            for (int i = 0; i < n; i++) {
                int[] arr = new int[sc.nextInt()];
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = sc.nextInt();
                }
                list.add(arr);
            }
            return list;
        }
    }

    public static void main(String[] args) {
        System.out.println(conc("hi", "nice to meet you"));
    }

    private static String conc(String s1, String s2) {
        return s1 + s2;
    }
}