package usuario;

public class Multa {

    private double valorMultaPorDia;
    private double diasAtrasados;
    private double qntdLivrosAtrasados;

    private double valorMultaAplicada;

    public Multa(){
        this.valorMultaPorDia = 3.50;
        this.diasAtrasados = diasAtrasados;
        this.qntdLivrosAtrasados = qntdLivrosAtrasados;
        this.valorMultaAplicada = valorMultaAplicada;
    }


    public double getValorMultaPorDia(){
        return this.valorMultaPorDia;
    }

    public void qntdDiasAtrasados(Devolucao devolucao){
        this.diasAtrasados = devolucao.getDiasDevolvidos() - devolucao.getDiasDevolucao();
    }

    public double getQntdDiasAtrasados(){
        return this.diasAtrasados;
    }

    public double getQntdLivrosAtrasados(){
        return qntdLivrosAtrasados;
    }


    public void valorMultaAplicada(){
        this.valorMultaAplicada = (this.getValorMultaPorDia() * this.getQntdDiasAtrasados()) * (this.getQntdLivrosAtrasados());
    }

    public double getValorMultaAplicada(){
        return this.valorMultaAplicada;
    }

}
