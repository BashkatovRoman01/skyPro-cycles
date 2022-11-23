public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Задание 2
        System.out.println("Задание 2");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        // Задание 3
        System.out.println("Задание 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        // Задание 4
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        // Задание 5
        System.out.println("Задание 5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            if (year%4==0 && year%100!=0 || year%400==0)
            System.out.println(" Год " +year + " является високосным. ");
        }
        // Задание 6
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        // Задание 7
        System.out.println("// Задание 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        // Задание 8
        System.out.println("// Задание 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей. ");
        }
        // Задание 9
        System.out.println("// Задание 9");
        double salary1 = 29000;
        double percent = 0.01;
        double total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = (total1+salary1)*(1+percent);
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total1 + " рублей. ");
        }
    }
}