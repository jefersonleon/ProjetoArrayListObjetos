package br.ulbra.classes;

/**
 * @author Jeferson
 * Assunto: Projeto de uma agenda utilizando ArrayList de Objetos
 */
public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private String sobre;
    private String fone;

    public Pessoa() {
        //construtor simples inicializando os atributos
        this.nome = "Asdrubal";
        this.sobre = " da Silva";
        this.fone = "(51)99923-9876";
    }
    
   
    public Pessoa(String nome, String sobre, String fone) {
        this.nome = nome;
        this.sobre = sobre;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public String toString() {
        return  this.nome+" "+this.sobre+" - "+this.fone+"\n";

    }

    @Override
    public int compareTo(Pessoa p) {
        return this.getNome().compareTo(p.getNome());
    }

  

    
    
    
}
