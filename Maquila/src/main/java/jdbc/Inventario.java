
package jdbc;

public class Inventario {
    private int ID_Articulo;
    private int Piezas;
    private String Tipo;

    public int getID_Articulo() {
        return ID_Articulo;
    }

    public void setID_Articulo(int ID_Articulo) {
        this.ID_Articulo = ID_Articulo;
    }

    public int getPiezas() {
        return Piezas;
    }

    public void setPiezas(int Piezas) {
        this.Piezas = Piezas;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
}
