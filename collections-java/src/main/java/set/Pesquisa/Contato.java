package main.java.set.Pesquisa;

import java.util.Objects;

public class Contato {
    //atributo
    private String nomes;
    private int numero;

    public Contato(String nomes, int numero) {
        this.nomes = nomes;
        this.numero = numero;
    }

    public String getNome() {
        return nomes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nomes, contato.nomes);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nomes);
    }

    public String toString() {
        return "{" + nomes + ","+ numero + "}";
    }
}
