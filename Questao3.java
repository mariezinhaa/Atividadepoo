import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] faixas = new int[5];

        for (int i = 1; i <= 8; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();

            if (idade <= 15) faixas[0]++;
            else if (idade <= 30) faixas[1]++;
            else if (idade <= 45) faixas[2]++;
            else if (idade <= 60) faixas[3]++;
            else faixas[4]++;
        }

        int total = 0;
        for (int f : faixas) total += f;

        System.out.println("\nQuantidade por faixa etária:");
        System.out.println("Até 15 anos: " + faixas[0]);
        System.out.println("16 a 30 anos: " + faixas[1]);
        System.out.println("31 a 45 anos: " + faixas[2]);
        System.out.println("46 a 60 anos: " + faixas[3]);
        System.out.println("Acima de 60 anos: " + faixas[4]);

        System.out.printf("%n%% até 15 anos: %.2f%%%n", (faixas[0] * 100.0 / total));
        System.out.printf("%% acima de 60 anos: %.2f%%%n", (faixas[4] * 100.0 / total));

        sc.close();
    }
}

