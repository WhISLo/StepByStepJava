import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    class TypeAndOpertions {
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
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    Max = a[i];
                }
            }
            return Max;
        }

        public static int Min(int[] a) {
            int Min = a[0];
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] < a[i + 1]) {
                    Min = a[i];
                }
            }
            return Min;
        }

        public static int[] ArrSum(int[] a, int[] b) {
            if (a.length != b.length) {
                return null;
            }
            int[] arr = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                arr[i] = a[i] + b[i];
            }
            return arr;
        }

        public static int[] ArrMult(int[] a, int[] b) {
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

    public class Cicles {
        public static void endless() {
            while (0 == 0) {
                System.out.println("CTRL + C to stop");
            }
        }

        public static void AnyTimes(int n) {
            for (int i = 0; i < n; i++) {
                System.out.println("step" + i);
            }
        }
    }

    public class Recusion {
        public static int Fact(int n) {
            return n * Fact(n - 1);
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

    public class LetsTry {
        int[] arr = new int[10];


        public static void MyTry(int[] arr) {
            int i = 0;
            try {
                arr[i] = arr[i++];
            } catch (Exception e) {
                throw e;
            }
        }
    }


    //Ввод/вывод, Java I/O, java.io.*
    public class StreamIO {
        public StreamIO() throws IOException {
        }

        public static void inp() {
            try (FileInputStream fis = new FileInputStream("C:\\Users\\user\\Documents\\JobTest\\JavaSbS\\src\\a.txt");) {
                System.out.printf("File size: %d bytes \n", fis.available());
                int i = -1;
                while ((i = fis.read()) != -1) {
                    System.out.print((char) i);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static void out() {
            String txt = "qwertyuiop[asdfghjkl;'zxcvbnm,.";
            try (FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Documents\\JobTest\\JavaSbS\\src\\b.txt")) {
                byte[] bytes = txt.getBytes();
                fos.write(bytes, 0, bytes.length);
                System.out.println("end");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //Но гораздо удобнее работать так
        public static void JavaNIOChanal() throws IOException {
            RandomAccessFile TheFile = new RandomAccessFile("C:\\Users\\user\\Documents\\JobTest\\JavaSbS\\src\\a.txt", "rw");
            FileChannel inChanel = TheFile.getChannel();

            ByteBuffer buf = ByteBuffer.allocate(100);
            int bytesRead = inChanel.read(buf);

            while (bytesRead != -1) {
                System.out.println("Read " + bytesRead);
                buf.flip();
                while (buf.hasRemaining()) {
                    System.out.print((char) buf.get());
                }
                buf.clear();
                bytesRead = inChanel.read(buf);
            }
            TheFile.close();
        }
    }

    public static void main(String[] args) {
        StreamIO.inp();

        System.out.println(conc("\nhi", " nice to meet you"));
    }

    private static String conc(String s1, String s2) {
        return s1 + s2;
    }
}