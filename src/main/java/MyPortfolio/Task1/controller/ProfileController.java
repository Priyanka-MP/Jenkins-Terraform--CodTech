package MyPortfolio.Task1.controller;

import MyPortfolio.Task1.model.Profile;
import MyPortfolio.Task1.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/profile")
public class ProfileController {
    @Autowired
    private ProfileService profileService;

    @GetMapping("/{id}")
    public String getProfile(@PathVariable Long id, Model model) {
        Profile profile = profileService.getProfile(id);
        model.addAttribute("profile", profile);
        return "profile";
    }

    @GetMapping("/new")
    public String newProfileForm(Model model) {
        model.addAttribute("profile", new Profile());
        return "profileForm";
    }

    @PostMapping
    public String createProfile(@ModelAttribute Profile profile) {
        profileService.saveProfile(profile);
        return "redirect:/profile/" + profile.getId();
    }
}
