import java.util.Scanner;

class Estante
{
   public static void main(String args[])
   {
      Scanner info = new Scanner(System.in);
      int estante[][] = new int[4][3];
      int itens;
      
      for(int i=0; i<estante.length; i++)
      {
         for(int j=0; j<estante[i].length; j++)
         {
            System.out.printf("Digite a quantidade de itens no compartimento %d da prateleira %d: ", j+1, i+1);
            itens = info.nextInt();
            putItens(i, j, itens, estante);
         }
      }
      System.out.println("\nAssim ficou a estante:\n");
      exibeEstante(estante);
   }
   
   public static void putItens(int i, int j, int itens, int arr[][])
   {
      arr[i][j] = itens;
   }
   
   public static void exibeEstante(int arr[][])
   {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Prateleira %d: \n", i+1);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Compartimento %d: %d itens\n", j+1, arr[i][j]);
            }
            System.out.println();
         }
   }
}
