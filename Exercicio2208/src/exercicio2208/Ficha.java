
package exercicio2208;

public class Ficha 
{
    private Pessoa pessoa;
    private double imc;
    private String status, observacao;
    
    public void Ficha (Pessoa pessoa, double imc, String status, String observacao)
    {
        this.imc = imc;
        this.status = status;
        this.observacao = observacao;
    }
    public double getImc()
    {
        return imc;
    }
    public void setImc(double imc)
    {
        this.imc = imc;
    }
    public String getStatus()
    {
        return status;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }
    public String getObservacao()
    {
        return observacao;
    }
    public void setObservacao(String observacao)
    {
        this.observacao = observacao;
    }
}
