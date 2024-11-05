package com.dio.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosInt;

    public SomaNumeros() {
        this.numerosInt = new ArrayList<>();
    }

    public List<Integer> getNumerosInt() {
        return numerosInt;
    }

    public void adicionarNumero(int numero){
        numerosInt.add(numero);
    }

    public double calcularSoma(){
        double soma = 0;
        if (!numerosInt.isEmpty()) {
            for (Integer numero : numerosInt) {
                soma += numero;
            }
        }
        return soma;
    }

    public double encontrarMaiorNumero(){
        double maior = Integer.MIN_VALUE;
        if (!numerosInt.isEmpty()) {
            for (Integer numero : numerosInt) {
                if (numero >= maior)
                    maior = numero;
            }
        }
        return maior;
    }

    public double encontrarMenorNumero(){
        double menor = Integer.MAX_VALUE;
        if (!numerosInt.isEmpty()) {
            for (Integer numero : numerosInt) {
                if (numero <= menor)
                    menor = numero;
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        if (!numerosInt.isEmpty()) {
            System.out.println(numerosInt);
        }
    }



    public static void main(String[] args) {
        // Criando uma instância da soma de números
        SomaNumeros somaNumeros = new SomaNumeros();

        // adicionando números na listas
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(35);

        // Exibindo os numeros
        somaNumeros.exibirNumeros();

        // Somando os números
        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());


        // Exibindo o maior número
        System.out.println("Maior: " + somaNumeros.encontrarMaiorNumero());

        // Exibindo o maior número
        System.out.println("Menor: " + somaNumeros.encontrarMenorNumero());
    }
}
