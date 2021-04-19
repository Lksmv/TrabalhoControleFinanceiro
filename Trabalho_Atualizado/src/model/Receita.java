package model;

import java.time.LocalDate;

/**
 * Classe para objetos do tipo Receita, onde serão contidos, os valores e
 * metodos do mesmo
 *
 * @author Amanda Miranda Zanella, Bruno Henrique Wiedemann Reis, Lucas Miguel
 * Vieira, Matheus Guilherme Jacinto
 */
public class Receita extends Lancamento {

    private TipoReceita tipoReceita;

    /**
     * Construtor Receita
     *
     * @param valor - valor informado
     * @param tipoReceita - tipo da receita
     * @param dataReceita - data da receita
     * @param tipoLancamento - tipo do lancamento
     */
    public Receita(String valor, TipoReceita tipoReceita, LocalDate dataReceita, String tipoLancamento) {
        setValor(valor);
        setTipoReceita(tipoReceita);
        setData(dataReceita);
        setTipoLancamento(tipoLancamento);
    }

    /**
     * obtem o tipo de receita
     *
     * @return TipoReceita - tipo da receita
     */
    public TipoReceita getTipoReceita() {
        return tipoReceita;
    }

    /**
     * armazena o tipo de receita
     *
     * @param tipoReceita - tipo da receita
     */
    public void setTipoReceita(TipoReceita tipoReceita) {
        if (tipoReceita == null) {
            throw new RuntimeException("Tipo não selecionado");
        }
        this.tipoReceita = tipoReceita;
    }
}
