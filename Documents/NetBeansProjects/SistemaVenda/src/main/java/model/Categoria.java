/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Patricia Pieroni
 */
public enum Categoria {
    
    VIP("VIP",0.1), PREMIUM("Premium",0.2), BASICO("Básico",0.0);
    
    private final String descricao;
    private final Double desconto;
    
    Categoria(String descricao, Double desconto){
           this.descricao = descricao;
           this.desconto = desconto;
    }
    
    public String getDescricao(){
       return descricao;
    }


    public Double getDesconto() {
        return desconto;
    }
    
    
}
