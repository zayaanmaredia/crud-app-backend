package com.zayaan.crudAppBackend;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.sun.xml.txw2.NamespaceResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private NameRepository nameRepository;

    // get all employees
    @GetMapping("/employees")
    public List<Name> getAllEmployees() {
        return nameRepository.findAll();
    }

    // create employee rest api
    @PostMapping("/employees")
    public Name createEmployee(@RequestBody Name employee) {
        return nameRepository.save(employee);
    }

    // get employee by id
    @GetMapping("/employees/{id}")
    public ResponseEntity<Object> getEmployeeById(@PathVariable Long id) {
        Optional<Name> employee = nameRepository.findById(id);
        return ResponseEntity.ok(employee);
    }

    // update employee rest api
    @PutMapping("/employees/{id}")
    public ResponseEntity < Name > updateEmployee(@PathVariable Long id, @RequestBody Name employeeDetails) {
       Name employee =  nameRepository.getById(id);

        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setEmailId(employeeDetails.getEmailId());

        Name updatedEmployee = nameRepository.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }

    // delete employee rest api
    @DeleteMapping("/employees/{id}")
    public ResponseEntity < Map < String, Boolean >> deleteEmployee(@PathVariable Long id) {
        Name employee = nameRepository.getById(id);

        nameRepository.delete(employee);
        Map < String, Boolean > response = new HashMap < > ();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}