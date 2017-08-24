package exercicio2208;

public class Cliente extends Pessoa
{
    
    public Cliente(String nome, String cpf, double peso, double altura) 
    {
        super(nome, cpf, peso, altura);      
    }
    
    private String id;

    public Cliente(String nome, String cpf, double peso, double altura, String id) 
    {
       super(nome, cpf, peso, altura); 
       this.id = id;
    }
    
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public void agendarConsulta()
    {
        
    }
    
}
