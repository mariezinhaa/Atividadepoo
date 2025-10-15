import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contIdadePeso = 0, contOlhosAzuis = 0, contRuivosNaoAzuis = 0;
        int contAlturaMenor150 = 0;
        double somaIdadesAlturaMenor150 = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("\nPessoa " + i + ":");
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();
            System.out.print("Altura (m): ");
            double altura = sc.nextDouble();
            System.out.print("Cor dos olhos (A-azul, P-preto, V-verde, C-castanho): ");
            char olhos = sc.next().toUpperCase().charAt(0);
            System.out.print("Cor dos cabelos (P-preto, C-castanho, L-louro, R-ruivo): ");
            char cabelo = sc.next().toUpperCase().charAt(0);

            if (idade > 50 && peso < 60) contIdadePeso++;
            if (altura < 1.5) {
                contAlturaMenor150++;
                somaIdadesAlturaMenor150 += idade;
            }
            if (olhos == 'A') contOlhosAzuis++;
            if (cabelo == 'R' && olhos != 'A') contRuivosNaoAzuis++;
        }

        double mediaIdades = contAlturaMenor150 > 0 ? somaIdadesAlturaMenor150 / contAlturaMenor150 : 0;
        double percOlhosAzuis = (contOlhosAzuis * 100.0) / 6;

        System.out.println("\nPessoas com idade > 50 e peso < 60kg: " + contIdadePeso);
        System.out.printf("Média das idades (altura < 1,50m): %.2f%n", mediaIdades);
        System.out.printf("%% de olhos azuis: %.2f%%%n", percOlhosAzuis);
        System.out.println("Pessoas ruivas sem olhos azuis: " + contRuivosNaoAzuis);

        sc.close();
    }
}

