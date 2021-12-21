package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
       //Recebendo os parametros do Construtor
        Produto meuProduto = new Produto("Nestle",Tamanho.MÉDIO);
        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(30);
       // meuProduto.setTamanho(Tamanho.GRANDE);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle",2);
       // primeiroItemIncluso.setNome("Controle");
       // primeiroItemIncluso.setQuantidade(2);
        itensInclusos.add(primeiroItemIncluso);

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogos",3);
        //segundoItemIncluso.setNome("Jogos");
        //segundoItemIncluso.setQuantidade(3);
        itensInclusos.add((segundoItemIncluso));


        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabos de Energia",2);
        //terceiroItemIncluso.setNome("Cabos de Energia");
        //terceiroItemIncluso.setQuantidade(2);
        itensInclusos.add(terceiroItemIncluso);


        meuProduto.setItensInclusos(itensInclusos);


        System.out.println(meuProduto.getItensInclusos().size());
        //System.out.println(meuProduto.getItensInclusos().get(0));
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getItensInclusos().get(0).getNome());
        System.out.println(meuProduto.getItensInclusos().get(0).getQuantidade());

        System.out.println("Começando apresentar os itens");

        for(ItemIncluso itemAtual :meuProduto.getItensInclusos()){
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());


        }

        System.out.println("Acabaram os Itens");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony",Tamanho.MÉDIO);
        meuProdutoNacional.setImpostoNacional(0.55789);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Samsung",Tamanho.GRANDE);
        meuProdutoInternacional.setTaxaImportação(0.30);
        System.out.println(meuProdutoInternacional.getTaxaImportação());

        meuProdutoNacional.setValor(30);
        //ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("sony",Tamanho.GRANDE);
        meuProdutoInternacional.setValor(-100.00);



    }
}
