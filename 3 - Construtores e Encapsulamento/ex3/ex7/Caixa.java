package ex3.ex7;
/* @author Luam */

public class Caixa {
    protected String cliente;
    protected Pedido pedido;
    protected String pagamento;

    public Caixa(String cliente, Pedido pedido, String pagamento) {
        this.cliente = cliente;
        this.pedido = pedido;
        this.pagamento = pagamento;
    }
    
    
    void imprimirPedido(){
        System.out.println("---------------------------------");
        System.out.println("Supermercados Markt");
        System.out.printf("Bom dia, Sr(a.) %s!\n", cliente);
        System.out.println("---------------------------------");
        System.out.printf("Pedido nº %d:\n", pedido.numero);
        pedido.imprimirItens();
        System.out.println("---------------------------------");
        System.out.printf("Total das Compras: R$%.2f \n", pedido.total());
        System.out.printf("Forma de pagamento: %s\n", pagamento);
        System.out.println("Volte Sempre!");
    }
}
