package com.connect.QuestionService.services;


import com.connect.QuestionService.entities.Question;
import com.connect.QuestionService.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService
{

    @Autowired
    private QuestionRepository questionRepository;


    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public void createQuestions(Question question) {
        questionRepository.save(question);
    }

    public Optional<Question> findById(Long id) {
        return questionRepository.findById(id);
    }

    public Question findByQuizId(Long id) {
        return questionRepository.findByQuizId(id);
    }
}
