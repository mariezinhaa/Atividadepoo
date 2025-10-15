import java.util.Scanner;

public class Questao15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sim = 0;
        int nao = 0;
        int mulheresSim = 0;
        int homens = 0;
        int homensNao = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o sexo (M/F) da pessoa " + (i + 1) + ": ");
            char sexo = scanner.next().toUpperCase().charAt(0);
            
            System.out.print("Digite a resposta (S/N): ");
            char resposta = scanner.next().toUpperCase().charAt(0);
            
            if (resposta == 'S') {
                sim++;
                if (sexo == 'F') {
                    mulheresSim++;
                }
            } else if (resposta == 'N') {
                nao++;
            }
            
            if (sexo == 'M') {
                homens++;
                if (resposta == 'N') {
                    homensNao++;
                }
            }
        }
        
        // Resultados
        System.out.println("Número de pessoas que responderam 'sim': " + sim);
        System.out.println("Número de pessoas que responderam 'não': " + nao);
        System.out.println("Número de mulheres que responderam 'sim': " + mulheresSim);
        
        if (homens > 0) {
            double porcentagemHomensNao = (homensNao / (double) homens) * 100;
            System.out.printf("Porcentagem de homens que responderam 'não': %.1f%%\n", porcentagemHomensNao);
        } else {
            System.out.println("Não há homens na pesquisa");
        }
        
        scanner.close();
    }
}
