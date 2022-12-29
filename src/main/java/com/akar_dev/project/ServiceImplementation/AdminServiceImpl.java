package com.akar_dev.project.ServiceImplementation;

import com.akar_dev.project.Entity.UserType.AdminUser;
import com.akar_dev.project.Repository.AdminUserRepository;
import com.akar_dev.project.Service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AdminServiceImpl implements AdminUserService {

    @Autowired
    AdminUserRepository adminUserRepository;

    @Override
    public AdminUser addAdminUSer(AdminUser adminUser) {
        return adminUserRepository.save(adminUser);
    }

    @Override
    public void deleteAdmin(Long adminID, AdminUser adminUser) {
        adminUserRepository.deleteById(adminID);
    }

    @Override
    public List<AdminUser> retrieveAdmins() {
        return adminUserRepository.findAll();
    }

    @Override
    public AdminUser updateAdmin(Long adminID, AdminUser adminUser) {
        AdminUser adminDB = adminUserRepository.findById(adminID).get();
        if (Objects.nonNull(adminUser.getAdminName()) &&
                !"".equalsIgnoreCase(adminUser.getAdminName())) {
            adminDB.setAdminName(adminUser.getAdminName());
        }
        if (Objects.nonNull(adminUser.getAdminEmail()) &&
                !"".equalsIgnoreCase(adminUser.getAdminEmail())) {
            adminDB.setAdminEmail(adminUser.getAdminEmail());
        }
        if (Objects.nonNull(adminUser.getAdminPassword()) &&
                !"".equalsIgnoreCase(adminUser.getAdminPassword())) {
            adminDB.setAdminPassword(adminUser.getAdminPassword());
        }
        if (Objects.nonNull(adminUser.getAdminRole()) &&
                !"".equalsIgnoreCase(adminUser.getAdminRole())) {
            adminDB.setAdminRole(adminUser.getAdminRole());
        }
        return adminUserRepository.save(adminDB);
    }
}
