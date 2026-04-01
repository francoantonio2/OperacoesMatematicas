package br.edu.operacoes;

public class Principal {

    public static void main(String[] args) {

        Soma soma = new Soma();
        Divisao divisao = new Divisao();

        try {
            System.out.println("Soma: " + soma.calcular(10, 5));
            System.out.println("Divisão: " + divisao.calcular(10, 0));

        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro geral: " + e.getMessage());
        }

    }

}
