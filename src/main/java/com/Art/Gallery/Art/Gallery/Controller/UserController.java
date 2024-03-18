package com.Art.Gallery.Art.Gallery.Controller;

import com.Art.Gallery.Art.Gallery.Entity.User;
import com.Art.Gallery.Art.Gallery.Dto.UserDTO;
import com.Art.Gallery.Art.Gallery.Service.artGalleryServiceIml;
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

    @Autowired
    private artGalleryServiceIml artGalleryServiceIml;


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
        return artGalleryServiceIml.getArtworkDetails(name);
    }
}