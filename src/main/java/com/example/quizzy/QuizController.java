package com.example.quizzy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {

        @GetMapping("/testquestion")
        public Question getTestQuestion() {
            Question question = new Question();
            question.setText("What is the capital of France?");
            question.setOptionA("London");
            question.setOptionB("Berlin");
            question.setOptionC("Paris");
            question.setOptionD("Rome");
            question.setCorrectAnswer("C");
            return question;
        }
}
