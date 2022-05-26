import livro.Disponibilidade;
import livro.Insercao;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import usuario.Devolucao;
import usuario.Multa;
import usuario.Reserva;

public class UsuarioMockitoTeste {

    @Test
    public void ReservaEfetuadaComSucesso(){
        Reserva reserva = new Reserva();
        Insercao insercao = Mockito.mock(Insercao.class);
        Mockito.when(insercao.getLivro()).thenReturn(3F);
        Disponibilidade disponibilidade = new Disponibilidade(3F, 0);
        reserva.reservaRealizada(insercao, disponibilidade);
        Assertions.assertTrue(disponibilidade.disponibilidade());
    }

    @Test
    public void ReservaNaoEfetuada(){
        Reserva reserva = new Reserva();
        Insercao insercao = Mockito.mock(Insercao.class);
        Mockito.when(insercao.getLivro()).thenReturn(0F);
        Disponibilidade disponibilidade = new Disponibilidade(0, 0);
        reserva.reservaRealizada(insercao, disponibilidade);
        Assertions.assertFalse(disponibilidade.disponibilidade());
    }

    @Test
    public void ReservaNaoEfetuadaPorLivroEmEmprestimo(){
        Reserva reserva = new Reserva();
        Insercao insercao = Mockito.mock(Insercao.class);
        Mockito.when(insercao.getLivro()).thenReturn(5F);
        Disponibilidade disponibilidade = new Disponibilidade(5, 5);
        reserva.reservaRealizada(insercao, disponibilidade);
        Assertions.assertEquals("Livro já emprestado, aguarde disponibilidade", reserva.livroEmEmprestimo(insercao, disponibilidade));
    }

    @Test
    public void FalseSeMultaNaoAplicada(){
        Multa multa = new Multa();
        Devolucao devolucao = Mockito.mock(Devolucao.class);
        Mockito.when(devolucao.getDiasDevolucao()).thenReturn(20F);
        Mockito.when(devolucao.getDiasDevolvidos()).thenReturn(15F);
        Assertions.assertFalse(devolucao.devolucaoComMulta(multa));
    }
}
