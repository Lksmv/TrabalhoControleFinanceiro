package model;

import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 * Classe para objetos do tipo despesa e receita
 *
 * @author Amanda Miranda Zanella, Bruno Henrique Wiedemann Reis, Lucas Miguel
 * Vieira, Matheus Guilherme Jacinto
 */
public class Lancamento implements Comparable<Lancamento> {

    private double valor;
    private LocalDate data;
    private String tipoLancamento;

    /**
     * Obtem o valor do lancamento
     *
     * @return double - valor do lancamento
     */
    public double getValor() {
        return valor;
    }

    /**
     * armazena e verifica o valor informado
     *
     * @param valorInformado String - valor informado
     */
    public void setValor(String valorInformado) {
        if (!"".equals(valorInformado)) {

            String trocarPonto = valorInformado.substring(0, valorInformado.length()).trim().replaceAll(",", ".");//caso tenha virgula, vai trocar a virgula por ponto
            double valorAlterado = Double.parseDouble(trocarPonto);//transforma o string em double
            DecimalFormat d = new DecimalFormat("#.00");//define o modelo de valor 
            String formatarValor = d.format(valorAlterado);//formata o valor conforme o modelo
            trocarPonto = formatarValor.substring(0, formatarValor.length()).trim().replaceAll(",", ".");//trocar a virgula do modelo por ponto
            valorAlterado = Double.parseDouble(trocarPonto);//transforma a string em double

            if (valorAlterado < 0) {//caso o valor seja  menor que zero , lança exceção
                throw new NumberFormatException("Valor invalido");
            }
            this.valor = valorAlterado;

        } else { //caso valor seja vazio lança exceção
            throw new NumberFormatException("Valor invalido");
        }
    }

    /**
     * Obtem a data do lancamento
     *
     * @return LocalDate - data informada
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Armazena a data do lancamento
     *
     * @param data - data informada
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Obtem o tipo de lancamento
     *
     * @return String - tipo de lancamento
     */
    public String getTipoLancamento() {
        return tipoLancamento;
    }

    /**
     * armazena o tipo do lancamento
     *
     * @param tipoLancamento - tipo do lancamento
     */
    public void setTipoLancamento(String tipoLancamento) {
        this.tipoLancamento = tipoLancamento;
    }

    @Override
    public int compareTo(Lancamento l) {
        if (this.data.isBefore(l.getData())) {
            return -1;
        } else if (this.data.isAfter(l.getData())) {
            return +1;
        } else {
            return 0;
        }
    }
}
