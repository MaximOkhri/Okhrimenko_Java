import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите 'y', если хотите проверить тестовые задания, введите 'n', чтобы выйти: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        while (choice.equals("y")) {

            System.out.print("Введите номер задания от 1 до 3: ");
            Scanner choice_scanner = new Scanner(System.in);
            int choose_test = choice_scanner.nextInt();

            if (choose_test == 1) {
                First_test number_test = new First_test();
                number_test.first_test();
                System.out.print("Введите 'y' для продолжения, 'n' чтобы выйти: ");
                Scanner next_choice_scanner = new Scanner(System.in);
                choice = next_choice_scanner.nextLine();
            } else if (choose_test == 2) {
                Second_test name_test = new Second_test();
                name_test.second_test();
                System.out.print("Введите 'y' для продолжения, 'n' чтобы выйти: ");
                Scanner next_choice_scanner = new Scanner(System.in);
                choice = next_choice_scanner.nextLine();
            } else if (choose_test == 3) {
                Third_test array_test = new Third_test();
                array_test.third_test();
                System.out.print("\nВведите 'y' для продолжения, 'n' чтобы выйти: ");
                Scanner next_choice_scanner = new Scanner(System.in);
                choice = next_choice_scanner.nextLine();
            }
        }
    }
}



