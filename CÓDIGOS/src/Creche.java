public class Creche {
    private String data;
    private float hora;
    private float duracao;
    private String detalhes;
    public Creche(String d, float h, float du, String de) {
        this.data = d;
        this.hora = h;
        this.duracao = du;
        this.detalhes = de;
    }
    @Override
    public String toString(){
        return "Servi�o de creche agendado para o dia: " + data + "�s" + hora + " h, com dura��o de" + 
    duracao + "horas. Observações: " + detalhes;
    }
    public void pagamento (){
        float valor=20;
        float pagamento = this.duracao*valor;
        System.out.print("O valor final da creche �: R$" + pagamento + "\n");
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public float getHora() {
        return hora;
    }
    public void setHora(float hora) {
        this.hora = hora;
    }
    public float getDuracao() {
        return duracao;
    }
    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }
    public String getDetalhes() {
        return detalhes;
    }
    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
}