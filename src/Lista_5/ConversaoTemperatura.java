/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_5;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author mateus
 */
public class ConversaoTemperatura {
    public static void main (String[] args){
        int escolha = 0;
        while (true){
            try{
                Scanner scan = new Scanner(System.in);
                System.out.println("Digite a opção que deseja:\nDigite 0 para sair\n1.Celsius para Farenheit\n2.Celsius para Kelvin\n3.Farenheit para Kelvin\n4.Kelvin para Farenheit\n5.Kelvin para Celsius\n6.Farenheit para Celsius");
                escolha = scan.nextInt();
                double temp=0.0;
                switch (escolha){
                    case 0:
                        System.out.println("Obrigado por usar a calculadora de temperaturas!");
                        exit(0);
                    case 1:
                        System.out.println("Digite a temperatura em Celsius para ser transformada em Farenheit:");
                        temp = scan.nextDouble();
                        ConversaoTemperatura.CelsiusToFaren(temp);
                        break;
                    case 2:
                        System.out.println("Digite a temperatura em Celsius para ser transformada em Kelvin:");
                        temp = scan.nextDouble();
                        ConversaoTemperatura.CelsiusToKilvin(temp);
                        break;
                    case 3:
                        System.out.println("Digite a temperatura em Farenheit para ser transformada em Kelvin:");
                        temp = scan.nextDouble();
                        ConversaoTemperatura.FarenToKilvin(temp);
                        break;
                    case 4:
                        System.out.println("Digite a temperatura em Kelvin para ser transformada em Farenheit:");
                        temp = scan.nextDouble();
                        ConversaoTemperatura.KelvinToFaren(temp);
                        break;
                    case 5:
                        System.out.println("Digite a temperatura em Kelvin para ser transformada em Celsius:");
                        temp = scan.nextDouble();
                        ConversaoTemperatura.KelvinToCelsius(temp);
                        break;
                    case 6:
                        System.out.println("Digite a temperatura em Farenheit para ser transformada em Celsius:");
                        temp = scan.nextDouble();
                        ConversaoTemperatura.FarenToCelsius(temp);
                        break;    
                    default:
                        System.out.println("Nenhuma opção selecionada, tente novamente.");
                        break;
                }
            } catch (Exception e){
                System.out.println("Valor inserido não é numerico, por favor se atenha a este fato.");
        }
    }
}

    private static void CelsiusToFaren(double temp) {
        System.out.printf("Temperatura em Farenheit é: %.2f\n", (temp*9/5+32));
    }

    private static void CelsiusToKilvin(double temp) {
        System.out.printf("Temperatura em Kelvin é: %.2f\n",(temp+273));
    }

    private static void FarenToKilvin(double temp) {
        System.out.printf("Temperatura em Kelvin é: %.2f\n",((temp-32)*5/9+273));
    }

    private static void KelvinToFaren(double temp) {
        System.out.printf("Temperatura em Farenheit é: %.2f\n", ((temp-273)*9/5+32));
    }

    private static void KelvinToCelsius(double temp) {
        System.out.printf("Temperatura em Celsius é: %.2f\n", (temp-273));
    }

    private static void FarenToCelsius(double temp) {
        System.out.printf("Temperatura em Celsius é: %.2f\n", ((temp-32)*5/9));
    }
}
