/*
 * Um motorista precisa abastecer seu carro para uma viagem. 
 * O carro tem um consumo médio de combustível de 12 km por litro e o motorista planeja percorrer uma distância de 360 km. 
 * Crie um programa que solicite o preço do combustível por litro ao usuário e calcule o custo total da viagem. 
 * Além disso, informe quantos litros de combustível serão necessários para completar a viagem.
 * 
 */

import java.util.Locale;
import java.util.Scanner;


public class Questao01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double consumoMedio = 12.0;
        double distancia = 360.0;

        System.out.print("Informe o preço do combustível por litro: ");

        double precoPorLitro = sc.nextDouble();
        double litrosNecessarios = distancia / consumoMedio;
        double custoTotal = litrosNecessarios * precoPorLitro;

        System.out.printf("Serão necessários %.2f litros de combustível para completar a viagem.%n", litrosNecessarios);
        System.out.printf("O custo total da viagem será de R$ %.2f.%n", custoTotal);

        sc.close();
    }
}