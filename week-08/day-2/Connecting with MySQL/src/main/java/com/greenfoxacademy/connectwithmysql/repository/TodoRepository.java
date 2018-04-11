package com.greenfoxacademy.connectwithmysql.repository;

import com.greenfoxacademy.connectwithmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findByDoneIsTrue();
  List<Todo> findByDoneIsFalse();
  List<Todo> findTodoByIdEquals(long id);
}
