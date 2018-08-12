package com.greenfoxacademy.connectionwithmysqlsecond.controllers;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Assignee;
import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import com.greenfoxacademy.connectionwithmysqlsecond.services.AssigneeService;
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
    private AssigneeService assigneeService;

    @Autowired
    public TodoController(TodoService todoService, AssigneeService assigneeService) {
        this.todoService = todoService;
        this.assigneeService = assigneeService;
    }

    @GetMapping(value = "/list")
    public String listTodos(Model model) {
        model.addAttribute("todos", todoService.getAllTodo());
        return "todoslist";
    }

    @RequestMapping(value = "/todo")
    public String listActiveTodos(@RequestParam(value = "isActive", required = false, defaultValue = "true") boolean isActive, Model model) {
        model.addAttribute("todos", todoService.getAllTodoByFinishedness(isActive));
        return "todoslist";
    }

    @GetMapping("todo/create")
    public String createTodoPage() {
        return "create-todo";
    }

    @PostMapping("submitnewtodo")
    public String submitNewTodo(@ModelAttribute(value = "title") String title,
                                @RequestParam(value = "isUrgent", required = false, defaultValue = "false") boolean isUrgent,
                                @RequestParam(value = "isDone", required = false, defaultValue = "false") boolean isDone) {
        todoService.saveTodo(new Todo(title, isUrgent, isDone));
        return "redirect:/list";
    }

    @PostMapping("todo/delete/{id}")
    public String deleteTodo(@PathVariable(value = "id") long id) {
        todoService.deleteTodoById(id);
        return "redirect:/list";
    }

    @GetMapping("todo/edit/{id}")
    public String edit(@PathVariable(value = "id") long id, Model todoToUpdateModel) {
        Optional<Todo> todoToUpdate = todoService.getTodoById(id);
        todoToUpdateModel.addAttribute("todoToUpdate", todoToUpdate.get());
        todoToUpdateModel.addAttribute("id", id);
        return "todo-edit";
    }

    @PostMapping("todo/update/{id}")
    public String updateTodo(@PathVariable(value = "id") long id,
                             @ModelAttribute(value = "todoToUpdate") Todo todoToUpdate,
                             @RequestParam(value = "assigneeName") String assigneeName,
                             @RequestParam(value = "assigneeEmail") String assigneeEmail) {

        todoToUpdate.setId(id);
        todoToUpdate.setDateOfModification(LocalDate.now());

        Assignee assignee = new Assignee(assigneeName, assigneeEmail);
        assigneeService.save(assignee);
        todoToUpdate.setAssignee(assignee);

        todoService.updateTodo(todoToUpdate);
        return "redirect:/list";
    }

    @PostMapping("/search")
    public String searchForTodo(@RequestParam(value = "todoActionToSearchFor") String todoActionToSearchFor, Model model) {
        model.addAttribute("todos", todoService.findTodosByTitleContent(todoActionToSearchFor));
        return "todoslist";
    }
}
