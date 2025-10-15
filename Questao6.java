import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalVista = 0, totalPrazo = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Transação " + i + " - Código (V/P): ");
            char codigo = sc.next().toUpperCase().charAt(0);
            System.out.print("Digite o valor: ");
            double valor = sc.nextDouble();

            if (codigo == 'V') {
                totalVista += valor;
            } else if (codigo == 'P') {
                totalPrazo += valor;
            } else {
                System.out.println("Código inválido!");
            }
        }

        double total = totalVista + totalPrazo;
        double primeiraPrestacao = totalPrazo / 3;

        System.out.printf("%nTotal à vista: R$ %.2f%n", totalVista);
        System.out.printf("Total a prazo: R$ %.2f%n", totalPrazo);
        System.out.printf("Total geral: R$ %.2f%n", total);
        System.out.printf("Primeira prestação (3x): R$ %.2f%n", primeiraPrestacao);

        sc.close();
    }
}
