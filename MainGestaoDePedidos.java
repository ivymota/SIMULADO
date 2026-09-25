package SIMULADO;

public class MainGestaoDePedidos {

    public static void main(String[] args) {

        GestaoPedidos pedido = new GestaoPedidos();

        pedido.adicionarPedido("Sushi");
        pedido.adicionarPedido("Bolo de Chocolate");
        pedido.adicionarPedido("Pizza");

        String atendido = pedido.proximoPedido();
        System.out.println("Pedido Atendido: " + atendido);

        System.out.println("Pedidos que ainda faltam: ");
        pedido.listarPedidos();
    }

}
