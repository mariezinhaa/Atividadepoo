import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaAlturas = 0;
        int quantidade = 0;
        int idade;
        
        System.out.println("Digite idade e altura (idade <= 0 para encerrar):");
        
        while (true) {
            System.out.print("Idade: ");
            idade = scanner.nextInt();
            
            if (idade <= 0) {
                break;
            }
            
            System.out.print("Altura (m): ");
            double altura = scanner.nextDouble();
            
            if (idade > 50) {
                somaAlturas += altura;
                quantidade++;
            }
        }
        
        if (quantidade > 0) {
            double media = somaAlturas / quantidade;
            System.out.printf("Média das alturas de pessoas com mais de 50 anos: %.2fm\n", media);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi informada");
        }
        
        scanner.close();
    }
}
