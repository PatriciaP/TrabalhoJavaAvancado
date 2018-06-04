/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Patricia Pieroni
 */

@Entity
public class Venda implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVenda;
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    private Double valor;
    private Double desconto;
    private Double valorTotal;
    
    //Eager : ao carregar os dados de um carro, todos os produtos sao recuperados
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "venda_produto",
            joinColumns = @JoinColumn(name = "idVenda"),
            inverseJoinColumns = @JoinColumn(name = "idProduto")
              )
    private List<Produto> produtos;
    
    @ManyToOne
    private Vendedor vendedor;
    
    @ManyToOne
    private Cliente cliente;
    
    
    
    
    public Venda() {
    }

    public Venda(Integer idVenda, Date dataVenda, Double valor, Double desconto, Double valorTotal) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.valor = valor;
        this.desconto = desconto;
        this.valorTotal = valorTotal;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    

    public Integer getIdVenda() {
        return idVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public Double getValor() {
        return valor;
    }

    public Double getDesconto() {
        return desconto;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.idVenda);
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
        final Venda other = (Venda) obj;
        if (!Objects.equals(this.idVenda, other.idVenda)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
