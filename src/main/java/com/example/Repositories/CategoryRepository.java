package com.example.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entities.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
