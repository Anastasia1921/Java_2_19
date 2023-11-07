import java.util.Scanner;

public class Main {

        public static void main(String[] args)  {
            //1
            System.out.println("Введите три целочисленных переменных a, b, c:");
            Scanner in = new Scanner(System.in);

            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            //2
            if ((a % 5 != 0) && (b % 5 != 0) && (c % 5 != 0))
                System.out.printf("нет значений, кратных 5\n");
            else {
                if (a % 5 == 0)
                    System.out.printf("a=%d\n", a);
                if (b % 5 == 0)
                    System.out.printf("b=%d\n", b);
                if (c % 5 == 0)
                    System.out.printf("c=%d\n", c);
            }
            //3
            System.out.println(a/b);
            //4
            System.out.println((float)a/b);
            //5
            System.out.println(Math.ceil((float)a/b));
            //6
            System.out.println(Math.floor((float)a/b));
            //7
            System.out.println(Math.round((float)a/b));
            //8
            System.out.println(b%c);
            //9
            System.out.println(a<b?a:b);
            //10
            System.out.println(b>c?b:c);
        }
}