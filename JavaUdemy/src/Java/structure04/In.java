package Java.structure04;

import java.util.Scanner;

public class In {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt(); //ввод целых чисел
        System.out.println(a);

        var d = new Scanner(System.in).nextDouble(); //ввод чисел с точкой
        System.out.println(d);

        var b = new Scanner(System.in).nextBoolean(); //тру фолс
        System.out.println(b);

        var c = new Scanner(System.in).nextLine().charAt(0); //символы
        System.out.println(c);

        var s = new Scanner(System.in).nextLine(); //текст
        System.out.println(s);

    }
}