//package com.virendra.table.mapping.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.virendra.table.mapping.entitys.Person;
//import com.virendra.table.mapping.userservice.PersonService;
//
////public class PersonController {
////
////}
//
//@RestController
//@RequestMapping("/person")
//public class PersonController {
//
//	@Autowired
//    private PersonService personService;
//
//
//
//	   @PostMapping
//	    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
//	        Person createdPerson = personService.createPerson(person);
//	        return ResponseEntity.ok(createdPerson);
//	    }
//    
//    @GetMapping
//    public ResponseEntity<List<Person>> getAllPersons() {
//        List<Person> persons = personService.getAllPersons();
//        return ResponseEntity.ok(persons);
//    }
//}
