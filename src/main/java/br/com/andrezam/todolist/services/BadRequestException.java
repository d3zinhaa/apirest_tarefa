package br.com.andrezam.todolist.services;

public class BadRequestException extends RuntimeException{
        public BadRequestException(String message) {
          super(message);
        }   
}
