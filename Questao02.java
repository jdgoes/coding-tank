/* Dada uma turma de alunos com N alunos, sendo que essa quantidade deve ser solicitada e definida pelo usuário, 
solicite o nome e a nota de cada um dos alunos. 
Seu programa deve imprimir apenas aqueles alunos que tiraram nota maior que a média da nota de todos os alunos.
 * 
 */

import java.util.Locale;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] nomes = new String[n];
        double[] notas = new double[n];
        double somaNotas = 0;

        for (int i = 0; i < n; i++) {

            System.out.printf("Digite o nome do aluno %d: ", (i + 1));
            nomes[i] = sc.nextLine();

            System.out.printf("Digite a nota do aluno %d: ", (i + 1));
            notas[i] = sc.nextDouble();
            System.out.println();

            sc.nextLine();

            somaNotas += notas[i];
        }

        double media = somaNotas / n;

        System.out.printf("Alunos com nota acima da média (%.2f): %n", media);

        for (int i = 0; i < n; i++) {

            if (notas[i] > media) {

                System.out.println(nomes[i] + " - " + notas[i]);
                
            }

        }

        sc.close();
    }
}