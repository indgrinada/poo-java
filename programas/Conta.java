class Conta
{
   private double saldo;
   
   public Conta()
   {
   }
   
   public Conta(double saldo)
   {
      saldo = saldo;
   }
   
   public double saldo()
   {
      return saldo;
   }
   
   public void saque(double valor)
   {
      saldo -= valor;
   }
   
   public void deposito(double valor)
   {
      saldo += valor;
   }
   
}
