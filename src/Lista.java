public class Lista<T> implements ILista<T> {

    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }


    // implementar los metodos indicados en la interfaz

    @Override
    public void insertar(Nodo<T> nodo) {
        if (esVacia()){
            primero=nodo;
            return;
        }
        Nodo<T> aux = primero;
        while (aux.getSiguiente() != null){
            aux=aux.getSiguiente();
        }
        aux.setSiguiente(nodo);
    }
    @Override
    public Nodo<T> buscar(Comparable clave) {
        if (esVacia()){
            return null;
        }
        Nodo<T> aux= primero;
        while (aux!=null){
            if (aux.getEtiqueta().equals(clave)){
                return aux;
            }
           aux=aux.getSiguiente();
        }
        return null;
    }

    @Override
    public boolean eliminar(Comparable clave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String imprimir(String separador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int cantElementos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean esVacia() {
        if (primero==null){
            return true;
        }
        return false;
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Nodo<T> getPrimero (){
        return this.primero;
    }
}
