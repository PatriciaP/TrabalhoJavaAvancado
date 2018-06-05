/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.produto;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Produto;

/**
 *
 * @author Patricia Pieroni
 */
public class TableModelProduto extends AbstractTableModel {

    private List<Produto> dados;
    private String[] colunas = {"ID", "Nome", "Estoque Min.", "Qtd. Estoque.",
        "Valor"};

    public TableModelProduto(List<Produto> dados) {
        this.dados = dados;
    }

    public TableModelProduto(List<Produto> dados, String[] colunas) {
        this.dados = dados;
        this.colunas = colunas;
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return dados.get(rowIndex).getIdProduto();
            case 1:
                return dados.get(rowIndex).getNome();
            case 2:
                return dados.get(rowIndex).getEstoqueMin();
            case 3:
                return dados.get(rowIndex).getQtdEstoque();
            case 4:
                return dados.get(rowIndex).getValor();
           
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (aValue == null) {
            return;
        }

        switch (columnIndex) {
            case 0:
                dados.get(rowIndex).setIdProduto((String) aValue);
                break;
            case 1:
                dados.get(rowIndex).setNome((String) aValue);
                break;
            case 2:
                dados.get(rowIndex).setEstoqueMin((Integer) aValue);
                break;
            case 3:
                dados.get(rowIndex).setQtdEstoque((Integer) aValue);
                break;
            case 4:
                dados.get(rowIndex).setValor((Double) aValue);
                break;
        }
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }

    public void addRow(Produto c) {
        dados.add(c);
        this.fireTableDataChanged();
    }

    public void removeRow(Integer linha) {
        dados.remove(linha);
        this.fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

}
