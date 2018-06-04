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
    
    VIP("VIP"), PREMIUM("Premium"), BASICO("Básico");
    
    private String descricao;
    
    Categoria(String descricao){
           this.descricao = descricao;
    }
    
    public String getDescricao(){
       return descricao;
    }
}
