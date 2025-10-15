import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somaIdades = 0;
        int contPesoAltura = 0;
        int contEntre10e30Mais190 = 0;
        int contMais190 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("\nPessoa " + i + ":");
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();
            System.out.print("Altura (m): ");
            double altura = sc.nextDouble();

            somaIdades += idade;
            if (peso > 90 && altura < 1.5) contPesoAltura++;
            if (altura > 1.9) {
                contMais190++;
                if (idade >= 10 && idade <= 30) contEntre10e30Mais190++;
            }
        }

        double mediaIdade = somaIdades / 10;
        double percIdadeEntre10e30 = contMais190 > 0 ? (contEntre10e30Mais190 * 100.0 / contMais190) : 0;

        System.out.printf("%nMédia das idades: %.2f%n", mediaIdade);
        System.out.println("Pessoas com peso > 90kg e altura < 1,50m: " + contPesoAltura);
        System.out.printf("%% de pessoas com 10-30 anos entre as >1,90m: %.2f%%%n", percIdadeEntre10e30);

        sc.close();
    }
}

