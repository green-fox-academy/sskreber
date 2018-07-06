package com.greenfoxacademy.connectionwithmysqlsecond.controllers;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import com.greenfoxacademy.connectionwithmysqlsecond.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value = "/list")
    public String listTodos(Model model,
                            @RequestParam(value = "id", required = false) Long id) {
        if (id != null) {
            List<Todo> searchedTodo = new ArrayList<Todo>();
            searchedTodo.add(todoService.findTodoById(id));
            model.addAttribute("todos", searchedTodo);
        } else {
            model.addAttribute("todos", todoService.findAllTodo());
        }
        return "todoslist";
    }

    @RequestMapping(value = "/todo")
    public String listActiveTodos(@RequestParam(value = "isActive", required = false) boolean isActive, Model model) {
        model.addAttribute("todos", todoService.findAllTodoByIsDone(true));
        return "todoslist";
    }

    @GetMapping("todo/create")
    public String createTodoPage() {
        return "create";
    }

    @PostMapping("submitnewtodo")
    public String submitNewTodo(@ModelAttribute(value = "title") String title,
                                @ModelAttribute(value = "isUrgent") boolean isUrgent,
                                @ModelAttribute(value = "isDone") boolean isDone,
    @ModelAttribute(value = "assigneeName") String assigneeName,
    @ModelAttribute(value = "assigneeEmail") String assigneeEmail){
        todoService.saveTodo(new Todo(title, isUrgent, isDone, assigneeName, assigneeEmail));
        return "redirect:/list";
    }

    @PostMapping("deletetodo/{id}")
    public String deleteTodo(@PathVariable(value = "id") long id) {
        todoService.deleteTodoById(id);
        return "redirect:/list";
    }

    @GetMapping("edittodo/{id}")
    public String edit(@PathVariable(value = "id") long id, Model todoToUpdateModel) {
        Todo todoToUpdate = todoService.findTodoById(id);
        todoToUpdateModel.addAttribute("todoToUpdate", todoToUpdate);
        todoToUpdateModel.addAttribute("id", id);
        return "edit";
    }

    @PostMapping("update/{id}")
    public String updateTodo(@PathVariable(value = "id") long id,
                             @ModelAttribute(value = "todoToUpdate") Todo todoToUpdate,
                             @ModelAttribute(value = "title") String updatedTitle,
                             @RequestParam(value = "isUrgent", required = false, defaultValue = "false") boolean updatedIsUrgent,
                             @RequestParam(value = "isDone", required = false, defaultValue = "false") boolean updatedIsDone,
                             @RequestParam(value = "assigneeName") String assigneeName,
                             @RequestParam(value = "assigneeEmail") String assigneeEmail) {
        Todo updatedTodo = new Todo(updatedTitle, updatedIsUrgent, updatedIsDone, assigneeName, assigneeEmail);

        updatedTodo.setDateOfCreation(todoToUpdate.getDateOfCreation());
        todoService.deleteTodoById(id);
        updatedTodo.setId(id);
        todoService.saveTodo(updatedTodo);
        return "redirect:/list";
    }

    @PostMapping("/search")
    public String searchForTodo(@RequestParam(value = "todoActionToSearchFor") String todoActionToSearchFor) {
        Long id = todoService.findTodoByTitle(todoActionToSearchFor).getId();
        return "redirect:/list/?id=" + id;
    }
}
