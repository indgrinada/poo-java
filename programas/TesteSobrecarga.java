import java.util.Scanner;

class Teste
{
   public static void main(String args[])
   {
      Scanner info = new Scanner(System.in);
      int forma = 0;
      double lado, comprimento;
      
      while(forma != 1 && forma != 2)
      {
         System.out.print("Para terreno quadrado, digite 1. Para terreno retangular, digite 2: ");
         forma = info.nextInt();
         
         if(forma == 1)
         {
            System.out.print("Digite o lado: ");
            lado = info.nextDouble();
            System.out.printf("A area eh: %.2f", getArea(lado));
         }
         else
            if(forma == 2)
            {
               System.out.print("Digite o lado: ");
               lado = info.nextDouble();
               System.out.print("Digite o comprimento: ");
               comprimento = info.nextDouble();
               System.out.printf("A area eh: %.2f", getArea(lado, comprimento));
            }
            else
            {
               System.out.print("\nOpcao invalida! ");
            }
         }
   }
   
   
   public static double getArea(double lado)
   {
      return lado*lado;
   }
   
   public static double getArea(double lado, double comprimento)
   {
      return lado*comprimento;
   }
}
