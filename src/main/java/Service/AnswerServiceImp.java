package Service;


import Model.Answer;
import Repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImp implements AnswerService {
    @Autowired
    private AnswerRepository answerRepository;


    @Override
    public void SaveAnswer(Answer answer) {
answerRepository.save(answer);
    }

    @Override
    public List<Answer> FindAll() {
        return answerRepository.findAll();
    }

    @Override
    public Answer FindAnswerById(Long id) {
        return answerRepository.getOne(id);
    }

    @Override
    public void deleteAnswerById(Long id) {
answerRepository.deleteById(id);
    }

}
