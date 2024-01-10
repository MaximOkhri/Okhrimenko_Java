import java.util.Arrays;

public class Third_test {
    public void third_test(){
        int[] arr_for_test = new int[15];
        for (int i = 0; i < arr_for_test.length; i++) {
            arr_for_test[i] = ((int)(Math.random() * 100));
        }
        System.out.println("Сгенерирован числовой массив: " + Arrays.toString(arr_for_test));
        System.out.print("Список чисел кратных 3: ");
        for (int number : arr_for_test){
            if (number != 0 && number % 3 == 0){
                System.out.print(number + " ");
            }
        }
    }
}
