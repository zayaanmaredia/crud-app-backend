//package com.zayaan.crudAppBackend;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Map;
//
//@RestController
//@RequestMapping ("/api")
//public class TestController {
//    @GetMapping("/test")
//    public ResponseEntity<?> test() {
//        Name testName = new Name();
//        testName.setPersonName("");
//        return ResponseEntity.ok(Map.of("name", "John Green"));
//    }
//
//    @PostMapping("/test")
//    public ResponseEntity<?> postTest(@RequestBody Name postName) {
//        return ResponseEntity.ok(Map.of("name", postName.getPersonName()));
//    }
//
//}
