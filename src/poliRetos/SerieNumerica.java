package poliRetos;

public class SerieNumerica {
    public void mostrarSerieNumerica(int cantidad) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < cantidad; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
