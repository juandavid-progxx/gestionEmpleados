package co.uniquindio.edu.co.model;

import java.util.ArrayList;

public class proyecto {
    private String nombre;
    private String codigo;
    public ArrayList<empleado> EmpleadosAsignados=new ArrayList<>();


    public proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    public void asignarEmpleado(empleado Empleado){
        EmpleadosAsignados.add(Empleado);
    }

    public ArrayList<empleado> getEmpleadosAsignados() {
        return EmpleadosAsignados;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", empleadosAsignados=" + EmpleadosAsignados.size() +
                '}';
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

    private void empleadosAsignados() {

    }

}
