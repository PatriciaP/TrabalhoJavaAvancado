/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.vendedor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Endereco;
import model.Vendedor;

/**
 *
 * @author Patricia Pieroni
 */
public class TableModelVendedor extends AbstractTableModel {

    private List<Vendedor> dados;
    private String[] colunas = {"CPF", "Nome", "Login", "Salário", "Dt. Nasc.",
        "Telefone", "Endereço"};

    public TableModelVendedor(List<Vendedor> dados) {
        this.dados = dados;
    }

    public TableModelVendedor(List<Vendedor> dados, String[] colunas) {
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
                return dados.get(rowIndex).getCpf();
            case 1:
                return dados.get(rowIndex).getNome();
            case 2:
                return dados.get(rowIndex).getLogin();
            case 3:
                return dados.get(rowIndex).getSalario();
            case 4:
                return formatData(dados.get(rowIndex).getDataNascimento());
            case 5:
                return dados.get(rowIndex).getTelefone();
            case 6:
                return dados.get(rowIndex).getEnderecos().toString();
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
                dados.get(rowIndex).setCpf((String) aValue);
                break;
            case 1:
                dados.get(rowIndex).setNome((String) aValue);
                break;
            case 2:
                dados.get(rowIndex).setLogin((String) aValue);
                break;
            case 3:
                dados.get(rowIndex).setSalario((Double) aValue);
                break;
            case 4:
                dados.get(rowIndex).setDataNascimento((Date) aValue);
                break;
            case 5:
                dados.get(rowIndex).setTelefone((String) aValue);
                break;
            case 6:
                dados.get(rowIndex).setEnderecos((Endereco) aValue);
                break;
        }
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }

    public void addRow(Vendedor v) {
        dados.add(v);
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
    
     private String formatData(Date dt) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(dt);
    }

}
