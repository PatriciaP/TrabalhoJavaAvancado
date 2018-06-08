/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 *
 * @author Patricia Pieroni
 */
@Entity
@DiscriminatorValue("CLIENTE")
@OnDelete(action = OnDeleteAction.CASCADE)
public class Cliente extends Pessoa{
    
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    public Cliente() {
    }

    public Cliente(Categoria categoria,String cpf, String nome, Date dataNascimento, String telefone,Endereco endereco) {
        super(cpf, nome, dataNascimento, telefone,  endereco);
        this.categoria = categoria;
    }

    

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return nome +"  CPF: "+cpf;
    }
    
    
    
    
    
    
    
}
