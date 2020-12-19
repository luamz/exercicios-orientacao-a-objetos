package ex7;
/* @author Luam */

public class Caixa {
    String cliente;
    Pedido pedido;
    String pagamento;
    
    
    
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
