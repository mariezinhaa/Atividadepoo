import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0;
        int total = 0;
        int canal;
        
        System.out.println("Digite os canais assistidos (4, 5, 7, 12 - 0 para encerrar):");
        
        while (true) {
            canal = scanner.nextInt();
            
            if (canal == 0) {
                break;
            }
            
            switch (canal) {
                case 4: canal4++; break;
                case 5: canal5++; break;
                case 7: canal7++; break;
                case 12: canal12++; break;
            }
            total++;
        }
        
        if (total > 0) {
            System.out.printf("Canal 4: %.1f%%\n", (canal4 / (double) total) * 100);
            System.out.printf("Canal 5: %.1f%%\n", (canal5 / (double) total) * 100);
            System.out.printf("Canal 7: %.1f%%\n", (canal7 / (double) total) * 100);
            System.out.printf("Canal 12: %.1f%%\n", (canal12 / (double) total) * 100);
        }
        
        scanner.close();
    }
}
