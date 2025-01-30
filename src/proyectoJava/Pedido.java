package proyectoJava;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pedido {
    private String userName;
    private List<Producto> productos = new ArrayList<>();
    
    private static final int LIMITE_PRODUCTO_CARO = 100;
    private static final int DESCUENTO_MIN_PRODUCTOS = 10;
    
    public String getUserName() {
        return userName;
    }

    public void procesarPedido() {
        List<Producto> productosCaros = filtrarProductosCaros();
        aplicarDescuento();
        System.out.println("Pedido procesado");
    }

    private List<Producto> filtrarProductosCaros() {
        return productos.stream()
                .filter(p -> p.getPrecio() > LIMITE_PRODUCTO_CARO)
                .collect(Collectors.toList());
    }

    private void aplicarDescuento() {
        if (productos.size() > DESCUENTO_MIN_PRODUCTOS) {
            System.out.println("Descuento aplicado");
        }
    }

    public void manejarExcepcion() {
        try {
            File archivo = new File("datos.txt");
            Scanner sc = new Scanner(archivo);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}


