import java.util.Scanner;

public class Questao24{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int numero;
        
        System.out.println("Digite números inteiros positivos (0 para encerrar):");
        
        while (true) {
            numero = scanner.nextInt();
            
            if (numero == 0) {
                break;
            }
            
            if (numero > 0) {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
        }
        
        if (maior != Integer.MIN_VALUE) {
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        } else {
            System.out.println("Nenhum número positivo foi informado");
        }
        
        scanner.close();
    }
}