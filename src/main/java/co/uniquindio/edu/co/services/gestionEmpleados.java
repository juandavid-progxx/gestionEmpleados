package co.uniquindio.edu.co.services;

import co.uniquindio.edu.co.model.*;

public class gestionEmpleados {
    public static void main(String[] args) {
        gestionEmpleados sistema= new gestionEmpleados();
        sistema.inicializarDatos();
    }
/*
Single Responsibility Principle
Open/Closed Principle
Liskov Substitution Principle
Segregation Principle
Dependency Inversion Principle
 */

    private void inicializarDatos() {
        departamento Departamento= new departamento("LA OFRENDA","123");


        // Crear empleados
        empleado emp1 = new empleado("Ana", "111", Departamento);
        empleado emp2 = new empleado("Luis", "222", Departamento);

        // Crear gerente y técnico
        gerente Gerente = new gerente("Carlos", "333", Departamento);
        tecnico Tecnico = new tecnico("Maria", "444", Departamento, "Redes");
        // Asignar empleados a departamento
        Departamento.agregarEmpleado(emp1);
        Departamento.agregarEmpleado(emp2);
        Departamento.agregarEmpleado(Gerente);
        Departamento.agregarEmpleado(Tecnico);
        // Crear y asignar proyectos
        proyecto proy1 = new proyecto("Sistema de Gestión", "P01");
        proyecto proy2 = new proyecto("Campaña Publicitaria", "P02");

        proy1.asignarEmpleado(emp1);
        proy1.asignarEmpleado(Gerente);
        proy1.asignarEmpleado(Tecnico);

        Gerente.gestionarProyecto(proy1);
        // Mostrar contribuciones
        Gerente.contribuir();
        Tecnico.contribuir();
        // Mostrar detalles
        System.out.println(Departamento);
        System.out.println(proy1);
        System.out.println(proy2);
        System.out.println(Gerente);
        System.out.println(Tecnico);
//a continuacion se asignara salario de acuerdo al cargo, se mostrara el pago mensual
        System.out.println("------------------------------------------------------------");
        System.out.println("empleado "+emp1.getNombre() + " - Salario Mensual: $" + emp1.calcularSalarioMensual());
        System.out.println("empleado "+emp2.getNombre() + " - Salario Mensual: $" + emp2.calcularSalarioMensual());
        System.out.println("el tecnico "+Tecnico.getNombre() + " - Salario Mensual: $" + Tecnico.calcularSalarioMensual());
        System.out.println("el gerente "+ Gerente.getNombre() + " - Salario Mensual: $" + Gerente.calcularSalarioMensual());

    }
    }


