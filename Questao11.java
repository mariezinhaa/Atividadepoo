import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] parcelas = {6, 12, 18, 24, 30, 36, 42, 48, 54, 60};
        double[] acrescimos = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};

        System.out.print("Digite o valor do carro: R$ ");
        double valor = sc.nextDouble();

        System.out.printf("%nÀ vista: R$ %.2f (20%% de desconto)%n", valor * 0.8);
        System.out.println("\nParcelamento:");
        System.out.println("Parcelas\tAcréscimo\tPreço final\tValor da parcela");

        for (int i = 0; i < parcelas.length; i++) {
            double precoFinal = valor * (1 + acrescimos[i] / 100);
            double valorParcela = precoFinal / parcelas[i];
            System.out.printf("%d\t\t%.0f%%\t\tR$ %.2f\t\tR$ %.2f%n",
                    (int) parcelas[i], acrescimos[i], precoFinal, valorParcela);
        }

        sc.close();
    }
}

