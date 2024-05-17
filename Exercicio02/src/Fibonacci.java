public class Fibonacci extends Progressao {
    private int anterior = 0;
    private int atual = 1;

    @Override
    public int next() {
        int total = atual;
        int temp = atual;
        atual = anterior + atual;
        anterior = temp;
        valor = total;
        return total;
    }
}