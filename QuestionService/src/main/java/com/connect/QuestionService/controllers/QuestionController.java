package com.connect.QuestionService.controllers;


import com.connect.QuestionService.entities.Question;
import com.connect.QuestionService.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/question")
public class QuestionController
{

    @Autowired
    private QuestionService questionService;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createQuestions(@RequestBody Question question){
        questionService.createQuestions(question);
        return "Created.";
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Question> findById(@PathVariable Long id){
        return questionService.findById(id);
    }


    @GetMapping("/quiz/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Question findByQuizId(@PathVariable Long id){
        return questionService.findByQuizId(id);
    }

}
