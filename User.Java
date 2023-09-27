public class User {
    private String nome;
    private String email;
    private List<Conta> conta;
    private List<Investimento> investimentos;
    private List<Orcamento> orcamentos;
    private List<Meta> metas;

    public User(String nome, String email, List<Conta> conta, List<Investimento> investimentos, List<Orcamento> orcamentos, List<Meta> metas){
        this.nome = nome;
        this.email = email;
        this.conta = conta;
        this.investimentos = investimentos;
        this.orcamentos = orcamentos;
        this.metas = metas;
    }
};