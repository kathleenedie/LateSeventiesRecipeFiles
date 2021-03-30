package com.example.codeclan.filingservice.repositories;

import com.example.codeclan.filingservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
