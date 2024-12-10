/*
 * Um número para ser considerado primo deve ser divisível apenas por 1 e ele mesmo. 
 * Considerando isso, crie um programa que vai solicitar um número para o usuário e dizer se ele é primo.
 */

import java.util.Locale;
import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        
        sc.close();

        if (ePrimo(numero)) {
            System.out.printf("O número %d é primo. %n", numero);
        } else {
            System.out.printf("O número %d não é primo. %n", numero);
        }

    }

    public static boolean ePrimo(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
