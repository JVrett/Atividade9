public class Loja {
    private Desconto desconto;
    
    public void setDesconto(Desconto desconto){
        this.desconto = desconto;
    }
    
    public double calcularValorFinal(double valor){
        return desconto.aplicarDesconto(valor);
    }
}

