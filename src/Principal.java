import br.com.screenmatch.calc.CalculadoraDeTempo;
import br.com.screenmatch.calc.FiltroRecomendacao;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Rocky");
        meuFilme.setAnoDeLancamento(1994);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.avalia(8);
        meuFilme.avalia(8);
        meuFilme.exibirFichaTecnica();

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar: O caminho da água");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(230);
        outroFilme.exibirFichaTecnica();

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setTemporadas(7);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.setAnoDeLancamento(2000);
        lost.setDuracaoEmMinutos(lost.getDuracaoEmMinutos());
        lost.exibirFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("Tempo total: " + calculadora.getTempoTotal() + "min");
    }
}