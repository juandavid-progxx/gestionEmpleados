package co.uniquindio.edu.co.model;
import java.util.ArrayList;
public class empleado {
    private String nombre;
    private String id;
    public departamento Departamento;

    public empleado(String nombre, String id, departamento Departamento) {
        this.nombre = nombre;
        this.id = id;
        this.Departamento = Departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public departamento getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(departamento departamento) {
        Departamento = departamento;
    }
}