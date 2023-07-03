package banco.modelo.conta;

public class ContaCorrente extends Conta {

    private double limite;
    private double juros;

    // Constructor
    public ContaCorrente(){
        super();
        limite = 100.0d;
        juros = 1.0d;
    }
    public ContaCorrente(double limite, double juros) {
        this.limite = limite;
        this.juros = juros;
    }
    public ContaCorrente(String Cliente, double saldo, double limite, double juros) {
        super(Cliente, saldo);
        this.limite = limite;
        this.juros = juros;
    }

    // GETTERS AND SETTERS
    public double getLimite() { return limite; }
    public void setLimite(double limite) { this.limite = limite; }

    public double getJuros() { return juros; }
    public void setJuros(double juros) { this.juros = juros;  }

    public void aplicarJuros(){

    }

}
