package receitas.genshin;

import receitas.base.Receita;

public class Clorinde extends Receita {

    public Clorinde() {
        super(
                "Especialidade de Clorinde “Caçado e Capturado”",
                new String[]{
                        "1 peito de pato",
                        "2 batatas",
                        "Suco de 1 laranja",
                        "40g de mel",
                        "1 colher de sopa de manteiga"
                },
                "\n1. Tempere o peito de pato a gosto.\n" +
                "2. Aqueça a frigideira com óleo e frite o seu pato primeiramente com a pele para baixo, e depois vire a carne para fritar igualmente até o ponto desejado.\n" +
                "3. Retire o peito do pato e envolva em um alumínio e deixe descansar por 15 minutos.\n" +
                "4. Corte as batatas em fatias finas e depois corte as fatias no formato de meia lua e algumas fatias no formato de um triângulo.\n" +
                "5. Frite as batatas no mesmo óleo que o pato até ficarem douradas.\n" +
                "6. Retire o pato do alumínio e frite novamente no óleo.\n" +
                "7. Leve o suco de 1 laranja ao fogo e adicione 40g de mel e deixe até ferver.\n" +
                "8. Após ferver adicione uma colher de sopa de manteiga e mantenha no fogo até o molho engrossar.\n" +
                "9. Sirva a carne e as batatas em um prato, despeje o molho por cima. E está pronto!"
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
