package contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int primeiroValor = terminal.nextInt();
        System.out.print("Digite o segundo valor: ");
        int segundoValor = terminal.nextInt();

        try {
            contar(primeiroValor, segundoValor);
        } catch (ParametrosInvalidosException errorMessage) {
            System.out.println(errorMessage);   
        }
        
        terminal.close();
    }

    static void contar(int primeiroValor, int segundoValor) throws ParametrosInvalidosException{
        if (primeiroValor >= segundoValor) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = segundoValor - primeiroValor;
        System.out.println("Contagem: " + contagem);

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}