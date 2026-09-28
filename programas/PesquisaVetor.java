import java.util.Scanner;

class PesquisaVetor
{
   public static void main(String args[])
   {
      Scanner info = new Scanner(System.in);
      double vetor[] = new double[20];
      double chute;
      int acerto = 0;
      
      for(int i=0; i<20; i++)
      {
         if(i%2 == 0)
            vetor[i] = (i+1)*4.4;
         else
            vetor[i] = i*8;
      }
      
      System.out.print("Tente advinhar um numero do vetor de 20 elementos: ");
      chute = info.nextDouble();
      
      for(int i=0; i<20; i++)
      {
         if(chute == vetor[i])
         {
            System.out.printf("Parabens! Voce encontrou o numero %.2f na posicao %d", vetor[i], i+1);
            acerto++;
         }
         else
            if(i+1 == 20 && acerto == 0)
               System.out.printf("Oh, nao! O numero nao foi encontado no vetor.");
      }
   }
}
