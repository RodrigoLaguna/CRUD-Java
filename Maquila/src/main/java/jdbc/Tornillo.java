
package jdbc;

public class Tornillo {
    private int ID_Tornillo;
    private float Tamaño;
    private String Material;
    private float PrecioXpieza;

    public int getID_Tornillo() {
        return ID_Tornillo;
    }

    public void setID_Tornillo(int ID_Tornillo) {
        this.ID_Tornillo = ID_Tornillo;
    }

    public float getTamaño() {
        return Tamaño;
    }

    public void setTamaño(float Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public float getPrecioXpieza() {
        return PrecioXpieza;
    }

    public void setPrecioXpieza(float PrecioXpieza) {
        this.PrecioXpieza = PrecioXpieza;
    }

    
}
