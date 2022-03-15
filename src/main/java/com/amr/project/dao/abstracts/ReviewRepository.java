package com.amr.project.dao.abstracts;

import com.amr.project.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Category, Long> {
}
