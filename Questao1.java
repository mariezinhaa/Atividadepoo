import java.util.Arrays;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int grupo = 1; grupo <= 5; grupo++) {
            System.out.println("\nGrupo " + grupo + ":");
            double[] valores = new double[4];

            for (int i = 0; i < 4; i++) {
                System.out.print("Digite o valor " + (char)('A' + i) + ": ");
                valores[i] = sc.nextDouble();
            }

            System.out.println("Ordem lida: " + Arrays.toString(valores));

            double[] crescente = valores.clone();
            Arrays.sort(crescente);
            System.out.println("Ordem crescente: " + Arrays.toString(crescente));

            double[] decrescente = crescente.clone();
            for (int i = 0; i < decrescente.length / 2; i++) {
                double temp = decrescente[i];
                decrescente[i] = decrescente[decrescente.length - 1 - i];
                decrescente[decrescente.length - 1 - i] = temp;
            }
            System.out.println("Ordem decrescente: " + Arrays.toString(decrescente));
        }
        sc.close();
    }
}

