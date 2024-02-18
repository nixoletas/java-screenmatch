package br.com.screenmatch.principal;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Rocky", 1994);
        meuFilme.avalia(7);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(9);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            if (item instanceof Filme filme) {
                System.out.println(item.getNome() + filme.getClassificacao());
            }
        }

        Collections.sort(lista);
        System.out.println(lista);
    }
}
