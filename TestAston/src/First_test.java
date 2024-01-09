import java.util.Scanner;

public class First_test {
    public void first_test(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число больше 7: ");
        int number = scanner.nextInt();
        if (number > 7){
            System.out.println("Привет");
        }
    }
}
