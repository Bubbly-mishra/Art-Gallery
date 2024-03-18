package com.Art.Gallery.Art.Gallery.Controller;

import com.Art.Gallery.Art.Gallery.Entity.User;
import com.Art.Gallery.Art.Gallery.Dto.UserDTO;
import com.Art.Gallery.Art.Gallery.Service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserDTO userDTO) {
        User existingUser = userRepository.findByUsername(userDTO.getUsername());
        if (existingUser != null) {
            return "Username already exists";
        }

        User newUser = new User();
        newUser.setUsername(userDTO.getUsername());
        newUser.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        userRepository.save(newUser);

        return "User registered successfully";
    }

    @GetMapping("/getartdetails")
    public String getArtData(@RequestParam String name) {
        // Simulate fetching data for the given artwork name from the backend
        String artData = "Data for artwork '" + name + "'";
        return artData;
    }
}