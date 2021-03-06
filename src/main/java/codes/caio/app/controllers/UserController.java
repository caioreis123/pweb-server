package codes.caio.app.controllers;

import codes.caio.app.dto.UserDto;
import codes.caio.app.models.User;
import codes.caio.app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDto user) {
        return userService.createUser(user);
    }

    @GetMapping("/{email}")
    @ResponseBody
    public UserDto getUser(@PathVariable String email) {
        return userService.getUser(email);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody UserDto user){
        return userService.updateUser(user);
    }
}
