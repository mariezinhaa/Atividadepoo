import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int quantidade = 0;
        int idade;
        
        System.out.println("Digite as idades (0 para encerrar):");
        
        while (true) {
            idade = scanner.nextInt();
            
            if (idade == 0) {
                break;
            }
            
            soma += idade;
            quantidade++;
        }
        
        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.printf("Média das idades: %.1f\n", media);
        } else {
            System.out.println("Nenhuma idade foi informada");
        }
        
        scanner.close();
    }
}
