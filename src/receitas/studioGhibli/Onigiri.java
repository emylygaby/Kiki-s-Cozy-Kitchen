// src/receitas/doce/Pudim.java
package receitas.studioGhibli;

import receitas.base.Receita;

public class Onigiri extends Receita {

    public Onigiri() {
        super(
                "Onigiri de “A Viagem de Chihiro”",
                new String[]{
                        "6 mini folhas de algas marinhas torradas (nori)",
                        "3/4 xícara de salmão cozido desfiado",
                        "6 xícaras de arroz japonês cozido",
                        "Um cortador de biscoitos em forma de triângulo (Caso você não tenha um cortador, também é possível usar plástico filme para moldar os onigiris)"
                },
                "\n1. Comece cortando as folhas de nori ao meio no sentido do comprimento. Misture a maionese com o salmão e reserve.\n" +
                "2. Coloque o cortador de biscoitos em uma superfície plana. Posicione uma folha de filme plástico sobre o cortador de biscoitos, de forma que a parte interna fique completamente forrada com filme plástico.\n" +
                "3. Adicione aproximadamente 2 colheres de sopa de arroz no fundo do cortador e pressione com uma colher.\n" +
                "4. Ao achatar o arroz, empurre-o até que o fundo esteja completamente coberto.\n" +
                "5. Para que haja salmão em cada mordida do onigiri, acrescente 1 colher de chá de recheio.\n" +
                "6. Coloque mais algumas colheres de arroz por cima e alise. Se precisar, adicione um pouco de arroz para cobrir o salmão.\n" +
                "7. Enrole o plástico firmemente sobre a extremidade exposta do onigiri e retire-o do cortador de biscoitos.\n" +
                "8. Deixe o onigiri repousar por 5 a 10 minutos.\n" +
                "9. Remova o filme plástico e passe uma tira de nori no fundo de cada onigiri.\n" +
                "10. Está pronto para servir!"
                
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

