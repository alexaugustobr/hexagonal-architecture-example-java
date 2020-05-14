package todo.application.impl;

import io.hschwentner.dddbits.annotation.ApplicationService;
import todo.application.ReadingTodos;
import todo.domain.model.Todo;
import todo.domain.model.UserId;
import todo.domain.service.TodoService;

import java.util.List;

@ApplicationService
public class ReadingTodosService implements ReadingTodos {

    private final TodoService todoService;

    public ReadingTodosService(final TodoService todoService){
        this.todoService = todoService;
    }

    @Override
    public List<Todo> getAllUndoneTodos(final UserId userId) {
        // no need for orchestration here
        return this.todoService.undoneTodos(userId);
    }

}
