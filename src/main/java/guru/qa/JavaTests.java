package guru.qa;

public class JavaTests {
    public static void main(String[] args) {

        // 0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int a = 9;
        int b = 5;
        System.out.println("a+b= " + (a+b));
        System.out.println("a-b= " + (a-b));
        System.out.println("a*b= " + (a*b));
        System.out.println("b/a= " + (b/a));

        // 1) применить несколько арифметических операций над int и double в одном выражении
        double c = 2.2;
        System.out.println("(a+b-c*c/a)= " + (a+b-c*c/a));

        // 2) применить несколько логических операций ( < , >, >=, <= )
        System.out.println("c<b= " + (c<b));
        System.out.println("a>b= " + (a>b));
        System.out.println("a>=c= " + (a>=c));
        System.out.println("a<=b= " + (a<=b));

        // 4) получить переполнение при арифметической операции
        int maxValue = Integer.MAX_VALUE;
        int maxResult = Integer.MAX_VALUE + 1;
        System.out.println("maxValue + 1 = " + (maxResult));

    }
    }
