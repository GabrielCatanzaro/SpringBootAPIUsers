package br.com.fiap.dto;

import jakarta.validation.constraints.*;

public class RegisterDTO {
    @NotBlank @Size(max=50)
    private String username;

    @NotBlank @Email
    private String email;

    @NotBlank @Size(min=8, max=128)
    private String password;

    // getters and setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
