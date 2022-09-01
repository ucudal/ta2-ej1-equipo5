/**
 *
 * @author abadie
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Instanciar almacen Agregar: productos y cantidades (altas.txt) Emitir
         * listado de productos y cantidades Emitir valor de stock de todo el
         * almacen Vender: restar stock de productos indicado en ventas.txt
         * Emitir valor de stock de todo el almacen
         *
         */

        // SUB-EQUIPO 1, PARTE A
        System.err.println("TBD");

        Almacen almacen = new Almacen("", "", "Lista");
        String [] lectura = ManejadorArchivosGenerico.leerArchivo("src/altas.txt");

        for (String linea : lectura)
        {
            String[] valores = linea.split(",");

            Producto prod = almacen.buscarPorCodigo(valores[0]);
            if(prod == null){
                try {
                    prod = new Producto(Integer.parseInt(valores[0]), valores[1], Integer.parseInt(valores[2]), Integer.parseInt(valores[3]));
                    almacen.insertarProducto(prod);
                }catch (NumberFormatException ignored){

                }
            }
            else
            {
                almacen.agregarStock(prod.getNombre(), Integer.parseInt(valores[3]));
            }
        }

        System.out.println(almacen.obtenerValorStock());

        // SUB-EQUIPO 2, PARTE B

        String[] ventas = ManejadorArchivosGenerico.leerArchivo("src/ventas.txt");
        for (String linea : ventas) {
            String[] valores = linea.split(",");
            Producto producto1 = almacen.buscarPorCodigo(valores[0]);
            if (producto1 != null) {
                try{
                    producto1.restarCantidadStock(Integer.parseInt(valores[1]));
                }catch(NumberFormatException e){
                    System.out.println("Valor inválido");
                }
            }

        }
        System.out.println(almacen.obtenerValorStock());
    }
    
}
