/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tia;

/**
 *
 * @author tamyres
 */
public class Aluno {
    
    private int tia;
    private String senha;
    
    public Aluno(int tia, String senha){
        
        this.tia = tia;
        this.senha = senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    public void setTia(int tia){
        this.tia = tia;
    }
    
    
    public String getSenha(){
        return senha;
    }
    public int getTia(){
        return tia;
    }
}
