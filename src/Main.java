import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String TodayIsWonderfulDay; //1

        final int NUM = 12; //2

        String word = "degree"; //3

        TodayIsWonderfulDay = NUM + word; //4

        System.out.println("Value of todayIsWonderfulDay: " + TodayIsWonderfulDay);
        System.out.println("Value of constant NUM: " + NUM);
        System.out.println("Value of variable word: " + word); //5

        if (NUM < 0) {
            System.out.println("вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("вы сохранили положительное число");
        } else {
            System.out.println("вы сохранили ноль");
        } //6

        System.out.print("Введи свое имя: " ); //7

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine(); //8

        System.out.print("Привет " + userName + "!");

    }
}