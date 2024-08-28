package co.uniquindio.edu.co.model;

import java.util.ArrayList;

public class departamento {
    private String nombre;
    private String codigo;
    public ArrayList<empleado>EmpleadosAsociadosDepartamento=new ArrayList<>();

    public departamento(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    public void agregarEmpleado(empleado Empleado) {
        EmpleadosAsociadosDepartamento.add(Empleado);
    }

    public ArrayList<empleado> getEmpleadosAsociadosDepartamento() {
        return EmpleadosAsociadosDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    @Override
    public String toString() {
        return "Departamento" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", empleados=" + EmpleadosAsociadosDepartamento.size() +
                '}';
    }

}
