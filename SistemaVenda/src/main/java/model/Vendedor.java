/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Patricia Pieroni
 */
@Entity
@DiscriminatorValue("VENDEDOR")
public class Vendedor extends Pessoa {

    private Double salario;
    private String login;
    private String senha;

    public Vendedor() {
     
    }

    public Vendedor(Double salario, String login, String senha, String cpf, String nome, Date dataNascimento, String telefone, Endereco endereco) {
        super(cpf, nome, dataNascimento, telefone, endereco);
        this.salario = salario;
        this.login = login;
        this.senha = senha;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
  

    

}
