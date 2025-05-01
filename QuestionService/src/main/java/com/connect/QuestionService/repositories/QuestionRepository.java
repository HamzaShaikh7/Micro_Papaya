package com.connect.QuestionService.repositories;

import com.connect.QuestionService.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Long> {

    Question findByQuizId(Long id);
}
