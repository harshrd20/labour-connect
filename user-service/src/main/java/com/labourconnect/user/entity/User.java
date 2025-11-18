package com.labourconnect.user.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private UUID userId;

    @NotBlank(message = "Full name cannot be blank")
    @Size(min = 3, max = 100, message = "Full name must be between 3 and 100 characters")
    private String fullname;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Email must be valid")
    @Column(unique = true, nullable = false)
    private String email;

    @Size(min = 10, max = 10, message = "Phone number cannot exceed 10 characters")
    private String phone;

    @NotBlank(message = "Password cannot be blank")
    @Size(min = 5, message = "Password must have at least 5 characters")
    private String passwordHash;

    @NotBlank(message = "Role cannot be blank")
    private String role;

    private LocalDateTime createdAt = LocalDateTime.now();

}
