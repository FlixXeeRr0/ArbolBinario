public class ArbolBinario {
  private Nodo raiz;

  public ArbolBinario() {
    this.raiz = null;
  }

  public boolean estaVacio() {
    return this.raiz == null;
  }

  public Nodo buscarValor(int valor) {
    return buscarRecursivo(this.raiz, valor);
  }

  private Nodo buscarRecursivo(Nodo nodo, int valor) {
    if (nodo == null || nodo.getValor() == valor) {
        return nodo;
    }

    if (valor < nodo.getValor()) {
        return buscarRecursivo(nodo.getNodoIzquierdo(), valor);
    } else {
        return buscarRecursivo(nodo.getNodoDerecho(), valor);
    }
  }

  public void agregar(int valor) {
    if(this.raiz == null) {
      this.raiz = new Nodo(valor);
    } else {
      this.raiz.insertar(valor);
    }
  }

  public void recorrerPreorden() {
    this.preorden(this.raiz);
  }
  private void preorden(Nodo nodo) {
    if(nodo == null) {
      return;
    } else {
      System.out.print(nodo.getValor() + ", ");
      preorden(nodo.getNodoIzquierdo());
      preorden(nodo.getNodoDerecho());
    }
  }

  public void recorrerInorden() {
    this.inorden(this.raiz);
  }
  private void inorden(Nodo nodo) {
    if(nodo == null) {
      return;
    } else {
      inorden(nodo.getNodoIzquierdo());
      System.out.print(nodo.getValor() + ", ");
      inorden(nodo.getNodoDerecho());
    }
  }

  public void recorrerPostorden() {
    this.postorden(this.raiz);
  }
  private void postorden(Nodo nodo) {
    if(nodo == null) {
      return;
    } else {
      postorden(nodo.getNodoIzquierdo());
      postorden(nodo.getNodoDerecho());
      System.out.print(nodo.getValor() + ", ");
    }
  }
}
