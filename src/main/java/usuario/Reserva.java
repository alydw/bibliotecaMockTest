package usuario;

import livro.Disponibilidade;
import livro.Insercao;

public class Reserva {

    private float qntdLivro;
    protected boolean livroReservado;

    public Reserva(){
        this.qntdLivro = 0;
    }

    public boolean reservaRealizada(Insercao insercao, Disponibilidade disponibilidade){
        if (disponibilidade.disponibilidade() && insercao.livroInseridoComSucesso() == true){
            this.livroReservado = true;
            return true;

        } else {
            this.livroReservado = false;
            return false;

        }

    }

    public String livroEmEmprestimo(Insercao insercao,Disponibilidade disponibilidade) {
        if (insercao.getLivro() - disponibilidade.getLivrosEmEmprestimo() >= 0) {
            return "Livro já emprestado, aguarde disponibilidade";
        }
        return null;
    }


    public boolean getLivroReservado(){
        return this.livroReservado;
    }
}
