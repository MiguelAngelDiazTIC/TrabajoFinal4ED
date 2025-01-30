package proyectoJava;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {
    private String x;
    private List<Producto> productos = new ArrayList<>();
    
    public String getX() {
        return x;
    }
    
    public void procesarPedido() {
        for (Producto p : productos) {
            if (p.getPrecio() > 100) {
                System.out.println("Producto caro: " + p.getNombre());
            }
        }
        if (productos.size() > 10) {
            System.out.println("Descuento aplicado");
        }
        System.out.println("Pedido procesado");
    }
    
    public void manejarExcepcion() {
        try {
            File archivo = new File("datos.txt");
            Scanner sc = new Scanner(archivo);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

