package org.uv.Practica08.controller;


import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Patidifusa
 */
@RestController
@RequestMapping("/api")
public class EmpleadoController {

    @GetMapping("/msg")
    public String holaMundo() {
        return "hola mundo";
    }
    
   @GetMapping("/empleado/{id}")
    public DTOEmpleado obtenerEmpleado(@PathVariable("id") long id){
        DTOEmpleado emp = null;
        if (id ==10){
        emp = new DTOEmpleado();
        emp.setClave(10);
        emp.setNombre("fha");
        emp.setDireccion("");
        emp.setTelefono("123");
    }
       return emp;
}
    
     @GetMapping("/empleado")
     public List<DTOEmpleado> obtenerTodosLosEmpleados(){
     List<DTOEmpleado> lstEmpleados=new ArrayList<>();
     DTOEmpleado emp1 = new DTOEmpleado();
        emp1.setClave(10);
        emp1.setNombre("fhaamono");
        emp1.setDireccion("olaketal");
        emp1.setTelefono("123");
        
       
       lstEmpleados.add(emp1);
       DTOEmpleado emp2= new DTOEmpleado();
        emp2.setClave(10);
        emp2.setNombre("fhaamono");
        emp2.setDireccion("aaav 2");
        emp2.setTelefono("321");
        
        return lstEmpleados;
     }
     
     @PostMapping("/empleado")
     public DTOEmpleado createEmpleado(@RequestBody DTOEmpleado empleado){
        DTOEmpleado emp = new DTOEmpleado();
        emp.setClave(10);
        emp.setNombre("fhaamono");
        emp.setDireccion("aaav 2");
        emp.setTelefono("321");
        
        //Se guardaria
        return emp;
     }
     
     @DeleteMapping("/empleado")
     public void deleteEmpleado(@PathVariable("id") Long id){
         //NBorrar
         return;
    }
    @PutMapping("/empleado/{id}")
    public DTOEmpleado modificarEmpleado(@PathVariable("id") Long id,
            @RequestBody DTOEmpleado empleado){
        //Buscar id
        //Mapeo
    }
}