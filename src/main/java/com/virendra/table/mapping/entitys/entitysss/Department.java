//package com.virendra.table.mapping.entitys.entitysss;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//@Entity
////@Table(name = "departments")
//public class Department {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//
//    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
//    private List<Employe> employees;
//
//    // Constructors, getters, setters, and other properties
//    // ...
//}
