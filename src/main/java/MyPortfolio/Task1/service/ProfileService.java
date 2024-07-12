package MyPortfolio.Task1.service;

import MyPortfolio.Task1.model.Profile;
import MyPortfolio.Task1.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    public Profile getProfile(Long id) {
        return profileRepository.findById(id).orElse(null);
    }

    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }

    public void saveProfile(Profile profile) {
    }
}
