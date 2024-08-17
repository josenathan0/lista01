package questoes;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalKm = 0;
        int totalLitros = 0;

        while (true) {
            System.out.print("Digite os quilômetros percorridos (ou -1 para sair): ");
            int km = scanner.nextInt();
            if (km == -1) break;

            System.out.print("Digite os litros de gasolina consumidos: ");
            int litros = scanner.nextInt();

            totalKm += km;
            totalLitros += litros;

            double consumo = (double) km / litros;
            System.out.println("Consumo deste tanque: " + consumo + " km/l");
        }

        if (totalLitros > 0) {
            double consumoTotal = (double) totalKm / totalLitros;
            System.out.println("Quilometragem percorrida: " + totalKm + " km");
            System.out.println("Total de litros consumidos: " + totalLitros + " litros");
            System.out.println("Consumo médio: " + consumoTotal + " km/l");
        }
    }
}
