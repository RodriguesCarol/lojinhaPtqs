package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {
    private String nome;
    private String marca;
    protected double valor;
    private List<ItemIncluso>itensInclusos;
    private Tamanho tamanho;

    //Construtor
    public Produto(String marcaInicial,Tamanho tamanhoInicial){
        this.marca= marcaInicial;
        this.tamanho = tamanhoInicial;


    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double novoValor){
        if(novoValor > 0) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String  novoNome){
        this.nome =novoNome;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String novaMarca){
        this.marca=novaMarca;
    }

    public Tamanho getTamanho(){
        return this.tamanho;

    }
        //enums
        public void setTamanho(Tamanho novoTamnanho){
            this.tamanho = novoTamnanho;
        }
    //public void setTamanho(String novoTamanho){
       // if (novoTamanho.equalsIgnoreCase("Pequeno") || novoTamanho.equalsIgnoreCase("Médio") || novoTamanho.equalsIgnoreCase("Grande")){
        //    this.tamanho= novoTamanho;
       // } else {
       //     throw new IllegalArgumentException("Tamanho pode ser Pequeno, Médio ou Grande");
       // }


    //}

    public List<ItemIncluso> getItensInclusos(){
        return this.itensInclusos;
    }

    public void setItensInclusos(List<ItemIncluso> novosItensInclusos){
        this.itensInclusos = novosItensInclusos;
    }

}
