package com.core.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumUsingStreamMain {

    public static void main(String[] args) {


        List<Employee> emplist=createEmployeeList();

        /*emplist.stream().filter(e->e.getAge()>20).map(Employee::getAge)
                .collect(Collectors.toList()).forEach(System.out::println);*/

        List<Employee> tempList = emplist.stream().filter(e -> "Manager".equalsIgnoreCase(e.getDesignation())&&e.getAge()>30).collect(Collectors.toList());

        tempList.forEach(e -> System.out.println("Designation :- " + e.getDesignation() + " , Age :- " + e.getAge()));
    }



    public static List<Employee> createEmployeeList() {
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(1,"Robert",35,"Manager"));
        empList.add(new Employee(2,"Martin",35,"General Manager"));
        empList.add(new Employee(1,"Jack",25,"Manager"));
        empList.add(new Employee(3,"Akshay",20,"Developer"));
        empList.add(new Employee(1,"Arvind",40,"Manager"));
        empList.add(new Employee(1,"Dinesh",45,"Manager"));
        return empList;
    }
}