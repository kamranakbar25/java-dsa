import java.util.Scanner;

public class Basics {
    static void main() {
        System.out.println("Hello World");
        int main = 5;
        System.out.println(main);

//        Datatypes in Java
//        Numeric DT - short, byte, int, long
        byte num1 = 10;
        System.out.println(num1);

        double num2 = 3.14;
        float num3 = 3.14f;
        System.out.println(num2);
        System.out.println(num3);

        boolean isabletovote = false;
        System.out.println(isabletovote);

        char grade = 'A';
        System.out.println("Your grade is: " + grade);
        System.out.println((char)(grade + 2));

//        Typecasting
        long val = 837454683;
        System.out.println(val);
        int newVal = (int)val;
        System.out.println(newVal);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of num1: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter second num: ");
        int secNum = sc.nextInt();
        int ans = firstNum + secNum;
        System.out.println("Answer is: " + ans);

        float flval = sc.nextFloat();
        System.out.println(flval);


    }
}