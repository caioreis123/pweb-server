package codes.caio.app.models;

import codes.caio.app.dto.UserDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "users")
public class User {
    @Id
    private String email;

    private String name;

    private String avatarUrl;

    public User(){}

    public User(String email){
        this.email = email;
    }

    public User(UserDto user) {
        this.email = user.getEmail();
        this.name = user.getName();
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
