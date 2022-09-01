/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 59891
 */
public class Producto implements IProducto {
    public String codigo;
    public String nombre;
    public int precio;
    public int stock;

    public Producto(String codigo, String nombre,int precio, int stock){
        this.nombre=nombre;
        this.codigo=codigo;
        this.precio=precio;
        this.stock=stock;
    }

    @Override
    public Comparable getCodProducto() {
        return codigo;
    }

    @Override
    public Integer getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public Integer getStock() {
        return stock;
    }

    @Override
    public void agregarCantidadStock(Integer stock) {
        this.stock += stock;
    }

    @Override
    public void restarCantidadStock(Integer stock) {
        if (stock > this.stock){
            this.stock -= stock;
        }
        else{
            this.stock=0;
        }
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    
}