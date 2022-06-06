import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону a=");
        int a = sc.nextInt();
        System.out.println("Введите сторону b=");
        int b = sc.nextInt();
        System.out.println("Введите сторону c=");
        int c = sc.nextInt();

        /**
         * равносторонний это, где а=б=с
         * равносторонний это, где а != б != с != a
         */

        if ((a >= b + c) || (b >= a + c) || (c > a + b)) {
            System.out.println("Увы,такого треугольника быть не может :(");
            findArea(a, b, c);
        } else if (a != b & b != c & a != c) {
            System.out.println("- Разносторонний треугольник -");
            findArea(a, b, c);
        } else if (a == b & b == c) {
            System.out.println("- Равносторонний треугольник -");
            double v = (a * a *  Math.sqrt(3) )/ 4 ;
            System.out.print("Площадь Равносторонний = ");
            System.out.printf("%.2f", v);
        } else {
            System.out.println("- Равнобедренный треугольник -");
            findArea(a, b, c);
        }

        if (c * c == (a * a + b * b)){
            System.out.println("- Прямоугольный -");
        } else if (c * c < (a * a + b * b)) {
            System.out.println("- Остроугольный -");
        } else if (c * c > (a * a + b * b)) {
            System.out.println("- Тупоугольный -");
        }


    }

    private static void findArea(int a, int b, int c) {
        int p = (a + b + c) / 2;
        System.out.print("Периметр треугольника = ");
        System.out.println(p);

        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.print("Площадь треугольника = ");
        System.out.printf("%.2f", s);
    }
}
