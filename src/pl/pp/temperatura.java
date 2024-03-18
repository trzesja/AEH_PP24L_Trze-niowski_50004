package pl.pp;

import java.util.Scanner;

public class temperatura {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double temperaturaFahrenheit;

    while (true) {
        System.out.print("Wprowadź temperaturę w skali Fahrenheit’a (-1 aby zakończyć): ");
        temperaturaFahrenheit = scanner.nextDouble();

        if (temperaturaFahrenheit == -1) {
            break;

        }

        double temperaturaCelsjusz = (temperaturaFahrenheit - 32.0) / 1.8;

        double temperaturaKelvin = temperaturaCelsjusz + 273.16;
        System.out.printf("Fahrenheit: %.2f°F, Celsjusz: %.2f°C, Kelvin: %.2fK\n", temperaturaFahrenheit, temperaturaCelsjusz, temperaturaKelvin);
    }
    System.out.println("Program zakończony.");
}
}

