package kh.edu.istad.demo.dto;

import java.util.UUID;

public record UserResponse(
        UUID id,
        String fullName,
        Boolean isActive
) {
}
