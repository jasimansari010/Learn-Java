//print hello world
/* public class Main{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
} */


//print two number
/* public class Main{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
    }
} */



// print three number
/* public class Main{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30
        int sum = a + b + c;
        System.out.println(sum);
    }
} */




// wap to calculate cgpa using marks pf three
/* public class Main{
    public static void main(String[] args){
        int marks1 = 85, marks2 = 78, marks3 = 81;
        float average = (marks1+marks2+marks3)/3;
        float cgpa = average/10;
        System.out.println("CGPA = "+cgpa);
    }
} */




// wap to check whether the user enter number is integer or float
/* 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the the number! ");
        double num = sc.nextDouble();
        if(num == (int) num){
            System.out.println("It is an Integer");
        }else{
            System.out.println("It is float");
        }
    }
}
 */





// binary,octal,hexa
/* public class Main {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println("binary number 10 = "+ 0b10);
        System.out.println("octal number 17 = "+ 017);
        System.out.println("hexadecimal number 15A = "+ 0x15A);
    }
} */





// Type casting
/* public class Main {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.println(b);

        double c = 10.75;
        int d = (int)c;
        System.out.println(d);
    }
}
 */




/* public class Main {
    public static void main(String[] args) {
        char ch = 97;
        System.out.println(ch);     //a
        int i = 'A';
        System.out.println(i);      //65
    }
} */


//Take input from user
/* 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer Value: ");
        int num1 = sc.nextInt();
        System.out.print("Enter float Value: ");
        float num2 = sc.nextFloat();
        System.out.print("Enter char: ");
        char ch = sc.next().charAt(0);
        System.out.print("Enter char: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Integer = "+num1 + " Float = "+ num2 +" Character + "+ch + " String = " + name );
    }
} */





//Sum of two number take input from user
/* import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter first number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is "+ sum);
    }
} */



// Accept name and age and print it on console

/* import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        System.out.print("Hello "+name + " your age is "+ age + " years");
    }
} */



//Swap two number
/* public class Main {
    public static void main(String[] args) {
        int a = 10,b=20;
        System.out.println("before Swap a = "+ a + " b = "+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap a = "+ a + " b = "+b);
    }
} */





// Operator
/* public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        // System.out.println(a);
        // System.out.println(++a);
        // System.out.println(a++);
        // System.out.println(a);


        // System.out.println(b);
        // System.out.println(--b);
        // System.out.println(b--);
        // System.out.println(b);



        // System.out.println(++a + a++ + a + --b + b--);
    }
}
 */








// Aritthmetic
/* public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus/remainder: " + (a % b));
    }
} */



// Relational Operator
/* public class Main{
    public static void main(String[] args) {
        System.out.println(10>9);
        System.out.println(10<9);
        System.out.println(10<=9);
        System.out.println(10>=9);
        System.out.println(10==9);
        System.out.println(10!=9);
    }
} */





// Logical Operator
/* public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(a > 5 && b > 10);
        System.out.println(a > 15 || b > 10);
        System.out.println(!(a > 5));
    }
} */




// Bitwise Operator
/* public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~4);
        //left shift
        System.out.println(5<<2);
        System.out.println(16<<2);
        // Right Shift
        System.out.println(5>>2);
        System.out.println(16>> 2);

    }
} */






