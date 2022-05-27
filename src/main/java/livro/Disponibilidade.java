package livro;

import usuario.Reserva;

public class Disponibilidade {
    private float livrosDisponiveis;
    private float livrosEmEmprestimo;
    public Disponibilidade(float livrosDisponiveis, float livrosEmEmprestimo){
        this.livrosDisponiveis = livrosDisponiveis;
        this.livrosEmEmprestimo = livrosEmEmprestimo;
    }

    public float livroDisponivel(Insercao insercao){
        if (insercao.getLivro() >1){
            this.livrosDisponiveis = insercao.getLivro() - insercao.getLivroRemovido();
        }
        return 0;
    }

    public float getLivrosDisponiveis(){
        return this.livrosDisponiveis;
    }

    public float getLivrosEmEmprestimo(){
        return this.livrosEmEmprestimo;
    }

    public boolean disponibilidade(){
        if (this.getLivrosDisponiveis() >= 1){
            return true;
        } else {
            return false;
        }
    }

    public String alugarLivro(Insercao insercao, Reserva reserva) {
        if ((insercao.getLivro() > 0) && !reserva.getLivroReservado()) {
            return "É possivel alugar Livro";
        } else {
            return "Não é possivel alugar livro";
        }
    }




}
