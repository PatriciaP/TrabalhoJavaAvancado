/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.VendaDAO;
import java.util.List;
import model.Venda;
import util.NegocioException;

/**
 *
 * @author Patricia Pieroni
 */
public class VendaService {

    VendaDAO vendaDAO = new VendaDAO();

    public void salvar(Venda v) throws NegocioException {

        vendaDAO.salvar(v);

    }

    public void remover(Venda v) {
        vendaDAO.remover(v.getIdVenda());
    }

    public Venda buscarPorCodigo(Integer codigo) {
        return vendaDAO.findID(codigo);
    }

    public List<Venda> buscarTodos() {
        return vendaDAO.findAll();
    }

}
