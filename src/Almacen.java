/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 59891
 */
public class Almacen implements IAlmacen {

    public String direccion;
    public String telefono;
    public String nombre;
    public Lista<Producto> listaProducto;

    public Almacen(String direccion, String telefono, String nombre) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombre = nombre;
        this.listaProducto = new Lista<>();
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono=telefono;
    }

    @Override
    public String getNombre() {
        return nombre;   
    }

    @Override
    public Lista<Producto> getListaProductos() {
        return listaProducto;
    }

    @Override
    public long obtenerValorStock() {
        int total=0;
        Nodo<Producto> aux = listaProducto.getPrimero();
        while (aux!=null){
            total += (aux.getDato().getStock())*(aux.getDato().getPrecio());
            aux=aux.getSiguiente();
        }
        return total;
    }

    @Override
    public void insertarProducto(Producto unProducto) {
        listaProducto.insertar(new Nodo<>(unProducto.codigo, unProducto));
    }

    @Override
    public boolean eliminarProducto(Comparable codProducto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String imprimirProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String imprimirSeparador(String separador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean agregarStock(Comparable codProducto, Integer cantidad) {
        Producto a = buscarPorCodigo(codProducto);
        if (a != null) {
            a.agregarCantidadStock(cantidad);
            return true;
        }
        return false;

    }

    @Override
    public Integer restarStock(Comparable codProducto, Integer cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto buscarPorCodigo(Comparable codProducto) {
        Nodo<Producto> nodoProducto = listaProducto.buscar(codProducto);
        if(nodoProducto == null) return null;
        return nodoProducto.getDato();
    }

    @Override
    public void listarOrdenadoPorNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto buscarPorDescripcion(String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int cantidadProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}