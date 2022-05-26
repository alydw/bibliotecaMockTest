package livro;

public class Insercao {
    private float livro;
    private float livrosRemovidos;

    public Insercao(){
        this.livro = 0;
        this.livrosRemovidos = 0;
    }

    public void insereLivro(float qntdLivroInserido){
        this.livro += qntdLivroInserido;
    }

    public float getLivro(){
        return this.livro;
    }

    public void retirarLivro(float qntdLivroRetirado){
        this.livrosRemovidos += qntdLivroRetirado;
    }

    public float getLivroRemovido(){
        return this.livrosRemovidos;
    }

    public boolean livroInseridoComSucesso(){
        if (this.getLivro() - this.getLivroRemovido() >= 1){
            return true;
        } else {
            return false;
        }
    }


}
