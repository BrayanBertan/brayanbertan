/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exc;

/**
 *
 * @author Edutec
 */
public abstract class Banda implements IBanda{
    
    private String nome,estilo;
    private int numintegrantes;

    public Banda(String nome, String estilo, int numintegrantes) {
        this.nome = nome;
        this.estilo = estilo;
        this.numintegrantes = numintegrantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getNumintegrantes() {
        return numintegrantes;
    }

    public void setNumintegrantes(int numintegrantes) {
        this.numintegrantes = numintegrantes;
    }
    
     @Override
    public String retornaDados() {
     return this.getNome() 
             + this.getEstilo()
             + this.getNumintegrantes();
             
             
     
    }
    

    @Override
    public void AlteraNome(String nome) {
       this.setNome(nome);
    }
    
    
}
