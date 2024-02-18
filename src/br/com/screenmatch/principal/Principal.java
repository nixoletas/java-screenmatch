package br.com.screenmatch.principal;

import br.com.screenmatch.calc.CalculadoraDeTempo;
import br.com.screenmatch.calc.FiltroRecomendacao;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Rocky", 1994);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.avalia(8);
        meuFilme.avalia(8);
        meuFilme.exibirFichaTecnica();

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(230);
        outroFilme.exibirFichaTecnica();

        Serie lost = new Serie("Lost", 2000);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.setDuracaoEmMinutos(lost.getDuracaoEmMinutos());
        lost.exibirFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("Tempo total: " + calculadora.getTempoTotal() + "min");

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);

        System.out.println(listaDeFilmes);
    }
}