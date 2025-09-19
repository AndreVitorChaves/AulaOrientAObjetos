/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1809;

/**
 *
 * @author IFSP
 */
public class Aula1809 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
    /*Cliente c1 = new Cliente();
    c1.setId(1);
    c1.setNome("André");
    
        System.out.println(c1.getNome());
        System.out.println(c1.getId());
        
    Endereco e1 = new Endereco();
    
    e1.setCidade("Capivari");
    e1.setRua("Feijao");
        
    c1.setEnd(e1);
        System.out.println(c1.getEnd().getRua());*/
    
        Livro liv1 = new Livro();
        liv1.setNomeLivro("Três Porquinhos");
        liv1.setAnoPublicacao("1987");
        
        Autor aut1 = new Autor();
        aut1.setId(1);
        aut1.setNome("Machado De Assis");
        
        Genero gen1 = new Genero();
        gen1.setId(1);
        gen1.setDescricao("Terror");
        
        liv1.setAut(aut1);
        liv1.setGen(gen1);
        
           /* System.out.println(liv1.getNomeLivro());
            System.out.println(liv1.getAnoPublicacao());
            System.out.println(liv1.getAut().getNome());
            System.out.println(liv1.getGen().getDescricao());*/
           
           liv1.imprimir();
    
    }
    
}
