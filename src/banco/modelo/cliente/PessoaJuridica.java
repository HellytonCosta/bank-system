package banco.modelo.cliente;

public class PessoaJuridica extends Cliente{

    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica() {
        this.cnpj = "INDEFINIDO";
        this.razaoSocial = "INDEFINIDO";
    }
    public PessoaJuridica(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String listarDados() {
        return "Razão Social: " + razaoSocial + "\n" + "CNPJ: " + cnpj + "\n" + super.listarDados();
    }
}

