
package jdbc;

public class Empleado {
    private int ID_Empleado;
    private int Nombre;
    private int Paterno;
    private int Materno;
    private int Fecha_Nacimiento;

    public int getID_Empleado() {
        return ID_Empleado;
    }

    public void setID_Empleado(int ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }

    public int getNombre() {
        return Nombre;
    }

    public void setNombre(int Nombre) {
        this.Nombre = Nombre;
    }

    public int getPaterno() {
        return Paterno;
    }

    public void setPaterno(int Paterno) {
        this.Paterno = Paterno;
    }

    public int getMaterno() {
        return Materno;
    }

    public void setMaterno(int Materno) {
        this.Materno = Materno;
    }

    public int getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(int Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }
    
    
}
