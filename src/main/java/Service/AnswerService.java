package Service;

import Model.Answer;


import java.util.List;

public interface AnswerService {
    void SaveAnswer(Answer answer);

    List<Answer> FindAll();
    Answer FindAnswerById (Long id);
    void deleteAnswerById(Long id);
}
