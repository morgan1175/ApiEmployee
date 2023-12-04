package fr.morgan.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import fr.morgan.api.bll.EmployeeService;
import fr.morgan.api.controller.EmployeController;

@WebMvcTest(controllers = EmployeController.class)
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;
    
    @MockBean
    private EmployeeService employeeService;

    @Test
    public void testGetEmployees() throws Exception {
        mockMvc.perform(get("/employees"))
            .andExpect(status().isOk());
//            .andExpect(jsonPath("$[0].firstName").value("Laurent"));
    }

}