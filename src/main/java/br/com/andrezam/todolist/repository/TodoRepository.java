package br.com.andrezam.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.andrezam.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

    
    
}
