package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CarrinhoDeCompra {

    private List<Item> carrinhoList;

    public CarrinhoDeCompra() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        carrinhoList.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : carrinhoList) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        for (Item item : carrinhoList) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        carrinho.adicionarItem("Camiseta", 29.99, 2);
        carrinho.adicionarItem("Calça", 59.99, 1);
        carrinho.exibirItens();
        System.out.printf("Valor Total: %.2f%n", carrinho.calcularValorTotal());
        carrinho.removerItem("Camiseta");
        carrinho.exibirItens();
        System.out.printf("Valor Total: %.2f%n", carrinho.calcularValorTotal());
    }
}