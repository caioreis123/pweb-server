package codes.caio.app.services;

import codes.caio.app.dto.UserDto;
import codes.caio.app.models.User;
import codes.caio.app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ResponseEntity<HttpStatus> createUser(String email) {
        User user = new User(email);
        userRepository.save(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public UserDto getUser(String email) {
        User user = userRepository.findByEmail(email);
        return new UserDto(user);
    }

    public ResponseEntity<HttpStatus> updateUser(UserDto user) {
        String email = user.getEmail();
        User userToUpdate = userRepository.findByEmail(email);
        String nameFromClientRequest = user.getName();
        userToUpdate.setName(nameFromClientRequest);
        userToUpdate.setAvatarUrl(user.getAvatarUrl());
        userRepository.save(userToUpdate);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
