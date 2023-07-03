package banco.modelo.conta;

import banco.modelo.cliente.Cliente;
import banco.modelo.cliente.PessoaFisica;
import banco.modelo.cliente.PessoaJuridica;

import java.text.DecimalFormat;

public class Conta {

    protected int numero;
    protected Cliente cliente;
    protected double saldo;

    int quantidade;

    // Constructors

    public Conta() {
        quantidade++;
        numero = quantidade;
        saldo = 0.0d;
    }
    public Conta(Cliente cliente) {
        quantidade++;
        numero = quantidade;
        saldo = 0d;
    }
    public Conta(String Cliente, double saldo) {
        quantidade++;
        numero = quantidade;
        this.saldo = saldo;
    }



    // Getters and Setters
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }



    // Methods
    public String listarDados(){
        String nome;
        if (cliente instanceof PessoaFisica){
            nome = ((PessoaFisica)cliente).getNome();
        } else {
            nome = ((PessoaJuridica)cliente).getRazaoSocial();
        }

        return "NÚMERO: " + numero + "\n" +
                "CORRENTISTA: " + nome + "\n" +
                "SALDO: " + DecimalFormat.getCurrencyInstance().format(saldo);

    }


    public boolean sacar(double valor){
        if(valor >= saldo){
            return false;
        } else {
            return true;
        }
    }
    public void depositar(double valor){
            saldo = saldo + valor;
        }
    public String getSaldoFormatado(){
        return "Saldo do Cliente: " + saldo;
    }


}
