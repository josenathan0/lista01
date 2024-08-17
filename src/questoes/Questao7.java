package questoes;

public class Questao7 {
    public static void main(String[] args) {
        System.out.println("Divisões usando int:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int divisaoInt = i / 2;
                System.out.println(i + " dividido por 2 = " + divisaoInt);
            }
        }

        System.out.println("\nDivisões usando double:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                double divisaoDouble = i / 2.0;
                System.out.println(i + " dividido por 2 = " + divisaoDouble);
            }
        }
    }
}
