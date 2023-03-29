package service;

import excepcion.BadRequestException;
import model.Question;

import java.util.*;

public class ExaminerServiceImpl implements ExaminerService {

    private final List<QuestionService> questionServices;
    private final UtilService utilService;

    public ExaminerServiceImpl(List<QuestionService> questionServices, UtilService utilService) {
        this.questionServices = questionServices;
        this.utilService = utilService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount <= 0 || calculateAmount() < amount) {
            throw new BadRequestException("Неверное количество");
        }
        Set<Question> result = new HashSet<>();
        while (result.size() < amount) {
            var serviceNumber = utilService.getRandomInt(questionServices.size());
            var questionService = questionServices.get(serviceNumber);
            result.add(questionService.getRandomQuestion());
        }
        return null;
    }

    private int calculateAmount() {
        return questionServices.stream()
                .mapToInt(s -> s.getAll().size())
                .sum();
    }
}
