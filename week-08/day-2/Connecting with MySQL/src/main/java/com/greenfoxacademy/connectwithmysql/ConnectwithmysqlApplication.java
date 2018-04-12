package com.greenfoxacademy.connectwithmysql;

import com.greenfoxacademy.connectwithmysql.model.Assignee;
import com.greenfoxacademy.connectwithmysql.model.Todo;
import com.greenfoxacademy.connectwithmysql.repository.AssigneeRepository;
import com.greenfoxacademy.connectwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectwithmysqlApplication implements CommandLineRunner {

	@Autowired
	TodoRepository todoRepository;

	@Autowired
    AssigneeRepository assigneeRepository;

	public static void main(String[] args) {
		SpringApplication.run(ConnectwithmysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("Wake up"));
		todoRepository.save(new Todo("Drink a cup of tea"));
		todoRepository.save(new Todo("Enjoy the day"));
		assigneeRepository.save(new Assignee("Tom Bush", "something@gmail.com"));
		assigneeRepository.save(new Assignee("Noel Fielding", "anything@gamil.com"));

	}
}
