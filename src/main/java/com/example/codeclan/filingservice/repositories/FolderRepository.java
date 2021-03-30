package com.example.codeclan.filingservice.repositories;

import com.example.codeclan.filingservice.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
