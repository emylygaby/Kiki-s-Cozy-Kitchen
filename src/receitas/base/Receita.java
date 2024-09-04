package receitas.base;

public abstract class Receita {
    private String nome;
    private String[] ingredientes;
    private String modoPreparo;

    public Receita(String nome, String[] ingredientes, String modoPreparo) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.modoPreparo = modoPreparo;
    }

    public String getNome() {
        return nome;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public abstract void exibirDetalhes();

}
