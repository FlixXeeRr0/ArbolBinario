import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    ArbolBinario abb = new ArbolBinario();

    // Verificar si el árbol está vacío
    if (abb.estaVacio()) {
      System.out.println("El árbol está vacío.");
    } else {
        System.out.println("El árbol no está vacío.");
    }

    // ELEMENTOS PARA EL ARBOL 43,10,8,54,15,50,53
    abb.agregar(43);
    abb.agregar(10);
    abb.agregar(8);
    abb.agregar(54);
    abb.agregar(15);
    abb.agregar(50);
    abb.agregar(53);

    System.out.print("INORDEN: ");
    abb.recorrerInorden();
    System.out.print("\nPREORDEN: ");
    abb.recorrerPreorden();
    System.out.print("\nPOSTORDEN: ");
    abb.recorrerPostorden();
    System.out.println("");

    // Buscar un nodo
    System.out.print("Ingrese el numero del nodo a buscar: ");
    int valorBuscar = leer.nextInt();
    Nodo nodoEncontrado = abb.buscarValor(valorBuscar);
    if (nodoEncontrado != null) {
        System.out.println("Nodo encontrado.");
    } else {
        System.out.println("Nodo no encontrado.");
    }

    leer.close();
  }
}
