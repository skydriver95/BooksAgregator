package pl.booksagregator.model.dto;

import lombok.Data;

@Data
public class LoginUserDto {

    private String username;

    private String password;
}