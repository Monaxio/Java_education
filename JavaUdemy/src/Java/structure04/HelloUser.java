package Java.structure04;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("ты кто по жизни?");
        var name = new Scanner(System.in).nextLine();
        System.out.println("привет " + name);
    }
}
