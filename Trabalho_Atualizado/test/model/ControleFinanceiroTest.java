/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amanda Miranda Zanella, Bruno Henrique Wiedemann Reis, Lucas Miguel
 * Vieira, Matheus Guilherme Jacinto
 */
public class ControleFinanceiroTest {

    ControleFinanceiro control = new ControleFinanceiro();
    Despesa despesa;
    Receita receita;

    //caso 1
    /**
     *
     */
    @Test
    public void test01CalcularSaldoDataAtualDespesa() {
        despesa = new Despesa("100", TipoDespesa.TRANSPORTE, LocalDate.now(), "Despesa");
        control.incluirLancamento(despesa);
        despesa = new Despesa("100", TipoDespesa.TRANSPORTE, LocalDate.parse("2025-12-12"), "Despesa");
        control.incluirLancamento(despesa);

        double saldoAtual = control.calcularSaldo(true);
        assertEquals(-100, saldoAtual, 0.01);
    }

    //caso 2
    /**
     *
     */
    @Test
    public void test02CalcularSaldoTotalDespesa() {
        despesa = new Despesa("100", TipoDespesa.TRANSPORTE, LocalDate.parse("2020-10-10"), "Despesa");
        control.incluirLancamento(despesa);
        despesa = new Despesa("100", TipoDespesa.TRANSPORTE, LocalDate.parse("2025-12-12"), "Despesa");
        control.incluirLancamento(despesa);

        double saldoTotal = control.calcularSaldo(false);
        assertEquals(-200, saldoTotal, 0.01);
    }

    //caso 3
    /**
     *
     */
    @Test
    public void test03CalcularSaldoDataAtualReceita() {
        receita = new Receita("100", TipoReceita.SALARIO, LocalDate.now(), "Receita");
        control.incluirLancamento(receita);
        receita = new Receita("100", TipoReceita.FERIAS, LocalDate.parse("2025-12-12"), "Receita");
        control.incluirLancamento(receita);

        double saldoAtual = control.calcularSaldo(true);
        assertEquals(100, saldoAtual, 0.01);
    }

    //caso 4
    /**
     *
     */
    @Test
    public void test04CalcularSaldoTotalReceita() {
        receita = new Receita("100", TipoReceita.SALARIO, LocalDate.parse("2020-10-10"), "Receita");
        control.incluirLancamento(receita);
        receita = new Receita("100", TipoReceita.FERIAS, LocalDate.parse("2025-12-12"), "Receita");
        control.incluirLancamento(receita);

        double saldoTotal = control.calcularSaldo(false);
        assertEquals(200, saldoTotal, 0.01);
    }

    //caso 5
    /**
     *
     */
    @Test
    public void test05CalcularSaldoTotalDiferenteSaldoAtual() {
        despesa = new Despesa("100", TipoDespesa.TRANSPORTE, LocalDate.now().plusDays(1), "Despesa");
        control.incluirLancamento(despesa);
        despesa = new Despesa("100", TipoDespesa.TRANSPORTE, LocalDate.parse("2020-10-10"), "Despesa");
        control.incluirLancamento(despesa);

        double saldoTotal = control.calcularSaldo(false);
        double saldoAtual = control.calcularSaldo(true);
        assertNotEquals(saldoTotal, saldoAtual);
    }

}
