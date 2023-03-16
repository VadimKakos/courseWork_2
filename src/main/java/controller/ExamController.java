package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ExamController {

    @GetMapping("/get/{amount}")
    public Collection<Question> gqtQuestions(@PathVariable("amount") Integer amount) {
        return null;
    }
}
