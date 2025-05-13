
package monlau;

import monlau.dao.ProductoDAO;
import monlau.dao.ProductoDAOImpl;
import monlau.model.Producto;

public class ProductoManager {
    public static void main(String[] args) {
        ProductoDAO producto =new ProductoDAOImpl();
        
        //agregar nuevo producto
        producto.insert(new Producto(4,"Pollo",10.0));
        producto.insert(new Producto(5,"Croqueta",19.5));

        producto.update(new Producto(6,"Pollo",11.0));

        producto.delete(new Producto(5,"Croqueta",19.5));
        //obtener el producto con el ID = 100
        Producto p = producto.read(6);
        System.out.println(p);
    }
}
