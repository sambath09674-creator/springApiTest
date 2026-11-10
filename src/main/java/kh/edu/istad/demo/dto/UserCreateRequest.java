package kh.edu.istad.demo.dto;

public record UserCreateRequest(
        String username,
        String password,
        String fullName
) {
}