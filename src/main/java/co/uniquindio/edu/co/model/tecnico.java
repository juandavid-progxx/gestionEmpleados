package co.uniquindio.edu.co.model;

import co.uniquindio.edu.co.services.contribuyente;

public class tecnico extends empleado implements contribuyente {
private String especialidad;
    public tecnico(String nombre, String id, departamento Departamento,String especialidad) {
        super(nombre, id, Departamento);
        this.especialidad=especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public void contribuir() {
        System.out.println("el tecnico:"+getNombre()+"contribuye con su especialidad");
    }
    @Override
    public String toString() {
        return "Técnico{" +
                "nombre='" + getNombre() + '\'' +
                ", idEmpleado=" + getId() +
                ", departamento=" + getDepartamento().getNombre() +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
