package service;

import model.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class JavaQuestionService implements QuestionService{

    private Set<Question> questions = new HashSet<>();
    @Override
    public Question add(String question, String answer) {
        return null;
    }

    @Override
    public Question add(String question) {
        return null;
    }

    @Override
    public Question remove() {
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return null;
    }

    @Override
    public Question getRandomQuestion() {
        return null;
    }
}
