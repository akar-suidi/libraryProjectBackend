package com.akar_dev.project.Repository;

import com.akar_dev.project.Entity.UserType.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface CustomerUserRepository extends JpaRepository<Customer, Long> {
}
