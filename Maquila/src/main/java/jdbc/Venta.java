
package jdbc;

public class Venta {
    private int ID_Venta;
    private int Cliente;
    private int Piezas;
    private float Subtotal;
    private String Fecha;

    public int getID_Venta() {
        return ID_Venta;
    }

    public void setID_Venta(int ID_Venta) {
        this.ID_Venta = ID_Venta;
    }

    public int getCliente() {
        return Cliente;
    }

    public void setCliente(int Cliente) {
        this.Cliente = Cliente;
    }

    public int getPiezas() {
        return Piezas;
    }

    public void setPiezas(int Piezas) {
        this.Piezas = Piezas;
    }

    public float getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(float Subtotal) {
        this.Subtotal = Subtotal;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    
}
