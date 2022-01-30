package com.softserveinc.task02;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task02 {

    final static Collection<Employee> EMPLOYEES = Arrays.asList(
            new Employee("Jon", 16, Gender.MAN),
            new Employee("Bob", 23, Gender.MAN),
            new Employee("Susanna", 18, Gender.WOMEN),
            new Employee("Nicola", 65, Gender.MAN),
            new Employee("Alex", 25, Gender.MAN),
            new Employee("Andrea", 21, Gender.WOMEN),
            new Employee("Jack", 33, Gender.MAN),
            new Employee("Andrea", 42, Gender.WOMEN),
            new Employee("Bill", 69, Gender.MAN)
    );

    static List<Employee> ex01() {
        // TODO: find and return list of all male employee with aged 18 to 27 (inclusive)
        class MalePredicate implements Predicate<Employee> {
            @Override
            public boolean test(Employee employee) {
                return employee.getGender() == Gender.MAN;
            }
        }
        return EMPLOYEES
                .stream()
                .filter(new MalePredicate())
                .filter(new Predicate<Employee>() {
                    @Override
                    public boolean test(Employee employee) {
                        return employee.getAge() > 18 && employee.getAge() <= 27;
                    }
                })
                .collect(Collectors.toList());
    }

    static double ex02() {
        // TODO: compute the average age of all male
        return EMPLOYEES
                .stream()
                .filter(employee -> employee.getGender() == Gender.MAN)
                .peek(employee -> System.out.println(employee))
                .mapToInt(employee -> employee.getAge())
                .peek(age -> System.out.println(age))
                .average().getAsDouble();
    }

    static long ex03() {
        // TODO: count how many employees are male aged 18 to 60 and women aged 18 to 55
        return EMPLOYEES
                .stream()
                .filter(employee -> employee.getAge() >= 18)
                .filter(employee -> {
                    switch (employee.getGender()){
                        case MAN: return employee.getAge() <= 60;
                        case WOMEN: return employee.getAge() <= 55;
                    }
                    return false;
                })
                .count();
    }

    static List<Employee> ex04() {
        // TODO: return the list of employees was sort employee by name in descending order
        return EMPLOYEES.stream()
                .sorted((empl1, empl2) -> empl2.getName().compareTo(empl1.getName()))
                .collect(Collectors.toList());
    }

    static Employee ex05() {
        // TODO: find and return the oldest employee
        return EMPLOYEES
                .stream()
                .max((empl1, empl2) -> empl1.getAge() - empl2.getAge())
                .get();
    }

    static Employee ex06() {
        // TODO: find and return the youngest employee
        return EMPLOYEES
                .stream()
                .min((empl1, empl2) -> empl1.getAge() - empl2.getAge())
                .get();
    }

    public static void main(String[] args) {
        // TODO: you can check your solution here
        System.out.println("ex01() = " + ex01());
        System.out.println("ex02() = " + ex02());
        System.out.println("ex03() = " + ex03());
        System.out.println("ex04() = " + ex04());
        System.out.println("ex05() = " + ex05());
        System.out.println("ex06() = " + ex06());
    }
} 
