package com.virendra.table.mapping.entitys.entitiii;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//public class Student {
//
//}

@Entity
//@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "student_course",
               joinColumns = @JoinColumn(name = "student_id"),
               inverseJoinColumns = @JoinColumn(name = "course_id"))          
    private Set<Course> courses = new HashSet<>();

    // Constructors, getters, setters, and other properties
    // ...
}
