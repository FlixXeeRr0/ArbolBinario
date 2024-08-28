public class Nodo{
  private int valor;
  private Nodo izquierdo, derecho;

  public Nodo(int valor) {
    this.valor = valor;
    this.izquierdo = null;
    this.derecho = null;
  }

  public int getValor() {
    return this.valor;
  }
  public void setValor(int valor) {
    this.valor = valor;
  }

  public Nodo getNodoIzquierdo() {
    return this.izquierdo;
  }
  public Nodo getNodoDerecho() {
    return this.derecho;
  }

  public void insertar(int valor) {
    if(valor < this.valor) {
      if(this.izquierdo == null) {
        this.izquierdo = new Nodo(valor);
      } else {
        this.izquierdo.insertar(valor);
      }
    } else {
      if(this.derecho == null) {
        this.derecho = new Nodo(valor);
      } else {
        this.derecho.insertar(valor);
      }
    }
  }
}
