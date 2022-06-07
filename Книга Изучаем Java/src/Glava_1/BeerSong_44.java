package Glava_1;

public class BeerSong_44 {
    public static void main(String[] args) {
        int beerNum=99;
        String word = "Бутылок";
        while (beerNum > 0) {
            if (beerNum ==1) {
                word = "Бутылка";}
            if (beerNum ==2) {
                word = "Бутылки";}
            if (beerNum ==3) {
                word = "Бутылки";}
            if (beerNum ==4) {
                word = "Бутылки";}
            System.out.println(beerNum + " " +word + " "+ "пива на стене");
            System.out.println(beerNum + " " + word + " " + "пива");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum -1;
            if (beerNum<1) {

                System.out.println("Нет бутылок пива на стене!");
            }
        }
    }
}
