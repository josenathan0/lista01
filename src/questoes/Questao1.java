package questoes;

public class Questao1 {
    public static void main(String[] args) {
        int i = 5;
        int j = i;
        j = 10;
        System.out.println("i + j = " + j + i);
    }
}

//O resultado é 105, pois i e j estarão concatenando como duas strings.