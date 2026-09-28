import java.util.Scanner;

class Retangulo
{
   private double base, altura;
   
   public Retangulo()
   {
   }
   
   public Retangulo(double b, double a)
   {
   setBase(b);
   setAltura(a);
   }
   
   public void setBase(double b)
   {
   if(b>0)
      base = b;
    else
      base = 0;
   }
   
   public double getBase()
   {
   return base;
   }
   
   public void setAltura(double a)
   {
   if(a>0)
      altura = a;
    else
      altura = 0;
   }
   
   public double getAltura()
   {
   return altura;
   }
   
   public double getArea()
   {
   return base*altura;
   }
   
   public double getPerimetro()
   {
   return 2*base + 2*altura;
   }
}



class AplicacaoRetangulo
{
   public static void main(String args[])
   {
      Retangulo retangulo_o = new Retangulo();
      Scanner info = new Scanner(System.in);
      double base, alt;
      
      System.out.print("Digite a base");
      base = info.nextDouble();
      System.out.print("Digite a altura");
      alt = info.nextDouble();
      
      retangulo_o.setBase(base);
      retangulo_o.setAltura(alt);
      
      System.out.printf("\nA area do retangulo eh %.2f", retangulo_o.getArea());
      System.out.printf("\nO perimetro do retangulo eh %.2f", retangulo_o.getPerimetro());
    }
}