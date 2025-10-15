import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaSalarios = 0;
        int quantidade = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int mulheresSalarioAte200 = 0;
        double menorSalario = Double.MAX_VALUE;
        int idadeMenorSalario = 0;
        char sexoMenorSalario = ' ';
        
        System.out.println("Digite idade, sexo (M/F) e salário (idade negativa para encerrar):");
        
        while (true) {
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            
            if (idade < 0) {
                break;
            }
            
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().toUpperCase().charAt(0);
            
            System.out.print("Salário: R$ ");
            double salario = scanner.nextDouble();
            
            // Atualiza dados gerais
            somaSalarios += salario;
            quantidade++;
            
            // Atualiza maior e menor idade
            if (idade > maiorIdade) maiorIdade = idade;
            if (idade < menorIdade) menorIdade = idade;
            
            // Conta mulheres com salário até R$200
            if (sexo == 'F' && salario <= 200) {
                mulheresSalarioAte200++;
            }
            
            // Atualiza menor salário
            if (salario < menorSalario) {
                menorSalario = salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }
        }
        
        // Resultados
        if (quantidade > 0) {
            double mediaSalarios = somaSalarios / quantidade;
            System.out.printf("Média de salários: R$ %.2f\n", mediaSalarios);
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Mulheres com salário até R$200: " + mulheresSalarioAte200);
            System.out.println("Pessoa com menor salário - Idade: " + idadeMenorSalario + 
                             ", Sexo: " + sexoMenorSalario + 
                             ", Salário: R$ " + menorSalario);
        }
        
        scanner.close();
    }
}
