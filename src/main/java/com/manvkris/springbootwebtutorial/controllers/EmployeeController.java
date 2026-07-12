package com.manvkris.springbootwebtutorial.controllers;

import com.manvkris.springbootwebtutorial.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @GetMapping(path = "/secretmessage")
    public String getMySuperSecretMessage() {
        return "Jai Shree Krsna.....";
    }

    @GetMapping(path = "{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable (name = "employeeId") Long ID) {
        return new EmployeeDTO(ID, "Vimal", "vimal005@gmail.com", 31, LocalDate.of(2022, 05, 02), true);
    }

    @GetMapping
    public  String getAllEmployee(@RequestParam (required = false) Integer age,
                                  @RequestParam (required = false) String sortBy){
        return "Hi Age : " + age + "  and Sort_by : " + sortBy;
    }

    @PostMapping
    public  EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){

        inputEmployee.setID(25L);
        return  inputEmployee;
    }

    @PutMapping
    public String updateEmployeeById(){
        return "Employee is getting updated.....";
    }

    @DeleteMapping
    public String deleteEmployeeById(){
        return "Employee is getting deleted.....";
    }

}
