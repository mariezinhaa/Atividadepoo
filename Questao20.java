import java.util.Scanner;

public class   Questao20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Média Aritmética");
            System.out.println("2. Média Ponderada");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite a primeira nota: ");
                    double nota1 = scanner.nextDouble();
                    System.out.print("Digite a segunda nota: ");
                    double nota2 = scanner.nextDouble();
                    double mediaAritmetica = (nota1 + nota2) / 2;
                    System.out.printf("Média Aritmética: %.1f\n", mediaAritmetica);
                    break;
                    
                case 2:
                    System.out.print("Digite a primeira nota: ");
                    double n1 = scanner.nextDouble();
                    System.out.print("Digite o peso da primeira nota: ");
                    double p1 = scanner.nextDouble();
                    
                    System.out.print("Digite a segunda nota: ");
                    double n2 = scanner.nextDouble();
                    System.out.print("Digite o peso da segunda nota: ");
                    double p2 = scanner.nextDouble();
                    
                    System.out.print("Digite a terceira nota: ");
                    double n3 = scanner.nextDouble();
                    System.out.print("Digite o peso da terceira nota: ");
                    double p3 = scanner.nextDouble();
                    
                    double somaPesos = p1 + p2 + p3;
                    double mediaPonderada = (n1 * p1 + n2 * p2 + n3 * p3) / somaPesos;
                    System.out.printf("Média Ponderada: %.1f\n", mediaPonderada);
                    break;
                    
                case 3:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            
        } while (opcao != 3);
        
        scanner.close();
    }
}
