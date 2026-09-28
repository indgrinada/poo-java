/* Programa que conta votos de eleição*/
import java.util.Scanner;

public class PrefeitoDeSP
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      
      int voto;
      int votosMonica = 0;
      int votosCebolinha = 0;
      int votosCascao = 0;
      int votosMagali = 0;
      
      do
      {
         System.out.printf("Digite o seu voto: ");
         voto = input.nextInt();
         
         switch(voto)
         {
            case 10: votosMonica += 1; break;
            case 20: votosCebolinha += 1; break;
            case 30: votosCascao += 1; break;
            case 40: votosMagali += 1; break;
            case -1: ;
            case 0: ; 
            case 1: ; break; // na realidade, qualquer valor inválido seria nulo, mas o exercício pede que apenas "1" seja assim considerado.
            default: System.out.println("\nOpcao invalida! Tente novamente.");
         }
      } while(voto != -1);
      
      if(votosMonica > votosCebolinha && votosMonica > votosCascao && votosMonica > votosMagali)
         System.out.printf("\nMonica venceu com %d votos!", votosMonica);
      else
         if(votosCebolinha > votosMonica && votosCebolinha > votosCascao && votosCebolinha > votosMagali)
            System.out.printf("\nCebolinha venceu com %d votos!", votosCebolinha);
         else
            if(votosCascao > votosCebolinha && votosCascao > votosMonica && votosCascao > votosMagali)
               System.out.printf("\nCascao venceu com %d votos!", votosCascao);
            else
               if(votosMagali > votosCebolinha && votosMagali > votosCascao && votosMagali > votosMonica)
                  System.out.printf("\nMagali venceu com %d votos!", votosMagali);
               else
                  System.out.printf("\nHouve empate. Convoque novas eleicoes!");
      
   }
}