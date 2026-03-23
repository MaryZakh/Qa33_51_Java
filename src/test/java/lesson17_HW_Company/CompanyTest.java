package lesson17_HW_Company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    Company company;
    Employee[] emps = {

            new Employee("ln1", "fn1", 1111, 10000.),
            new Employee("ln2", "fn2", 2222, 29000.),
            new Employee("ln3", "fn3", 3333, 19000.),
            new Employee("ln4", "fn4", 4444, 35000.),
            new Employee("ln5", "fn5", 5555, 18500.)
    };


    @BeforeEach
    void setUp() {
        company = new Company("Roga and Kopyta", "Haifa, Nemo Street,10");
        for (Employee emp : emps) {
            company.addEmployee(emp);
        }
    }

    @Test
    void testAddEmployee() {
        assertArrayEquals(emps, company.getStaff().toArray());
        Employee emp = new Employee("ln6", "fn6", 6666, 25000.);
        assertTrue(company.addEmployee(emp));
        assertEquals(emps.length + 1, company.getStaff().size());
        assertEquals(emp, company.findEmployeeById(emp.getId()));
        //================================
        assertFalse(company.addEmployee(emp));
        assertEquals(emps.length + 1, company.getStaff().size());
        assertFalse(company.addEmployee(null));
        assertEquals(emps.length + 1, company.getStaff().size());
    }

    @Test
    void testFireEmployee() {
        assertTrue(company.fireEmployee(2222));
        assertEquals(emps.length - 1, company.getStaff().size());
        assertNull(company.findEmployeeById(2222));
        //==========================
        assertFalse(company.fireEmployee(2222));
        assertEquals(emps.length - 1, company.getStaff().size());

    }

    @Test
    void testFindEmployeeById() {
        assertEquals(emps[2], company.findEmployeeById(3333));
        assertNull(company.findEmployeeById(-113));
    }

    @Test
    void testTotalSalary() {
        double res = calcSalary(company.getStaff());
        assertEquals(res, company.totalSalary());
    }

    private double calcSalary(TreeSet<Employee> staff) {
        double res = 0;
        for (Employee emp : staff) {
            res += emp.getSalary();
        }
        return res;
    }

    @Test
    void testAvgSalary() {
        assertEquals(calcSalary(company.getStaff()) / company.getStaff().size(), company.avgSalary());
    }

    @Test
    void testDisplay() {
        company.display();
    }
}