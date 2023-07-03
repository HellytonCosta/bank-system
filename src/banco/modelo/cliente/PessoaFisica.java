package banco.modelo.cliente;

public class PessoaFisica extends Cliente{

    private String nome;
    private String cpf;

    public PessoaFisica(){
        super();
        nome = "INDEFINIDO";
        cpf = "";
    }
    public PessoaFisica(String cidade, String estado, String nome, String cpf){
        super(cidade, estado);
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    // Método listar Dados
    @Override
    public String listarDados() {
        return "NOME: " + nome + "\n" + "CPF: " + cpf + "\n" + super.listarDados();
    }

}
