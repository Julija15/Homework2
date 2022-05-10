import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Homework2/1");
        Scanner scanner = new Scanner(System.in);
        int a, b, c, a1, a2, a3, b1, b2;
        a = 100;
        a1 = a / 100;
        a3 = a1 * 75;
        b = 7;
        b1 = 7 % 5;
        a2 = a3 * 10;
        b2 = b1 * 2;
        c = a2 + b2;
        System.out.println(c);
        int a4, a5, b3, c2;
        a4 = a1 * 50;
        a5 = a4 * 7;
        b3 = b1 * 1;
        c2 = a5 + b3;
        System.out.println(c2);
        int a6, a7, b4, c3;
        a6 = a1 * 90;
        a7 = a6 * 2;
        b4 = b1 * 3;
        c3 = a7 + b4;
        System.out.println(c3);
        System.out.println("Homework2/2");
        int x = 5;
        int y = 10;
        int f = x+y;
        double z = f * 0.1;
        double z1 = f * 0.9;
        System.out.println(z);
        System.out.println(z1);
        double t = 25;
        double p = 100;
        System.out.println(Math.sqrt(t + p));
        int t2 = a * a;
        int p2 = b * b;
        double t1 = t2;
        double p1 = p2;
        System.out.println(Math.sqrt(t1 + p1));
        int ll = a % b;
        System.out.println(ll);
        double n = 15.256;
        int lll = (int) n;
        System.out.println(lll);
                { System.out.println("Привет!");
            int z15 = 2147483647+1;
            System.out.println(z15);
                }

        int x4, y4, z4 , k4;
                x4 = 5;
                y4 = 7;
                z4 = 0;
                k4 = 9;
        z4 = x4 * x4 + y4 * y4;
        System.out.println(z4);
        z4 = x4 * x4 * x4;
        System.out.println(z4);
        k4 = x4 / z4;
        System.out.println(k4);
        int a10 = 0;
        int a11 = 1;
        int a12 = 2;
       int a13 = 3;
        int a14 = 4;
        int a15 = 5;
        int a16 = 6;
        int a17 = 7;
        int a18 = 8;
        int a19 = 9;
        int n5 = (a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19) / 10;
        System.out.println(n5);
        double n6 = (a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19) / 10;
        System.out.println(n6);
        long 123; // вводимое число
        int ns; //номер системы счисления
        int nsnumb; //номер системы в которой число
        System.out.println("В какой системе счисления число?");
        nsnumb = Integer.parseInt(sc.nextLine());
        System.out.println("Введите число: ");
        number = Long.parseLong(sc.nextLine(), nsnumb);
        System.out.println("Введите систему счисления: ");
        ns = sc.nextInt();
        System.out.println("Полученое число " + Long.toString(number, ns));
    }
    }

