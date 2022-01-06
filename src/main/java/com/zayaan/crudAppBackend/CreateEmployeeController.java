//package com.zayaan.crudAppBackend;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Map;
//
//@RestController
//@RequestMapping ("/employee")
//public class CreateEmployeeController {
//    private NameRepository nameRepository;
//
//    public CreateEmployeeController(NameRepository nameRepository) {
//        this.nameRepository = nameRepository;
//    }
//
//    @GetMapping("/test")
//    public ResponseEntity<?> test() {
//        Name employeeName = new Name();
//        employeeName.setPersonName("");
//        employeeName.setPersonLastName("");
//        employeeName.setEmailID("");
//        return ResponseEntity.ok(Map.of("name", "John Green"));
//    }
//
//    @PostMapping
//    public ResponseEntity<?> createEmployee(@RequestBody Name postName) {
//        nameRepository.save(postName);
//        return ResponseEntity.ok(Map.of("name", postName.getPersonName(),
//                "Last Name", postName.getPersonLastName(),
//                "emailID", postName.getEmailID()));
//    }
//
//
//
//}