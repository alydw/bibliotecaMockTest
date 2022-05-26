package usuario;

public class Devolucao {

    private float diasDevolvidos;
    private float diasDevolucao;

    public Devolucao(){
        this.diasDevolucao = 0;
        this.diasDevolvidos = 0;
    }

    public void diasDevolucao(float qntdDiasDevolucao){
        this.diasDevolucao += qntdDiasDevolucao;
    }

    public void diasDevolvidos(float qntdDiasDevolvidos){
        this.diasDevolvidos += qntdDiasDevolvidos;
    }

    public float getDiasDevolvidos(){
        return this.diasDevolvidos;
    }

    public float getDiasDevolucao(){
        return this.diasDevolucao;
    }

    public String devolucaoNaDataCerta(){
        if (this.getDiasDevolucao() > this.getDiasDevolvidos()){
            return "Livro devolvido no prazo correto";
        } else {
            return "Livro devolvido fora da data";
        }
    }

    public boolean devolucaoComMulta(Multa multa){
        if (multa.getValorMultaAplicada() > 0){
            return true;
        } else {
            return false;
        }
    }
}
