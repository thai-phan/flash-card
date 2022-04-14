package controller;

import dict.repository.MerriamWebsterRepository;
import dict.service.EmployeeService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class MerriamWebsterEntityServiceImplIntegrationTest {

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
    private MerriamWebsterRepository merriamWebsterRepository;

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