package SIMULADO;

import java.util.ArrayList;

public class GestaoPedidos {

    private ArrayList<String> pedidos;

    public GestaoPedidos() {

        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(String item) {

        pedidos.add(item);

    }

    public String proximoPedido() {

        if(pedidos.isEmpty())
            return "Lista Vazia";
        else
            return pedidos.remove(0);
    }

    public int quantidadePendentes() {

        return pedidos.size();
    }

    public void listarPedidos() {

        for(String itens : pedidos)
            System.out.println(itens);
    }

}
