package receitas.genshin;

import receitas.base.Receita;

public class Kirara extends Receita {

    public Kirara() {
        super(
            "Especialidade de Kirara “Bentô Energizante”",
            new String[]{
                "Para fazer os Gatinhos: ",
                "150g de arroz japonês",
                "2 tabletes de caldo de carne",
                "5 ml de molho shoyu",
                "1 fatia de mortadela",
                "1 fatia de presunto",
                "1 fatia de alga marinha desidratada",
                "\n",
                "Para o restante do Bentô: ",
                "1 batata doce cortada em rodelas",
                "1 colher de chá de manteiga para cada rodela de batata",
                "4 ovos",
                "8g de açúcar",
                "3 filés de tilápia",
                "45g de farinha de trigo",
                "1 pacote de farinha panko",
                "2 filés de salmão"
            },
            "\nPreparo dos Gatinhos:\n" +
            "1. Lave o arroz japonês e deixe de molho por 10 minutos.\n" +
            "2. Em um recipiente separado adicione 200ml de água, 2 tabletes de caldo de carne, 5 ml de shoyu e um pouco de sal a gosto.\n" +
            "3. Tire o arroz do molho e o coloque em uma panela juntamente com o caldo que acabou de preparar e deixe cozinhar até o caldo secar.\n" +
            "4. Coloque o arroz em um outro recipiente e deixe esfriar até uma temperatura que não queime suas mãos.\n" +
            "5. Após o arroz esfriar, molde-o em 2 pequenos gatinhos e em 2 pequenas bolinhas. Envolva em papel filme e deixe gelar.\n" +
            "6. Em um prato coloque a fatia de mortadela e cima a fatia de presunto. Corte 4 pequenos triângulos e 6 pequenas tiras.\n" +
            "7. Retire o arroz do papel filme e coloque os triângulos nas orelhas e as pequenas tiras coloque nas pequenas bolinhas de arroz.\n" +
            "8. Corte 4 pequenos círculos de alga e 4 pequenas tiras de alga, serão os olhos e os bigodes dos gatinhos de arroz.\n" +
            "9. Coloque as algas cortadas no arroz moldado para formar o rosto do gatinho.\n" +
            "\n" +
            "Preparo do Bentô:\n" +
            "1. Pegue 4 rodelas da batata doce e deixe de molho na água por 10 minutos.\n" +
            "2. Transfira as rodelas para um prato e coloque 1 colher de chá de manteiga em cima de cada rodela.\n" +
            "3. Leve a batata doce ao microondas por 5 minutos.\n" +
            "4. Retire e deixe descansando.\n" +
            "5. Em um recipiente coloque 3 ovos, o açúcar e uma pitada de sal a gosto. Mexa bem e coe a mistura para um outro recipiente.\n" +
            "6. Em uma frigideira com óleo quente frite o ovo e o enrole como um pequeno rocambole.\n" +
            "7. Coloque em um prato e corte em pequenas tiras. Reserve.\n" +
            "8. Em um outro recipiente misture 1 ovo e a farinha de trigo. Mexa bem.\n" +
            "9. Esquente em uma panela funda o óleo de sua preferência.\n" +
            "10. Pegue as tiras de tilápia e empane na mistura de ovo e farinha. E depois passe na farinha panko.\n" +
            "11. Frite as tiras de tilápia até dourarem.\n" +
            "12. Em uma frigideira frite o filé de salmão com pouco óleo (se preferir pode assar).\n" +
            "13. Monte o seu bentô conforme a referencia. E está pronto para consumir!"
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
