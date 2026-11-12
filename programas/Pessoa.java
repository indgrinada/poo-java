import javax.swing.JOptionPane;

//Superclasse Pessoa
public class Pessoa extends Object
{
   protected String nome;                              
   protected String sobrenome;                               
   protected String cpf;                   
        
   public Pessoa(String n, String s, String ncpf)                                     
   {                                                                  
      nome = n;
      sobrenome = s;
      cpf = ncpf;      
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
   
   public void setCPF(String ncpf)
   {
      cpf = ncpf;
   } 
      
   public String getCPF()
   {
      return cpf;
   }
   
   public String toString()                                         
    {                                                                
       return "Nome: " + nome + " " + sobrenome +                
              "\nCPF: " + cpf;                       
    }
}


//Subclasse Aluno
class Aluno extends Pessoa
{
   private String curso;
   
   public Aluno(String n, String s, String ncpf, String c)
   {
      super(n, s, ncpf);
      setCurso(c);
   }
   
   public void setCurso(String c)
   {
      curso = c;
   }
   
   public String getCurso()
   {
      return curso;
   }
   
   public String toString()                                         
    {                                                                
       return super.toString() + "\nCurso: " + curso;                      
    }
}


//Teste de instância do objeto da Classe Aluno

class TesteAlunoPessoa
{
   public static void main(String args[])
   {
      Aluno ingrid = new Aluno("Ingrid", "Guedes", "91471894004", "ADS");
      
      JOptionPane.showMessageDialog(null, ingrid.toString(), "Dados do Aluno", JOptionPane.INFORMATION_MESSAGE);
   }
}