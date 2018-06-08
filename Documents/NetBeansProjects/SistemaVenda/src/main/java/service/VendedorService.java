/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.VendedorDAO;
import java.io.Serializable;
import java.util.List;
import javax.swing.JOptionPane;
import model.Pessoa;
import model.Vendedor;
import util.NegocioException;
import util.Validacoes;

/**
 *
 * @author devai
 */
public class VendedorService implements Serializable {

    static VendedorDAO vendedorDAO = new VendedorDAO();

    public static boolean salvar(Vendedor v) throws NegocioException {

        if (Validacoes.isNome(v.getNome())) {
            if (Validacoes.isCPF((v.getCpf()))) {
                vendedorDAO.salvar(v);
                JOptionPane.showMessageDialog(null, "Vendedor cadastrado com sucesso!",
                        "Cadastro Vendedor", JOptionPane.INFORMATION_MESSAGE);
              return true;

            } else {
                throw new NegocioException("CPF inválido!", "Erro Cadastro Vendedor");
            }

        } else {
            throw new NegocioException("Informe corretamente o nome!", "Erro Cadastro Vendedor");

        }

    }
    
    public static boolean editar(Vendedor v) throws NegocioException {

        if (Validacoes.isNome(v.getNome())) {
            if (Validacoes.isCPF((v.getCpf()))) {
                vendedorDAO.salvar(v);
                JOptionPane.showMessageDialog(null, "Vendedor editado com sucesso!",
                        "Edição Vendedor", JOptionPane.INFORMATION_MESSAGE);
              return true;

            } else {
                throw new NegocioException("CPF inválido!", "Erro Edição Vendedor");
            }

        } else {
            throw new NegocioException("Informe corretamente o nome!", "Erro Edição Vendedor");

        }

    }

    public static boolean remover(Vendedor v) {
       return vendedorDAO.remover(v.getIdPessoa());
    }

    public static Vendedor buscarPorCodigo(Integer codigo) {
        return vendedorDAO.findID(codigo);
    }

    public static List<Vendedor> buscarTodos() {
        return vendedorDAO.findAll();
    }

    public static Boolean buscarCPF(String cpf) {

        return vendedorDAO.buscarCPF(cpf);

    }

    public static Boolean validarLogin(String login, String senha) {

        return vendedorDAO.validarLogin(login, senha);

    }

    public static Boolean verificarLogin(String login) {


        return vendedorDAO.verificarLogin(login);

    }
    
    public static String retornarQtdPessoas(){
        return vendedorDAO.retornarCod();
    }
    
     public static Pessoa retornarDados(Integer id){
        return vendedorDAO.dados(id);
    }
    

}
