package codes.caio.app.dto;

import codes.caio.app.models.User;

public class UserDto {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    private String name;
    private String avatarUrl;

    public UserDto(User user) {
        this.email = user.getEmail();
        this.name = user.getName();
        this.avatarUrl = user.getAvatarUrl();
    }
}
