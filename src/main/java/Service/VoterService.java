package Service;


import Model.Voter;

import java.util.List;

public interface VoterService {
    void SaveVoter(Voter voter);

    List<Voter> FindAll();
   Voter FindVoterById (Long id);
    void deleteVoterById(Long id);
}
