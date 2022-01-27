package com.softserveinc.task02;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;

public class Task02Test {
    @Test
    public void testEx01() {
        List<Employee> employees = Task02.ex01();
        assertNotNull(employees);
        assertEquals(2, employees.size());
        assertEquals(new Employee("Bob", 23, Gender.MAN), employees.get(0));
        assertEquals(new Employee("Alex", 25, Gender.MAN), employees.get(1));
    }

    @Test
    public void testEx02() {
        double optionalAge = Task02.ex02();
        assertEquals(38.5, optionalAge);
    }

    @Test
    public void testEx03() {
        assertEquals(6L, Task02.ex03());
    }

    @Test
    public void testEx04() {
        List<Employee> employees = Task02.ex04();
        assertNotNull(employees);
        assertEquals(9, employees.size());
    }

    @Test
    public void testEx05() {
        Employee employee = Task02.ex05();
        assertNotNull(employee);
        assertEquals(new Employee("Bill", 69, Gender.MAN), employee);
    }

    @Test
    public void testEx06() {
        Employee employee = Task02.ex06();
        assertNotNull(employee);
        assertEquals(new Employee("Jon", 16, Gender.MAN), employee);
    }
}

