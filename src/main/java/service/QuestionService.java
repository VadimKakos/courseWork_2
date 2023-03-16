package service;

import model.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);
    Question add(String question);
    Question remove();
    Collection<Question> getAll();
    Question getRandomQuestion();
}
