package dto;

import java.util.List;

public class VendaDTO {
    
    private String cliente;
    private List<ItemVendaDTO> itens;
    private String observacoes;

    public VendaDTO(String cliente, List<ItemVendaDTO> itens, String observacoes) {
        this.cliente = cliente;
        this.itens = itens;
        this.observacoes = observacoes;
    }

    public String getCliente() {
        return cliente;
    }

    public List<ItemVendaDTO> getItens() {
        return itens;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public static class ItemVendaDTO {
        private String produto;
        private int quantidade;
        private double valorTotal;

        public ItemVendaDTO(String produto, int quantidade, double valorTotal) {
            this.produto = produto;
            this.quantidade = quantidade;
            this.valorTotal = valorTotal;
        }

        public String getProduto() {
            return produto;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public double getValorTotal() {
            return valorTotal;
        }
    }
}
