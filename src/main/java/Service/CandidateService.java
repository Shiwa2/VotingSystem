package Service;

import Model.Candidate;

import org.springframework.stereotype.Service;

import java.util.List;

public interface CandidateService {
    void SaveCandidate(Candidate candidate);

    List<Candidate> FindAll();
    Candidate FindCandidateById (Long id);
    void deleteCandidateById(Long id);
}
