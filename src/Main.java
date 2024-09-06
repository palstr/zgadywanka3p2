/*
git init
git config --global (global tylko w domu)
git config user.name "nazwa"
git config user.email "email"
git add .
git commit -m (od message) "commit"
git log (wszystkie commity)(wyjść za pomocą q)
git status
git remote add (add za 1. razem, by zmienić: set-url) origin [link]
git push -u origin master (za 1. razem, za kolejnymi tylko push)(master to branch)

PROGRAMUJEMY W FOLDERZE "SRC"
 */

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
        System.out.println("Wylosowaną liczbą było "+wylosowanaLiczba);

        roznica = roznica/10;

        // dzielenie 2 całkowitych zawsze da całkowitą. By była rzeczywista, trzeba rzutować.

        // instrukcja switch

        switch(roznica){
            case 0:
                System.out.println("Bardzo blisko!");
                break;

            case 1:
                System.out.println("Blisko!");
                break;

            case 2:
                System.out.println("Dość blisko...");
                break;

            default:
                System.out.println("Słabo...");
                break;
        }

        // wyrażenie switch

        System.out.println(
                switch(roznica){
                    case 0 -> "Bardzo dobrze!";
                    case 1 -> "Dobrze!";
                    case 2 -> "Dość dobrze.";
                    default -> "Słabo...";
                }
        );

        //zgadywanie 10 razy

        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę");
            wpisanaLiczba = klawiatura.nextInt();
            if (wpisanaLiczba == wylosowanaLiczba){
                System.out.println("Wygrana!");
                break;
            }
        }
        // można napisać 'fori' ^

        // tak długo, aż się zgadnie

        System.out.println("Podaj liczbę");
        wpisanaLiczba = klawiatura.nextInt();

        while(wpisanaLiczba != wylosowanaLiczba){
            if(wpisanaLiczba > wylosowanaLiczba){
                System.out.println("Wpisano za dużo!");
            }
            else{
                System.out.println("Wpisano za mało!");
            }
            System.out.println("Podaj liczbę");
            wpisanaLiczba = klawiatura.nextInt();
        }
        System.out.println("Wygrana!");
    }
}