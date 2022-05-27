

import livro.Disponibilidade;
import livro.Insercao;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import usuario.Reserva;

public class LivroMockitTest {
     @Test
    public void possivelAlugarLivro() {
         Disponibilidade disponibilidade = new Disponibilidade(5, 4);
         Reserva reserva =  Mockito.mock(Reserva.class);
         Mockito.when(reserva.getLivroReservado()).thenReturn(false);
         Insercao insercao = Mockito.mock(Insercao.class);
         Mockito.when(insercao.getLivro()).thenReturn(1f);

         Assertions.assertEquals("É possivel alugar Livro", disponibilidade.alugarLivro(insercao, reserva));
    }
    @Test
    public void alugarLivroLivroReservado() {
        Disponibilidade disponibilidade = new Disponibilidade(5, 4);
        Reserva reserva =  Mockito.mock(Reserva.class);
        Mockito.when(reserva.getLivroReservado()).thenReturn(true);
        Insercao insercao = Mockito.mock(Insercao.class);
        Mockito.when(insercao.getLivro()).thenReturn(1f);

        Assertions.assertEquals("Não é possivel alugar livro", disponibilidade.alugarLivro(insercao, reserva));
    }

    @Test
    public void alugarLivroInsercaoZerada() {
        Disponibilidade disponibilidade = new Disponibilidade(5, 4);
        Reserva reserva =  Mockito.mock(Reserva.class);
        Mockito.when(reserva.getLivroReservado()).thenReturn(false);
        Insercao insercao = Mockito.mock(Insercao.class);
        Mockito.when(insercao.getLivro()).thenReturn(0f);

        Assertions.assertEquals("Não é possivel alugar livro", disponibilidade.alugarLivro(insercao, reserva));
    }


    @Test
    public void alugarLivroInsercaoZeradaLivroReservado() {
        Disponibilidade disponibilidade = new Disponibilidade(5, 4);
        Reserva reserva =  Mockito.mock(Reserva.class);
        Mockito.when(reserva.getLivroReservado()).thenReturn(true);
        Insercao insercao = Mockito.mock(Insercao.class);
        Mockito.when(insercao.getLivro()).thenReturn(0f);

        Assertions.assertEquals("Não é possivel alugar livro", disponibilidade.alugarLivro(insercao, reserva));
    }






}
