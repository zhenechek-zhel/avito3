package com.amr.project.dao.abstracts;

import com.amr.project.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<Category, Long> {
}
