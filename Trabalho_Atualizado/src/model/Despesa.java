package model;

import java.time.LocalDate;

/**
 * Classe para objetos do tipo Despesa, onde serão contidos, os valores e
 * metodos do mesmo
 *
 * @author Amanda Miranda Zanella, Bruno Henrique Wiedemann Reis, Lucas Miguel
 * Vieira, Matheus Guilherme Jacinto
 */
public class Despesa extends Lancamento {

    private TipoDespesa tipoDespesa;

    /**
     * Construtor Despesa
     *
     * @param valor - valor da despesa
     * @param tipoDespesa - tipo da despesa
     * @param dataDespesa - data da despesa
     * @param tipoLancamento - tipo do lancamento
     */
    public Despesa(String valor, TipoDespesa tipoDespesa, LocalDate dataDespesa, String tipoLancamento) {//construtor de Despesa para setar os valores 
        setValor(valor);
        setTipoDespesa(tipoDespesa);
        setData(dataDespesa);
        setTipoLancamento(tipoLancamento);
    }

    /**
     * obtem o tipo da despesa
     *
     * @return TipoDespesa - tipo da despesa
     */
    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }

    /**
     * armazena o tipo de despesa
     *
     * @param tipoDespesa - tipo da despesa
     */
    public void setTipoDespesa(TipoDespesa tipoDespesa) {

        if (tipoDespesa == null) {
            throw new RuntimeException("Tipo não selecionado");
        }
        this.tipoDespesa = tipoDespesa;

    }
}
