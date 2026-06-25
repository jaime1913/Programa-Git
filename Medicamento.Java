public class Medicamento {

    String codigo;
    String nombre;
    double precio;
    int stock;

    public Medicamento(String codigo, String nombre, double precio, int stock) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarInformacion() {

        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }

    public void vender(int cantidad) {

        if (cantidad <= stock) {

            stock = stock - cantidad;

            System.out.println("Venta realizada.");

        } else {

            System.out.println("No hay suficiente stock.");
        }
    }
}