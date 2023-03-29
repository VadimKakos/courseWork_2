package service;

import excepcion.BadRequestException;
import model.Question;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import repository.JavaQuestionRepository;
import repository.QuestionRepository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
@Service
public class JavaQuestionService implements QuestionService{

    private final QuestionRepository questionRepository;

    private final UtilService utilService;

    public JavaQuestionService(@Qualifier("questionRepository") QuestionRepository questionRepository, UtilService utilService) {
        this.questionRepository = questionRepository;
        this.utilService = utilService;
    }

    @Override
    public Question add(String question, String answer) {
        if (question == null || question.isBlank()) {
            throw new BadRequestException("Введите вопрос");
        }
        if (answer == null || answer.isBlank()) {
            throw new BadRequestException("Введите ответ");
        }
        return questionRepository.add(new Question(question, answer));
    }

    @Override
    public Question add(Question question) {
        return questionRepository.add(question);
    }

    @Override
    public Question remove(Question question) {
        return questionRepository.remove(question);
    }

    @Override
    public Collection<Question> getAll() {
        return questionRepository.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        return utilService.getRandomQuestion(questionRepository.getAll());
    }
}
