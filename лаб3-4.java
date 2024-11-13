import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начальное число: ");
        int x = scanner.nextInt();
        System.out.print("Ведите конечное число  ");
        int y = scanner.nextInt();
        
        System.out.println("Чётные числа от " + x + "до " + y + ":");
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("Нечетные числа от " + x + " до " + y + ":");
        for (int i = x; i <= y; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}