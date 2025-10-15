import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mais50 = 0, cont10a20 = 0, menos40 = 0;
        double somaAlturas10a20 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nPessoa " + i + ":");
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura (m): ");
            double altura = sc.nextDouble();
            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();

            if (idade > 50) mais50++;
            if (idade >= 10 && idade <= 20) {
                somaAlturas10a20 += altura;
                cont10a20++;
            }
            if (peso < 40) menos40++;
        }

        double mediaAltura = cont10a20 > 0 ? somaAlturas10a20 / cont10a20 : 0;
        double percMenos40 = (menos40 * 100.0) / 5;

        System.out.println("\nPessoas com mais de 50 anos: " + mais50);
        System.out.printf("Média das alturas (10 a 20 anos): %.2f m%n", mediaAltura);
        System.out.printf("%% de pessoas com menos de 40 kg: %.2f%%%n", percMenos40);

        sc.close();
    }
}
