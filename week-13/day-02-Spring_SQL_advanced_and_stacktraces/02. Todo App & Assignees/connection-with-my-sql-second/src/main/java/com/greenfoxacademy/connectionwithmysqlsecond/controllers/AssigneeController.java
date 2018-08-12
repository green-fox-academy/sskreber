package com.greenfoxacademy.connectionwithmysqlsecond.controllers;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Assignee;
import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import com.greenfoxacademy.connectionwithmysqlsecond.services.AssigneeService;
import com.greenfoxacademy.connectionwithmysqlsecond.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AssigneeController {

    private TodoService todoService;
    private AssigneeService assigneeService;

    @Autowired
    public AssigneeController(TodoService todoService, AssigneeService assigneeService) {
        this.todoService = todoService;
        this.assigneeService = assigneeService;
    }
    @GetMapping(value = "/assignees")
    public String listAssignees(Model model) {
        model.addAttribute("assignees", assigneeService.getAllAssignees());
        return "assigneelist";
    }

    @GetMapping("assignee/create")
    public String createAssigneePage() {
        return "create-assignee";
    }

    @PostMapping("submitnewassignee")
    public String submitNewAssignee(@ModelAttribute(value = "name") String name,
                                @RequestParam(value = "email") String email) {
        assigneeService.save(new Assignee(name, email));
        return "redirect:/assignees";
    }

    @PostMapping("assignee/delete/{id}")
    public String deleteAssignee(@PathVariable(value = "id") long id) {
        assigneeService.deleteAssignee(id);
        return "redirect:/assignees";
    }
}
