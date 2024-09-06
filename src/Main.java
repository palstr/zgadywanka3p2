import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Na lekcjach");

        int wylosowanaLiczba = (int) (Math.random()*100+1);
        //rzutowanie na inta     ^ (wyrażane nawiasem)
        /*
        typy proste przechowują tylko wartość (pisane małą literą!!):
        logiczne - boolean
        całkowite - byte, short, int, long
        rzeczywiste - double, float
        znakowy - char

        typy złożone (mają własności i metody):
        String, Integer, Kosc
         */

        System.out.println(wylosowanaLiczba);

        //wczytywanie z klawiatury

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int wpisanaLiczba = klawiatura.nextInt();


    }



}