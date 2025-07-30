package dev.java10x.user.service;

import dev.java10x.user.model.UserModel;
import dev.java10x.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserModel createUser(UserModel userModel) {
        return userModel = userRepository.save(userModel);
    }
}
