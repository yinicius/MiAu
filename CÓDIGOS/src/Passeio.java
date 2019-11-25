public class Passeio {
    private String data;
    private float hora;
    private float duracao;
    private String detalhes;

    public Passeio(String data, float hora, float duracao, String detalhes) {
        this.data = data;
        this.hora = hora;
        this.duracao = duracao;
        this.detalhes = detalhes;
    }
    @Override
    public String toString() {
        return "Passeio agendado para o dia " + data + "às" + hora + "h, com duração de " +
                duracao + "horas. Observações: " + detalhes;
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

    public void pagamento(){
        float valor = 10;
        float pagamento = this.duracao*valor;
        System.out.print("O valor final do passeio é: R$" + pagamento + "\n");
    }
}