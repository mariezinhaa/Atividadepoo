import java.util.Scanner;

public class Questao25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalInvestido = 0;
        
        System.out.println("Digite código do cliente, tipo de investimento e valor:");
        System.out.println("Tipos: 1-Poupança (1.5%), 2-Plus (2%), 3-Renda Fixa (4%)");
        
        while (true) {
            System.out.print("Código do cliente (0 para encerrar): ");
            int codigo = scanner.nextInt();
            
            if (codigo == 0) {
                break;
            }
            
            System.out.print("Tipo de investimento (1/2/3): ");
            int tipo = scanner.nextInt();
            
            System.out.print("Valor investido: R$ ");
            double valor = scanner.nextDouble();
            
            double rendimento = 0;
            String tipoNome = "";
            
            switch (tipo) {
                case 1:
                    rendimento = valor * 0.015;
                    tipoNome = "Poupança";
                    break;
                case 2:
                    rendimento = valor * 0.02;
                    tipoNome = "Plus";
                    break;
                case 3:
                    rendimento = valor * 0.04;
                    tipoNome = "Renda Fixa";
                    break;
                default:
                    System.out.println("Tipo de investimento inválido!");
                    continue;
            }
            
            totalInvestido += valor;
            System.out.printf("Cliente %d - %s: Rendimento mensal: R$ %.2f\n", 
                            codigo, tipoNome, rendimento);
        }
        
        System.out.printf("\nTotal investido: R$ %.2f\n", totalInvestido);
        
        scanner.close();
    }
}
