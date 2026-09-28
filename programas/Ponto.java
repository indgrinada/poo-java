import javax.swing.JOptionPane;

class Ponto
{
   private double x, y;
   
   public Ponto()
   {
   }
   
   public Ponto(double x, double y)
   {
      this.x = x;
      this.y = y;
   }
   
   public void setX(double x)
   {
      this.x = x;
   }
   
   public void setY(double y)
   {
      this.y = y;
   }
   
   public double getX()
   {
      return (x);
   }
   
   public double getY()
   {
      return (y);
   }
   
   public void exibeCoordenada()
   {
      System.out.printf("Coordenadas do ponto x=%.2f e y=%.2f", x, y);
   }
}

class Linha
{
   Ponto p1, p2;
   
   public Linha()
   {
      p1 = new Ponto();
      p2 = new Ponto();
   }
   
   public Linha(double x1, double y1, double x2, double y2)
   {
      p1 = new Ponto(x1, y1);
      p2 = new Ponto(x2, y2);
   }
   
   public void setP1(double x, double y)
   {
      p1.setX(x);
      p1.setY(y);
   }
   
   public void setP2(double x, double y)
   {
      p2.setX(x);
      p2.setY(y);
   }
   
   public double getDistancia()
   {
      double dist;
      dist = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(),2));
      return dist;
   }
}

class AppPontoLinha
{
   public static void main(String args[])
   {
      Linha lin;
      
      lin = new Linha();
      
      lin.setP1(2, 2);
      lin.setP2(2, 4);
      
      JOptionPane.showMessageDialog(null, "Distancia: " + lin.getDistancia());
      System.exit(0);
   }
}
