public class main {

    


    public static void main(String[] args) {
        
        Loja loja = new Loja();
        
        double valorCompra = 500;
        
        loja.setDesconto(new DescontoClienteRegular());
        System.out.println(loja.calcularValorFinal(valorCompra));
        
        loja.setDesconto(new DescontoClientePremium());
        System.out.println(loja.calcularValorFinal(valorCompra));
        
        loja.setDesconto(new DescontoClienteVIP());
        System.out.println(loja.calcularValorFinal(valorCompra));
    }
}
