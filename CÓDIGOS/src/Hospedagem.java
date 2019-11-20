public class Hospedagem {
    private String entrada;
    private String saida;
    private float periodo;
    private String local;
    private String detalhes;

    public Hospedagem(String entrada, String saida, float periodo, String local, String detalhes) {
        this.entrada = entrada;
        this.saida = saida;
        this.periodo = periodo;
        this.local = local;
        this.detalhes = detalhes;
    }
    @Override
    public String toString() {
        return "Serviço de hospedagem agendado do dia " + entrada + " ao dia " +saida+ ", em " + local
                + ". Observações: " + detalhes;
    }

    public String getEntrada() {
        return entrada;
    }
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }
    public String getSaida() {
        return saida;
    }
    public void setSaida(String saida) {
        this.saida = saida;
    }
    public float getPeriodo() {
        return periodo;
    }
    public void setPeriodo(float periodo) {
        this.periodo = periodo;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getDetalhes() {
        return detalhes;
    }
    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public float pagamento(){
        float valor = 80;
        float pagamento = this.periodo*valor;
        return pagamento;
    }
}