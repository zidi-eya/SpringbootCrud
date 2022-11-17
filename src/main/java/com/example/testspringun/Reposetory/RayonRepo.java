package com.example.testspringun.Reposetory;

import com.example.testspringun.Entity.DetailFacture;
import com.example.testspringun.Entity.Rayon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RayonRepo extends JpaRepository<Rayon,Long> {
}
