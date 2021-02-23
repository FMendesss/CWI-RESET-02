package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;

public class ContaCorrente implements br.com.banco.desgraca.domain.conta.ContaBancaria {

    private Integer numero;
    private br.com.banco.desgraca.domain.InstituicaoBancaria instituicao;

    public ContaCorrente(Integer numero, InstituicaoBancaria instituicao) {
        this.numero = numero;
        this.instituicao = instituicao;
    }
}