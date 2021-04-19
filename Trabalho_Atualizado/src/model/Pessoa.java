package model;

/**
 * Classe para representar a pessoa
 *
 * @author Amanda Miranda Zanella, Bruno Henrique Wiedemann Reis, Lucas Miguel
 * Vieira, Matheus Guilherme Jacinto
 */
public class Pessoa {

    private String nome;

    /**
     * Obtem o nome
     *
     * @return String - nome da pessoa
     */
    public String getNome() {
        return nome;
    }

    /**
     * armazena e verifica o nome informado
     *
     * @param nome - nome informado
     */
    public void setNome(String nome) {

        if (nome.equals("")) {//exceção caso nome vazio
            throw new IllegalArgumentException("Não foi informado um nome");
        } else if (nome.length() >= 30 || nome.length() <= 2) {//exceção caso nome com menos de 3 caracteres ou mais que 30
            throw new RuntimeException("Nome invalido, contem menos do que 3 caracteres ou mais que 30");
        } else if (contemNumero(nome)) {//execeção caso nome contenha numeros
            throw new NumberFormatException("Nome invalido, contem numeros");
        } else {
            this.nome = nome.trim();
        }
    }

    /**
     * verificar se o nome contem numero
     *
     * @param nome - nome da pessoa
     * @return boolean - true( caso contenha numero) e false ( caso não contenha
     * numero )
     */
    public boolean contemNumero(String nome) {

        for (int i = 0; i < 10; i++) {
            if (nome.contains(Integer.toString(i))) {
                return true;
            }
        }
        return false;
    }

}
