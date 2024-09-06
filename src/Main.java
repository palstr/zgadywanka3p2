import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Na lekcjach");

        int wylosowanaLiczba = (int) (Math.random() * 100 + 1);
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

        //zamiast System.out[...] można pisać 'sout'

        if (wpisanaLiczba == wylosowanaLiczba) {
            System.out.println("Wygrana!");
        } else {
            System.out.println("Pudło!");
        }

        // określić jak duża różnica
        //wyrażenie warunkowe zwraca wartość

        int roznica = wpisanaLiczba > wylosowanaLiczba ? wpisanaLiczba - wylosowanaLiczba : wylosowanaLiczba - wpisanaLiczba;

        System.out.println("Pomyłka o "+roznica);


    }
}