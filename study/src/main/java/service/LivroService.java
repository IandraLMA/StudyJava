package service;

import Classes.Livro;
import enumeration.OpcoesCategoriaLivro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LivroService {



    public Livro preencher() {
        Livro livro = new Livro();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o titulo");
        livro.setTitulo(leitor.nextLine());
        System.out.println("Informe o autor");
        livro.setAutor(leitor.nextLine());
        System.out.println("Informe a nacionalidade:");
        livro.setNacionalidade(leitor.nextLine());
        System.out.println("Informe o número de páginas");
        livro.setPag(leitor.nextInt());
        System.out.println("Informe o preço:");
        livro.setPreco(leitor.nextDouble());
        System.out.println("Informe a categoria do livro:\n" );
        for(OpcoesCategoriaLivro op: OpcoesCategoriaLivro.values()){
            System.out.println(op.getNumeroCategoriaLivro() + "-"+ op.getCategoriaLivro());
        }


        livro.setOpcoesCategoriaLivro(OpcoesCategoriaLivro.obterPorKeyNumero(leitor.nextInt()));
        

        return livro;
    }



    public void imprimir(Livro livro) {
        System.out.println("Título:" + livro.getTitulo());
        System.out.println("Autor:" + livro.getAutor());
        System.out.println("Nacionalidade:" + livro.getNacionalidade());
        System.out.println("Páginas:" + livro.getPag());
        System.out.println("Preço" + livro.getPreco());
        System.out.println("Categoria:"+livro.getOpcoesCategoriaLivro().getCategoriaLivro());
    }

    public void removerLivro(List<Livro> lista) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o titulo:");
        String titulolivro = leitor.nextLine();
        for (int i = 0; i <= lista.size() - 1; i++) {
            Livro li = lista.get(i);
            if (titulolivro.equalsIgnoreCase(li.getTitulo())) {
                lista.remove(li);
            }
        }
    }

    public void infoLivroPorTitulo(List<Livro> lista) {
        System.out.println("Informe o titulo:");
        Scanner leitor = new Scanner(System.in);
        String titulolivro = leitor.nextLine();
        boolean achou=false;
        for (int i = 0; i <= lista.size() - 1; i++) {
            Livro li = lista.get(i);
            if (titulolivro.equals(li.getTitulo())) {
                achou = true;
                imprimir(li);
            }
        }
        if(!achou){
           System.out.println("não achou o livro");
        }

    }
    public void infoLivroPorAutor(List<Livro> lista){
        System.out.println("Informe o autor:");
        Scanner leitor = new Scanner(System.in);
        String autorlivro = leitor.nextLine();
        boolean achou=false;
        for (int i = 0; i <= lista.size() - 1; i++) {
            Livro li = lista.get(i);
            if (autorlivro.equals(li.getAutor())) {
                achou = true;
                imprimir(li);
            }
        }
        if(!achou){
            System.out.println("não achou o livro");
        }
    }
}