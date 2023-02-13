package com.example.BackSocialNetwork.Controllers;

import com.example.BackSocialNetwork.Entities.User;
import com.example.BackSocialNetwork.Repositories.UserRepository;
import com.example.BackSocialNetwork.Security.Jwt.JwtTokenUtil;
import com.example.BackSocialNetwork.Security.Payload.JwtResponse;
import com.example.BackSocialNetwork.Security.Payload.LoginRequest;
import com.example.BackSocialNetwork.Security.Payload.RegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenUtil jwtTokenUtil;

    public AuthController(AuthenticationManager authenticationManager,
                          UserRepository userRepository,
                          PasswordEncoder passwordEncoder,
                          JwtTokenUtil jwtTokenUtil) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @PostMapping("/login")
    public ResponseEntity<JwtResponse> login(@RequestBody LoginRequest loginRequest){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtTokenUtil.generateJwtToken(authentication);

        return ResponseEntity.ok(new JwtResponse(jwt));
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest registerRequest){
        if(userRepository.existsByUsername(registerRequest.getUsername())){
            return ResponseEntity.badRequest().body("Error: Username is already taken");
        }

        if(userRepository.existsByEmail(registerRequest.getEmail())){
            return ResponseEntity.badRequest().body("Error: Email is already taken");
        }

        if(passwordEncoder.matches(registerRequest.getPassword(), registerRequest.getPasswordConfirm())){
            return ResponseEntity.badRequest().body("Passwords do not match");
        }

        userRepository.save(new User(registerRequest.getUsername(),
                registerRequest.getName(),
                registerRequest.getLastname(),
                registerRequest.getEmail(),
                passwordEncoder.encode(registerRequest.getPassword())));

        return ResponseEntity.ok("User registered successfully");
    }
}
