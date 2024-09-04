package receitas.studioGhibli;

import receitas.base.Receita;

public class Lamen extends Receita {

    public Lamen() {
        super(
            "Lámen de “Ponyo: Uma Amizade Que Veio Do Mar”",
            new String[] {
                "1 Pacote de macarrão instantâneo",
                "1 ovo cozido", 
                "1 fatia de presunto cortado ao meio",
                "2 1/2 xícaras de água",
                "Cebolinha picada"
            },
            "\n1. Prepare os ingredientes: ferva o ovo e corte ao meio, pique a cebolinha e corte o presunto ao meio.\n" +
            "2. Ferva a água.\n" +
            "3. Coloque o macarrão em uma tigela. Se quiser, adicione o pacote de tempero agora.\n" +
            "4. Despeje a água fervente na tigela. Cubra a tigela e deixe descansar de acordo com as instruções da embalagem do macarrão instantâneo (3 a 5 minutos).\n" +
            "5. Depois de cozido, descubra e separe o macarrão usando um garfo ou hashi. Misture bem a água, o macarrão e o tempero.\n" +
            "6. Adicione o ovo, cebolinha picada e os pedaços de presunto cortado.\n" +
            "7. Sirva a seguir."
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
