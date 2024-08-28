package co.uniquindio.edu.co.model;

import co.uniquindio.edu.co.services.contribuyente;

import java.util.ArrayList;

public class gerente extends empleado implements contribuyente {

    public ArrayList<proyecto> proyectosGestionados=new ArrayList<>();
    public gerente(String nombre, String id, departamento Departamento) {
        super(nombre, id, Departamento);
    }
    public void gestionarProyecto(proyecto Proyecto){
        proyectosGestionados.add(Proyecto);
    }

    public ArrayList<proyecto> getProyectosGestionados() {
        return proyectosGestionados;
    }

    public void gestionarEquipos() {
    }


    @Override
    public void contribuir() {
        System.out.println("gerente"+getNombre()+"gestiona proyectos");
    }
    @Override
    public String toString() {
        return "Gerente{" +
                "nombre='" + getNombre() + '\'' +
                ", idEmpleado=" + getId() +
                ", departamento=" + getDepartamento().getNombre() +
                ", proyectosGestionados=" + proyectosGestionados.size() +
                '}';
    }
}


