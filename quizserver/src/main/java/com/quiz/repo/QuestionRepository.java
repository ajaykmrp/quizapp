package com.quiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.model.exam.Question;
import com.quiz.model.exam.Quiz;

import java.util.Set;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    Set<Question> findByQuiz(Quiz quiz);
}
