package com.apress.todooauth2.repository;

import com.apress.todooauth2.domain.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ToDoRepository extends CrudRepository<ToDo, String> {
}
