public class Main {
    public static void main(String[] args) {
        imprimirProgressao(new PorogressaoAritmetica(1), 10);
        imprimirProgressao(new Geometrica(2), 10);
        imprimirProgressao(new Fibonacci(), 10);
    }

    private static void imprimirProgressao(Progressao progressao, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.print(progressao.next() + ", ");
        }
        System.out.println();
    }
}
