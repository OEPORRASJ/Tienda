

package tienda.estructura;

import java.util.Scanner;


public class Producto {
    private String nombre;
    private String tipo;
    private int cantidad;
    private int cantidadPedido;
    private double precioBase;

    public Producto(String nombre, String tipo, int cantidad, int cantidadPedido, double precioBase) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.cantidadPedido = cantidadPedido;
        this.precioBase = precioBase;
    }
    
    
    public void precioFinal(){
        if ( tipo == "papeleria" ){
            precioBase = 1.16*precioBase;
        } if ( tipo == "supermercado" ){
            precioBase = 1.04*precioBase;
        } if ( tipo == "drogueria" ){
            precioBase = 1.12*precioBase;
        }
    }
    
    
    public void vender(){
        System.out.println("Cuántos productos desea vender?");
        Scanner lector = new Scanner(System.in);
        int unidades = lector.nextInt();
        cantidad = cantidad - unidades;
    }
    
    public void pedido(){
        if ( cantidadPedido == cantidad){
            System.out.println("Debe hacer pedido de este producto, cuantas unidades desea pedir? ");
            Scanner lector = new Scanner(System.in);
            int unidades = lector.nextInt();
            cantidad = cantidad + unidades;
                    
        }
        
    }
    
   
    
    
    
   

    
    
    
}
