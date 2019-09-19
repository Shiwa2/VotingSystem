package Service;

import Model.Candidate;
import Repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CandidateServiceImp implements CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;
    @Override
    public void SaveCandidate(Candidate candidate) {
        candidateRepository.save(candidate);
    }

    @Override
    public List<Candidate> FindAll() {
        return candidateRepository.findAll();
    }

    @Override
    public Candidate FindCandidateById(Long id) {
        return candidateRepository.getOne(id);
    }

    @Override
    public void deleteCandidateById(Long id) {
candidateRepository.deleteById(id);
    }
}
