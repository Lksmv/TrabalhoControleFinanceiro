package model;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe responsavel pelo controle financeiro de uma pessoa
 *
 * @author Amanda Miranda Zanella, Bruno Henrique Wiedemann Reis, Lucas Miguel
 * Vieira, Matheus Guilherme Jacinto
 *
 */
public class ControleFinanceiro {

    private Pessoa pessoa;
    private List<Object> extrato = new LinkedList<>();

    /**
     * Metodo que inclui um objeto Receita ou Despesa na List
     *
     * @param lancamento - Objeto que contem uma despesa ou receita
     */
    public void incluirLancamento(Lancamento lancamento) {
        extrato.add(lancamento);//add lancamento no List extrato
    }

    /**
     * Obtem a lista de objetos(Receita e Despesa)
     *
     * @return List - extrato
     */
    public List<Object> getExtrato() {
        return extrato;//retorna o List
    }

    /**
     * obtem a Pessoa
     *
     * @return Pessoa - Objeto pessoa
     */
    public Pessoa getPessoa() {
        return pessoa;//Retorna Pessoa
    }

    /**
     * Metodo que armazena uma pessoa
     *
     * @param pessoa - Objeto pessoa
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;//seta na variavel pessoa a referencia do objeto criado
    }

    /**
     * Metodo que calcula o saldo das despesas e receitas de uma pessoa
     *
     * @author Amanda Miranda Zanella, Bruno Henrique Wiedemann Reis, Lucas
     * Miguel Vieira, Matheus Guilherme Jacinto
     * @param isFilter - paremetro de identificação da operação de calculo,
     * sendo true até a data atual e false para data indefinida
     * @return double - saldo calculado
     */
    public double calcularSaldo(boolean isFilter) {//true = data atual / false data indefinida
        double saldoTotal = 0;
        LocalDate agora = LocalDate.now();//data atual
        if (isFilter) {//filtro para identificar se o saldo para retornar deve ser o saldo até o momento ou o saldo total sendo true para data atual e false para data indefinida
            for (Object extract : getExtrato()) {//for each do List de Lancamentos

                if (extract instanceof Despesa) {//verifica se o lancamento é instancia de Despesa

                    LocalDate dataInformada = ((Despesa) extract).getData();//pega a data informada do lançamento

                    if (dataInformada.isBefore(agora) || dataInformada.isEqual(agora)) { // compara a data informada , caso seja <= 
                        saldoTotal -= ((Despesa) extract).getValor(); //ira subtrair o valor do saldototal
                    }

                } else if (extract instanceof Receita) {//caso o objeto não seja Despesa e seja Receita

                    LocalDate dataInformada = ((Receita) extract).getData(); //pega a data informada do lançamento

                    if (dataInformada.isBefore(agora) || dataInformada.isEqual(agora)) { // compara a data informada, caso seja <=
                        saldoTotal += ((Receita) extract).getValor(); // ira adicionar o valor para o saldo
                    }

                }
            }
        } else {//caso seja false ira calcular o saldo sem data definida
            for (Object extract : getExtrato()) { // for each para percorer o List de lancamentos
                if (extract instanceof Despesa) { // verifica se o objeto é instancia de Despesa 
                    saldoTotal -= ((Despesa) extract).getValor(); // caso seja , pega o valor do objeto e decrementa do saldo total
                } else if (extract instanceof Receita) { //caso não seja de Despesa, ele verifica se o objeto é instancia de Receita
                    saldoTotal += ((Receita) extract).getValor(); // caso seja , pega o valor e adiciona no saldo
                }
            }

        }

        return saldoTotal;//retorna o valor calculado 
    }

}
