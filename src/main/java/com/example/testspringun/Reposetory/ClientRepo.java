package com.example.testspringun.Reposetory;

import com.example.testspringun.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client,Long> {
}
