package com.akar_dev.project.Repository;

import com.akar_dev.project.Entity.Authors;
import com.akar_dev.project.Entity.UserType.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUserRepository extends JpaRepository<AdminUser, Long> {
}
