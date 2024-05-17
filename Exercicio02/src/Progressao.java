public abstract class Progressao {
    protected int valor;

    public Progressao() {
        this.valor = 0;
    }

    public abstract int next();

    public void reset() {
        this.valor = 0;
    }
}