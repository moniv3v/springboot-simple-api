package com.tw.apistackbase.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class EmployeeService {
    static Map<Integer, Employee> employeeData = new HashMap<>();

    {
        employeeData.put(0, new Employee(0, "Xiaoming", 20, "Male"));
        employeeData.put(1, new Employee(1, "Xiaohong", 19, "Female"));
        employeeData.put(2, new Employee(2, "Xiaozhi", 15, "Male"));
        employeeData.put(3, new Employee(3, "Xiaogang", 16, "Male"));
        employeeData.put(4, new Employee(4, "Xiaoxia", 15, "Female"));
    }

    public List<Employee> getAllEmployee() {
        return new ArrayList<Employee>(employeeData.values());
    }

    public List<Employee> addEmployee(Employee employee) {
        employeeData.put(employee.getId(),employee);
        return new ArrayList<Employee>(employeeData.values());
    }

    public List<Employee> updateEmployee(Employee employee) {
        Employee targetEmployee = findEmployee(employee);
        if(targetEmployee!=null){
            employeeData.replace(targetEmployee.getId(),employee);
        }
        return new ArrayList<Employee>(employeeData.values());
    }

    private Employee findEmployee(Employee employee) {
        Employee targetEmployee;
        for(Map.Entry<Integer, Employee> data : employeeData.entrySet()) {
            if(data.getKey().equals(employee.getId())) {
                targetEmployee = data.getValue();
                return targetEmployee;
            }
        }
        return null;
    }

    public List<Employee> deleteEmployee(Employee employee) {
        Employee targetEmployee = findEmployee(employee);
        if(targetEmployee!=null){
            employeeData.remove(employee.getId());
        }
        return new ArrayList<Employee>(employeeData.values());
    }
}