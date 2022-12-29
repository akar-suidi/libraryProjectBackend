package com.akar_dev.project.Controller;

import com.akar_dev.project.Entity.UserType.AdminUser;
import com.akar_dev.project.ServiceImplementation.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    AdminServiceImpl adminServiceImpl;

    @PostMapping("/addAdmin")
    public AdminUser addAdmin(@RequestBody AdminUser adminUser) {
        return adminServiceImpl.addAdminUSer(adminUser);
    }

    @GetMapping("/getAdmin")
    public List<AdminUser> retrieveAdmins() {
        return adminServiceImpl.retrieveAdmins();
    }

    @DeleteMapping("/delAdmin/{id}")
    public String deleteAdmins(@PathVariable("id") Long adminID, @RequestBody AdminUser adminUser) {
        adminServiceImpl.deleteAdmin(adminID, adminUser);
        return "Admin Deleted Successfully";
    }

    @PutMapping("/updateAdmin/{id}")
    public AdminUser updateAdmin(@PathVariable("id") Long adminID, @RequestBody AdminUser adminUser) {
        return adminServiceImpl.updateAdmin(adminID  , adminUser);
    }


}
