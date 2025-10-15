import java.util.Scanner;

public class Questao23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n=== MENU EMPRESA ===");
            System.out.println("1. Novo Salário");
            System.out.println("2. Férias");
            System.out.println("3. Décimo Terceiro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o salário atual: R$ ");
                    double salario = scanner.nextDouble();
                    double novoSalario;
                    
                    if (salario <= 2100) {
                        novoSalario = salario * 1.15; // 15% de aumento
                    } else if (salario <= 6000) {
                        novoSalario = salario * 1.10; // 10% de aumento
                    } else {
                        novoSalario = salario * 1.05; // 5% de aumento
                    }
                    
                    System.out.printf("Novo salário: R$ %.2f\n", novoSalario);
                    break;
                    
                case 2:
                    System.out.print("Digite o salário: R$ ");
                    double salarioFerias = scanner.nextDouble();
                    double valorFerias = salarioFerias + (salarioFerias / 3);
                    System.out.printf("Valor das férias: R$ %.2f\n", valorFerias);
                    break;
                    
                case 3:
                    System.out.print("Digite o salário: R$ ");
                    double salarioDecimo = scanner.nextDouble();
                    System.out.print("Digite quantos meses trabalhou (1-12): ");
                    int meses = scanner.nextInt();
                    
                    if (meses >= 1 && meses <= 12) {
                        double decimoTerceiro = (salarioDecimo * meses) / 12;
                        System.out.printf("Décimo terceiro: R$ %.2f\n", decimoTerceiro);
                    } else {
                        System.out.println("Quantidade de meses inválida!");
                    }
                    break;
                    
                case 4:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            
        } while (opcao != 4);
        
        scanner.close();
    }
}
