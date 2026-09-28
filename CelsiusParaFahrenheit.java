/* Programa que converte de Celsius para Fahrenheit */
import java.util.Scanner;

public class CelsiusParaFahrenheit
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      
      double valorC; // valor em Celsius
      double valorF; // valor em Fahrenheit
      
      System.out.print("Digite o valor em Celsius: ");
      valorC = input.nextDouble();
      
      valorF = valorC * 9/5.0 + 32;
      
      System.out.printf("%s %.2f","Valor em Fahrenheit: ", valorF);  
   }
}