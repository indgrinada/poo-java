import java.util.Scanner;

class Circunferencia
{
   private double raio;
   
   public Circunferencia()
   {
   }
   
   public Circunferencia(double r)
   {
      setRaio(r);
   }
   
   public void setRaio(double r)
   {
      if(r>0)
         raio = r;
      else
         raio = 0;
   }
   
   public double getDiametro()
   {
      return 2*raio;
   }
   
   public double getArea()
   {
      return 3.14*raio*raio;
   }
   
   public double getPerimetro()
   {
      return 2*3.14*raio;
   } 
}

class TesteCirunferencia
{
   public static void main(String args[])
   {
      Circunferencia circulo_o = new Circunferencia();
      Scanner info = new Scanner(System.in);
      double raio;
      
      System.out.print("Digite o raio: ");
      raio = info.nextDouble();
      
      circulo_o.setRaio(raio);
      
      System.out.printf("\nO diametro da circunferencia eh: %.2f", circulo_o.getDiametro());
      System.out.printf("\nA area da circunferencia eh: %.2f", circulo_o.getArea());
      System.out.printf("\nO perimetro da circunferencia eh: %.2f", circulo_o.getPerimetro());
   }
}
