package com.example.iossenac.appjava.model;


public class Conta {
    private String nome;
    private String agencia;
    private String numero;
    private float saldo;
    private float limite;


    public Conta(String nome, String agencia, String numero, float limite){
        this.nome = nome;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
        this.limite = limite;

    }

    public Conta(String nome, String agencia, String numero, float saldo, float limite){
        this.nome = nome;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;

    }

    public void depositar(float valor){
        this.saldo += valor;
    }

    public void sacar(float valor) throws Exception {
        if(this.saldo+this.limite >= valor)
            this.saldo -= valor;
        else {
            throw new Exception("Saldo insifuciente para está operacao!");
        }
    }

    public void transferir(Conta conta, float valor){
        if(this.saldo+this.limite >= valor){
            conta.depositar(valor);
            this.saldo -= valor;
        }
        else
            System.out.println("ERRO!");
    }

    public String getNome() {
        return nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite){
        this.limite = limite;
    }
}
