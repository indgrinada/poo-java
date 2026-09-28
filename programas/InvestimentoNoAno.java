/* Programa que calcula investimento ao longo de 1 ano */
import java.util.Scanner;

public class InvestimentoNoAno
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Digite o valor do capital investido (R$): ");
      double capitalInicial = input.nextDouble();
      
      System.out.print("Digite a taxa de juro mensal (%): ");
      double juro = input.nextDouble();
      
      for(int mes = 1; mes <= 12; mes++)
      {
         capitalInicial *= 1 + juro/100;
         System.out.printf("Mes %2d: R$ %.2f\n", mes, capitalInicial);
      }
   }
}
