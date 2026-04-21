package poliRetos;

public class SerieCarater {
  public void mostrarCaracterAlterno(int caracter) {
    for (int i = 0; i < caracter; i++) {
      if (i % 2 == 0) {
        System.out.print("+ ");
      } else {
        System.out.print("- ");
      }
    }
    System.out.println();
  }

  public void mostrarSeriedeFibonacci(int cantidad) {
    int a = 0, b = 1;
    for (int i = 0; i < cantidad; i++) {
      System.out.print(a + " ");
      int temp = a;
      a = b;
      b = temp + b;
    }
    System.out.println();
  }
}
