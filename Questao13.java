import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma1 = 0, soma2 = 0, soma3 = 0;
        int cont1 = 0, cont2 = 0, cont3 = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.println("\nPessoa " + i + ":");
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();

            if (idade <= 10) { soma1 += peso; cont1++; }
            else if (idade <= 20) { soma2 += peso; cont2++; }
            else if (idade <= 30) { soma3 += peso; cont3++; }
            else { }
        }

        System.out.printf("%nMédia peso (1-10): %.2f%n", cont1 > 0 ? soma1 / cont1 : 0);
        System.out.printf("Média peso (11-20): %.2f%n", cont2 > 0 ? soma2 / cont2 : 0);
        System.out.printf("Média peso (21-30): %.2f%n", cont3 > 0 ? soma3 / cont3 : 0);
        System.out.printf("Média peso (>31): %.2");

    }
}


