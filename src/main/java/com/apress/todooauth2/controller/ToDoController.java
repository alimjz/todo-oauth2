package com.apress.todooauth2.controller;

import com.apress.todooauth2.domain.ToDo;
import com.apress.todooauth2.repository.ToDoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ToDoController {

    private final ToDoRepository repository;

    public ToDoController(ToDoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/todo/{id}")
    public Optional<ToDo> getToDo(String id){
        return this.repository.findById(id);
    }


    @GetMapping("/todo")
    public Optional<Iterable<ToDo>> getToDos(){
        return Optional.of(this.repository.findAll());
    }
}
