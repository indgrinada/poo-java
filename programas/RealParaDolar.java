/* Programa que converte valor em Real para Dólar */
import java.util.Scanner;

public class RealParaDolar
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      
      double valorReal;
      double valorDolar;
      
      System.out.print("Digite o valor em Real R$: ");
      valorReal = input.nextDouble();
      
      valorDolar = valorReal/5.14;
      
      System.out.printf("%s %.2f","Valor em Dolar ($ 1 = R$ 5,14): $", valorDolar);  
   }
}
