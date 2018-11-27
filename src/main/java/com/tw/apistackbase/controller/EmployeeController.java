package com.tw.apistackbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

//    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Autowired
    EmployeeService employeeService;

    @GetMapping(path = "/getAllEmployee", produces = {"application/json"})
    public ResponseEntity<List<Employee>> getAllEmployee() {
        List<Employee> employeeList = employeeService.getAllEmployee();
        return ResponseEntity.ok(employeeList);
    }

    @PostMapping(path = "/add", produces = {"application/json"})
    public ResponseEntity<List<Employee>> addEmployee(@RequestBody Employee employee) {
        List<Employee> employeeList = employeeService.addEmployee(employee);
        return ResponseEntity.ok(employeeList);
    }

    @PutMapping(path = "/update", produces = {"application/json"})
    public ResponseEntity<List<Employee>> updateEmployee(@RequestBody Employee employee) {
        List<Employee> employeeList = employeeService.updateEmployee(employee);
        return ResponseEntity.ok(employeeList);
    }

    @DeleteMapping(path = "/delete", produces = {"application/json"})
    public ResponseEntity<List<Employee>> deleteEmployee(@RequestBody Employee employee) {
        List<Employee> employeeList = employeeService.deleteEmployee(employee);
        return ResponseEntity.ok(employeeList);
    }



}