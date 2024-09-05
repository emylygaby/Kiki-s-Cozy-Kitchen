package receitas.studioGhibli;

import receitas.base.Receita;
import receitas.base.Exibivel;

public class OvosComBacon extends Receita implements Exibivel {

    public OvosComBacon() {
        super(
                "Ovos com Bacon de “O Castelo Animado”",
                new String[]{
                        "3 fatias de bacon",
                        "2 ovos",
                        "2 fatias de pão",
                        "2 fatias de queijo"
                },
                "\n1. Coloque óleo na frigideira e aqueça a 200°C.\n" +
                "2. Adicione as fatias de bacon e deixe até que os dois lados estejam crocantes.\n" +
                "3. Reduza a temperatura para 180°C e quebre os ovos diretamente na frigideira ao lado do bacon. Cozinhe a gosto.\n" +
                "4. Distribua as fatias de pão e o queijo em um prato raso. Complete com os ovos e as fatias de bacon.\n" +
                "5. Agora é só servir!"
        );
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Receita: " + getNome());
        System.out.println("Ingredientes:");
        for (String ingrediente : getIngredientes()) {
            System.out.println("- " + ingrediente);
        }
        System.out.println("Modo de Preparo: " + getModoPreparo());
    }
}
