
public class Pessoa{
    protected String nome;
    protected String cpf;
    // atributos de Pessoa
    
    public Pessoa(String nome, String cpf){
      this.nome = nome;
      this.cpf = cpf;
    }

    public String getCpf(){
      return cpf;
  }

  public void setCpf(String cpf){
      this.cpf = cpf;
  }

  public String getNome(){
      return nome;
  }

  public void setNome(String nome){
      this.nome = nome;
  }
   
}



