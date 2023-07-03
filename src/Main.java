import banco.modelo.cliente.Cliente;
import banco.modelo.cliente.PessoaFisica;
import banco.modelo.cliente.PessoaJuridica;
import banco.modelo.conta.Conta;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        String tipoCliente = JOptionPane.showInputDialog(null, "Escolha o tipo de Cliente: \n" +
                "F - Pessoa Física\nJ - Pessoa Jurídica");

        if(tipoCliente.equals("F")){
            cliente = new PessoaFisica();
            ((PessoaFisica)cliente).setNome(JOptionPane.showInputDialog(null, "Nome do Cliente"));
            ((PessoaFisica)cliente).setCpf(JOptionPane.showInputDialog(null, "CPF do Cliente"));
        } else if (tipoCliente.equals("J")) {
            cliente = new PessoaJuridica();
            ((PessoaJuridica)cliente).setRazaoSocial(JOptionPane.showInputDialog(null, "Razão Social"));
            ((PessoaJuridica)cliente).setCnpj(JOptionPane.showInputDialog(null, "CNPJ do Cliente: "));
        } else {
            JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA! Encerrando o programa..");
            return;
        }

        cliente.setCidade(JOptionPane.showInputDialog(null, "Cidade do Cliente"));
        cliente.setEstado(JOptionPane.showInputDialog(null, "Estado do Cliente"));

        JOptionPane.showMessageDialog(null, "Dados do CLIENTE: \n" +
                cliente.listarDados());


        Conta conta = new Conta(cliente);

//        JOptionPane.showMessageDialog(null, "DADOS DA CONTA\n\n" +
//                conta.listarDados());




    }
}