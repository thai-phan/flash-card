package controller;

import dict.entity.Employee;
import dict.repository.EmployeeRepository;
import dict.service.EmployeeService;
import dict.service.EmployeeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
public class EmployeeServiceImplIntegrationTest {

//    @TestConfiguration
//    static class EmployeeServiceImplTestContextConfiguration {
//
//        @Bean
//        public EmployeeService employeeService() {
//            return new EmployeeServiceImpl();
//        }
//    }

    @Autowired
    private EmployeeService employeeService;

    @MockBean
    private EmployeeRepository employeeRepository;

//    @Test
//    public void givenEmployees_whenGetEmployees_thenReturnJsonArray()
//            throws Exception {
//
//        Employee alex = new Employee("alex");
//
//        List<Employee> allEmployees = Arrays.asList(alex);
//
//        given(employeeService.getAllEmployees()).willReturn(allEmployees);
//
//        mvc.perform(get("/api/employees")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$", hasSize(1)))
//                .andExpect(jsonPath("$[0].name", is(alex.getName())));
//    }
}