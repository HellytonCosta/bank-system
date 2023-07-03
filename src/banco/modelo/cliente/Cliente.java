package banco.modelo.cliente;

public class Cliente {

    protected int codigo;
    protected String cidade;
    protected String estado;

    private static int quantidade;

    // Construtor
    public Cliente() {
        quantidade++;
        codigo = quantidade;
        cidade = "São Paulo";
        estado = "São Paulo";
    }

    // Construtor com entrada de parâmetros
    public Cliente(String cidade, String estado) {
        quantidade++;
        codigo = quantidade;
        this.cidade = cidade;
        this.estado = estado;
    }

    // Getters and Setters
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }

    // Método Listar dados
    public String listarDados() {
        return  "CÓDIGO: " + codigo + "\n" +
                "CIDADE: " + cidade + "\n" +
                "ESTADO: " + estado;

    }


    public static int qtdClientes(){
        return quantidade;
    }


}
