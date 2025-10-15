import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdadesOtimo = 0;
        int quantidadeOtimo = 0;
        int quantidadeRegular = 0;
        int quantidadeBom = 0;
        
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite a idade do espectador " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            
            System.out.print("Digite a opinião (3-ótimo, 2-bom, 1-regular): ");
            int opiniao = scanner.nextInt();
            
            if (opiniao == 3) {
                somaIdadesOtimo += idade;
                quantidadeOtimo++;
            } else if (opiniao == 2) {
                quantidadeBom++;
            } else if (opiniao == 1) {
                quantidadeRegular++;
            }
        }
        
        // Resultados
        if (quantidadeOtimo > 0) {
            double mediaIdadesOtimo = (double) somaIdadesOtimo / quantidadeOtimo;
            System.out.printf("Média das idades que responderam 'ótimo': %.1f\n", mediaIdadesOtimo);
        } else {
            System.out.println("Nenhuma pessoa respondeu 'ótimo'");
        }
        
        System.out.println("Quantidade de pessoas que responderam 'regular': " + quantidadeRegular);
        
        double porcentagemBom = (quantidadeBom / 15.0) * 100;
        System.out.printf("Porcentagem de pessoas que responderam 'bom': %.1f%%\n", porcentagemBom);
        
        scanner.close();
    }
}
