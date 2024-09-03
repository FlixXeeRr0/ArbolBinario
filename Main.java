import java.util.Scanner;

public class Main {
  public static Scanner leer = new Scanner(System.in);
  public static void main(String[] args) {
    // Declaración del arbol
    ArbolBinario arbolBinario = new ArbolBinario();

    // Verificamos si el arbol esta vacio
    validarVacio(arbolBinario);

    // Solicitamos cantidad de nodos a agregar
    System.out.print("Ingrese la cantidad de nodos a agregar: ");
    int cantidadNodos = leer.nextInt();
    int opcion;
    do{
      System.out.print("Ingrese 1 para carga manual o 2 para carga automatica: ");
      opcion = leer.nextInt();
    }while(opcion != 1 && opcion != 2);
    if(opcion == 1){
      cargaDeNodosManual(arbolBinario, cantidadNodos);
    }else{
      cargaDeNodosAutomatica(arbolBinario, cantidadNodos);
    }

    // Mostramos los diferentes recorridos del arbol
    System.out.println("");
    System.out.print("INORDEN: ");
    arbolBinario.recorrerInorden();
    System.out.print("\nPREORDEN: ");
    arbolBinario.recorrerPreorden();
    System.out.print("\nPOSTORDEN: ");
    arbolBinario.recorrerPostorden();
    System.out.println("");

    // Busqueda de algún nodo
    System.out.print("Ingrese el elemento a buscar: ");
    int valorBuscar = leer.nextInt();
    buscarNodo(arbolBinario, valorBuscar);


    // Verificamos nuevamente si el arbol esta vacio
    validarVacio(arbolBinario);
    // Cerramos el scanner
    leer.close();
  }

  public static void validarVacio(ArbolBinario arbol) {
    if (arbol.estaVacio()) {
      System.out.println("El arbol esta vacio.");
    } else {
      System.out.println("El arbol no esta vacio.");
    }
  }

  public static void cargaDeNodosManual(ArbolBinario arbol, int cantidadNodos) {
    for (int i = 0; i < cantidadNodos; i++) {
      System.out.println("Ingrese el valor del nodo " + (i + 1) + ": ");
      int valor = leer.nextInt();
      arbol.agregar(valor);
    }
  }

  public static void cargaDeNodosAutomatica(ArbolBinario arbol, int cantidadNodos) {
    System.out.print("Carga automatica con valores: ");
    for (int i = 0; i < cantidadNodos; i++) {
      int valor = (int) (Math.random() * 100);
      System.out.print(valor + ", ");
      arbol.agregar(valor);
    }
  }

  public static void buscarNodo(ArbolBinario arbol, int valor) {
    Nodo nodoEncontrado = arbol.buscarValor(valor);
    if (nodoEncontrado != null) {
      System.out.println("Si existe el valor proporcionado dentro del arbol.");
    } else {
      System.out.println("No existe el valor proporcionado en el arbol.");
    }
  }
}
