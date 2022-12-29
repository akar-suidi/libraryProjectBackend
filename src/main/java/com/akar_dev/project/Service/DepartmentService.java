package com.akar_dev.project.Service;

import com.akar_dev.project.Entity.Department;

import java.util.List;

public interface DepartmentService {

    Department addDepartment(Department department);

    List<Department> retrieveDepartments();

    void deleteDepartment(Long departmentID, Department department);

    Department updateDepartment(Long departmentID, Department department);
}
