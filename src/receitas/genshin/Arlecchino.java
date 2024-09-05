package receitas.genshin;

import receitas.base.Receita;
import receitas.base.Exibivel;

public class Arlecchino extends Receita implements Exibivel {

    public Arlecchino() {
        super(
                "Especialidade de Arlecchino “Hearthfire's Trail”",
                new String[]{
                        "1 fatia grossa de pão",
                        "4 colheres de sopa de milho enlatado",
                        "200g de filé mignon cru cortada em bifes finos (a carne deve estar fresca, não pode ter sido congelada anteriormente - por razões de segurança)",
                        "10g de pasta de pimenta gochugaru",
                        "5g de shoyu",
                        "5g de açúcar",
                        "1 fio de óleo de gergelim"
                },
                "\n1. Torre a fatia de pão até ficar crocante\n" +
                "2. Corte o bife de filé mignon cru em pequenos pedaços.\n" +
                "3. Após tostado, coloque o pão em um prato e adicione os milhos por cima.\n" +
                "4. Logo em seguida, adicione a carne crua cortada por cima dos milhos.\n" +
                "5. Despeje o molho por cima e está pronto para o consumo!\n" +
                "6. Atenção: por motivos de segurança o prato deve ser feito para consumo imediato!\n" +
                "\n" +
                "Modo de Preparo do Molho:\n" +
                "1. Adicione em um pequeno pote a pasta de pimenta gochugaru, o shoyu, o açúcar e o óleo de gergilim.\n" +
                "2. Mexa até o molho ficar homogêneo.\n" +
                "3. Está pronto!"
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
