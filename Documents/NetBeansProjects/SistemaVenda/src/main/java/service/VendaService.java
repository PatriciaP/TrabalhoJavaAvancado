/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.VendaDAO;
import java.util.List;
import model.Venda;
import static service.ClienteService.clienteDAO;
import util.NegocioException;

/**
 *
 * @author Patricia Pieroni
 */
public class VendaService {

    static VendaDAO vendaDAO = new VendaDAO();

    public static void salvar(Venda v) throws NegocioException {

        vendaDAO.salvar(v);

    }

    public static boolean remover(Venda v) {
        return vendaDAO.remover(v.getIdVenda());
    }

    public static Venda buscarPorCodigo(Integer codigo) {
        return vendaDAO.findID(codigo);
    }

    public static  List<Venda> buscarTodos() {
        return vendaDAO.findAll();
    }

    public static String retornarCod() {
        return vendaDAO.retornarCod();
    }
}
