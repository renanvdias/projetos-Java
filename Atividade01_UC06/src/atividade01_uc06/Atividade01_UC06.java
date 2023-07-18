/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade01_uc06;
import java.util.Scanner;

public class Atividade01_UC06 {

    public static void main(String[] args) {
        float margem, valor_margem, cotacao;
        transporte t = new transporte();
        hospedagem h = new hospedagem();
        pacote p = new pacote ();
        venda v = new venda();
        Scanner entrada = new Scanner(System.in);
        System.out.println("BEM VINDO A AGENCIA DE VIAGENS");
        System.out.println("Informe o nome do cliente: ");
        v.setNome_cliente(entrada.nextLine());
        System.out.println("Informe o meio de pagamento: ");
        v.setForma_pagamento(entrada.nextLine());
        System.out.println("Digite o tipo de transporte (aéreo, rodoviário, marítimo etc) ");
        t.setTipo(entrada.nextLine());
        System.out.println("Digite o valor do transporte: ");
        t.setValor(entrada.nextFloat());
       Scanner entradah = new Scanner(System.in);
        System.out.println("Digite a descricão da hospedagem: ");
        h.setDescricao(entradah.nextLine());
        System.out.println("Digite o valor da diária: ");
        h.setValor_diaria(entrada.nextFloat());
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o destino da viagem: ");
        p.setDestino(input.nextLine());
        System.out.println("Digite o número de dias: ");
        p.setDias(entrada.nextInt());
        System.out.println("Digite o valor em cima da margem de lucro que deseja: ");
        valor_margem = entrada.nextFloat();
        System.out.println("Digite a margem de lucro que deseja: ");
        margem = entrada.nextFloat();
        System.out.println("Informe a cotação do dólar no dia de hoje: ");
        cotacao = entrada.nextFloat();
        p.setHosp(h);
        p.setTrans(t);
        v.setViagem(p);
        System.out.println("Parabéns " + v.getNome_cliente() +"! seu pacote de viagem para " + p.getDestino()+ " pelo meio " + t.getTipo() + " foi criado com sucesso");
        System.out.println("O valor da hospedagem é de $" + p.totalHospedagem(h.getValor_diaria(), p.getDias()));
        System.out.println("O valor do lucro é de $" + p.valorLucro(margem, valor_margem));
        System.out.println("O valor do transporte é de $" + t.getValor());
        System.out.println("O valor total é de $" + p.valorTotal(p.totalHospedagem(h.getValor_diaria(), p.getDias()), t.getValor(), p.valorLucro(margem, valor_margem)));
        v.conversao(p.valorTotal(p.totalHospedagem(h.getValor_diaria(), p.getDias()), t.getValor(), p.valorLucro(margem, valor_margem)), cotacao);
    }
}