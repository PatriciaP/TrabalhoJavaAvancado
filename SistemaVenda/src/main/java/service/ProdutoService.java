/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProdutoDAO;
import java.io.Serializable;
import java.util.List;
import javax.swing.JOptionPane;
import model.Produto;
import util.NegocioException;

/**
 *
 * @author devai
 */
public class ProdutoService implements Serializable {

    static ProdutoDAO produtoDAO = new ProdutoDAO();

    public static boolean salvar(Produto p) throws NegocioException {

        if (buscarPorCodigo(p.getIdProduto()) == null) {
            if (p.getValor().toString() != null) {
                if (p.getQtdEstoque() >= p.getEstoqueMin()) {
                    produtoDAO.salvar(p);
                    JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!",
                            "Cadastro Produto", JOptionPane.INFORMATION_MESSAGE);
                    return true;
                } else {
                    throw new NegocioException("A quantidade de estoque deve ser maior que o estoque minimo.",
                            "Erro Cadastro Produto");
                }

            } else {
                throw new NegocioException("Valor do produto não foi informado.", "Erro Cadastro Produto");
            }
        } else {
            throw new NegocioException("ID do produto ja cadastrado.", "Erro Cadastro Produto");
        }

    }

    public boolean remover(Produto p) {
        return produtoDAO.remover(p.getIdProduto());
    }

    public static Produto buscarPorCodigo(String codigo) {
        return produtoDAO.findID(codigo);
    }

    public List<Produto> buscarTodos() {
        return produtoDAO.findAll();
    }

}
