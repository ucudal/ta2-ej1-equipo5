
/**
 *
 * @author abadie
 */
public class Main {

    public static void main(String[] args) {
        // TODO: 
        /**
         * Instanciar almacen Agregar: productos y cantidades (altas.txt) Emitir
         * listado de productos y cantidades Emitir valor de stock de todo el
         * almacen Vender: restar stock de productos indicado en ventas.txt
         * Emitir valor de stock de todo el almacen
         *
         */
        Almacen almacen;
        String[] ventas = ManejadorArchivosGenerico.leerArchivo("ventas.txt");
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

    }

}
