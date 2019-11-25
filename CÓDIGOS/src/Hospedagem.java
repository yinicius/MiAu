public class Hospedagem {
    private int periodo;
    private String local;
    private String detalhes;

    public Hospedagem(int periodo, String local, String detalhes) {
        this.periodo = periodo;
    	this.local = local;
        this.detalhes = detalhes;
    }
    

    @Override
	public String toString() {
		return "Hospedagem com periódo de: " + periodo + "em " + local + ". Detalhes: " + detalhes;
	}


    public int getPeriodo() {
        return periodo;
    }
    public void setPeriodo(int periodo) {
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

    public void pagamento(){
        float valor = 80;
        float pagamento = this.periodo*valor;
        System.out.print("O valor final da hospedagem �: R$" + pagamento + "\n");
    }
}