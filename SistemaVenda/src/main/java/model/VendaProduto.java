/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

/**
 *
 * @author devai
 */
@Entity
public class VendaProduto implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Codigo;
    @ManyToOne
    @JoinColumn(name = "codVenda")
    private Venda venda;
    
    @ManyToOne
    @JoinColumn(name = "codProduto")
    private Produto produto;
    
    @Column(nullable = false)
    private Integer qtde;
    private Float valor;
    
    @Transient
    private Float total;

    public VendaProduto() {
    }

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Float getTotal() {
         if (getProduto() != null) {
            return getProduto().getValor().floatValue()*getQtde();
        }
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.Codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VendaProduto other = (VendaProduto) obj;
        if (!Objects.equals(this.Codigo, other.Codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VendaProduto{" + "Codigo=" + Codigo + ", venda=" + venda + ", produto=" + produto + ", qtde=" + qtde + ", valor=" + valor + ", total=" + total + '}';
    }
    
    
    
    
}
