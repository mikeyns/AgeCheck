import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Peça ao usuário para inserir um número entre 1 e 10
        System.out.print("Insira um numero entre 1 e 10: ");
        int numero = scanner.nextInt();
        
        // Verifique se o número está dentro do intervalo de 1 a 10 e se é par ou ímpar
        if (numero >= 1 && numero <= 10) {
            if (numero % 2 == 0) {
                System.out.println("O numero " + numero + ", e par.");
            } else {
                System.out.println("O numero " + numero + ", e impar.");
            }
        } else {
            System.out.println("O numero deve estar entre 1 e 10.");
        }
        
        // Feche o Scanner
        scanner.close();
    }
}