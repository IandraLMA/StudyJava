package org.example;

import Classes.Livro;
import service.BibliotecaService;
import service.LivroService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        BibliotecaService bibliotecaService = new BibliotecaService();
        bibliotecaService.iniciar();
    }
}