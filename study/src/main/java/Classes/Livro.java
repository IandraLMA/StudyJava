package Classes;


import enumeration.OpcoesCategoriaLivro;

public class Livro {

    private OpcoesCategoriaLivro opcoesCategoriaLivro;
    private String titulo;
    private String autor;
    private String nacionalidade;
    private int pag;
    private double preco;

    public Livro(){
        this.titulo="";
        this.autor="";
        this.nacionalidade="";
        this.pag=0;
        this.preco=0.0;

    }
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getTitulo(){
         return this.titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public OpcoesCategoriaLivro getOpcoesCategoriaLivro() {
        return opcoesCategoriaLivro;
    }

    public void setOpcoesCategoriaLivro(OpcoesCategoriaLivro opcoesCategoriaLivro) {
        this.opcoesCategoriaLivro = opcoesCategoriaLivro;
    }
}
