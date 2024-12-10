/*
* Uma família está dividindo uma pizza entre seus membros. 
* Crie um programa que solicite o número de membros da família e o número de fatias da pizza. 
* O programa deve calcular quantas fatias cada membro vai receber, e informar se haverá sobras e quantas fatias sobrarão. 
* Se a pizza não puder ser igualmente dividida, o programa deve sugerir quantas fatias adicionais são 
* necessárias para que todos recebam a mesma quantidade.
*/

import java.util.Locale;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de membros da família: ");
        int numMembros = sc.nextInt();

        System.out.print("Digite o número de fatias da pizza: ");
        int numFatias = sc.nextInt();

        int fatiasPorMembro = numFatias / numMembros;
        int sobras = numFatias % numMembros;

        System.out.printf("Cada membro receberá %d fatias. %n", fatiasPorMembro);

        if (sobras > 0) {

            System.out.printf("Haverá %d fatias sobrando. %n", sobras);

            int fatiasAdicionais = numMembros - sobras;

            System.out.printf("Para que todos recebam a mesma quantidade, são necessárias %d fatias adicionais. %n", fatiasAdicionais);

        } else {
            System.out.println("Não haverá sobras.");
        }

        sc.close();
    }
}
