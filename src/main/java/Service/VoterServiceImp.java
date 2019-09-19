package Service;

import Model.Voter;
import Repository.VoterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VoterServiceImp implements VoterService {
    @Autowired
    private VoterRepository voterRepository;
    @Override
    public void SaveVoter(Voter voter) {
voterRepository.save(voter);
    }

    @Override
    public List<Voter> FindAll() {
        return voterRepository.findAll();
    }

    @Override
    public Voter FindVoterById(Long id) {
        return voterRepository.getOne(id);
    }

    @Override
    public void deleteVoterById(Long id) {
voterRepository.deleteById(id);
    }
}
