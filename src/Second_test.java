import java.util.Scanner;

public class Second_test {
    public void second_test() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);
        } else{
            System.out.println("Нет такого имени");
        }

    }
}
