
package jdbc;

public class Cuenta {
    private int Cuenta;
    private int ID_Usuario;
    private String Tipo;
    private String Password;

    public int getCuenta() {
        return Cuenta;
    }

    public void setCuenta(int Cuenta) {
        this.Cuenta = Cuenta;
    }

    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
