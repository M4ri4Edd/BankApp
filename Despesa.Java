public class Despesa{
    private String data;
    private Float valor;
    private String descricao;
    private String categoria;

    public Despesa(String data, Float valor, String descricao, String categoria){
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
        this.categoria = categoria;
    }
}