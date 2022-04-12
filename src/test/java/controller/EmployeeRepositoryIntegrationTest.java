package controller;

import dict.entity.Employee;
import dict.repository.EmployeeRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.hamcrest.MatcherAssert.assertThat;


public class EmployeeRepositoryIntegrationTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private EmployeeRepository employeeRepository;

//    @Test
//    public void whenFindByName_thenReturnEmployee() {
//        // given
//        Employee alex = new Employee("alex");
//        entityManager.persist(alex);
//        entityManager.flush();
//
//        // when
//        Employee found = employeeRepository.findByName(alex.getName());
//
//        // then
//        assertThat(found.getName()).isEqualTo(alex.getName());
//    }
}
