package banco.modelo.conta;

import java.util.Date;

public class ContaPoupanca extends Conta {

    private Date aniversario;
    private double rendimento;

    public ContaPoupanca(Date aniversario, double rendimento) {
        this.aniversario = aniversario;
        this.rendimento = rendimento;
    }

    public ContaPoupanca(String Cliente, double saldo, Date aniversario, double rendimento) {
        super(Cliente, saldo);
        this.aniversario = aniversario;
        this.rendimento = rendimento;
    }

    public Date getAniversario() { return aniversario; }
    public void setAniversario(Date aniversario) { this.aniversario = aniversario; }

    public double getRendimento() { return rendimento; }
    public void setRendimento(double rendimento) { this.rendimento = rendimento; }

    public void aplicarRendimentos(){


    }

}
