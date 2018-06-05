/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.venda;

import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Cliente;
import model.Venda;
import model.Vendedor;

/**
 *
 * @author Patricia Pieroni
 */
public class TableModelVenda extends AbstractTableModel {

    private List<Venda> dados;
    private String[] colunas = {"Código", "Vendedor", "CPF Cliente", "Nome Cliente",
        "Data", "Valor", "Desconto", "Total"};

    public TableModelVenda(List<Venda> dados) {
        this.dados = dados;
    }

    public TableModelVenda(String[] colunas) {
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
                return dados.get(rowIndex).getIdVenda();
            case 1:
                return dados.get(rowIndex).getVendedor();
            case 2:
                return dados.get(rowIndex).getCliente().getCpf();
            case 3:
                return dados.get(rowIndex).getCliente().getNome();
            case 4:
                return dados.get(rowIndex).getDataVenda();

            case 5:
                return dados.get(rowIndex).getValor();
            case 6:
                return dados.get(rowIndex).getDesconto();
            case 7:
                return dados.get(rowIndex).getValorTotal();

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
                dados.get(rowIndex).setIdVenda((Integer) aValue);
                break;
            case 1:
                dados.get(rowIndex).setVendedor((Vendedor) aValue);
                break;
            case 2:
                dados.get(rowIndex).setCliente((Cliente) aValue);
                break;
            case 3:
                dados.get(rowIndex).setCliente((Cliente) aValue);
                break;
            case 4:
                dados.get(rowIndex).setDataVenda((Date) aValue);
                break;

            case 5:
                dados.get(rowIndex).setValor((Double) aValue);
                break;
            case 6:
                dados.get(rowIndex).setDesconto((Double) aValue);
                break;
            case 7:
                dados.get(rowIndex).setValorTotal((Double) aValue);
                break;
        }
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }

    public void addRow(Venda u) {
        dados.add(u);
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
