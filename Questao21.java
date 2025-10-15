import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] votos = new int[7]; // índices 1-6 para os códigos
        int totalVotos = 0;
        int voto;
        
        System.out.println("Códigos: 1-4 (candidatos), 5 (nulos), 6 (brancos) - 0 para encerrar");
        
        while (true) {
            System.out.print("Digite o código do voto: ");
            voto = scanner.nextInt();
            
            if (voto == 0) {
                break;
            }
            
            if (voto >= 1 && voto <= 6) {
                votos[voto]++;
                totalVotos++;
            } else {
                System.out.println("Código inválido!");
            }
        }
        
        // Resultados
        System.out.println("\n=== RESULTADOS DA VOTAÇÃO ===");
        for (int i = 1; i <= 4; i++) {
            System.out.println("Candidato " + i + ": " + votos[i] + " votos");
        }
        System.out.println("Votos nulos: " + votos[5]);
        System.out.println("Votos em branco: " + votos[6]);
        
        if (totalVotos > 0) {
            double porcentagemNulos = (votos[5] / (double) totalVotos) * 100;
            double porcentagemBrancos = (votos[6] / (double) totalVotos) * 100;
            
            System.out.printf("Porcentagem de votos nulos: %.1f%%\n", porcentagemNulos);
            System.out.printf("Porcentagem de votos em branco: %.1f%%\n", porcentagemBrancos);
        }
        
        scanner.close();
    }
}
