package Java.structure04;
import java.util.Scanner;

public class StructureOfAnyConsole {
    public static void main(String[] args) {
      // read source data
      //processing
      //display results

        // ПРИМЕР
        //ЧТЕНИЕ ВХОДНЫХ ДАННЫХ
        System.out.println("Введите число");
        var n = new Scanner(System.in).nextInt();

        //ОБРАБОТКА ДАННЫХ
        var result = n + 1;

        //ВЫВОД РЕЗУЛЬТАТА НА ЭКРАН
        System.out.println(result);
    }
}
