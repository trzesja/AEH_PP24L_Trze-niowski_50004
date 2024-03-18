package pl.pp;

import java.util.Scanner;

public class Mojatrzeciaaplikacja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę dni: ");
        int dni = scanner.nextInt();

        int tygodnie = dni / 7;
        int pozostaleDni = dni % 7;

        System.out.printf("%d dni to %d tygodnie i %d dni.", dni, tygodnie, pozostaleDni);
    }
}


























