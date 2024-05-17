public class PorogressaoAritmetica extends Progressao {
    private int incremento;

    public PorogressaoAritmetica(int incremento) {
        this.incremento = incremento;
    }

    @Override
    public int next() {
        int result = valor + incremento;
        valor = result;
        return result;
    }
}