package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {

        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));
        System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
        System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2));
        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control:");
        System.out.println(sumNum(5));
        System.out.println(sumEvenNum(20));
        System.out.println(factorial(7));
        System.out.println(recursiveFactorial(5));
    }

    public static int sumNum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumEvenNum(int num) {
        int sum = 0;
        int evenNumber = 2;
        for (int i = 0; i < num; i++)
        {
            sum += evenNumber;
            evenNumber += 2;
        }
        return sum;
    }

    public static int factorial(int num) {

        for (int i = num - 1; i > 0; i--){
            num = num * i;
        }
        return num;
    }

    public static int recursiveFactorial(int num) {
        if (num == 0 || num == 1)
        {
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }
}
