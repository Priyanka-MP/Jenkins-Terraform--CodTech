package MyPortfolio.Task1.controller;

import MyPortfolio.Task1.model.Profile;
import MyPortfolio.Task1.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/profileForm")
    public String showProfileForm(Model model) {
        model.addAttribute("profile", new Profile());
        return "profileForm";
    }

    @PostMapping("/profile")
    public String createProfile(@ModelAttribute Profile profile) {
        profileService.saveProfile(profile);
        return "redirect:/profile/all";
    }

    @GetMapping("/profile/all")
    public String getAllProfiles(Model model) {
        List<Profile> profiles = profileService.getAllProfiles();
        model.addAttribute("profiles", profiles);
        return "profiles";
    }

    @GetMapping("/profile/{id}")
    public String getProfile(@PathVariable Long id, Model model) {
        Profile profile = profileService.getProfile(id);
        model.addAttribute("profile", profile);
        return "profile";
    }
}
