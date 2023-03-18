import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int math,physics,chemical,turkish,history,music;

        System.out.print("Your math grade: ");
        math = input.nextInt();

        System.out.print("Your physics grade: ");
        physics = input.nextInt();

        System.out.print("Your chemistry grade: ");
        chemical = input.nextInt();

        System.out.print("Your turkish grade: ");
        turkish = input.nextInt();

        System.out.print("Your history grade: ");
        history = input.nextInt();

        System.out.print("Your music grade: ");
        music = input.nextInt();

        double average = (math + physics + chemical + turkish + history + music) / 6.0;
        System.out.println("Your average grade: " + average);

        String result = average >= 60 ? "Successful" : "Unsuccessful";
        System.out.println("Result: " + result);
    }
}