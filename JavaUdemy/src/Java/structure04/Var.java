package Java.structure04;

public class Var {
    public static void main(String[] args) {
        var text = "Hello Bublik";
        System.out.println(text);
        text = "ГЫГЫГЫ";
        System.out.println(text);
        text = "Hello " + System.getProperty("user.name");
        System.out.println(text);
    }
}