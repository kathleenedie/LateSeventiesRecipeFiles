package com.example.codeclan.filingservice.repositories;

import com.example.codeclan.filingservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
