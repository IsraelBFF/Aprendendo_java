package entities;

public class Empregado{
    private Integer id;
    private String nome;
    private Float salario;

    public Empregado(Integer id, String nome, Float salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Float getSalario(){
        return salario;
    }

    public void setSalario(Float salario){
        this.salario = salario;
    }

    public void increaseSalario(Float porcentagem){
        this.salario += this.salario*porcentagem/100;
    }

    public String toString(){
        return this.id + ", " + this.nome + ", " + this.salario;  
    }
}