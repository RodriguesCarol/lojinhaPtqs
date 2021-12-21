package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {
    private double TaxaImportação;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public void setValor(double novoValor){
        if(novoValor > -100) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que -100");
        }
    }

    public double getTaxaImportação() {
        return TaxaImportação;
    }

    public void setTaxaImportação(double taxaImportação) {
        TaxaImportação = taxaImportação;
    }

    public String getDadosFavorito() {
        //Sony, PS4 e 30
        return getNome() + ", " + this.getMarca() + " e " + this.getValor();
    }
}
