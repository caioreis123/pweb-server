package codes.caio.app.services;

import codes.caio.app.dto.UserDto;
import codes.caio.app.models.User;
import codes.caio.app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ResponseEntity<User> createUser(UserDto user) {
        User userCreated = new User(user);
        userRepository.save(userCreated);
        return new ResponseEntity<>(userCreated, HttpStatus.ACCEPTED);
    }

    public UserDto getUser(String email) {
        User user = userRepository.findByEmail(email);
        return new UserDto(user);
    }

    public ResponseEntity<User> updateUser(UserDto user) {
        String email = user.getEmail();
        User userToUpdate = userRepository.findByEmail(email);
        String nameFromClientRequest = user.getName();
        userToUpdate.setName(user.getName());
        userToUpdate.setAvatarUrl(user.getAvatarUrl());
        userRepository.save(userToUpdate);
        return new ResponseEntity<>(userToUpdate, HttpStatus.OK);
    }
}
