public class Geometrica extends Progressao {
    private double fator;

    public Geometrica(double fator) {
        this.fator = fator;
    }

    @Override
    public int next() {
        int total = (int) (valor * fator);
        valor = total;
        return total;
    }
}