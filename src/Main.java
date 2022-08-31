/**
 *
 * @author abadie
 */
public class Main {
    
    public static void main(String[] args){
        // TODO: 
        /**
         * Instanciar almacen
         * Agregar: productos y cantidades (altas.txt)
         * Emitir listado de productos y cantidades
         * Emitir valor de stock de todo el almacen
         * Vender: restar stock de productos indicado en ventas.txt
         * Emitir valor de stock de todo el almacen
         **/
        System.err.println("TBD");
        
        Almacen almacen = new Almacen("", "", "Lista");
        ManejadorArchivosGenerico manejador = new ManejadorArchivosGenerico();
        String [] lectura = manejador.leerArchivo("altas.txt");
        
        for (String linea : lectura)
        {
            String[] valores = linea.split(",");
            
            Producto prod = almacen.buscarPorCodigo(valores[0]);
            if(prod == null){
                prod = new Producto(Integer.parseInt(valores[0]), valores[1], Integer.parseInt(valores[2]), Integer.parseInt(valores[3]));
                almacen.insertarProducto(prod);
            }
            else
            {
                almacen.agregarStock(prod.getNombre(), Integer.parseInt(valores[3]));
            }
        }
        
        
        
    }
    
}
