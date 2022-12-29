package com.akar_dev.project.Repository;

import com.akar_dev.project.Entity.Department;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentRepositoryTest {

    @Autowired
    DepartmentRepository departmentRepository;

    @Test
    void addDepartment() {
        Department department =
                Department.builder()
                        .departmentID(1L)
                        .departmentName("Computer Science")
                        .build();
        departmentRepository.save(department);
    }


}