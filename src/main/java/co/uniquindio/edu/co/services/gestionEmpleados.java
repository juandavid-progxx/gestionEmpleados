package co.uniquindio.edu.co.services;

import co.uniquindio.edu.co.model.*;

public class gestionEmpleados {
    public static void main(String[] args) {
        gestionEmpleados sistema= new gestionEmpleados();
        sistema.inicializarDatos();
    }


    private void inicializarDatos() {
        departamento dep1= new departamento("LA OFRENDA","123");
        departamento dep2= new departamento("LA GLORIETA","321");

        // Crear empleados
        empleado emp1 = new empleado("Ana", "111", dep1);
        empleado emp2 = new empleado("Luis", "222", dep2);

        // Crear gerente y técnico
        gerente gerente = new gerente("Carlos", "333", dep1);
        tecnico tecnico = new tecnico("Maria", "444", dep1, "Redes");
        // Asignar empleados a departamentos
        dep1.agregarEmpleado(emp1);
        dep2.agregarEmpleado(emp2);
        dep1.agregarEmpleado(gerente);
        dep1.agregarEmpleado(tecnico);
        // Crear y asignar proyectos
        proyecto proy1 = new proyecto("Sistema de Gestión", "P01");
        proyecto proy2 = new proyecto("Campaña Publicitaria", "P02");

        proy1.asignarEmpleado(emp1);
        proy1.asignarEmpleado(gerente);
        proy1.asignarEmpleado(tecnico);

        gerente.gestionarProyecto(proy1);
        // Mostrar contribuciones
        gerente.contribuir();
        tecnico.contribuir();
        // Mostrar detalles
        System.out.println(dep1);
        System.out.println(dep2);
        System.out.println(proy1);
        System.out.println(proy2);
        System.out.println(gerente);
        System.out.println(tecnico);
    }
    }


