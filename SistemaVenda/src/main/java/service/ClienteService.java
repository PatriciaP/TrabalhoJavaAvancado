/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ClienteDAO;
import java.io.Serializable;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import util.NegocioException;
import util.Validacoes;

/**
 *
 * @author devai
 */
public class ClienteService implements Serializable {

    static ClienteDAO clienteDAO = new ClienteDAO();

    public static boolean salvar(Cliente v) throws NegocioException {
     if (Validacoes.isNome(v.getNome())) {
            if (Validacoes.isCPF((v.getCpf()))) {
                clienteDAO.salvar(v);
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!",
                        "Cadastro Cliente", JOptionPane.INFORMATION_MESSAGE);
              return true;

            } else {
                throw new NegocioException("CPF inválido!", "Erro Cadastro Cliente");
            }

        } else {
            throw new NegocioException("Informe corretamente o nome!", "Erro Cadastro Cliente");

        }

    }
    
    public static boolean editar(Cliente v) throws NegocioException {
     if (Validacoes.isNome(v.getNome())) {
            if (Validacoes.isCPF((v.getCpf()))) {
                clienteDAO.salvar(v);
                JOptionPane.showMessageDialog(null, "Cliente editado com sucesso!",
                        "Edição Cliente", JOptionPane.INFORMATION_MESSAGE);
              return true;

            } else {
                throw new NegocioException("CPF inválido!", "Erro Ediçao Cliente ");
            }

        } else {
            throw new NegocioException("Informe corretamente o nome!", "Erro Edição Cliente");

        }

    }

    public List<Cliente> buscarTodos() {
        return clienteDAO.findAll();
    }

    public boolean remover(Cliente v) {
        return clienteDAO.remover(v.getIdPessoa());
    }

    public Cliente buscarPorCodigo(Integer codigo) {
        return clienteDAO.findID(codigo);
    }

    public static Boolean buscarCPF(String cpf) {

        return clienteDAO.buscarCPF(cpf);

    }
      
      
    public static String retornarQtdPessoas(){
        return clienteDAO.retornarCod();
    }
    

}
