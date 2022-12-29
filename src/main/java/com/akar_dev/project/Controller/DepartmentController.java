package com.akar_dev.project.Controller;


import com.akar_dev.project.Entity.Department;
import com.akar_dev.project.ServiceImplementation.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentServiceImpl departmentServiceImpl;

    @PostMapping(
            "/addDep"
    )
    public Department addDepartment(@RequestBody Department department) {
        return departmentServiceImpl.addDepartment(department);
    }

    @GetMapping("/department")
    public List<Department> retrieveDepartments() {

        return departmentServiceImpl.retrieveDepartments();
    }

    @DeleteMapping("/delDep/{id}")
    public String deleteDepartment(@PathVariable("id") Long departmentID, @RequestBody Department department) {
        departmentServiceImpl.deleteDepartment(departmentID, department);
        return "Deleted Successfully";
    }

    @PutMapping("/updateDep/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentID, @RequestBody Department department) {
        return departmentServiceImpl.updateDepartment(departmentID, department);
    }


}
