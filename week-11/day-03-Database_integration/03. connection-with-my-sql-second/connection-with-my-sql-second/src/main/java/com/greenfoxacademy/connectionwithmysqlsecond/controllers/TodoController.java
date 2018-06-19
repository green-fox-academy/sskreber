package com.greenfoxacademy.connectionwithmysqlsecond.controllers;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import com.greenfoxacademy.connectionwithmysqlsecond.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@Controller
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value = "/list")
    public String listTodos(Model model) {
        model.addAttribute("todos", todoService.getAllTodo());
        return "todoslist";
    }

    @RequestMapping(value = "/todo")
    public String listActiveTodos(@RequestParam("isActive") boolean isActive, Model model) {
        model.addAttribute("todos", todoService.getAllTodoByFinishedness(isActive));
        return "todoslist";
    }

    @GetMapping("todo/create")
    public String createTodoPage() {
        return "create";
    }

    @PostMapping("submitnewtodo")
    public String submitNewTodo(@ModelAttribute(value = "title") String title,
                                @ModelAttribute(value = "isUrgent") boolean isUrgent,
                                @ModelAttribute(value = "isDone") boolean isDone) {
        todoService.saveTodo(new Todo(title, isUrgent, isDone));
        return "redirect:/list";
    }

    @PostMapping("delete/{id}")
    public String increaseBalanceOfAccount(@PathVariable(value = "id") long id) {
        todoService.deleteTodoById(id);
        return "redirect:/list";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable(value = "id") long id, Model todoToUpdateModel) {
        Optional<Todo> todoToUpdate = todoService.getTodoById(id);
        todoToUpdateModel.addAttribute("todoToUpdate", todoToUpdate);
        todoToUpdateModel.addAttribute("id", id);
        return "edit";
    }

    @PostMapping("update/{id}")
    public String increaseBalanceOfAccount(@PathVariable(value = "id") long id,
                                           @ModelAttribute(value = "todoToUpdate") Todo todoToUpdate,
                                           @ModelAttribute(value = "title") String updatedTitle,
                                           @RequestParam(value = "isUrgent", required = false, defaultValue = "false") boolean updatedIsUrgent,
                                           @RequestParam(value = "isDone", required = false, defaultValue = "false") boolean updatedIsDone) {
        Todo updatedTodo = new Todo(updatedTitle, updatedIsUrgent, updatedIsDone);

        updatedTodo.setDateOfCreation(todoToUpdate.getDateOfCreation());
        todoService.deleteTodoById(id);
        updatedTodo.setId(id);
        todoService.saveTodo(updatedTodo);
        return "redirect:/list";
    }
}
