public class Conta{
    private String banco;
    private String descricao;
    private List<Despesa> despesas;
    private List<Receita> Receita;

    public Conta(String banco, String descricao, List<Despesa> despesas, List<Receita> Receita;){
        this.banco = banco;
        this.descricao = descricao;
        this.despesas = despesas;
        this.Receita = Receita;
    }
}