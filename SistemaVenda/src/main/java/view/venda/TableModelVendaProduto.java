/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.venda;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Produto;
import model.VendaProduto;

/**
 *
 * @author patri
 */
public class TableModelVendaProduto extends AbstractTableModel{

    private List<VendaProduto> dados;
    private String[] colunas ={"Produto","Qtde","Valor","Total"};
    
    public TableModelVendaProduto(List<VendaProduto> dados) {
        this.dados = dados;
    }
    
    public TableModelVendaProduto(List<VendaProduto> dados, String[] colunas) {
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
        switch (columnIndex){
            case 0 : return dados.get(rowIndex).getProduto();
            case 1 : return dados.get(rowIndex).getQtde();
            case 2 : return dados.get(rowIndex).getProduto().getValor();
            case 3 : return dados.get(rowIndex).getTotal();
        }
        return null;
    }   
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
        if (aValue == null) return;
        
            switch (columnIndex){
            case 0 : dados.get(rowIndex).setProduto((Produto)aValue);break;
            case 1 : dados.get(rowIndex).setQtde((Integer)aValue);break;
            case 2 : dados.get(rowIndex).getProduto().setValor((Double)aValue);break;
            case 4 : dados.get(rowIndex).setTotal((Float) aValue);break;
        }      
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }

    public void addRow(VendaProduto a){
        dados.add(a);
        this.fireTableDataChanged();
    }

    public void removeRow(Integer linha){
        dados.remove(linha);
        this.fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return  colunas[column]; 
    }        
    
}
