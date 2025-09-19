/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1809;

/**
 *
 * @author IFSP
 */
public class Livro {
    
    private String nomeLivro;
    private String anoPublicacao;
    private Autor aut;
    private Genero gen;

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Autor getAut() {
        return aut;
    }

    public void setAut(Autor aut) {
        this.aut = aut;
    }

    public Genero getGen() {
        return gen;
    }

    public void setGen(Genero gen) {
        this.gen = gen;
    }
    
    public void imprimir(){
        System.out.println(getNomeLivro());
            System.out.println(getAnoPublicacao());
            System.out.println(getAut().getNome());
            System.out.println(getGen().getDescricao());
    }
    
}
