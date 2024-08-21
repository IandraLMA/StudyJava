package service;

import Classes.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaService {

    LivroService service = new LivroService();
    List<Livro> listaLivros =new ArrayList<>();

    public void iniciar(){
        int opcao=0;
        while (opcao !=100){
            opcao= menuOp();
            switch(opcao){
                case 1 -> listaLivros.add(service.preencher());
                case 2 -> service.removerLivro(listaLivros);
                case 3 -> service.infoLivroPorTitulo(listaLivros);
            }
        }
    }

    public static int menuOp(){
        Scanner leitor =new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("1-Inserir livro");
        System.out.println("2-Remover livrp");
        System.out.println("3-Pesquisar livro (titulo)");
        System.out.println("4-Pesquisar livro (autor)");
        System.out.println("0-Sair");
        System.out.println("------------------");
        System.out.println("Escolha uma opção:");
        return leitor.nextInt();

    }


}
