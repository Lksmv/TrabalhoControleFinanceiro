/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amanda Miranda Zanella, Bruno Henrique Wiedemann Reis, Lucas Miguel
 * Vieira, Matheus Guilherme Jacinto
 */
public class PessoaTest {

    public PessoaTest() {
    }

    @Test
    public void testContemNumeroNome() {
        Pessoa pessoa = new Pessoa();
        assertEquals(true, pessoa.contemNumero("M4theus"));
    }

    @Test
    public void testNaoContemNumeroNome() {
        Pessoa pessoa = new Pessoa();
        assertEquals(false, pessoa.contemNumero("Matheus"));
    }
}
