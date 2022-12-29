package com.akar_dev.project.Service;

import com.akar_dev.project.Entity.UserType.AdminUser;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

import java.util.List;

public interface AdminUserService {

    AdminUser addAdminUSer(AdminUser adminUser);
    void deleteAdmin(Long adminID , AdminUser adminUser);
    List<AdminUser> retrieveAdmins();

    AdminUser updateAdmin(Long adminID , AdminUser adminUser);

}
