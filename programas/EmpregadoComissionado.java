import javax.swing.JOptionPane;

public class EmpregadoComissionado extends Object
{
   protected String nome;                              
   protected String sobrenome;                               
   protected String cpf;                   
   protected double vendasSemanais; 
   protected double porcentagemDeComissao; 
        
   public EmpregadoComissionado(String n, String s,
   String ncpf, double vendas, double porc)                                     
   {                                                                  
      nome = n;
      sobrenome = s;
      cpf = ncpf;      
      setVendasSemanais(vendas);       
      setPorcentagemDeComissao(porc);
   }
   
   public void setNome(String n)
   {
      nome = n;
   } 
      
   public String getNome()
   {
      return nome;
   }
      
   public void setSobrenome(String s)
   {
      sobrenome = s;
   }
   
   public String getSobrenome()
   {
      return sobrenome;
   }
   
   public void setCPF(String n)
    {
       cpf = n;
    }
    
    public String getCPF()
    {
       return cpf;
    }
    
    public void setVendasSemanais(double vendas)
    {
       vendasSemanais = (vendas < 0.0)? 0.0 : vendas;
    }
    
    public double getVendasSemanais()
    {
       return vendasSemanais;
    }

    public void setPorcentagemDeComissao(double porc)
    {
       porcentagemDeComissao = 
          (porc > 0.0 && porc < 1.0) ? porc : 0.0;
    }
    
    public double getPorcentagemDeComissao()
    {
       return porcentagemDeComissao;
    }
    
    public double calcula()              
    {                                     
       return vendasSemanais * porcentagemDeComissao;
    }

    public String toString()                                         
    {                                                                
       return "Nome do empregado: " + nome + " " + sobrenome +                
              "\nCPF: " + cpf +            
              "\nVendas Semanais: " + vendasSemanais +                                  
              "\nPorcentagem da comissão: " + porcentagemDeComissao;                       
    }
 } 
 
 
class EmpregadoComissionadoComSalarioBase4 extends EmpregadoComissionado
{
   private double salarioBase; 
   
   public EmpregadoComissionadoComSalarioBase4 (String n, String s, String ncpf,  
          double vendas, double porc, double salario)                                     
   {                                   
     //chamada explícita ao construtor da superclasse                               
      super(n, s, ncpf, vendas, porc );
      setSalarioBase(salario);
   }
   
   public void setSalarioBase( double salario )
   {
   	  salarioBase = (salario<0.0)?0.0:salario;	
   }
   
   public double getSalarioBase()
   {
   	  return salarioBase; 	
   }   

   public double calcula()              
   {                                     
      return  super.calcula() + getSalarioBase();
   }
   
   public String toString()                                         
   {                                                                
      return super.toString() + "\nSalário base: " + getSalarioBase();
   }
}


//Programa que testa as classes anteriores:
 
 
class TestaEmpregadoComissionado4 
{
   public static void main(String args[]) 
   {
      String str;
      EmpregadoComissionadoComSalarioBase4 empregado = new EmpregadoComissionadoComSalarioBase4("José", "da Silva", "22222222222", 5000, 0.04, 300 );      
      
      str = "Nome: " + empregado.getNome()     +
            "\nSobrenome: " + empregado.getSobrenome()+
            "\nCPF: " + empregado.getCPF()      +
            "\nVendas: " + empregado.getVendasSemanais()+
            "\n% de comissão: " + empregado.getPorcentagemDeComissao()+
            "\nSalário base: " + empregado.getSalarioBase();
            
      JOptionPane.showMessageDialog(null, str + "\nSalário final: " + empregado.calcula(), "Dados do empregado", JOptionPane.PLAIN_MESSAGE);
         
      empregado.setSalarioBase(1000);    
         
      JOptionPane.showMessageDialog(null, empregado.toString() + "\nSalário: " + empregado.calcula(), "Dados atualizados do empregado", JOptionPane.INFORMATION_MESSAGE);
      System.exit(0);
   }
}



    
  




